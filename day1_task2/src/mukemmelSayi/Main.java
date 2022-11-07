package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 -> 1,2,3
		//28 -> 1,2,4,7,14
	    
		int number = 28;
		int dividerSum = 0;
		for (int i = 1; i < number; i++) {
			if(number%i==0) dividerSum+=i;
		}
		
		if(number==dividerSum) {System.out.println(number+" is a perfect number");}
		else {System.out.println(number + " is not a perfect number");}
	}

}
