package ilbars.haci.dogan.odevMatematikSayilar;

class SoruDort {
	int sayac = 0;

	public SoruDort() {
		System.out.println("Soru-4.\nABC rakamlarý farklý üç basamaklý bir doðal sayýdýr.\n"
				+ "\tA + B + C = 7\nolduðuna göre, bu þarta uyan kaç farklý ABC sayýsý yazýlabilir?\n");
		System.out.println("A) 12\tB) 15\tC) 18\nD) 20\tE) 24\n");

	}

	public void hesaplaABC(int ABC) {

		int A = (ABC - ABC % 100) / 100;
		int B = (ABC - A * 100 - ABC % 10) / 10;
		int C = ABC % 10;

		if (A != 0 && A + B + C == 7) {
			System.out.println(ABC);
			sayac++;

		} else {
			System.out.println("Yanlýþ sayý girdiniz ");

		}
		System.out.println("sayac= " + sayac + "\n");
	}

}
