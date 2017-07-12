package ilbars.haci.dogan.odevMatematikSayilar;

public class Islem {

	public static void main(String[] args) {

		// SoruBir
		SoruBir s1 = new SoruBir();
		// System.out.println(s1.kacBasamak(9000, 900));
		System.out.println(s1.kacBasamak(1000, 100));

		System.out.println("\n");
		SoruIki s2 = new SoruIki();
		int sonuc = s2.toplamKacArtar(100, 100, 100, 100, 100, 100, 100, 100, 100, 100);
		System.out.println(sonuc);

		System.out.println("\n");
		SoruUc s3 = new SoruUc();
		// System.out.println(s3.sayilarinToplami(210, 431, 652, 873));
		int toplam = s3.sayilarinToplami(210, 431, 652, 873);
		s3.cevapGoster(toplam);

		System.out.println("\n\n");
		SoruDort s4 = new SoruDort();
		s4.hesaplaABC(106);
		s4.hesaplaABC(502);
		s4.hesaplaABC(124);
		s4.hesaplaABC(160);
		s4.hesaplaABC(520);
		s4.hesaplaABC(142);
		s4.hesaplaABC(601);
		s4.hesaplaABC(304);
		s4.hesaplaABC(214);
		s4.hesaplaABC(610);
		s4.hesaplaABC(340);
		s4.hesaplaABC(241);
		s4.hesaplaABC(205);
		s4.hesaplaABC(403);
		s4.hesaplaABC(412);
		s4.hesaplaABC(250);
		s4.hesaplaABC(430);
		s4.hesaplaABC(421);

		System.out.println("\n\n");
		SoruBes s5 = new SoruBes();
		s5.sayfaSayisindaKacRakam(234);

		System.out.println("\n\n");
		SoruAlti s6 = new SoruAlti();
		s6.sonuc();

		System.out.println("\n\n");
		SoruYedi s7 = new SoruYedi();
		System.out.println(s7.islemSonucu());

		System.out.println("\n\n");
		SoruSekiz s8 = new SoruSekiz();
		System.out.println(s8.yanlisiDuzelt(6880));

		System.out.println("\n\n");
		SoruDokuz s9 = new SoruDokuz();
		s9.maxToplam();

		System.out.println("\n\n");
		SoruOn s10 = new SoruOn();
		int say = s10.uygunSayilar(15324);
		say = s10.uygunSayilar(15342);
		say = s10.uygunSayilar(51324);
		say = s10.uygunSayilar(51342);
		say = s10.uygunSayilar(24315);
		say = s10.uygunSayilar(24351);
		say = s10.uygunSayilar(42315);
		say = s10.uygunSayilar(42351);
		System.out.println(say);
		s10.kacTane(8);

	}

}
