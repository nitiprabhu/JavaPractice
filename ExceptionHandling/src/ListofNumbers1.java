import java.io.*;
import java.util.List;
import java.util.ArrayList;



	
	 public class ListofNumbers1 {

	    private static List<Integer> list;
		private static PrintStream out;
	    private static final int SIZE = 10;

	   public void ListOfNumbers () {
	        list = new ArrayList<Integer>(SIZE);
	        for (int i = 0; i < SIZE; i++) {
	            list.add(new Integer(i));
	        }
	    }

	    
	    public static void writeList() throws IOException {
		try{
	        for (int i = 0; i < SIZE; i++) {
	            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
 } catch(Exception ae)
 {
	System.out.print("Error-index\n"); 
 } finally{   out.close();}
	    } 
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ListofNumbers1 p = new ListofNumbers1();
try {
writeList() ;
	}
catch(IOException a) {}
	}

}
