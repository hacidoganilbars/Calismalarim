package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnYedi {
	public SoruOnYedi() {

		System.out.println("Soru-17.\nAAB üç B iki basamaklý sayýlardýr.\n"
				+ "\tAAB + BB = 940\nolduðuna göre, A + B toplamý kaçtýr?\n");
		System.out.println("A) 11\tB) 12\tC) 13\nD) 14\tE) 15\n");
	}

	public int toplaRakamAB(int toplam) {

		int sonuc = toplam / 110 + (toplam - toplam / 110) / 12;

		sonuc = (sonuc - sonuc % 10) / 10 + sonuc % 10;

		return sonuc;
	}

}
