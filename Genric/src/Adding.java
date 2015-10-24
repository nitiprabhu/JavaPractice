import java.lang.*;
import java.math.*;

class AdditionOfTwo<T1> 
{
	public T1 a,b,c;
	
	AdditionOfTwo(T1 x, T1 y)
	{
		a=x; b=y;
	}
	
	public void Show()
	{
	//	System.out.println("Read---" + (a +b));
		
	}
	
	
	
}


//class Diff<T1, T2>
//{
	//public Diff() {
		// TODO Auto-generated constructor stub
	//}
//}


public class Adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionOfTwo<Integer> A= new AdditionOfTwo(10, 20);
		A.Show();
        AdditionOfTwo<String> B = new AdditionOfTwo("Nitish", "Prabhu");
        B.Show();
        
	}

}
