class RR<T1>
{
	T1 a, b;
	public void read(T1 x, T1 y)
	{
		 a= x; b=y;
		System.out.println("Reading---- " + a + "  " + b );
	}
	public void print()
	{
		System.out.println("Done Printed \n");
	}
}


public class Evv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RR<Integer> A = new RR<Integer>();
		A.read(10, 20);
		A.print();
		RR<String> S = new RR<String>();
		S.read("Nitish", "Prabhu");
		S.print();
		
	}

}
