package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnAlti {
	public SoruOnAlti() {
		System.out.println("Soru-16.\nAB, BC, CA iki basamakl� say�lard�r.\n"
				+ "\tAB + BC + CA = 231\noldu�una g�re, en b�y�k ABC ka�t�r?\n");
		System.out.println("A) 945\tB) 966\tC) 972\nD) 984\tE) 993\n");
	}

	public int enBuyukABC(int x) {
		int a = 9;
		int b = 9;
		int c;
		int sonuc = x / 11;
		c = sonuc - 18;

		return a * 100 + b * 10 + c;
	}

}
