package ilbars.haci.dogan.odevMatematikSayilar;

class SoruUc {
	int toplam = 0;

	public SoruUc() {
		System.out.println("Soru-3.\nABC üç basamaklý bir sayýdýr.\n"
				+ "\tA = B + 1\n\tB = 2C + 1\nolduðuna göre, bu koþulu saðlayan ABC sayýlarýnýn toplamý kaçtýr?\n");
		System.out.println("A) 2084\tB) 2122\tC) 2166\nD) 2214\tE) 2226\n");

	}

	public int sayilarinToplami(int UcBasGelecekDeger1, int UcBasGelecekDeger2, int UcBasGelecekDeger3,
			int UcBasGelecekDeger4) {

		int toplam = UcBasGelecekDeger1 + UcBasGelecekDeger2 + UcBasGelecekDeger3 + UcBasGelecekDeger4;
		this.toplam = toplam;
		return this.toplam;
	}

	public void cevapGoster(int toplam) {
		// sayilarinToplami(this.toplam);
		this.toplam = toplam;
		if (toplam == 2166) {
			System.out.print(this.toplam + " Doðru cevap");

		} else {
			System.out.println(this.toplam + " Yanlýþ cevap");
		}

	}

}
