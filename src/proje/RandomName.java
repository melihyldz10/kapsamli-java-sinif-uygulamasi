package proje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class RandomName {

	public RandomName() {
	
	String[] name = {"MELÝH","ALÝ","YAMAN","FATÝH","AHMET","YASÝN","ERTUGRUL","ALEYNA","CANAN","GÖZDE"};
	int i;
	int tahmin=0;
	int anahtar=0; 
	int dogru=0;
	
	
	Random rand = new Random();//Rastgele bir sayý için nesne oluþturuyoruz.
	int deger = rand.nextInt(name.length);// dizi uzunluðunda rastgele sayý üretmesini saðlýyoruz.
	String randName =name[deger];//Rastgele Ýsimleri randName degiskeninde tutuyoruz.
	
	String uzunluk[] = new String[randName.length()];//uzunluk dizisi içerisine Rastgele Gelen kelimenin uzunlugunu alýrýz.
	
	System.out.println("Kelimeyi bulmak için 5 hakkýnýz var.");
	Scanner veri = new Scanner(System.in);//scanner ile harfleri alýyoruz.
	
	
	  for (i = 0; i < randName.length(); i++)//Gelen ismin uzunlugu kadar for döngüsü döner
      {
		  	uzunluk[i] = "_ ";//rastgele gelen kelimenin uzunlugu kadar _ çizgi eklenir.
      }
	  
	  finish:
	  while(tahmin<=5){
          System.out.println("Bir harf giriniz (Kalan hakkiniz "+(5-tahmin) +") : ");// her yanlýþda tahmini azaltýr.
          String harf = veri.nextLine().toUpperCase();//girilen harfi Büyük harf ile alýr.
          tahmin++;
          
          for (i = 0; i < randName.length(); i++)//rastgele gelen ismin uzunlugu kadar döner.
          {
                  if (randName.charAt(i) == harf.charAt(0))//rastgele gelen kelime ile klavyeden alýnan deger karþýlaþtýrýlýr.
                  {
                	  uzunluk[i] = harf+" ";//eðer if degeri çalýþýrsa uzunluk içersinde harf tutulacaktýr.
                      anahtar = 1;
                      dogru++;
                      if (dogru == randName.length()){//kelime doðru ise ekrana kelimeyi yazacak kod satýrý.
                    	  System.out.println("kelime " +randName+ " Tebrikler\n");
                    	  break 
                    	  finish;  
                    	  }
                  }
          }
          if (anahtar == 1) {//eger kelime doðru bulunamadýysa tahmini bir azaltýr ve anahtarý sýfýra eþitler.
        	  anahtar = 0; 
        	  tahmin--; 
        	  }
      
          for (i = 0; i < randName.length(); i++){
        	  System.out.print(uzunluk[i]);
        	  }
          
          System.out.println();
	  }
      if (dogru != randName.length()) {//kelime doðru degilse çalýþacak kod satýrý
    	  System.out.println("\n");
    	  System.out.println("Kelimeyi tahmin edemediniz."); 
    	  System.out.println("Doðru yanýt: " + randName);
    	  }
	 
	}
	
}
