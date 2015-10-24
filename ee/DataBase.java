interface MyInter
     {
       void connect() ;  // public and abstract by default
     //void disconnect();
     }


class OracleDB implements MyInter
    {
        public void connect()
    {   
    System.out.println("connecting to oracle DB ......" ) ;
     }
   }

class SybaseDB implements MyInter
     {    public void connect()

       {  System.out.println(" connecting to sybase DB....." ) ;
     }
   }

class DataBase
         { public static void main(String args[]) throws Exception
             {
                 // accept user db name through commant line args 
				//and store it into an object C ;
        
	Class C = Class.forName(args[0]);

// create another object to the class where name is in C '
	MyInter  mi = (MyInter)C.newInstance() ;

// call connect() method using  mi ;
	mi.connect();
  }
 }

//best example for Dynamic polymorphism
