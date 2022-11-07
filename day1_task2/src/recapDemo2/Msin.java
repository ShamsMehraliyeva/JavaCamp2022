package recapDemo2;

public class Msin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {1.2,2.3,3.4,4.5,5.6};
		double total=0;
		double max = myList[0];
		for(double number:myList) {
			total+=number;
			if(max<number) {
				max=number;
			}
			System.out.println(number);
		}
		
		System.out.println("Toplam = "+total);

		System.out.println("En buyuk sayi = "+max);
	}

}
