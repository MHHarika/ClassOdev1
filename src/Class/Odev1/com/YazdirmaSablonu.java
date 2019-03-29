package Class.Odev1.com;

public class YazdirmaSablonu {
	static String ogrencininAdi;
	static int ogrenciNo;
	
	static public void FatihBilisimOkuluProgramBasligiYazdir() {
		System.out.println("************* Fatih Biliþim Okulu *******************");
		System.out.println("*****************************************************");
	}
	
	static public void BilgiVerenBasligiYazdir(int sayi) {
		System.out.println("****************************************************");
		System.out.println(" *** " +  sayi + " Harfli bir öðrenci adi üretiliyor." + " *** " );
		System.out.println("****************************************************");

	}
	
	static public void AyracYazdir() {
		System.out.println("*****************************************************");
		System.out.println("**********************");
	
	}
	
	
	static public void SonucuYazdir(String ad,int no,int sayi) {
		ogrencininAdi = ad;
		ogrenciNo = no;
		System.out.println("******" + sayi + ". öðrencinin Adý " + ad + " ve numarasý:  " + no + "********");
	}
	}
	

