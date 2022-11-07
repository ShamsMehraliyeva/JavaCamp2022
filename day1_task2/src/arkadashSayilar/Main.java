package arkadashSayilar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//220 -228
		
		int number1 = 220;
		int number2 = 284;
		int dividerSumNumber1 = 0;
		int dividerSumNumber2 = 0;
		
		for (int i = 1; i < number1; i++) {
			if(number1%i==0) {
				dividerSumNumber1 +=i;
			}
		}
		
		for (int i = 1; i < number2; i++) {
			if(number2%i==0) {
				dividerSumNumber2 +=i;
			}
		}
		
		if(number1==dividerSumNumber2 && number2==dividerSumNumber1)
		{
			System.out.println(number1+" and "+ number2+" is a friend numbers");
		}else {

			System.out.println(number1+" and "+ number2+" is not a friend numbers");
		}
	}

}
