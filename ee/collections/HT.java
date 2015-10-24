//hashtable with cricket scores....

import java.io.*;
import java.util.*;

class HT{
public static void main(String args[])throws IOException{

//creat an empty hash table....
 Hashtable ht = new Hashtable();

//store the key value pairs...

ht.put("yuraj",new Integer(66));
ht.put("sachi",new Integer(99));
ht.put("kapil",new Integer(102));
ht.put("dhoni",new Integer(60));
ht.put("gavas",new Integer(0));  

//retriev all keys...
 
Enumeration e = ht.keys();
System.out.println("player list is..");

while(e.hasMoreElements())
System.out.println(e.nextElement());

//accept the player name from K.B...

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the player name:");
String name = br.readLine();

//to get the runs...
Integer runs = (Integer)ht.get(name);

if(runs==null)
  System.out.println("player not found");
else
  {
    int n = runs.intValue();   //wrappper class methods
    System.out.println(name + " scored runs " + n);
  }
 }
}








                         







