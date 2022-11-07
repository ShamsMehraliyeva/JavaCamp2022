package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		for (int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngü bitdi");
		
		//while
		int i = 2;
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngü bitdi");
		
		//do-while
		int j=100;
		 do {
			 System.out.println(j);
			 j+=2;
		 }while(i<=10);
		 System.out.println("Do-While döngü bitdi");
	}
}
