package ilbars.haci.dogan.odevMatematikSayilar;

class SoruSekiz {
	
	public SoruSekiz(){
		System.out.println("Soru-8.\nAli, üc basamaklý bir sayýyla 20'yi çarparken\n"
				+ "sayýnýn 2 olan onlar basamaðýný yanlýþlýkla 4 \nolarak almýþ ve iþlemin sonucunu 6880 ola-\nrak bulmuþtur.\n"
				+ "Ali, iþlemi doðru yapsaydý sonucu kaç bulacaktý?\n");
		System.out.println("A) 6440\tB) 6480\tC) 6520\nD) 6580\tE) 6640\n");
	}
	public int yanlisiDuzelt(int sayi){
		int sonuc=sayi-20*20;
		return sonuc;
		
	}

}
