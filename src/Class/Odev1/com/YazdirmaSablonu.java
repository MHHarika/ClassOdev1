package Class.Odev1.com;

public class YazdirmaSablonu {
	static String ogrencininAdi;
	static int ogrenciNo;
	
	static public void FatihBilisimOkuluProgramBasligiYazdir() {
		System.out.println("************* Fatih Bili�im Okulu *******************");
		System.out.println("*****************************************************");
	}
	
	static public void BilgiVerenBasligiYazdir(int sayi) {
		System.out.println("****************************************************");
		System.out.println(" *** " +  sayi + " Harfli bir ��renci adi �retiliyor." + " *** " );
		System.out.println("****************************************************");

	}
	
	static public void AyracYazdir() {
		System.out.println("*****************************************************");
		System.out.println("**********************");
	
	}
	
	
	static public void SonucuYazdir(String ad,int no,int sayi) {
		ogrencininAdi = ad;
		ogrenciNo = no;
		System.out.println("******" + sayi + ". ��rencinin Ad� " + ad + " ve numaras�:  " + no + "********");
	}
	}
	

