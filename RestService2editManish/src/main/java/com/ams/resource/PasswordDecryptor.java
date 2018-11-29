package com.ams.resource;

public class PasswordDecryptor {

	public static PasswordDecryptor pe;
	
	private PasswordDecryptor(){
		System.out.println("this has been invoked once");
	}
	
	public static PasswordDecryptor  getPasswordDecryptor(){
		if(pe==null){
			pe=new PasswordDecryptor();
			return pe;
		}
		else return pe;
	}
	
	
	public static String passwordDecrypt(String s) {
		
		char[] a = s.toCharArray();
		String lola = "";
		for (int i = 0; i < s.length(); i++) {

			if ((int) a[i] < 124) {
				if (i % 2 == 0) {

					a[i] = (char) ((int) a[i] - 2);
					// System.out.println(a[i]);
					lola = lola + a[i];
				} else {
					a[i] = (char) ((int) a[i] - 1);
					// System.out.println(a[i]);
					lola = lola + a[i];
				}

			}
		}
	

	return lola;

	}

}
