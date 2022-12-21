
public class Donguler {

	public static void main(String[] args) {
		
		
//	WHILE DÖNGÜSÜ
		int sayi = 5;
		while (sayi>0) {
			System.out.println("Sayı pozitiftir. Sayı değeri: " + sayi);
			sayi--;
		}
		
		
		
		while(true) {
			System.out.println("Döngü");
			System.out.println("Döngü");
			System.out.println("Döngü");
			break;
		}
		
		
		int i=10, j=0, k=0;
		while(i>j) {
			System.out.println("i, j'den büyük.");
			i-=2;
			j+=2;
			k++;
		}
		System.out.println("Artık i, j'den küçük.");
		System.out.println("Bu döngü " + k + " defa döndü.");
		
		
//	DO-WHILE DÖNGÜSÜ
		int sayii = 1;
		do {
			System.out.println("Sayı değişkeni : " + sayii);
		} while (sayi<0);
		
		
		
		int x=100, y=40, z=0;
		do {
			z++;
			x-=10;
			y+=10;
		} while (x>y);
		System.out.println("Döngü " + z + " defa döndü.");
		
		
//		FOR DÖNGÜSÜ
		for(int w = 1; w <= 50; w++) {
			if(w % 7 == 0) {
				System.out.println(w + ", 7'ye tam bölünen bir sayıdır.");
			}
		}
		
		
		int m,n;
		System.out.println("Döngü başladı.");
		for(m=0, n=10; m<n; m++, n--) {
			System.out.println(m + " değeri, " + n + " değerinden küçüktür.");
		}
		System.out.println("Döngü bitti.");
		
		
		int u = 1;
		for(char q = 'a'; q <= 'e'; q++) {
			System.out.println("Alfabenin " + u + ". harfi = " + q);
			u++;
		}
		
		
		
//		GELİŞMİŞ FOR DÖNGÜSÜ - FOREACH
		int [] dizi = {1,2,3,4,5};
		for (int l : dizi) {
			System.out.print(l + " ");
		}
		
		System.out.println();
		
		int [] dizii = new int[4];
		for(int ü = 0; ü < 4; ü++) {
			dizii[ü] = 3*ü+ü*ü;
		}
		int s = 1;
		for (int üü : dizii) {
			System.out.println("Dizinin " + s + ". elemanı = " + üü);
			s++;
		}
		
		
		
	}

}
