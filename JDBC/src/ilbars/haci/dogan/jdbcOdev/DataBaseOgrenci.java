package ilbars.haci.dogan.jdbcOdev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseOgrenci {

	public Connection baglanti = null;

	public void baglan() {
		String URL = "jdbc:mysql://localhost:3306/okul";

		try {
			baglanti = DriverManager.getConnection(URL, "root", "8124782.Aa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (baglanti != null) {
			System.out.println("Baðlantý saðlandý!!!");
		}

	}

	public List<OgrenciEntity> selectListOgr() {
		String SQL = "SELECT * FROM OGRENCÝLER";
		List<OgrenciEntity> myList = new ArrayList<OgrenciEntity>();

		Statement statement = null;
		try {
			OgrenciEntity ogrenciEntity = null;
			statement = baglanti.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL);

			while (resultSet.next()) {
				ogrenciEntity = new OgrenciEntity();
				ogrenciEntity.setOgrenciNo(resultSet.getInt("ogrenci_no"));
				ogrenciEntity.setAd(resultSet.getString("adi"));
				ogrenciEntity.setSoyad(resultSet.getString("soyadi"));
				ogrenciEntity.setCinsiyet(resultSet.getString("cinsiyeti"));
				ogrenciEntity.setSinif(resultSet.getString("sinifi"));
				myList.add(ogrenciEntity);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return myList;

	}

	public void insertIntoOgrenci(int ogrenci_no, String adi, String soyadi, String cinsiyeti, String sinifi) {
		String SQL = "INSERT INTO ogrenciler (ogrenci_no, adi, soyadi, cinsiyeti, sinifi) VALUES (" + ogrenci_no + ",'"
				+ adi + "','" + soyadi + "','" + cinsiyeti + "','" + sinifi + "')";
		executeOgr(SQL);

	}

	public void executeOgr(String SQL) {
		Statement statement = null;
		try {
			statement = baglanti.createStatement();
			statement.execute(SQL);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public OgrenciEntity numarasiylaOgrenciGetir(int ogrenciNo) {
		String SQL = "SELECT * FROM ogrenciler WHERE ogrenci_no=" + ogrenciNo;
		Statement statement = null;
		OgrenciEntity ogrenciEntity = null;

		try {
			statement = baglanti.createStatement();
			ResultSet resultSet = statement.executeQuery(SQL);

			while (resultSet.next()) {
				ogrenciEntity = new OgrenciEntity();
				ogrenciEntity.setOgrenciNo(resultSet.getInt("ogrenci_no"));
				ogrenciEntity.setAd(resultSet.getString("adi"));
				ogrenciEntity.setSoyad(resultSet.getString("soyadi"));
				ogrenciEntity.setCinsiyet(resultSet.getString("cinsiyeti"));
				ogrenciEntity.setSinif(resultSet.getString("sinifi"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return ogrenciEntity;

	}

	public void silOgrenci(int ogrenciNo) {
		String SQL = "DeLETE FROM ogrenciler WHERE ogrenci_no = " + ogrenciNo;
		executeOgr(SQL);
		System.out.println(ogrenciNo+" numaralý öðrenci kaydý silindi!!");
	}
	
	public void ogrenciGuncelle(int ogrenciNo){
		
		String SQL="UPDATE ogrenciler SET sinifi ='12/B' WHERE ogrenci_no ="+ogrenciNo;
		executeOgr(SQL);
		
	}

}
