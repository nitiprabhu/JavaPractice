class New6<n,v>
{
	public n a;
	public v b;
	
	public New6() {
		// TODO Auto-generated constructor stub
	}
	
	New6(n a, v b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void print()
	{
		System.out.println("Printing---" + a + " " + b);
	}
	
	public boolean compare<>
	
	
}


public class New5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		New6<String, Integer>  N= new New6<String, Integer>("Nitish", 565);
		N.print();
		New6<Integer, Integer> NN = new New6<Integer, Integer>(10,20);
		NN.print();
		
		
	}

}
