// star class

package ex03.pyrmont.startup ;
import ex03.pyrmont.connector.http.HttpConnector ;
public final class Bootstarp{
	public static void main(String args[]){
		HttpConnector connector = new Httpconnector() ;
		connector.start() ;
	}
}