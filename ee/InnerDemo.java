//inner class demo

//outer class
class BankAcc {
private double bal;

BankAcc(double b){
   bal=b;
}  
   void start(double r)
 {
 Interest in = new Interest(r);
  System.out.println(in);
  in.calInt();
   }

private class Interest {  //inner class

private double rate;

Interest(double r){
rate=r;
}
 
 void calInt(){
double interest = bal * rate/100;  // bal is outer class variable
System.out.println("interest: " +interest);
bal+=interest;
System.out.println(" total balance is: " +bal);

    }
  
  } //end of inner class
} // end of outer class


class InnerDemo{

public static void main(String a[]){

BankAcc acc = new BankAcc(10000);
System.out.println(acc.hashCode());
acc.start(4.5);
  }
}