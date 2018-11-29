package com.ams.resource;


public class PasswordEncryptor {

	public static PasswordEncryptor pe;
	
	private PasswordEncryptor(){
		System.out.println("this has been invoked once");
	}
	
	public static PasswordEncryptor  getPasswordEncryptor(){
		if(pe==null){
			pe=new PasswordEncryptor();
			return pe;
		}
		else return pe;
	}
	
	
	public static String passwordEncrypt(String s) {
		
		char[] a = s.toCharArray();
		String lola = "";
		for (int i = 0; i < s.length(); i++) {

			if ((int) a[i] < 124) {
				if (i % 2 == 0) {

					a[i] = (char) ((int) a[i] + 2);
					// System.out.println(a[i]);
					lola = lola + a[i];
				} else {
					a[i] = (char) ((int) a[i] + 1);
					// System.out.println(a[i]);
					lola = lola + a[i];
				}

			}
		}
	

	return lola;

	}
	
}