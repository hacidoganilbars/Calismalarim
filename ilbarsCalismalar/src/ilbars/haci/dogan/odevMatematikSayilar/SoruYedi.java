package ilbars.haci.dogan.odevMatematikSayilar;

class SoruYedi {
	public SoruYedi() {
		System.out.println("Soru-7.\nABC �� basamakl� bir say�d�r.\n"
				+ "\tx = 20 * ABC\ni�leminde A 1 artar, B 2 azal�r, C 5 artarsa x ka� artar?\n");
		System.out.println("A) 1600\tB) 1650\tC) 1700\nD) 1750\tE) 1800\n");
	}

	public int islemSonucu() {
		int sonuc;
		sonuc = 20 * 100 + 20 * 5 - 20 * 20;
		return sonuc;
	}

}
