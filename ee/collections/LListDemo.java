import java.util.*;
import java.io.*;
class LListDemo
{
public static void main(String args[]) throws IOException
{
//create an empty linked list
LinkedList ll = new LinkedList();

//add elements to LL

ll.add("INDIA");
ll.add("America");
ll.add("France");
ll.add("Britain");
ll.add("Italy");

//display the contents of LL
System.out.println("list:"+ll);

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String element;
int pos, choice=0;

//menu
while(choice<4)
{
  System.out.println("LL Operation");
  System.out.println("1. insert element");
  System.out.println("2. remove element");
  System.out.println("3. change element");
  System.out.println("4. exit");


  System.out.println("enter your choice");
choice = Integer.parseInt(br.readLine());

switch(choice)
{
case 1:

  System.out.println("enter element");
  element = br.readLine();
  System.out.println("enter position no");
pos = Integer.parseInt(br.readLine());
ll.add(pos,element);
break;

case 2:
System.out.println("enter position no");
pos = Integer.parseInt(br.readLine());
ll.remove(pos);
break;

case 3:
System.out.println("enter new element");
element = br.readLine();
System.out.println("enter pos number");
pos = Integer.parseInt(br.readLine());
ll.set(pos,element);
break;


  default:
  return;
   }
System.out.println("List = "+ll);
  }
}
}