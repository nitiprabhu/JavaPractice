// Demonstrate command line args.
class CmdLineArgs {
public static void main(String args[]) {
	
	int n=args.length;
System.out.println("no. of args " + n);

System.out.println("the args are :");

for(int i=0; i<n; i++) 
System.out.println(args[i]);
    
  }
}