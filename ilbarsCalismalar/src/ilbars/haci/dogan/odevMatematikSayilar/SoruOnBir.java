package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnBir {
	public SoruOnBir() {
		System.out.println("Soru-11.\nMN iki basamakl� bir say�d�r.\n"
				+ "\tM * x = 30\tN * x = 40\noldu�una g�re, MN * x �arp�m� ka�t�r?\n");
		System.out.println("A) 310\tB) 320\tC) 330\nD) 340\tE) 360\n");
	}

	public int sayiDegerMN(int MN) {
		int M = (MN - MN % 10);
		int N = MN % 10;
		return (M + N) * 10;

	}

}
