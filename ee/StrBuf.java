import java.io.*;

	   class StrBuf
	 {
                public static void main(String args[]) throws IOException
	   {  
		//to create data from K B
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    
		System.out.println("enter surname:");
	    String sur = br.readLine();

	  System.out.println("Enter mid name:") ;
	  String mid = br.readLine();
	  
	  System.out.println("Enter last name:");
	  String last = br.readLine();
	  
	  //create string buf object
	  StringBuffer sb = new StringBuffer() ;
	  
	  System.out.println("empty string buffer = " + sb);
	  
	  // append sur and last to sb
	     sb.append(sur);
	     sb.append(last);
	System.out.println(sb.hashCode());

	//insert mid after sur on sb
	int n = sur.length();
	sb.insert(n,mid) ;
	
	System.out.println(sb.hashCode());

	//display the full name in rev.
	
	System.out.println("Full name = " + sb);
	
	//display in rev.
	  System.out.println("reverse: " + sb.reverse());
	}
         
}
