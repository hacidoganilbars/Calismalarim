package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnSekiz {
	public SoruOnSekiz() {
		System.out.println("Soru-18.\nAB4 ve 1AB �� basamakl� say�lard�r.\n"
				+ "\tAB4 = 4 * (1AB)\noldu�una g�re, A + B toplam� ka�t�r?\n");
		System.out.println("A) 11\tB) 12\tC) 13\nD) 14\tE) 15\n");
	}

	public void rakamTopla() {
		int AB = 66;
		int A = (AB) / 10;
		int B = (AB) % 10;
		System.out.println(A + B);
	}

}
