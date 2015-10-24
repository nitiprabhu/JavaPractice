//to print ****
class Stars1
{
  public static void main(String a[])
   {
     int i,j,k;
     int n=6; 
    for(i=0;i<n;i++) 
     {
       for(j=0;j<n-i-1;j++)
        System.out.print(" ");

         for(k=1;k<=2*i+1;k++)
	  {
            if((k%2)==0) 
             System.out.print(" ");
            else
             System.out.print("*");
           }  
        System.out.print("\n");
     }
   }  
}