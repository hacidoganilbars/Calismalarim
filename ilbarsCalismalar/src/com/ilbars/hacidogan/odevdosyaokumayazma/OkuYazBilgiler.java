package com.ilbars.hacidogan.odevdosyaokumayazma;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OkuYazBilgiler {

	public void dosyaOku(String file) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			int b;
			while ((b = bis.read()) != -1) {

				System.out.print((char) b);

			}

		} catch (IOException e) {
			System.out.println("hata");
			e.printStackTrace();
		}
	}

	public void dosyaYaz(String file,byte[]veri) throws IOException {
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		try {	
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			for (int i = 0; i < veri.length; i++) {
				bos.write(veri[i]);
				bos.flush();
			}
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}finally{
			bos.close();
		}
	}

}
