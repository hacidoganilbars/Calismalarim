package ilbars.haci.dogan.odevMatematikSayilar;

class SoruYirmi {
	public SoruYirmi() {
		System.out.println("Soru-20.\nAB * 24 = abc + def = 444\n"
				+ "yukar�daki �arpma i�lemi s�ras�nda bir hata yap�lm�� ve def say�s� abc\n"
				+ "say�s�n�n hizas�nda yaz�lm��t�r. Buna g�re A + B ka�t�r?\n");
		System.out.println("A) 10\tB) 11\tC) 12\nD) 13\tE) 14\n");
	}

	public int duzelt(int x) {
		int AB = x / 6;
		AB = AB / 10 + AB % 10;
		return AB;

	}
}
