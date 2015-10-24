class StringsDemo1
{
	public static void main(String args[])
	{
		String s1="This is Java";
	String s2=new String("I like it");
	
	char ch[] = {'j','n','n','c','e'};
	String s3=new String(ch);


	System.out.println("s1-->" + s1);
	System.out.println("s2-->" + s2);
	System.out.println("s3-->" + s3);
	
	
	System.out.println("length of s1-->" + s1.length());

	System.out.println("s1 joined with s2-->" + s1.concat(s2));
	
	System.out.println(s1 + "at" + s3);

boolean x=s1.startsWith("This");
if(x)
System.out.println("s1 starts with this");
else
System.out.println("s1 doesnot starts with this");

String p=s2.substring(0,6);
String q=s3.substring(0);

System.out.println(p+q);

System.out.println("uppercase of s1=" +s1.toUpperCase());
System.out.println("lowercase of s1=" +s1.toLowerCase());

 }
}