package Class.Odev1.com;

import java.util.Scanner;
import java.util.Random;

public class ProgramClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int sayi = 0;

		YazdirmaSablonu.FatihBilisimOkuluProgramBasligiYazdir();
		for (int i = 0; i < 10; i++) {
			System.out.println("Kaç harfli bir öðrenci adi üretilmesini istersiniz: ");
			int kacHarf = input.nextInt();
			YazdirmaSablonu.BilgiVerenBasligiYazdir(kacHarf);
			String adi = Kelime.KelimeUret(kacHarf);
			
			Random random = new Random();
			int ogno = random.nextInt(100);
			sayi++;
			Ogrenci ogrenci = new Ogrenci(adi, ogno);
			YazdirmaSablonu.SonucuYazdir(ogrenci.ogrenciAdi, ogrenci.ogrenciNo, sayi);
			YazdirmaSablonu.AyracYazdir();
		}
	}

}
