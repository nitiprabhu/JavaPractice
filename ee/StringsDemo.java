class StringsDemo
{
	public static void main(String args[])
	{
		
String s2=new String("hello1");
String s1=new String("hello2");
String s3=new String("hello3");

//String s1="hello";
//String s2="hello";
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	
	if (s1==s2)
	//if(s1.equals(s2))
	System.out.println("both are same");
	else
	System.out.println("both are not same");
 }
}