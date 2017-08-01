package ilbars.haci.dogan.jdbcOdev;

import java.util.List;

public class Islem {

	public static void main(String[] args) {

		// SQL baðlantý
		DataBaseOgrenci dataBaseOgrenci = new DataBaseOgrenci();
		dataBaseOgrenci.baglan();

		
		
		// insert into örneði
		// dataBaseOgrenci.insertIntoOgrenci(5, "Ayþe", "Ýlbars", "Kýz",
		// "10/A");
		// dataBaseOgrenci.insertIntoOgrenci(6, "Hacý Doðan", "Ýlbars", "Erkek",
		// "11/A");
		// dataBaseOgrenci.insertIntoOgrenci(7, "Hakan", "Ceylan", "Erkek",
		// "11/A");
		// dataBaseOgrenci.insertIntoOgrenci(8, "Hamza Fatih", "Sevim", "Erkek",
		// "9/C");
		
		

		// öðrenci numarasýna göre istenebilecek bilgiler Select örneði
		// OgrenciEntity ogrEntity = dataBaseOgrenci.numarasiylaOgrenciGetir(7);
		// if (ogrEntity != null) {
		// System.out.println(ogrEntity.getAd() + " " + ogrEntity.getSoyad() + "
		// " + ogrEntity.getSinif());
		// }
		
		

		// Tüm öðrenci seçim Select örneði
		// List<OgrenciEntity> ogrList = dataBaseOgrenci.selectListOgr();
		// for (int i = 0; i < ogrList.size(); i++) {
		// OgrenciEntity ogrenciEntity = ogrList.get(i);
		// System.out.println(ogrenciEntity.getOgrenciNo() + " " +
		// ogrenciEntity.getAd() + " "
		// + ogrenciEntity.getSoyad() + " " + ogrenciEntity.getCinsiyet() + " "
		// + ogrenciEntity.getSinif());
		//
		// }
		
		

		// Öðrenci delete örneði
		// dataBaseOgrenci.silOgrenci(7);

		
		
		// Ögrenci numarasý güncelleme Update Örneði
		dataBaseOgrenci.ogrenciGuncelle(8);

	}

}
