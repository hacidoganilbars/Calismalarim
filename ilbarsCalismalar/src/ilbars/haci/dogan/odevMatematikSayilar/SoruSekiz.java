package ilbars.haci.dogan.odevMatematikSayilar;

class SoruSekiz {
	
	public SoruSekiz(){
		System.out.println("Soru-8.\nAli, �c basamakl� bir say�yla 20'yi �arparken\n"
				+ "say�n�n 2 olan onlar basama��n� yanl��l�kla 4 \nolarak alm�� ve i�lemin sonucunu 6880 ola-\nrak bulmu�tur.\n"
				+ "Ali, i�lemi do�ru yapsayd� sonucu ka� bulacakt�?\n");
		System.out.println("A) 6440\tB) 6480\tC) 6520\nD) 6580\tE) 6640\n");
	}
	public int yanlisiDuzelt(int sayi){
		int sonuc=sayi-20*20;
		return sonuc;
		
	}

}
