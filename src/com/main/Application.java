package com.main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		String userName, password,verificationPassword = "",newPassword;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Kullanıcı Adını Giriniz: ");
		userName = inp.nextLine();
		
		System.out.println("Sifreniz: ");
		password = inp.nextLine();
		
		if (userName.equals("patika") && password.equals("java 123")) {
			System.out.println("Giris Yaptiniz !");
		}else {
			System.out.println("Bilgileriniz Yanlis ! \nSifrenizi Sifirlamak Istermisiniz ? \n1-Evet, 2-Hayir ");
			 String vote = inp.next();
			 if(vote.equals("1")) {
				System.out.println("Sifreniz bir onceki sifrenizle ayni olmamalidir ! \nYeni sifrenizi giriniz !");				
				newPassword = inp.next();
				System.out.println("lutfen yeni sifreyi dogrulayiniz");
				 	if (!newPassword.equals(password)) {
				 		System.out.println("Sifreniz Eski Sifre Ile Ayni Olmamali !");				 		
						verificationPassword = inp.next();
						if (newPassword.equals(verificationPassword)) {							
							System.out.println("Tebrikler Sifreniz Basari ile Degistirildi");
						}else if (!newPassword.equals(verificationPassword)){
							System.out.println("Sifre Yenileme Basarisiz !");
							System.out.println("Yenileme Islemini Dogru Yaptiginizdan Emin Olun!");
						}
				 	}  	
					else{
					  	System.out.println("Sifre Yenileme Basarisiz !\nSifreniz Eski Sifre Ile Ayni Olmamali !");
					}				 		
				 			  		
			}else {
				 System.out.println("Lutfen Sifrenizi Tekrar giriniz");
			}
			
		}

	}

}
