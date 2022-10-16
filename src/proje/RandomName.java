package proje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class RandomName {

	public RandomName() {
	
	String[] name = {"MEL�H","AL�","YAMAN","FAT�H","AHMET","YAS�N","ERTUGRUL","ALEYNA","CANAN","G�ZDE"};
	int i;
	int tahmin=0;
	int anahtar=0; 
	int dogru=0;
	
	
	Random rand = new Random();//Rastgele bir say� i�in nesne olu�turuyoruz.
	int deger = rand.nextInt(name.length);// dizi uzunlu�unda rastgele say� �retmesini sa�l�yoruz.
	String randName =name[deger];//Rastgele �simleri randName degiskeninde tutuyoruz.
	
	String uzunluk[] = new String[randName.length()];//uzunluk dizisi i�erisine Rastgele Gelen kelimenin uzunlugunu al�r�z.
	
	System.out.println("Kelimeyi bulmak i�in 5 hakk�n�z var.");
	Scanner veri = new Scanner(System.in);//scanner ile harfleri al�yoruz.
	
	
	  for (i = 0; i < randName.length(); i++)//Gelen ismin uzunlugu kadar for d�ng�s� d�ner
      {
		  	uzunluk[i] = "_ ";//rastgele gelen kelimenin uzunlugu kadar _ �izgi eklenir.
      }
	  
	  finish:
	  while(tahmin<=5){
          System.out.println("Bir harf giriniz (Kalan hakkiniz "+(5-tahmin) +") : ");// her yanl��da tahmini azalt�r.
          String harf = veri.nextLine().toUpperCase();//girilen harfi B�y�k harf ile al�r.
          tahmin++;
          
          for (i = 0; i < randName.length(); i++)//rastgele gelen ismin uzunlugu kadar d�ner.
          {
                  if (randName.charAt(i) == harf.charAt(0))//rastgele gelen kelime ile klavyeden al�nan deger kar��la�t�r�l�r.
                  {
                	  uzunluk[i] = harf+" ";//e�er if degeri �al���rsa uzunluk i�ersinde harf tutulacakt�r.
                      anahtar = 1;
                      dogru++;
                      if (dogru == randName.length()){//kelime do�ru ise ekrana kelimeyi yazacak kod sat�r�.
                    	  System.out.println("kelime " +randName+ " Tebrikler\n");
                    	  break 
                    	  finish;  
                    	  }
                  }
          }
          if (anahtar == 1) {//eger kelime do�ru bulunamad�ysa tahmini bir azalt�r ve anahtar� s�f�ra e�itler.
        	  anahtar = 0; 
        	  tahmin--; 
        	  }
      
          for (i = 0; i < randName.length(); i++){
        	  System.out.print(uzunluk[i]);
        	  }
          
          System.out.println();
	  }
      if (dogru != randName.length()) {//kelime do�ru degilse �al��acak kod sat�r�
    	  System.out.println("\n");
    	  System.out.println("Kelimeyi tahmin edemediniz."); 
    	  System.out.println("Do�ru yan�t: " + randName);
    	  }
	 
	}
	
}
