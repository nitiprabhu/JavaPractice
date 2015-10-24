
public class ThrowableExample1 {

	private static int a;

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub

	
	try{
		a = 10/0;
		throw new ArithmeticException();
	}catch(IndexOutOfBoundsException ae)
	{
		System.out.print("This is first called exception");
	}
	
	
	catch(ArithmeticException ae)
	{
		System.out.print("This is Thrown Exceptions");
	}
	
}
	
}
