package ilkJavaProjemiz;

public class JavaProgrami {

	public static void main(String[] args) {
		
		System.out.println("İlk Java Programı");
		
		int i = 5;
		Integer j = new Integer(6);
		
		System.out.println(i);
		System.out.println(j);
		
		Integer x = Integer.valueOf(7);		//Java-9 ile bu şekile döndü.
		
		System.out.println(x);
		
		
//		String tipinden => int tipine cast
		String a = "16";
		
		int b = Integer.valueOf(a);
		System.out.println(b);
		
		int c = Integer.parseInt(a);
		System.out.println(c);
		
//		int tipinden => String tipine cast
		int sayı = 5;
		
		String sayı1 = String.valueOf(sayı);
		System.out.println(sayı1);
		
		String sayı2 = Integer.toString(sayı);
		System.out.println(sayı2);
		
		System.out.println(sayı1 + "-" + sayı2);
		
//		double tipinden => int tipine cast(küsuratları yok etmek için)
		double sayi = 345.6;
		
		int sayi2 = (int)sayi;
		System.out.println(sayi2);
		
//		int tipinden => double tipine cast
		int sayiint = 345;
		
		double sayidouble = (double)sayiint;
		System.out.println(sayidouble);
		
//		float tipinden => long tipine cast
		float sayifloat = 345.6f;
		
		long sayilong = (long)sayifloat;
		System.out.println(sayilong);
		
//		long tipinden => float tipine cast
		long sayii = 3578;
		
		float sayiii = (float)sayii;
		System.out.println(sayiii);
		
		
		
		String s1 = "4";
		
		int s1yeni = Integer.parseInt(s1);
		
		System.out.println(s1yeni * s1yeni);
		
	}
}