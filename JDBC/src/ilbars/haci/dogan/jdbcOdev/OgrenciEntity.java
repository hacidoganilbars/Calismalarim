package ilbars.haci.dogan.jdbcOdev;

public class OgrenciEntity {
	private int ogrenci_no;
	private String ad;
	private String soyad;
	private String cinsiyet;
	private String sinif;
	public int getOgrenciNo() {
		return ogrenci_no;
	}
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenci_no = ogrenciNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	

}
