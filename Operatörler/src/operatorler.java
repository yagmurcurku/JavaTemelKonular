
public class operatorler {

	public static void main(String[] args) {
		
//		TEMEL ATAMA OPERATÖRÜ
		String ad = "Mehmet";
		int a = 5;
		int c = a;
		
		System.out.println(ad);
		System.out.println(a);
		System.out.println(c);
		
//		ATAMA OPERATÖRLERİ
		int x = 10;
		System.out.println(x = x + 5);
		System.out.println(x += 5);
		
		int y = 10;
		System.out.println(y = y * 10);
		System.out.println(y *= 10);
		
		int aa = 10, bb = 20, cc = 100, dd = 40;
		aa += 5;
		bb -= 25;
		cc *= 2;
		dd /= 10;
		System.out.println(aa+","+bb+","+cc+","+dd+",");
		
//		ÇOKLU ATAMA İŞLEMİ
		int sayi1 = 3;
		int sayi2 = 5;
		int k = sayi1 = sayi2;
		System.out.println(k);
		System.out.println(sayi1);
		System.out.println(sayi2);
		
//		İKİ DEĞİŞKEN DEĞERİNİN TAKAS YAPILMASI
		int j = 5;
		int l = 10;
		int m;
		m = j;
		j = l;
		l = m;
		System.out.println("j değeri = " + j);
		System.out.println("l değeri = " + l);

//		İLİŞKİSEL OPERATÖRLER
		int g = 10;
		int ğ = 6;
		System.out.println(g > ğ);
		
		int ı = 5;
		int i = 6;
		boolean sonuc = ı < i;
		System.out.println(sonuc);
		
		int sayi11 = 1;
		int sayi12 = 2;
		if(sayi11 == sayi12) {
			System.out.println("Sayılar aynı");
		}
		if(sayi11 != sayi12) {
			System.out.println("sayılar farklı");
		}

//		ARİTMETİK OPERATÖRLER
		int xx = 8;
		int yy = 5;
		System.out.println("toplama işlemi sonucu: " + (xx + yy));
		System.out.println("çıkarma işlemi sonucu: " + (xx - yy));
		System.out.println("çarpma işlemi sonucu: " + (xx * yy));
		System.out.println("bölme işlemi sonucu: " + (xx / yy));
		System.out.println("mod alma işlemi sonucu: " + (xx % yy));
		
		
//		ARTTIRMA(++) VE AZALTMA(--) OPERATÖRLERİ
		int sayii = 20;
		int q,w,z,v;
		g = ++sayii;
		System.out.println(g);
		w = sayii++;
		System.out.println(w);
		System.out.println(sayii);
		z = --sayii;
		System.out.println(z);
		v = sayii--;
		System.out.println(v);
		System.out.println(sayii);
		
		
//		MANTIKSAL OPERATÖRLER
		int sifre = 1234;
		String kullaniciAdi = "mehmet";
		if(sifre==1234 && kullaniciAdi=="mehmet") {
			System.out.println("giriş başarılı");
		}
		
		boolean u = false;
		boolean o = true;
		System.out.println(" u & o = " + (u & o));
		System.out.println(" u | o = " + (u | o));
		System.out.println(" u && o = " + (u && o));
		System.out.println(" u || o = " + (u || o));
		System.out.println(" !u = " + (!u));
		System.out.println(" !o = " + (!o));
		System.out.println(" (u & o) || (u | o) = " + ((u & o) || (u | o)));
		

		
		
	}
}



