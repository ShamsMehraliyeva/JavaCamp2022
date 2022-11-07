package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 13;
		boolean isPrimeNumber = true;
		
		if(number==1)
		{
			System.out.println(number+" is not prime");
			return;
		}
		if(number<1)
		{
			System.out.println("invalid number");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if(number%i==0) 
			{
				isPrimeNumber = false;
				return;
			}
		}
		
		if(isPrimeNumber) {System.out.println(number+" is prime number");}
		else {System.out.println(number+" isn't prime number");}

	}

}
