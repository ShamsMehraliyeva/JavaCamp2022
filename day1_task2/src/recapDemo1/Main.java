package recapDemo1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
//		if(sayi1>sayi2 && sayi1>sayi2){
//			System.out.println(sayi1);
//		}else if(sayi2>sayi1 && sayi2>sayi3){
//			System.out.println(sayi2);	
//		}else{
//			System.out.println(sayi3);
//		}
		
		int enBuyuk = sayi1;
		if(enBuyuk<=sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = "+enBuyuk);
	}

}
