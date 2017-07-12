package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnSekiz {
	public SoruOnSekiz() {
		System.out.println("Soru-18.\nAB4 ve 1AB üç basamaklý sayýlardýr.\n"
				+ "\tAB4 = 4 * (1AB)\nolduðuna göre, A + B toplamý kaçtýr?\n");
		System.out.println("A) 11\tB) 12\tC) 13\nD) 14\tE) 15\n");
	}

	public void rakamTopla() {
		int AB = 66;
		int A = (AB) / 10;
		int B = (AB) % 10;
		System.out.println(A + B);
	}

}
