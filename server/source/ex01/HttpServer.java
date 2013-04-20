package ex01.pyrmont ;
import java.net.Socket ;
import java.net.ServerSocket ;
import java.net.InetAddress ;
import java.io.InputStream ;
import java.io.OutputStream ;
import java.io.File ;
import java.io.IOException ;

public class HttpServer{

	/**
		����һ��WEB��������
		��Ҫ���������
	*/
	public static final String WEB_ROOT = 
		System.getProperty("user.dir") + File.separator + "webroot" ;

	// shutdown command
	public static final String SHUTDOWN_COMMAND = "/SHUTDOWN" ;

	
	private boolean shutdown = false ;

	public static void main(String args[]){
		HttpServer server = new HttpServer() ;
		server.await() ;		// ���м���
	}

	public void await(){
		
		// ���м���
		ServerSocket serverSocket = null ;
		int port = 8080 ;
		try{
			serverSocket = new ServerSocket(port,1,
				InetAddress.getByName("127.0.0.1")) ;
		}catch(IOException e){
			e.printStackTrace() ;
			System.exit(1) ;
		}
		
		while(!shutdown){
			Socket socket = null ;
			InputStream input = null ;
			OutputStream output = null ;

			try{
			socket = serverSocket.accept() ;		// ����
			input = socket.getInputStream() ;
			output = socket.getOutputStream() ;
			
		
			// ����Requse�����н���uri
			Request request = new Request(input) ;
			request.parse() ;			// ����parse(),����uri�Ľ���

			// ����Response����Ӧ����
			Response response = new Response(output) ;
			response.setRequest(request) ;		
			response.sendStaticResource() ;		// �������������Դ

			// �ر�socket
			socket.close() ;

			// �ж��Ƿ�ػ�
			shutdown = request.getUri().equals(SHUTDOWN_COMMAND) ;

			}catch(IOException e){
				e.printStackTrace() ;
				continue ;
			}
		}
	}
}