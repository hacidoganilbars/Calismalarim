package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnIki {
	public SoruOnIki() {
		System.out.println(
				"Soru-12.\nAþaðýdakilerden hangisi AB ve BA iki basamaklý sayýlarýnýn\n" + "toplamý olabilir?\n");
		System.out.println("A) 118\tB) 124\tC) 132\nD) 144\tE) 160\n");
	}

	public int basamakAyirTopla_AB_BA(int ab, int ba) {
		int a = (ab - ab % 10) / 10;
		int b = (ba - ba % 10) / 10;
		return topla_AB_BA(a, b);

	}

	public int topla_AB_BA(int a, int b) {
		int x = 10 * a + b;
		int y = 10 * b + a;
		int z = x + y;

		return z;
	}

}
