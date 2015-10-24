package Animals;

public class CheckAnimal implements Animal{

	   public void eat(){
	      System.out.println("Mammal eats");
	   }

	   public void travel(){
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs(){
	      return 0;
	   }

	   public static void main(String args[]){
	      CheckAnimal m = new CheckAnimal();
	      m.eat();
	      m.travel();
	   }

	@Override
	public void Nature() {
		// TODO Auto-generated method stub
		
	}
	} 
