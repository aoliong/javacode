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
		这是一个WEB服务器。
		主要负责监听。
	*/
	public static final String WEB_ROOT = 
		System.getProperty("user.dir") + File.separator + "webroot" ;

	// shutdown command
	public static final String SHUTDOWN_COMMAND = "/SHUTDOWN" ;

	
	private boolean shutdown = false ;

	public static void main(String args[]){
		HttpServer server = new HttpServer() ;
		server.await() ;		// 进行监听
	}

	public void await(){
		
		// 进行监听
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
			socket = serverSocket.accept() ;		// 监听
			input = socket.getInputStream() ;
			output = socket.getOutputStream() ;
			
		
			// 创建Requse，进行解析uri
			Request request = new Request(input) ;
			request.parse() ;			// 调用parse(),进行uri的解析

			// 创建Response，响应请求
			Response response = new Response(output) ;
			response.setRequest(request) ;		
			response.sendStaticResource() ;		// 向浏览器发送资源

			// 关闭socket
			socket.close() ;

			// 判断是否关机
			shutdown = request.getUri().equals(SHUTDOWN_COMMAND) ;

			}catch(IOException e){
				e.printStackTrace() ;
				continue ;
			}
		}
	}
}