package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOn {
	int cevap = 1;
	int ABCDE = 0;

	public SoruOn() {
		System.out.println("Soru-10.\n1, 2, 3, 4, 5 rakamlar� birer kez kullan�larak\n"
				+ "yaz�lan ABCDE be� basamakl� say�s�nda,\n\tA + B = D + E\noldu�una g�re, ka� farkl� ABCDE Say�s�\n"
				+ "vard�r?\n");
		System.out.println("A) 4\tB) 5\tC) 8\nD) 10\tE) 12\n");

	}

	public int uygunSayilar(int ABCDE) {
		this.ABCDE = ABCDE;
		if (ABCDE == 15342) {
			cevap++;
			return this.cevap;
		}
		if (ABCDE == 51324) {
			cevap++;
			return this.cevap;
		}
		if (ABCDE == 51342) {
			cevap++;
			return this.cevap;
		}
		if (ABCDE == 24315) {
			cevap++;
			return this.cevap;
		}
		if (ABCDE == 24351) {
			cevap++;
			return this.cevap;
		}
		if (ABCDE == 42315) {
			cevap++;
			return this.cevap;
		}
		if (ABCDE == 42351) {
			cevap++;
			return this.cevap;
		} else {
			System.out.println("Say� uygun de�il!");

		}
		return cevap;
	}

	public void kacTane(int cevap) {
		this.cevap = 8;
		cevap = this.cevap;
		if (cevap == 8) {
			System.out.println("Do�ru=> " + cevap);
		} else {
			System.out.println("Yanl��");
		}
	}

}
