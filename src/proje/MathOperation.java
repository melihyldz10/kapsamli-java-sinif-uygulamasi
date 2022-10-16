package proje;
import java.util.Scanner;

public class MathOperation {
	

	
	public MathOperation() {
	
	}
	
	
	public void cýkarma(double s1,double s2) {
		if(s1-(int)s1==0 && s2-(int)s2==0){//s1 ve s2 degerleri degeri Tam sayý ise Girer. 
			if(s1>s2) {//s1 degeri s2 den büyük ise s1 degerinden s2 degeri çýkartýlýr.
				 int sonuc=(int)(s1-s2);
				 System.out.println("Ýsleminin Sonucu: "+(int)s1+"-"+(int)s2+" = "+sonuc);
			}else {//s2 degeri büyükse s1'den s2 degerinden s1 degeri çýkartýlýr.
				 int sonuc=(int)(s2-s1);
				 System.out.println("Ýsleminin Sonucu: "+(int)s2+"-"+(int)s1+" = "+sonuc);
			}
	       }else if(s2-(int)s2==0){ //eðer s2 degeri tam sayý s1 degeri double bir sayý ise girer.
	    	   if(s1>s2) {//s1 degeri s2 den büyük ise s1 degerinden s2 degeri çýkartýlýr. int tam sayýya dönüþtürülmüþtür.
		        	 double sonuc=s1-s2;
						System.out.println("Ýsleminin Sonucu: "+s1+"-"+(int)s2+" = "+sonuc);     
	    	   }else {
	    		   double sonuc=s2-s1;
					System.out.println("Ýsleminin Sonucu: "+(int)s2+"-"+s1+" = "+sonuc);    
	    	   }  
	        }else if(s1-(int)s1==0){//eðer s1 degeri tam sayý s2 degeri double bir sayý ise girer.
	        	if(s1>s2) {
					double sonuc=s1-s2;
					System.out.println("Ýsleminin Sonucu: "+(int)s1+"-"+s2+" = "+sonuc);	
	        	}else {
					double sonuc=s2-s1;
					System.out.println("Ýsleminin Sonucu: "+s2+"-"+(int)s1+" = "+sonuc);
	        	}
	        }else {//eðer s1 ve s2 degerleri double ise girer.
	        	if(s1>s2) {
	        	  	double sonuc=s1-s2;
					System.out.println("Ýsleminin Sonucu: "+s1+"-"+s2+" = "+sonuc);	
	        	}else {
	        	  	double sonuc=s2-s1;
					System.out.println("Ýsleminin Sonucu: "+s2+"-"+s1+" = "+sonuc);
	        	}
	        }		
	}
	
	public void toplama(double s1 ,double s2) {
		 if(s1-(int)s1==0 && s2-(int)s2==0){  //Eðer s1 ve s2 sayýsý tam sayý ise if karar yapýsý çalýþýr.
			 int sonuc=(int)(s1+s2);//toplama iþlemi double türünde sonuc deðiþkeninde tutulur.
				System.out.println("Ýsleminin Sonucu: "+(int)s1+"+"+(int)s2+" = "+sonuc);//ekrana yazdýrýlýr.
	        }else if(s2-(int)s2==0){  //Eðer  s2 sayýsý tam sayý ise else if karar yapýsý çalýþýr.
	        	 double sonuc=s1+s2;//toplama iþlemi double türünde sonuc deðiþkeninde tutulur.
					System.out.println("Ýsleminin Sonucu: "+s1+"+"+(int)s2+" = "+sonuc); //ekrana yazdýrýlýr.    
	        }else if(s1-(int)s1==0){ //Eðer  s1 sayýsý tam sayý ise else if karar yapýsý çalýþýr.
					double sonuc=s1+s2;//toplama iþlemi double türünde sonuc deðiþkeninde tutulur.
					System.out.println("Ýsleminin Sonucu: "+(int)s1+"+"+s2+" = "+sonuc);//ekrana yazdýrýlýr.    
	        }else {//eðer s1 ve s2 deðerleri tam sayý degilse ekrana double türünde deðerler yazýlýr.
	        	double sonuc=s1+s2;
				System.out.println("Ýsleminin Sonucu: "+s1+"+"+s2+" = "+sonuc);
	        }
		
	}
	
	public void carpma(double s1,double s2) {
		
		if(s1-(int)s1==0 && s2-(int)s2==0){  //Eðer s1 ve s2 sayýsý tam sayý ise if karar yapýsý çalýþýr.
				double sonuc = (double)(s1*s2);
				System.out.println("Ýsleminin Sonucu: "+(int)s1+"x"+(int)s2+" = "+(int)sonuc);
	        }else if(s2-(int)s2==0){  //Eðer  s2 sayýsý tam sayý ise else if karar yapýsý çalýþýr.
	        		double sonuc = (double)(s1*s2);
					System.out.println("Ýsleminin Sonucu: "+s1+"x"+(int)s2+" = "+(double)sonuc);
					
	        }else if(s1-(int)s1==0){//Eðer  s1 sayýsý tam sayý ise else if karar yapýsý çalýþýr.
	        	double sonuc = (double)(s1*s2);
				System.out.println("Ýsleminin Sonucu: "+(int)s1+"x"+s2+" = "+(double)sonuc);
	        }else {//eðer s1 ve s2 deðerleri tam sayý degilse ekrana double türünde deðerler yazýlýr.
	        	double sonuc = (double)(s1*s2);
				System.out.println("Ýsleminin Sonucu: "+s1+"x"+s2+" = "+(double)sonuc);
	        }
	}
	
	public void bolme(double s1, double s2) {
		if(s1-(int)s1==0 && s2-(int)s2==0){  //Eðer s1 ve s2 sayýsý tam sayý ise if karar yapýsý çalýþýr.
			int sonuc =Math.floorDiv((int)s1,(int)s2);
			System.out.println("Ýsleminin Sonucu: "+(int)s1+"/"+(int)s2+" = "+sonuc);
        }else if(s2-(int)s2==0){//Eðer  s2 sayýsý tam sayý ise else if karar yapýsý çalýþýr.
    		double sonuc = s1/s2;
    		System.out.println("Ýsleminin Sonucu: "+s1+"/"+(int)s2+" = "+sonuc);
				
        }else if(s1-(int)s1==0){//Eðer  s1 sayýsý tam sayý ise else if karar yapýsý çalýþýr.
        	double sonuc = s1/s2;
        	System.out.println("Ýsleminin Sonucu: "+(int)s1+"/"+s2+" = "+sonuc);
        }else {//eðer s1 ve s2 deðerleri tam sayý degilse ekrana double türünde deðerler yazýlýr.
        	double sonuc = s1/s2;
        	System.out.println("Ýsleminin Sonucu: "+s1+"/"+s2+" = "+sonuc);
        }
		
	}
	
	public void karekok(double s1) {
		if(s1-(int)s1==0){  //Eðer s1 sayýsý tam sayý ise if karar yapýsý çalýþýr.
			System.out.println((int)s1 + " Sayýsýnýn Kare kökü: "+(int)Math.sqrt((int)s1));//math sýnýfýnýn karekök alma iþlemidir.
        }else {
        	System.out.println(s1 + " Sayýsýnýn Kare kökü: "+(double)Math.sqrt(s1));
        }
	}
	
	public void kupkop(double s1) {
		if(s1-(int)s1==0){  //Eðer s1  sayýsý tam sayý ise if karar yapýsý çalýþýr.
			System.out.println((int)s1 + " Sayýsýnýn Küp Kökü: "+Math.cbrt((int)s1));//math sýnýfýnýn kupkop alma iþlemidir.
        }else {
        	System.out.println(s1 + " Sayýsýnýn Küp Kökü: "+Math.cbrt(s1));
        }
		
	}
	
	public void usAlma(double s1 ,double s2) {
		//s1= taban;
		//s2=kuvvet;
		if(s1-(int)s1==0 && s2-(int)s2==0){  //Eðer s1 ve s2 sayýsý tam sayý ise if karar yapýsý çalýþýr.
			double sonuc =Math.pow((int)s1, (int)s2);//Math sýnýfýnýn üyesi olan üst alma fonksiyonu kullanýlmýþtýr. 
			System.out.println("Ýsleminin Sonucu: "+(int)s1+"^"+(int)s2+" = "+(int)sonuc);
        }else if(s2-(int)s2==0){ //Eðer  s2 sayýsý tam sayý ise else if karar yapýsý çalýþýr. 
    		double sonuc =Math.pow(s1, (int)s2);
			System.out.println("Ýsleminin Sonucu: "+s1+"^"+(int)s2+" = "+sonuc);
        }else if(s1-(int)s1==0){//Eðer  s1 sayýsý tam sayý ise else if karar yapýsý çalýþýr.
        	double sonuc =Math.pow((int)s1,s2); 	
			System.out.println("Ýsleminin Sonucu: "+(int)s1+"^"+s2+" = "+sonuc);
        }else {//eðer s1 ve s2 deðerleri tam sayý degilse ekrana double türünde deðerler yazýlýr.
        	double sonuc =Math.pow(s1, s2);
			System.out.println("Ýsleminin Sonucu: "+s1+"^"+s2+" = "+sonuc);
        }
	}

		
	public void mathOperations(){
		char islem,secim;
		double s1,s2;
		Scanner sayýAl = new Scanner(System.in);
		System.out.println("Matematiksel Ýþlemleri Seçtiniz");	
		System.out.println("======"+"1. Dört Ýþlem Menüsü "+"======");
		System.out.println("======"+"2. Karekök Ýþlemi "+"======");
		System.out.println("======"+"3. KüpKok Ýþlemi "+"======");
		System.out.println("======"+"4. Kuvvet Alma Ýþlemi "+"======");
		System.out.println("======"+"5. Faktoriyel hesabý"+"======");	
		
		do {
			System.out.println("Lütfen Geçerli Bir Deðer Giriniz=  ");
			islem=sayýAl.next().charAt(0);//girilen degerin karakterini tutar.
		}while(!(islem>='1' && islem<='5'));
		
		switch(islem) {
		case '1':
			System.out.println("===========Dört Ýþlem Menusunu Seçtiniz===========");
			System.out.println("1. Toplama Ýþlemi");
			System.out.println("2. Cýkarma Ýþlemi");
			System.out.println("3. Çarpma Ýþlemi");
			System.out.println("4. Bölme Ýþlemi");
			
			do {
				System.out.println("Lütfen Geçerli Bir Deðer Giriniz=  ");
				secim = sayýAl.next().charAt(0);	
			}while(!(secim>='1' && secim<='4'));
			
			if(secim == '1') {//Toplama Ýþlemi
				System.out.println("===========Toplama Ýþlemini Seçtiniz===========");
				System.out.println("Birinci Sayýyý Giriniz: ");
				s1 = sayýAl.nextDouble();
				System.out.println("Ýkinci Sayýyý Giriniz: ");
				s2 = sayýAl.nextDouble();
				toplama(s1,s2);
			
			}else if(secim == '2') {//Çýkarma Ýþlemi
				System.out.println("===========Çýkarma Ýþlemini Seçtiniz===========");
				System.out.println("Birinci Sayýyý Giriniz: "); 
				s1 = sayýAl.nextDouble();
				System.out.println("Ýkinci Sayýyý Giriniz: ");
				s2 = sayýAl.nextDouble();
				cýkarma(s1,s2);	
				
			}else if(secim == '3') {//Çarpma Ýþlemi
				System.out.println("===========Çarpma Ýþlemini Seçtiniz===========");
				System.out.println("Birinci Sayýyý Giriniz: ");
				 s1 = sayýAl.nextDouble();
				System.out.println("Ýkinci Sayýyý Giriniz: ");
				 s2 = sayýAl.nextDouble();
				carpma(s1,s2);
				
			}else if(secim == '4') {//Bölme Ýþlemi
				System.out.println("===========Bölme Ýþlemini Seçtiniz===========");
				System.out.println("Bölünen Sayýyý Giriniz: ");
				s1 = sayýAl.nextDouble();
				System.out.println("Bölen Sayýyý Giriniz: ");
				s2 = sayýAl.nextDouble();
				bolme(s1,s2);
			}	
			
			break;
			
		case '2'://Kare Kök
			System.out.println("===========Kare Kök Alma Ýþlemini Seçtiniz===========");
			System.out.println("Kare Kökünü Almak Ýstediðiniz Sayýyý Giriniz: ");
			double KareKok = sayýAl.nextDouble();
			karekok(KareKok);
			break;
			
		case '3': //Küp Kök
			System.out.println("===========Küp Kök Alma Ýþlemini Seçtiniz===========");
			System.out.println("Küp Kökünü Almak Ýstediðiniz Sayýyý Giriniz: ");
			double KupKok = sayýAl.nextDouble();
			kupkop(KupKok);
			break;
			
		case '4'://Üs alma
			System.out.println("===========Üs Alma Ýþlemini Seçtiniz===========");
			System.out.println("Taban Sayýyýsýný Giriniz: ");
			double taban = sayýAl.nextDouble();
			System.out.println("Kuvvet Sayýsýný Giriniz: ");
			double kuvvet = sayýAl.nextDouble();
			usAlma(taban,kuvvet);
			break;
			
		case '5': 
			System.out.println("===========Faktöriyel Alma Ýþlemini Seçtiniz===========");
			int faktoriyel=1;//faktoriyel deðiþkenine 1 deðeri atanýr.
			System.out.println("Faktöriyelini Almak Ýstediðiniz Sayýyý Giriniz: ");
			int fakt = sayýAl.nextInt();// kullanýcýdan sayýsal bir deðer alýnýr.
			if(fakt == 0 || fakt== 1) {//eðer faktöriyel 0 veya bir ise kullanýcýdan farklý bir rakam istenecektir. deðil ise kod blogu çalýþacak. 
				System.out.println("Lütfen 0 ve 1 Rakamlarýndan Farklý Bir Rakam Giriniz.");
			}else {
				for(int i=1; i<=fakt; i++) {//döngü kullanýcýnýn girdigi deðer kadar göndecektir.
					 faktoriyel *=i;//1 den baþlayarak her defasýnda 1 artýþ ile kullanýcnýn girdigi deðer kadar çarpýlur.
				}
				System.out.println(fakt+"! Sayýsýnýn Faktöriyeli: "+faktoriyel);//ekrana faktoriyelin cevabý verilir.
			}
			break;
			default: System.out.println("Yanlýþ Bir Ýþlem Yaptýnýz Lütfen Kontrol Edip Tekrar Deneyiniz."); 
		
		}
		
	}
	
	

}
