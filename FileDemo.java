import java.io.File ;
import java.io.IOException ;

public class FileDemo{
	public static void main(String args[]){
		File f = new File("d:" + File.separator + "test.txt") ;
		try{
			f.createNewFile() ;
			for(int i=0;i<10;i++){
				System.out.println(i) ;
				for(int j=0;j<499999;j++) ;
			}
			f.delete() ;
		}catch(IOException e){
			System.out.println(e.toString()) ;
		}
	}
}

class Test{
	public void tell(){
		System.out.println("HelloWorld") ;
	}
}
