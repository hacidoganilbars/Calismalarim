package ilbars.haci.dogan.jdbcOdev;

import java.util.List;

public class Islem {

	public static void main(String[] args) {

		// SQL ba�lant�
		DataBaseOgrenci dataBaseOgrenci = new DataBaseOgrenci();
		dataBaseOgrenci.baglan();

		
		
		// insert into �rne�i
		// dataBaseOgrenci.insertIntoOgrenci(5, "Ay�e", "�lbars", "K�z",
		// "10/A");
		// dataBaseOgrenci.insertIntoOgrenci(6, "Hac� Do�an", "�lbars", "Erkek",
		// "11/A");
		// dataBaseOgrenci.insertIntoOgrenci(7, "Hakan", "Ceylan", "Erkek",
		// "11/A");
		// dataBaseOgrenci.insertIntoOgrenci(8, "Hamza Fatih", "Sevim", "Erkek",
		// "9/C");
		
		

		// ��renci numaras�na g�re istenebilecek bilgiler Select �rne�i
		// OgrenciEntity ogrEntity = dataBaseOgrenci.numarasiylaOgrenciGetir(7);
		// if (ogrEntity != null) {
		// System.out.println(ogrEntity.getAd() + " " + ogrEntity.getSoyad() + "
		// " + ogrEntity.getSinif());
		// }
		
		

		// T�m ��renci se�im Select �rne�i
		// List<OgrenciEntity> ogrList = dataBaseOgrenci.selectListOgr();
		// for (int i = 0; i < ogrList.size(); i++) {
		// OgrenciEntity ogrenciEntity = ogrList.get(i);
		// System.out.println(ogrenciEntity.getOgrenciNo() + " " +
		// ogrenciEntity.getAd() + " "
		// + ogrenciEntity.getSoyad() + " " + ogrenciEntity.getCinsiyet() + " "
		// + ogrenciEntity.getSinif());
		//
		// }
		
		

		// ��renci delete �rne�i
		// dataBaseOgrenci.silOgrenci(7);

		
		
		// �grenci numaras� g�ncelleme Update �rne�i
		dataBaseOgrenci.ogrenciGuncelle(8);

	}

}
