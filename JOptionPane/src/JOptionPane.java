
public class JOptionPane {

	public static void main(String[] args) {
		
		
//	KULLANICIDAN VERİ ALMA
		String sayi = javax.swing.JOptionPane.showInputDialog("Bir sayı girin");
		
		int yeniSayi = Integer.parseInt(sayi);
		
		System.out.println("Girilen sayı: " + yeniSayi);
		
		
//	BİLGİ MESAJI GÖNDERME
		javax.swing.JOptionPane.showMessageDialog(null, "Bilgilendirme mesajı");
		
		
//	BİLGİ MESAJINI DEĞİŞTİREREK GÖNDERME
		javax.swing.JOptionPane.showMessageDialog(null, "Dikkat", "!!!", javax.swing.JOptionPane.WARNING_MESSAGE
				);
		javax.swing.JOptionPane.showMessageDialog(null, "Dikkat", "!!!", javax.swing.JOptionPane.OK_OPTION
				);
		
	
		javax.swing.JOptionPane.showMessageDialog(null, 16, "!!!", javax.swing.JOptionPane.CANCEL_OPTION
				);
	

		
		
	}

}
