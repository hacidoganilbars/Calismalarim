package ilbars.haci.dogan.odevMatematikSayilar;

class SoruBir {

	public SoruBir() {
		System.out.println("Soru-1.\nA 4 basamakl� bir say�, B 3 basamakl� 2. bir say�d�r.");
		System.out.println("Buna g�re A*B �arp�m� en az ka� basamakl�d�r?\n");
		System.out.println("A) 5\tB) 6\tC) 7\nD) 8\tE) 9");
	}

	public int kacBasamak(int dortBasamakliSayi, int ucBasamakliSayi) {
		/*
		 * soruda a i�in 4 basamak b i�in 3 basamak diyordu bu 4 ve 3 verdi�imde
		 * ka� basamak oldu�unu vermektedir
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
			System.out.print("\nDo�ru cevap=> ");

		} else {
			System.out.print("\nArad���m cevap de�il");
		}

	}

}
