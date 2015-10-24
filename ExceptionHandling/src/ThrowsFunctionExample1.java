
public class ThrowsFunctionExample1 {

	public static void ThrowExceptions() throws ArithmeticException
	{
		System.out.print("This will form function exception");
		throw new ArithmeticException();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
			int a=10/0;
			ThrowExceptions();
		}catch(ArithmeticException ae)
		{
			System.out.print("Catched Exceptions");
		}
		finally{
			System.out.print("\nFinally catched");
		} 
		//finally {
		//	System.out.print("Prints at end too");
		//	}
	
		
		
		
		
		
	}

}
