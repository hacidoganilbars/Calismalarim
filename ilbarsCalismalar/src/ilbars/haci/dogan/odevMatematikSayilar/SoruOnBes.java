package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnBes {

	SoruOnBes() {
		System.out.println("Soru-15.\nAAB ve BBA �� basamakl� say�lard�r.\n"
				+ "\tAAB + BBA = 1443\noldu�una g�re, A * B�arp�m�n�n\n" + "alabilece�i en b�y�k de�er ka�t�r?\n");
		System.out.println("A) 32\tB) 35\tC) 36\nD) 40\tE) 42\n");
	}

	public int maxRakamCarp(int x) {
		int a;
		int sonuc = (x / 111);
		a = (sonuc - 1) / 2;
		return a * (a + 1);

	}

}
