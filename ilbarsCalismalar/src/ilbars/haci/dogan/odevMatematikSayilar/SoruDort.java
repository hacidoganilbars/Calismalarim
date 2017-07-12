package ilbars.haci.dogan.odevMatematikSayilar;

class SoruDort {
	int sayac = 0;

	public SoruDort() {
		System.out.println("Soru-4.\nABC rakamlar� farkl� �� basamakl� bir do�al say�d�r.\n"
				+ "\tA + B + C = 7\noldu�una g�re, bu �arta uyan ka� farkl� ABC say�s� yaz�labilir?\n");
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
			System.out.println("Yanl�� say� girdiniz ");

		}
		System.out.println("sayac= " + sayac + "\n");
	}

}
