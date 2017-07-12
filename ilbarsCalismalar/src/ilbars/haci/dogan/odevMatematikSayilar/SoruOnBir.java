package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnBir {
	public SoruOnBir() {
		System.out.println("Soru-11.\nMN iki basamaklý bir sayýdýr.\n"
				+ "\tM * x = 30\tN * x = 40\nolduðuna göre, MN * x çarpýmý kaçtýr?\n");
		System.out.println("A) 310\tB) 320\tC) 330\nD) 340\tE) 360\n");
	}

	public int sayiDegerMN(int MN) {
		int M = (MN - MN % 10);
		int N = MN % 10;
		return (M + N) * 10;

	}

}
