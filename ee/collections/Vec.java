//Vector demo

import java.util.*;

class Vec{
public static void main(String a[])throws Exception{

//creat a empty vec
Vector v = new Vector();

//take an int type array;
int x[] = {22,56,40,87,77};

//read from array & store it into v...

for(int i=0;i<x.length;i++)
v.add(new Integer(x[i]));

//retriev elements from v & display;

for(int i=0;i<v.size();i++)
System.out.println(v.get(i));

//retriev elements from v usin list iterator....

ListIterator lit = v.listIterator();

System.out.println("elements in forw dir");
while(lit.hasNext())
System.out.println(lit.next());

System.out.println("elemnts in rev dir");

while(lit.hasPrevious())
System.out.println(lit.previous());

 }
}