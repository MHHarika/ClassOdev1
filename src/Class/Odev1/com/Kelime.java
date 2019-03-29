package Class.Odev1.com;

import java.util.Random;

public class Kelime {
	static char[] Dizi = new char[26];

	public static String KelimeUret(int harfSayisi) {
		byte index = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			Dizi[index] = i;
			index++;
		}

		String kelime = "";
		for (int j = 0; j < harfSayisi; j++) {
			Random random = new Random();
			int harfIndexi = random.nextInt(26);
			char harf = Dizi[harfIndexi];
			kelime += harf;
		}

		return kelime;
        }
	
	
}