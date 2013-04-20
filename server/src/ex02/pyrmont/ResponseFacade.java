package ex02.pyrmont;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import javax.servlet.ServletResponse;
import javax.servlet.ServletOutputStream;

public class ResponseFacade implements ServletResponse {

  private ServletResponse response;
  public ResponseFacade(Response response) {
    this.response = response;
  }

  /** implementation of ServletResponse */
	public PrintWriter getWriter() throws IOException{
		// autoflush is true, println() will flush,
		// but print() will not .
		//writer = new PrintWriter(output, true) ;
		return null ;
	}
	public  void flushBuffer() throws java.io.IOException {}
	public  int	getBufferSize(){
		return 0 ;
	}
	public java.lang.String	getCharacterEncoding(){
		return null ;
	}
	public  java.lang.String getContentType(){
		return null ;
	}
	public  java.util.Locale getLocale(){
		return null ;
	}
	public  ServletOutputStream	getOutputStream() throws java.io.IOException{
		return null ;
	}
	public  boolean	isCommitted(){
		return false ;
	}
	public  void	reset() {}
	public  void	resetBuffer() {}
	public  void	setBufferSize(int size) {}
	public  void	setCharacterEncoding(java.lang.String charset){}
	public  void	setContentLength(int len) {}
	public  void	setContentType(java.lang.String type) {}
	public  void	setLocale(java.util.Locale loc){}

}