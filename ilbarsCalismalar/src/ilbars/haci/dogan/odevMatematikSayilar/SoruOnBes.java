package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnBes {

	SoruOnBes() {
		System.out.println("Soru-15.\nAAB ve BBA üç basamaklý sayýlardýr.\n"
				+ "\tAAB + BBA = 1443\nolduðuna göre, A * Bçarpýmýnýn\n" + "alabileceði en büyük deðer kaçtýr?\n");
		System.out.println("A) 32\tB) 35\tC) 36\nD) 40\tE) 42\n");
	}

	public int maxRakamCarp(int x) {
		int a;
		int sonuc = (x / 111);
		a = (sonuc - 1) / 2;
		return a * (a + 1);

	}

}
