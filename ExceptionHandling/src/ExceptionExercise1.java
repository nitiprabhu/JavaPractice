
public class ExceptionExercise1 {

	private static Integer a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	
	a = 10;
	try {
		
		//Integer c = Integer.parseInt("0");
	//	Integer b= a/c;	
		int a1[];
		a1 = new int[10];
		a1[5]=6;
		a1[20]=74;
			
	} catch(ArrayIndexOutOfBoundsException ae)
	{
		System.err.println("Error out of index" + ae.getLocalizedMessage());
	}
	
	
	catch(Exception ae)
	{
		System.err.println("Error is " + ae.getMessage());
	}
	
	
	
	
	
	
	
	}
}
