package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnUc {
	int sayac = 0;

	public SoruOnUc() {
		System.out.println("Soru-13.\nAB ve BA iki basamaklý sayýlardýr.\n"
				+ "\tAB - BA = 27\nolacak þekilde kaç farklý BA sayýsý vardýr?\n");
		System.out.println("A) 4\tB) 5\tC) 6\nD) 7\tE) 8\n");
	}

	public int hesapla(int ab, int ba) {

		int a = (ab - ab % 10) / 10;
		int b = (ba - ba % 10) / 10;
		System.out.println("A-B= " + cikar_AB_BA(a, b, 27));
		sayac++;
		System.out.println("sayac= " + sayac);
		return sayac;

	}

	public int cikar_AB_BA(int a, int b, int x) {
		x = 9 * (a - b);
		return (a - b);
	}

}
