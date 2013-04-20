package ex03.pyrmont.connector.http ;

public class HttpProcessor{

	public void process(Socket socket){
		SocketInputStream input = null ;
		OutputStream output = null ;
		try{
			intput = new SocketInputStream(socket.getInputStream(), 2048) ;
			output = socket.getOutputStream() ;

			// Create HttpRequest object and parse
			request = new HttpRequest(input) ;

			// Create HttpResponse object 
			response = new HttpResponse(output) ;
			response.setRequest(request) ;

			response.setHeader("Server", "Pyrmont Servlet Container") ;

			parseRequest(input, output) ;
			parseHeaders(input) ;

			// check if this is a request for a servlet or a static resource
			// a request for a servlet begins with "/servlet/"
			if(request.getRequeestURI().startsWith("/servlet/")){
				ServletProcessor processor = new ServletProcessor() ;
				processor.process(request, response) ;
			}

			// Close the socket
			socket.close() ;
			// no shutdown for this application
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}

	public void parseRequest(){}

	public void parseHeaders(){}
}