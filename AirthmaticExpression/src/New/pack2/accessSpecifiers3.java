package New.pack2;
import New.pack1.*;

public class accessSpecifiers3 extends proaccessspecifiers {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}

}
//4. using public access specifiers
package New.pack1;

public class pubaccessspecifiers {

	public void display() 
  { 
      System.out.println("This is Public Access Specifiers"); 
  } 
}

//create another package
package New.pack2;
import New.pack1.*;

public class accessSpecifiers4 {

	public static void main(String[] args) {
		
		pubaccessspecifiers obj = new pubaccessspecifiers(); 
      obj.display();  
		
	}
}
