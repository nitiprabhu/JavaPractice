import java.util.*;
import java.io.*;
class StackDemo
{
static void stpush1(Stack st, int a)
	{
       st.push(new Integer(a));
	}

static void stpop1(Stack st)
	{
       Integer a= (Integer)st.pop();
       System.out.println("popped:"+a);
		}

static int stsearch1(Stack st, int a)
	{
       int i = st.search(new Integer(a));
	   return i;
		}



public static void main(String args[]) throws IOException
{

Stack st = new Stack();
int element, pos, choice=0;


BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

while(choice<4)
{
  System.out.println(" Stack Operation");
  System.out.println("1. push element");
  System.out.println("2. pop element");
  System.out.println("3. search element");
  System.out.println("4. exit");

System.out.println("enter your choice");
choice = Integer.parseInt(br.readLine());

switch(choice)
{
case 1:

  System.out.println("enter element");
  
element = Integer.parseInt(br.readLine());
stpush1(st,element);
break;

case 2:
stpop1(st);
break;

case 3:
System.out.println("enter element to search");
element = Integer.parseInt(br.readLine());
pos = stsearch1(st, element);

if(pos==-1)
System.out.println("element not found");
else
	System.out.println("element found @ position:" + pos);
break;


 default:
  return;
   }//end of switch

System.out.println("stack = "+st);
  } // end of while

}
}