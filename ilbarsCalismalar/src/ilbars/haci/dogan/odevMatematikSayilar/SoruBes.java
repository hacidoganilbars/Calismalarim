package ilbars.haci.dogan.odevMatematikSayilar;

class SoruBes {

	int sayfaSayisi = 0;

	public SoruBes() {
		System.out.println("Soru-5.\n234 sayfal�k bir kitab� 1'den ba�layarak numaraland�rmak i�in,\n"
				+ "ka� rakam kullan�l�r?\n");
		System.out.println("A) 582\tB) 594\tC) 600\nD) 612\tE) 624\n");
	}

	public void sayfaSayisindaKacRakam(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
		if (this.sayfaSayisi <= 9) {
			System.out.println(this.sayfaSayisi);
		}
		if (10 <= this.sayfaSayisi && 99 >= this.sayfaSayisi) {

			System.out.println(((this.sayfaSayisi - this.sayfaSayisi % 10) * 2 + this.sayfaSayisi % 10));
		}
		if (100 <= this.sayfaSayisi && 999 >= this.sayfaSayisi) {

			System.out.println((this.sayfaSayisi - 100 + 1) * 3 + 189);
		}

	}

}
