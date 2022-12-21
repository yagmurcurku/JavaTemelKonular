
public class Metodlar2 {

	public static void main(String[] args) {
		
//	METODLARA DİZİ TÜRÜNDEN PARAMETRE GEÇİRMEK
		int dizi[] = new int[] {1,4,7};
		islemYap(dizi);
		for (int e : dizi) {
			System.out.println(e);
		}
	
		System.out.println("--------------------");
		
//	OVERLOADING - AŞIRI YÜKLEME
		System.out.println(metod1(5));
		System.out.println(metod1(3, 5));
		
		System.out.println(metod2(5, 3.6));
		System.out.println(metod2(6.8, 5));
		
	}

	
	
	
	static void islemYap(int dizi[]) {
		for(int i = 0; i<3; i++) {
			dizi[i] = i*i;
		}	
	}

	
	static int metod1(int sayi) {
		return sayi;
	}
	static int metod1(int sayi1, int sayi2) {
		return sayi1;
	}
	
	
	static int metod2(int sayi1, double sayi2) {
		return sayi1;
	}
	static int metod2(double sayi1, int sayi2) {
		return sayi2;
	}
	
	
	
}
