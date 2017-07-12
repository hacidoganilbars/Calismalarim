package ilbars.haci.dogan.odevMatematikSayilar;

class SoruIki {
	public SoruIki() {
		System.out.println("Soru-2.\nÜç basamaklı 10 sayının herbirinin yüzler basamağının sayı değeri 2 arttırılır,\n"
				+ "onlar basamağının sayı değeri 4 azaltılırsa sayıların toplamı kaç artar?\n");
		System.out.println("A) 1200\tB) 1400\tC) 1500\nD) 1600\tE) 1800");
	}

	public int toplamKacArtar(int ucBasamakliSayi1, int ucBasamakliSayi2, int ucBasamakliSayi3, int ucBasamakliSayi4,
			int ucBasamakliSayi5, int ucBasamakliSayi6, int ucBasamakliSayi7, int ucBasamakliSayi8,
			int ucBasamakliSayi9, int ucBasamakliSayi10) {
		int toplam = (ucBasamakliSayi1 + ucBasamakliSayi2 + ucBasamakliSayi3 + ucBasamakliSayi4 + ucBasamakliSayi5
				+ ucBasamakliSayi6 + ucBasamakliSayi7 + ucBasamakliSayi8 + ucBasamakliSayi9 + ucBasamakliSayi10)
				+ (2 * 100 * 10 - 4 * 10 * 10);
		int sonToplam = toplam + (2 * 100 * 10 - 4 * 10 * 10);
		System.out.println("\nGirilen Sayıların Toplamı: " + toplam + "\nişlenmiş hali: " + sonToplam);
		System.out.print("Doğru Cevap=> ");
		return (2 * 100 * 10 - 4 * 10 * 10);
	}

}
