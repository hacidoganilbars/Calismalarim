package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnDokuz {
	public SoruOnDokuz() {
		System.out.println("Soru-19.\nABC + AB + CA = 965\n" + "Yukarýda verilen toplama iþlemine göre, \n"
				+ "A + B + C kaçtýr?\n");
		System.out.println("A) 15\tB) 16\tC) 17\nD) 18\tE) 19\n");

	}

	public int toplaRakamABC(int sayiToplam) {
		int sonuc = sayiToplam / 111 + (sayiToplam - ((sayiToplam / 111) * 111)) / 11;
		return sonuc;
	}

}
