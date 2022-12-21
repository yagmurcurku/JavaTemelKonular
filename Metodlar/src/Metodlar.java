import java.util.Scanner;

public class Metodlar {

	static int x,y;
	static int buyukSayi;
	static String adi, soyadi;
	public static void main(String[] args) {
		
		ekranaYaz();
		carp();

		String isim = yaz();
		System.out.println(isim);
		
		int a = 5, b = 2;
		islem(a, b);
		aktar();
		
		int q = hesapla(4, 5);
		System.out.println("Büyük olan sayı: " + q);
		
		degerAl("Yağmur", "Çurku");
		yazdir();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		long sonuc = faktoriyelHesapla(sayi);
		System.out.println(sayi + "! = " + sonuc);
		
		metod1();
		metod2();
		metod3(1);
		metod4(2);
	}
	
	
	
	
	static void ekranaYaz() {
		System.out.println("Bu metod çağırıldı.");
	}
	
	static void carp() {
		System.out.println(3*5);
	}

	
	static String yaz() {	//geriye dönen değer String olduğu için void yerine String yazıldı.
		return "Mehmet";	//Eğer geriye değer dönecekse, dönüş tipi metodun başına yazılmalıdır.
	}
	
	
	static void islem(int a, int b) {			//parametreli metod
		x=a;
		y=b;
	}
	
	static void aktar() {						//parametresiz metod
		System.out.println("x değeri : " + x);
		System.out.println("y değeri : " + y);
	}
	
	
	static int hesapla(int i, int j) {
		if(i>j) {
			buyukSayi = i;
		}
		else if(j>i) {
			buyukSayi = j;
		}
		return buyukSayi;
	}
	
	
	static void degerAl(String ad, String soyad) {
		adi = ad;
		soyadi = soyad;
	}
	
	static void yazdir() {
		System.out.println("Tam isim: " + adi + " " + soyadi);
	}
	
	
	static long faktoriyelHesapla(int deger) {
		int carpim = 1;
		for(int i = 1; i<=deger; i++) {
			carpim = carpim * i;
		}
		return carpim;
	}
	
	
	static void metod1() {
		System.out.println("Bu metod parametre almıyor ve değer döndürmüyor.");
	}
	static int metod2() {
		System.out.println("Bu metod parametre almıyor fakat değer döndürüyor.");
		return 2;
	}
	static void metod3(int a) {
		System.out.println("Bu metod parametre alıyor fakat değer döndürmüyor.");
	}
	static int metod4(int a) {
		System.out.println("Bu metod parametre alıyor ve değer döndürüyor.");
		return a;
	}
	
}