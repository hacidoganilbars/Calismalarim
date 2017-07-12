package ilbars.haci.dogan.odevMatematikSayilar;

public class Islem2 {

	public static void main(String[] args) {

		SoruOnBir s11 = new SoruOnBir();
		System.out.println(s11.sayiDegerMN(34));

		System.out.println("\n\n");
		SoruOnIki s12 = new SoruOnIki();
		// int toplamAB1=s12.topla_AB_BA(3, 2);
		// System.out.println(toplamAB1);
		int toplamAB = s12.basamakAyirTopla_AB_BA(66, 66);
		System.out.println(toplamAB);

		System.out.println("\n\n");
		SoruOnUc s13 = new SoruOnUc();
		s13.hesapla(41, 14);
		s13.hesapla(52, 25);
		s13.hesapla(63, 36);
		s13.hesapla(74, 47);
		s13.hesapla(85, 58);
		s13.hesapla(96, 69);

		System.out.println("\n\n");
		SoruOnDort s14 = new SoruOnDort();
		s14.kacFarkli(55);

		System.out.println("\n\n");
		SoruOnBes s15 = new SoruOnBes();
		int maxRak = s15.maxRakamCarp(1443);
		System.out.println(maxRak);

		System.out.println("\n\n");
		SoruOnAlti s16 = new SoruOnAlti();
		int enBuyuk = s16.enBuyukABC(231);
		System.out.println(enBuyuk);

		System.out.println("\n\n");
		SoruOnYedi s17 = new SoruOnYedi();
		int s17Top = s17.toplaRakamAB(940);
		System.out.println(s17Top);

		System.out.println("\n\n");
		SoruOnSekiz s18 = new SoruOnSekiz();
		s18.rakamTopla();

		System.out.println("\n\n");
		SoruOnDokuz s19 = new SoruOnDokuz();
		System.out.println(s19.toplaRakamABC(965));

		System.out.println("\n\n");
		SoruYirmi s20 = new SoruYirmi();
		System.out.println(s20.duzelt(444));

	}

}
