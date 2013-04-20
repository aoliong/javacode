//package ex02.pyrmont ;

import javax.servlet.* ;
import java.io.IOException ;
import java.io.PrintWriter ;

public class PrimitiveServlet implements Servlet {

	public void init(ServletConfig config)
          throws ServletException{
		System.out.println("from init") ;
	}

	public void service(ServletRequest req, ServletResponse res) 
		throws ServletException, java.io.IOException{
		System.out.println("from service") ;
		PrintWriter out = res.getWriter() ;
		out.println("hello,Roses are red.") ;
		out.println("Violets are blue.") ;
	}

	public void destroy(){
		System.out.println("destroy") ;
	}

	public ServletConfig getServletConfig(){
		return null ;
	}

	public String getServletInfo(){
		return null ;
	}
}