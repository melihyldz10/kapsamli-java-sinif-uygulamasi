package proje;
import java.util.Scanner;

public class MathOperation {
	

	
	public MathOperation() {
	
	}
	
	
	public void c�karma(double s1,double s2) {
		if(s1-(int)s1==0 && s2-(int)s2==0){//s1 ve s2 degerleri degeri Tam say� ise Girer. 
			if(s1>s2) {//s1 degeri s2 den b�y�k ise s1 degerinden s2 degeri ��kart�l�r.
				 int sonuc=(int)(s1-s2);
				 System.out.println("�sleminin Sonucu: "+(int)s1+"-"+(int)s2+" = "+sonuc);
			}else {//s2 degeri b�y�kse s1'den s2 degerinden s1 degeri ��kart�l�r.
				 int sonuc=(int)(s2-s1);
				 System.out.println("�sleminin Sonucu: "+(int)s2+"-"+(int)s1+" = "+sonuc);
			}
	       }else if(s2-(int)s2==0){ //e�er s2 degeri tam say� s1 degeri double bir say� ise girer.
	    	   if(s1>s2) {//s1 degeri s2 den b�y�k ise s1 degerinden s2 degeri ��kart�l�r. int tam say�ya d�n��t�r�lm��t�r.
		        	 double sonuc=s1-s2;
						System.out.println("�sleminin Sonucu: "+s1+"-"+(int)s2+" = "+sonuc);     
	    	   }else {
	    		   double sonuc=s2-s1;
					System.out.println("�sleminin Sonucu: "+(int)s2+"-"+s1+" = "+sonuc);    
	    	   }  
	        }else if(s1-(int)s1==0){//e�er s1 degeri tam say� s2 degeri double bir say� ise girer.
	        	if(s1>s2) {
					double sonuc=s1-s2;
					System.out.println("�sleminin Sonucu: "+(int)s1+"-"+s2+" = "+sonuc);	
	        	}else {
					double sonuc=s2-s1;
					System.out.println("�sleminin Sonucu: "+s2+"-"+(int)s1+" = "+sonuc);
	        	}
	        }else {//e�er s1 ve s2 degerleri double ise girer.
	        	if(s1>s2) {
	        	  	double sonuc=s1-s2;
					System.out.println("�sleminin Sonucu: "+s1+"-"+s2+" = "+sonuc);	
	        	}else {
	        	  	double sonuc=s2-s1;
					System.out.println("�sleminin Sonucu: "+s2+"-"+s1+" = "+sonuc);
	        	}
	        }		
	}
	
	public void toplama(double s1 ,double s2) {
		 if(s1-(int)s1==0 && s2-(int)s2==0){  //E�er s1 ve s2 say�s� tam say� ise if karar yap�s� �al���r.
			 int sonuc=(int)(s1+s2);//toplama i�lemi double t�r�nde sonuc de�i�keninde tutulur.
				System.out.println("�sleminin Sonucu: "+(int)s1+"+"+(int)s2+" = "+sonuc);//ekrana yazd�r�l�r.
	        }else if(s2-(int)s2==0){  //E�er  s2 say�s� tam say� ise else if karar yap�s� �al���r.
	        	 double sonuc=s1+s2;//toplama i�lemi double t�r�nde sonuc de�i�keninde tutulur.
					System.out.println("�sleminin Sonucu: "+s1+"+"+(int)s2+" = "+sonuc); //ekrana yazd�r�l�r.    
	        }else if(s1-(int)s1==0){ //E�er  s1 say�s� tam say� ise else if karar yap�s� �al���r.
					double sonuc=s1+s2;//toplama i�lemi double t�r�nde sonuc de�i�keninde tutulur.
					System.out.println("�sleminin Sonucu: "+(int)s1+"+"+s2+" = "+sonuc);//ekrana yazd�r�l�r.    
	        }else {//e�er s1 ve s2 de�erleri tam say� degilse ekrana double t�r�nde de�erler yaz�l�r.
	        	double sonuc=s1+s2;
				System.out.println("�sleminin Sonucu: "+s1+"+"+s2+" = "+sonuc);
	        }
		
	}
	
	public void carpma(double s1,double s2) {
		
		if(s1-(int)s1==0 && s2-(int)s2==0){  //E�er s1 ve s2 say�s� tam say� ise if karar yap�s� �al���r.
				double sonuc = (double)(s1*s2);
				System.out.println("�sleminin Sonucu: "+(int)s1+"x"+(int)s2+" = "+(int)sonuc);
	        }else if(s2-(int)s2==0){  //E�er  s2 say�s� tam say� ise else if karar yap�s� �al���r.
	        		double sonuc = (double)(s1*s2);
					System.out.println("�sleminin Sonucu: "+s1+"x"+(int)s2+" = "+(double)sonuc);
					
	        }else if(s1-(int)s1==0){//E�er  s1 say�s� tam say� ise else if karar yap�s� �al���r.
	        	double sonuc = (double)(s1*s2);
				System.out.println("�sleminin Sonucu: "+(int)s1+"x"+s2+" = "+(double)sonuc);
	        }else {//e�er s1 ve s2 de�erleri tam say� degilse ekrana double t�r�nde de�erler yaz�l�r.
	        	double sonuc = (double)(s1*s2);
				System.out.println("�sleminin Sonucu: "+s1+"x"+s2+" = "+(double)sonuc);
	        }
	}
	
	public void bolme(double s1, double s2) {
		if(s1-(int)s1==0 && s2-(int)s2==0){  //E�er s1 ve s2 say�s� tam say� ise if karar yap�s� �al���r.
			int sonuc =Math.floorDiv((int)s1,(int)s2);
			System.out.println("�sleminin Sonucu: "+(int)s1+"/"+(int)s2+" = "+sonuc);
        }else if(s2-(int)s2==0){//E�er  s2 say�s� tam say� ise else if karar yap�s� �al���r.
    		double sonuc = s1/s2;
    		System.out.println("�sleminin Sonucu: "+s1+"/"+(int)s2+" = "+sonuc);
				
        }else if(s1-(int)s1==0){//E�er  s1 say�s� tam say� ise else if karar yap�s� �al���r.
        	double sonuc = s1/s2;
        	System.out.println("�sleminin Sonucu: "+(int)s1+"/"+s2+" = "+sonuc);
        }else {//e�er s1 ve s2 de�erleri tam say� degilse ekrana double t�r�nde de�erler yaz�l�r.
        	double sonuc = s1/s2;
        	System.out.println("�sleminin Sonucu: "+s1+"/"+s2+" = "+sonuc);
        }
		
	}
	
	public void karekok(double s1) {
		if(s1-(int)s1==0){  //E�er s1 say�s� tam say� ise if karar yap�s� �al���r.
			System.out.println((int)s1 + " Say�s�n�n Kare k�k�: "+(int)Math.sqrt((int)s1));//math s�n�f�n�n karek�k alma i�lemidir.
        }else {
        	System.out.println(s1 + " Say�s�n�n Kare k�k�: "+(double)Math.sqrt(s1));
        }
	}
	
	public void kupkop(double s1) {
		if(s1-(int)s1==0){  //E�er s1  say�s� tam say� ise if karar yap�s� �al���r.
			System.out.println((int)s1 + " Say�s�n�n K�p K�k�: "+Math.cbrt((int)s1));//math s�n�f�n�n kupkop alma i�lemidir.
        }else {
        	System.out.println(s1 + " Say�s�n�n K�p K�k�: "+Math.cbrt(s1));
        }
		
	}
	
	public void usAlma(double s1 ,double s2) {
		//s1= taban;
		//s2=kuvvet;
		if(s1-(int)s1==0 && s2-(int)s2==0){  //E�er s1 ve s2 say�s� tam say� ise if karar yap�s� �al���r.
			double sonuc =Math.pow((int)s1, (int)s2);//Math s�n�f�n�n �yesi olan �st alma fonksiyonu kullan�lm��t�r. 
			System.out.println("�sleminin Sonucu: "+(int)s1+"^"+(int)s2+" = "+(int)sonuc);
        }else if(s2-(int)s2==0){ //E�er  s2 say�s� tam say� ise else if karar yap�s� �al���r. 
    		double sonuc =Math.pow(s1, (int)s2);
			System.out.println("�sleminin Sonucu: "+s1+"^"+(int)s2+" = "+sonuc);
        }else if(s1-(int)s1==0){//E�er  s1 say�s� tam say� ise else if karar yap�s� �al���r.
        	double sonuc =Math.pow((int)s1,s2); 	
			System.out.println("�sleminin Sonucu: "+(int)s1+"^"+s2+" = "+sonuc);
        }else {//e�er s1 ve s2 de�erleri tam say� degilse ekrana double t�r�nde de�erler yaz�l�r.
        	double sonuc =Math.pow(s1, s2);
			System.out.println("�sleminin Sonucu: "+s1+"^"+s2+" = "+sonuc);
        }
	}

		
	public void mathOperations(){
		char islem,secim;
		double s1,s2;
		Scanner say�Al = new Scanner(System.in);
		System.out.println("Matematiksel ��lemleri Se�tiniz");	
		System.out.println("======"+"1. D�rt ��lem Men�s� "+"======");
		System.out.println("======"+"2. Karek�k ��lemi "+"======");
		System.out.println("======"+"3. K�pKok ��lemi "+"======");
		System.out.println("======"+"4. Kuvvet Alma ��lemi "+"======");
		System.out.println("======"+"5. Faktoriyel hesab�"+"======");	
		
		do {
			System.out.println("L�tfen Ge�erli Bir De�er Giriniz=  ");
			islem=say�Al.next().charAt(0);//girilen degerin karakterini tutar.
		}while(!(islem>='1' && islem<='5'));
		
		switch(islem) {
		case '1':
			System.out.println("===========D�rt ��lem Menusunu Se�tiniz===========");
			System.out.println("1. Toplama ��lemi");
			System.out.println("2. C�karma ��lemi");
			System.out.println("3. �arpma ��lemi");
			System.out.println("4. B�lme ��lemi");
			
			do {
				System.out.println("L�tfen Ge�erli Bir De�er Giriniz=  ");
				secim = say�Al.next().charAt(0);	
			}while(!(secim>='1' && secim<='4'));
			
			if(secim == '1') {//Toplama ��lemi
				System.out.println("===========Toplama ��lemini Se�tiniz===========");
				System.out.println("Birinci Say�y� Giriniz: ");
				s1 = say�Al.nextDouble();
				System.out.println("�kinci Say�y� Giriniz: ");
				s2 = say�Al.nextDouble();
				toplama(s1,s2);
			
			}else if(secim == '2') {//��karma ��lemi
				System.out.println("===========��karma ��lemini Se�tiniz===========");
				System.out.println("Birinci Say�y� Giriniz: "); 
				s1 = say�Al.nextDouble();
				System.out.println("�kinci Say�y� Giriniz: ");
				s2 = say�Al.nextDouble();
				c�karma(s1,s2);	
				
			}else if(secim == '3') {//�arpma ��lemi
				System.out.println("===========�arpma ��lemini Se�tiniz===========");
				System.out.println("Birinci Say�y� Giriniz: ");
				 s1 = say�Al.nextDouble();
				System.out.println("�kinci Say�y� Giriniz: ");
				 s2 = say�Al.nextDouble();
				carpma(s1,s2);
				
			}else if(secim == '4') {//B�lme ��lemi
				System.out.println("===========B�lme ��lemini Se�tiniz===========");
				System.out.println("B�l�nen Say�y� Giriniz: ");
				s1 = say�Al.nextDouble();
				System.out.println("B�len Say�y� Giriniz: ");
				s2 = say�Al.nextDouble();
				bolme(s1,s2);
			}	
			
			break;
			
		case '2'://Kare K�k
			System.out.println("===========Kare K�k Alma ��lemini Se�tiniz===========");
			System.out.println("Kare K�k�n� Almak �stedi�iniz Say�y� Giriniz: ");
			double KareKok = say�Al.nextDouble();
			karekok(KareKok);
			break;
			
		case '3': //K�p K�k
			System.out.println("===========K�p K�k Alma ��lemini Se�tiniz===========");
			System.out.println("K�p K�k�n� Almak �stedi�iniz Say�y� Giriniz: ");
			double KupKok = say�Al.nextDouble();
			kupkop(KupKok);
			break;
			
		case '4'://�s alma
			System.out.println("===========�s Alma ��lemini Se�tiniz===========");
			System.out.println("Taban Say�y�s�n� Giriniz: ");
			double taban = say�Al.nextDouble();
			System.out.println("Kuvvet Say�s�n� Giriniz: ");
			double kuvvet = say�Al.nextDouble();
			usAlma(taban,kuvvet);
			break;
			
		case '5': 
			System.out.println("===========Fakt�riyel Alma ��lemini Se�tiniz===========");
			int faktoriyel=1;//faktoriyel de�i�kenine 1 de�eri atan�r.
			System.out.println("Fakt�riyelini Almak �stedi�iniz Say�y� Giriniz: ");
			int fakt = say�Al.nextInt();// kullan�c�dan say�sal bir de�er al�n�r.
			if(fakt == 0 || fakt== 1) {//e�er fakt�riyel 0 veya bir ise kullan�c�dan farkl� bir rakam istenecektir. de�il ise kod blogu �al��acak. 
				System.out.println("L�tfen 0 ve 1 Rakamlar�ndan Farkl� Bir Rakam Giriniz.");
			}else {
				for(int i=1; i<=fakt; i++) {//d�ng� kullan�c�n�n girdigi de�er kadar g�ndecektir.
					 faktoriyel *=i;//1 den ba�layarak her defas�nda 1 art�� ile kullan�cn�n girdigi de�er kadar �arp�lur.
				}
				System.out.println(fakt+"! Say�s�n�n Fakt�riyeli: "+faktoriyel);//ekrana faktoriyelin cevab� verilir.
			}
			break;
			default: System.out.println("Yanl�� Bir ��lem Yapt�n�z L�tfen Kontrol Edip Tekrar Deneyiniz."); 
		
		}
		
	}
	
	

}
