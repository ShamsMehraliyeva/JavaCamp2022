package stringsDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mesaj = "    Bugun hava cok guzel.";		
		System.out.println(mesaj);
		
		/*
		 * System.out.println("Element sayi: " + mesaj.length());
		 * System.out.println("Beshinci elemean: " + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yashasin!")); System.out.println(mesaj);
		 * System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.startsWith("b"));
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[25];
		 * mesaj.getChars( 0, 5,karakterler,0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf('a'));
		 * System.out.println(mesaj.indexOf("av"));
		 * System.out.println(mesaj.lastIndexOf('a'));
		 */
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5)); //gun
		
		for(String kelime:mesaj.split(" "))
		{
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
	}

}
