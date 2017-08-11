package com.ilbars.hacidogan.odevdosyaokumayazma;

import java.io.File;

public class OlusturDosyaFile {

	private File d = null;

	public void dosyaOlustur(String dosya) {
		d = new File(dosya);
		if (d.exists()) {
			System.out.println(d.getName() + " dosyas� zaten vard�");
		} else {
			d.mkdir();
			System.out.println(d.getName() + " dosyas� olu�turuldu");
		}

	}

	public void fileOlustur(String file) {
		d = new File(file);
		if (d.exists()) {
			System.out.println(d.getName() + " file zaten vard�");
		} else {
			try {
				d.createNewFile();
				System.out.println(d.getName() + " file olu�turuldu");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
