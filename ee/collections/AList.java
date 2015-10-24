
//Array list demo
import java.util.*; //ArrayList

class AList{
public static void main(String args[])throws Exception{

//creat an empty arrlist\
ArrayList arl=new ArrayList();

//store elements into arl
arl.add("america");
arl.add("india");
arl.add("japan");
arl.add("china");
arl.add("russia");

//disp list elements
System.out.println("LIst="+arl);
System.out.println("size="+arl.size());

//del elems from arl
arl.remove("america");
arl.remove(1);

//disp list elements
System.out.println();

System.out.println("LIst after removing="+arl);
System.out.println("size="+arl.size());

//To retrive the elems 1 by 1 from any colln obj

Iterator it = arl.iterator();

System.out.println();

while(it.hasNext())
System.out.println(it.next());


//find no. of elems in arl

System.out.println("size="+arl.size());

 }
}



