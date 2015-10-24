class A
{
A()
{
	System.out.println("SUPER class");
  }
}


class B extends A
{
B()
{
	System.out.println("SUB class");
  }
}


class Inherit
{
public static void main(String a[])

{
B b= new B();
}
}
  