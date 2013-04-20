package ex02.pyrmont;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.* ;

public class RequestFacade implements ServletRequest {

  private ServletRequest request = null;

  public RequestFacade(Request request) {
    this.request = request;
  }

  /* implementation of ServletRequest */
	public AsyncContext getAsyncContext(){
		return null ;
	}
	public java.lang.Object getAttribute(java.lang.String name){
		return null ;
	}
	public java.util.Enumeration<java.lang.String> getAttributeNames(){
		return null ;
	}
	public java.lang.String getCharacterEncoding(){
		return null ;
	}
	public int getContentLength(){
		return 0 ;
	}
	public java.lang.String getContentType(){
		return null ;
	}
	public DispatcherType getDispatcherType(){
		return null ;
	}
	public ServletInputStream getInputStream()
                                  throws java.io.IOException {
		return null ;
	}
	public java.lang.String getLocalAddr(){
		return null ;
	}
	public java.util.Locale getLocale(){
		return null ;
	}
	public java.util.Enumeration<java.util.Locale> getLocales(){
		return null ;
	}
	public java.lang.String getLocalName(){
		return null ;
	}
	public int getLocalPort(){
		return 0 ;
	}
	public java.lang.String getParameter(java.lang.String name){
		return null ;
	}
	public java.util.Map<java.lang.String,java.lang.String[]> getParameterMap(){
		return null ;
	}
	public java.util.Enumeration<java.lang.String> getParameterNames(){
		return null ;
	}
	public java.lang.String[] getParameterValues(java.lang.String name){
		return null ;
	}
	public java.lang.String getProtocol(){
		return null ;
	}
	public java.io.BufferedReader getReader()
                                 throws java.io.IOException{
		return null ;
	}
	public java.lang.String getRealPath(java.lang.String path){
		return null ;
	}
	public java.lang.String getRemoteAddr(){
		return null ;
	}
	public java.lang.String getRemoteHost(){
		return null ;
	}
	public int getRemotePort(){
		return 0 ;
	}
	public RequestDispatcher getRequestDispatcher(java.lang.String path){
		return null ;
	}
	public java.lang.String getScheme(){
		return null ;
	}
	public java.lang.String getServerName(){
		return null ;
	}
	public int getServerPort(){
		return 0 ;	
	}
	public ServletContext getServletContext(){
		return null ;
	}
	public boolean isAsyncStarted(){
		return false ;
	}
	public boolean isAsyncSupported(){
		return false ;
	}
	public boolean isSecure(){
		return false ;
	}
	public void removeAttribute(java.lang.String name){
		
	}
	public void setAttribute(java.lang.String name,
                  java.lang.Object o){
	}
	public void setCharacterEncoding(java.lang.String env)
                          throws java.io.UnsupportedEncodingException{
	}
	public AsyncContext startAsync()
                        throws java.lang.IllegalStateException{
		return null ;
	}
	public AsyncContext startAsync(ServletRequest servletRequest,
                        ServletResponse servletResponse)
                        throws java.lang.IllegalStateException{
		return null ;
	}

}