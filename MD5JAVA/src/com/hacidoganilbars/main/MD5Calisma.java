package com.hacidoganilbars.main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Calisma {
	public static void main(String[] args) {

		String parola = "ilbars";

		try {
			MessageDigest mdNesnesi = MessageDigest.getInstance("MD5");
			mdNesnesi.update(parola.getBytes());
			byte mesajDigestDizisi[] = mdNesnesi.digest();
			StringBuffer sb16 = new StringBuffer();
			StringBuffer sb32 = new StringBuffer();

			for (int i = 0; i < mesajDigestDizisi.length; i++) {
				sb16.append(Integer.toString((mesajDigestDizisi[i] & 0xff) + 0x100, 16).substring(1));
				sb32.append(Integer.toString((mesajDigestDizisi[i] & 0xff) + 0x100, 32));
			}
			System.out.println("Parolanýn Þifrelenmiþ Hali:(16) " + sb16.toString());
			System.out.println("Parolanýn Þifrelenmiþ Hali:(32) " + sb32.toString());

		} catch (NoSuchAlgorithmException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
