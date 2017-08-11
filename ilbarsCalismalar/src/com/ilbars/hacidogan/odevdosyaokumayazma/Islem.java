package com.ilbars.hacidogan.odevdosyaokumayazma;

import java.io.IOException;

public class Islem {
	public static void main(String[] args) throws IOException {
		String dosya = "C:/Kisiler";
		String file = "C:/Kisiler/Bilgiler.txt";

		OlusturDosyaFile odf = new OlusturDosyaFile();
		odf.dosyaOlustur(dosya);
		odf.fileOlustur(file);

		OkuYazBilgiler oyb = new OkuYazBilgiler();
		String veri="Adý: Hacý Doðan\nSoyadý: Ýlbars\nYaþ: 30\nKurs: Vektorel23";
		oyb.dosyaYaz(file, veri.getBytes());
		oyb.dosyaOku(file);

		
	

	}

}
