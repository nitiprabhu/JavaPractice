class ForDemo 
{
	public static void main(String args[]) 
	{
int count;
for(count = 0; count < 5; ++count)
System.out.println("This is count: " + count);

System.out.println("outside loop: " + count);

System.out.println("count++:" + count++);

System.out.println(count);

System.out.println("++count:" + ++count);
System.out.println(count);
System.out.println("Done!"); 
	}
}
