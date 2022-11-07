package sayiBulma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] {1,2,5,7,9,0};
		int search = 5;

		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==search)
			{
				System.out.println("Find the number");
				return;
			}
		}
		
		System.out.println("Don't find the number");
		
	}

}
