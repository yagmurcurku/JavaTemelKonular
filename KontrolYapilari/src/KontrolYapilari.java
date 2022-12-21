import java.util.Scanner;

public class KontrolYapilari {

	public static void main(String[] args) {
		
//	IF-ELSE YAPISI
		int notOrt = 90;
		if(notOrt >= 50) {
			System.out.println("Başarılı");
		}
		else {
			System.out.println("Başarısız");
		}

	
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.sayıyı giriniz: ");
		int sayi1 = scanner.nextInt();
		System.out.println("2.sayıyı giriniz: ");
		int sayi2 = scanner.nextInt();
		if(sayi1>sayi2) {
			System.out.println(sayi1 + ", " + sayi2 + "'den büyüktür.");
		}
		else {
			System.out.println(sayi1 + ", " + sayi2 + "'den küçüktür.");
		}
		
		
//		IF-ELSE IF YAPISI
		int not = 90;
		if(not >= 85) {
			System.out.println("Harf notu : AA");
		}
		else if(not<85 && not>=70) {
			System.out.println("Harf notu : BA");
		}
		else if(not<70 && not>=60) {
			System.out.println("Harf notu : BB");
		}
		
		
//		İÇ İÇE IF YAPILARI
		int hiz = 91;
		if(hiz > 90) {
			System.out.println("Radara girdiniz.");
			if(hiz >= 120) {
				System.out.println("Cezanız 400 TL !");
			}
			else {
				System.out.println("Cezanız 200 TL !");
			}
		}
		else {
			System.out.println("Hızınız normal.");
		}
		
		
//		SWITCH YAPISI
		System.out.println("Sayıyı giriniz: ");
		int i = scanner.nextInt();
		switch (i) {
		case 1: {
			System.out.println("Sayımız 1'dir");
			break;
		}
		case 2: {
			System.out.println("Sayımız 2'dir");
			break;
		}
		case 3: {
			System.out.println("Sayımız 3'dür");
			break;
		}
		default:
			throw new IllegalArgumentException("Girilen sayı 1,2 veya 3 değildir. Lütfen geçerli bir sayı giriniz.");
		}
		
		
		
		int sayi = 2;
		switch (sayi) {
		case 1: case 3: case 5: case 7: case 9:
			System.out.println("Tek bir sayıdır.");
			break;
		case 2: case 4: case 6: case 8:
			System.out.println("Çift bir sayıdır.");
			break;
		}
		
		
	}

}
