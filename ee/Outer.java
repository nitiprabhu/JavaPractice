class Outer
{
	 int outer_x = 100;

	  class Inner // this is an innner class
	  {
		    void display()
		    {
		      System.out.println("display: outer_x = " + outer_x);
		    }
	  }// end of inner class

  
	void test()
	 {
	    Inner inner = new Inner();
	    inner.display();
	 }

}// end of outer class

