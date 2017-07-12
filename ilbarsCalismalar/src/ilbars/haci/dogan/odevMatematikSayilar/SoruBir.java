package ilbars.haci.dogan.odevMatematikSayilar;

class SoruBir {

	public SoruBir() {
		System.out.println("Soru-1.\nA 4 basamaklý bir sayý, B 3 basamaklý 2. bir sayýdýr.");
		System.out.println("Buna göre A*B çarpýmý en az kaç basamaklýdýr?\n");
		System.out.println("A) 5\tB) 6\tC) 7\nD) 8\tE) 9");
	}

	public int kacBasamak(int dortBasamakliSayi, int ucBasamakliSayi) {
		/*
		 * soruda a için 4 basamak b için 3 basamak diyordu bu 4 ve 3 verdiðimde
		 * kaç basamak olduðunu vermektedir
		 */
		int h = dortBasamakliSayi - dortBasamakliSayi % 1000;
		int m = ucBasamakliSayi - ucBasamakliSayi % 100;
		int sonuc = (h * m);
		int sayac = 0;
		while (sonuc > 0) {
			sayac++;
			sonuc /= 10;
		}
		minBasamak(sayac);

		return sayac;
	}

	public void minBasamak(int sayac) {
		if (sayac == 6) {
			System.out.print("\nDoðru cevap=> ");

		} else {
			System.out.print("\nAradýðým cevap deðil");
		}

	}

}
