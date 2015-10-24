//hashmap with telephone entries....

import java.io.*;
import java.util.*;

class HM{
public static void main(String args[])throws IOException{

//creat vars...
 HashMap hm = new HashMap();
 String name,str;
 Long phno;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//menu...

while(true)
{
 
System.out.println("1. enter entries into phonebook:");
System.out.println("2. to look in the phone book:");

int n = Integer.parseInt(br.readLine());

switch(n)
{

 case 1:

System.out.println("enter the person name:");
name = br.readLine();

System.out.println("enter phone no:");
 str = br.readLine();
phno = new Long(str);

hm.put(name,phno);
break;

  case 2:
System.out.println("enter the person name:");
name = br.readLine();
phno=(Long)hm.get(name);
System.out.println("phno:"+phno);

break;

default:
return;
   }
  }
 }
}