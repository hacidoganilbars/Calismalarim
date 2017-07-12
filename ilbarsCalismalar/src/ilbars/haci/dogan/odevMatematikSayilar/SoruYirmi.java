package ilbars.haci.dogan.odevMatematikSayilar;

class SoruYirmi {
	public SoruYirmi() {
		System.out.println("Soru-20.\nAB * 24 = abc + def = 444\n"
				+ "yukarýdaki çarpma iþlemi sýrasýnda bir hata yapýlmýþ ve def sayýsý abc\n"
				+ "sayýsýnýn hizasýnda yazýlmýþtýr. Buna göre A + B kaçtýr?\n");
		System.out.println("A) 10\tB) 11\tC) 12\nD) 13\tE) 14\n");
	}

	public int duzelt(int x) {
		int AB = x / 6;
		AB = AB / 10 + AB % 10;
		return AB;

	}
}
