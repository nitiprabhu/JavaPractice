import mypack.arith.Addition;
import mypack.arith.Subtraction;

class UsePackage
{
	public static void main(String args[]) //throws Exception
	{
		Addition p = new Addition(10,25.2);
		p.sum();

		double subres=Subtraction.sub(2,1.2);
	System.out.println("sub is" + subres);
	}
}