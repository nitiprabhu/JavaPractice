class PrimeNumber {
	static public void main(String[] args) {
		int num = 12;
		int i;
		for (i=2; i < num ;i++ ){
			int n = num%i;
			if (n==0){
				System.out.println("not Prime!");
				break;
			}
		}
		if(i == num){
			System.out.println("Prime number!");
		}
	}
}