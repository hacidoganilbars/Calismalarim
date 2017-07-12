package ilbars.haci.dogan.odevMatematikSayilar;

class SoruOnDort {
	int ab;
	int cd;
	public SoruOnDort() {
		System.out.println("Soru-14.\nAB ve CD iki basamaklý sayýlardýr.\n"
				+ "\tAB + CD = 55\nolacak þekilde kaç farklý AB sayýsý vardýr?\n");
		System.out.println("A) 42\tB) 41\tC) 40\nD) 36\tE) 35\n");
	}

	public void kacFarkli(int x) {
		 
		 cd=10;
		 ab=x-cd;
		 for (int i = 10; i <=x; i++) {
			System.out.println("Sayýlar: " +i);
		}
		 int sayilar=x-cd-9;
		 System.out.println(sayilar+ " tane");

		

	}

}
