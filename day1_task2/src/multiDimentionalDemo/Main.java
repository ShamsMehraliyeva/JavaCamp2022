package multiDimentionalDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] shehirler =new String[3][3];
		shehirler[0][0] = "Istanbul";
		shehirler[0][1] = "Bursa";
		shehirler[0][2] = "Bilecik";
		shehirler[1][0] = "Ankara";
		shehirler[1][1] = "Konya";
		shehirler[1][2] = "Kayseri";
		shehirler[2][0] = "Diyarbakir";
		shehirler[2][1] = "Shanliurfa";
		shehirler[2][2] = "Gaziantep";
		
		//nasted loop
		for (int i = 0; i <= 2; i++) {
			System.out.println("------------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(shehirler[i][j]);
			}
		}
	}

}
