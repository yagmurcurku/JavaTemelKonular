import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diziler {

	public static void main(String[] args) {
		
//	DİZİ TANIMLAMA
		int[] dizi= {1, 2};
		
		int[] dizi1 = new int[] {1,2};
		
		int[] dizi2;
		dizi2 = new int[] {1,2,3};
		
		int[] dizi3 = new int[3];
		
		
//  DİZİ ELEMANINA ERİŞİM
		int[] dizi4 = {2,4,6,8,10};
		System.out.println(dizi4[0]);

		
//	DİZİ ELEMANLARINI LİSTELEME
		int[] dizi5 = new int[5];
		dizi5 = new int[] {9,8,7,6,5};
		
		for(int i = 0; i<dizi5.length; i++) {	//for döngüsü ile erişme
			System.out.println(i);
		}
		
		for (int i : dizi5) {					//foreach döngüsü ile erişme
			System.out.println(i);
		}
	
		
//	ASCII KODUNA ERİŞİM
		int[] dizi6 = new int[] {1,'2',3};
		System.out.println(dizi6[1]);
		
		
//	OBJECT SINIFINDAN DİZİ OLUŞTURMA
		Object[] dizi7 = new Object[3];
		dizi7 = new Object[] {1,"Yağmur", 2.33};
		for(int j = 0; j<dizi7.length; j++) {
			System.out.println("Dizinin " + j + ". elemanı = " + dizi7[j]);
		}
		
		
//	DİZİLERİ KOPYALAMA
		int[] dizi8 = new int[4];
		for(int i = 0; i<dizi8.length; i++) {
			dizi8[i] = i+i;
		}
		
		int[] dizi9 = new int[dizi8.length];		//for döngüsü ile kopyalama
		for(int i = 0; i<dizi8.length; i++) {
			dizi9[i] = dizi8[i];
		}
		
		for (int i : dizi9) {
			System.out.println(i);
		}
		
		
		int[] dizi10 = new int[4];					//"System.arraycopy" metodu ile kopyalama 
		System.arraycopy(dizi8, 0, dizi10, 0, 4);
		for (int i : dizi10) {
			System.out.println(i);
		}
		
		
//	DİZİLERİ SIRALAMA
		System.out.println("--------");
		int[] dizi11 = {1,8,6,3,7,2};
		Arrays.sort(dizi11);
		for (int i : dizi11) {
			System.out.println(i);
		}
		System.out.println("--------");
		int[] dizi12 = {1,8,6,3,7,2};
		Arrays.sort(dizi12,1,4);		//dizinin sadece 1-4 arası elemanları sıralandı.
		for (int i : dizi12) {
			System.out.println(i);
		}
		
		
//	DİZİLERİ KARŞILAŞTIRMA
		char[] dizi13 = {'x'};
		char[] dizi14 = {'y'};
		System.out.println(Arrays.equals(dizi13, dizi14));
		
		int[] dizi15 = {16,24};
		int[] dizi16 = {16,24};
		System.out.println(Arrays.equals(dizi15, dizi16));
		
		
//	ÇOK BOYUTLU DİZİ TANIMI
		int[][] dizi17 = new int[3][3];
		int[][] matris = new int[][] {{3,6},{3,7}};
		
		
//	ÇOK BOYUTLU DİZİ ELEMANLARINA ERİŞİM
		int[][] dizi18 = new int[][] {{3,6},{3,7}};
		System.out.println(dizi18[0][1]);
		
		
//	ÇOK BOYUTLU DİZİLERİ LİSTELEME
		int[][] dizi19;
		dizi19 = new int[2][2];
		dizi19[0][0] = 9;
		dizi19[0][1] = 8;
		dizi19[1][0] = 7;
		dizi19[1][1] = 6;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(dizi19[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
//	ÇOK BOYUTLU DİZİNİN UZUNLUĞI
		int[][] dizi20 = {{1,2},{1,3},{1,2,5}};
		System.out.println(dizi20.length);
		System.out.println(dizi20[0].length);
		System.out.println(dizi20[1].length);
		System.out.println(dizi20[2].length);
		
		
//	DİZİYİ LİSTE YAPISINA KOPYALAMA
		String[] dizi21 = {"Edirne", "İstanbul", "Tekirdağ"};
		Integer[] dizi22 = {22,33,44,55};
		
		List<String> liste1 = new ArrayList<>();
		List<Integer> liste2 = new ArrayList<>();
		
	
		liste1 = Arrays.asList(dizi21);
		liste2 = Arrays.asList(dizi22);
		
		System.out.println(liste1);
		System.out.println(liste1.get(0));
		System.out.println(liste2);
		System.out.println(liste2.get(1));
		
		
//	DİZİYİ BELLİ BİR BÖLÜME KADAR KOPYALAMA <<(Arrays.copyOf)>>
		char[] dizi23 = {'k','o','d','l','a','m','a'};
		char[] yeniDizi = {};
		
		System.out.print("Kopyalanacak dizi: ");
		for (char c : dizi23) {
			System.out.print(c);
		}
		
		System.out.println();
		
		yeniDizi = Arrays.copyOf(dizi23, 3);
		System.out.print("Yeni dizi: ");
		for (char c : yeniDizi) {
			System.out.print(c);
		}
		
		System.out.println();
		System.out.println("----------------");
		
//	DİZİNİN BELİRLİ BİR ARALIĞINI KOPYALAMA <<(Arrays.copyOfRange)>>
		int[] dizi24 = {11,22,33,44,55,66};
		int[] yeniDizi2 = {};
		
		System.out.print("Kopyalanacak dizi: ");
		for (int i : dizi24) {
			System.out.print(i);
		}
		
		System.out.println();
		
		yeniDizi2 = Arrays.copyOfRange(dizi24, 2, 4);
		System.out.print("Yeni dizi: ");
		for (int i : yeniDizi2) {
			System.out.print(i);
		}
		
		System.out.println();
		System.out.println("---------------");
		
		
//	DİZİYE ELEMAN ATAMA <<(Arrays.fill)>>
		int[] dizi25 = {0,0,0,0,0};
		int[] dizi26 = {1,1,1,1,1};
		
		Arrays.fill(dizi25, 5);
		Arrays.fill(dizi26, 2, 4, 9);
		
		System.out.println("1. dizinin yeni hali: ");
		for (int i : dizi25) {
			System.out.print(i);
		}
		
		System.out.println();
		
		System.out.println("2. dizinin yeni hali: ");
		for (int i : dizi26) {
			System.out.print(i);
		}
		
		
		
	
	}
}