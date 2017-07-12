package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnYedi {
	public SoruOnYedi() {

		System.out.println("Soru-17.\nAAB �� B iki basamakl� say�lard�r.\n"
				+ "\tAAB + BB = 940\noldu�una g�re, A + B toplam� ka�t�r?\n");
		System.out.println("A) 11\tB) 12\tC) 13\nD) 14\tE) 15\n");
	}

	public int toplaRakamAB(int toplam) {

		int sonuc = toplam / 110 + (toplam - toplam / 110) / 12;

		sonuc = (sonuc - sonuc % 10) / 10 + sonuc % 10;

		return sonuc;
	}

}
