package proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.*;


public class DiceOperation {
	
	
	public void dosyasil(){//Dosya silme i�lemi
	    File file = new File("zarlar�m.txt");
	    if(file.exists())//dosya var m� ?
	    {
	        file.delete();//Dosyay� siler.
	    }else {
	    	file.delete();
	    }  
	}
	
	public static void listele() throws IOException {
		File file = new File("zarlar�m.txt");//Nesne olu�turuldu ve bu nesne �zerinden i�lem yap�l�r.
		if(file.exists()){//dosya var m� ?			
			System.out.println("Zar De�erleri...");
	        Scanner dosya = new Scanner(file);
	        while(dosya.hasNextLine())//dosya i�indeki degerleri sat�r sat�r okur.
	        {
	            System.out.println(dosya.nextLine());//dosya i�indeki degerleri consola yazd�rd�k.
	        }
		}else {
			System.out.println("G�sterilecek bir Zar De�eri Yoktur L�tfen Zar At�n�z");
		}
	}
	
	public static void kaydet(int dice1, int dice2) throws IOException {
		File file = new File("zarlar�m.txt");
		FileWriter fileWriter = new FileWriter(file,true);//true de�eri dosyadaki bilgilerin devam�na ekleme yapar.
		String deger="1.Zar de�eri: "+dice1+" "+" 2.Zar de�eri: "+dice2+"\n";
		fileWriter.write(deger);//dosyaya degerler yaz�ld�.
		fileWriter.close();//Ba�lant� kapat�ld�.
	}


public void zarUygulama() throws IOException {
		
		Scanner zarOku = new Scanner(System.in);
		char DiceR,save;
		char islem;

		System.out.println("======"+"1.Rastgele Zar At "+"======");
		System.out.println("======"+"2.Kaydedilen T�m Kay�tlar� G�ster."+"======");
		do{
			System.out.println("L�tfen Ge�erli Bir De�er Giriniz=  ");
		islem = zarOku.next().charAt(0);
		}while(!(islem>='1' && islem<='2'));
		//1'den b�y�k 7'den k���k ise ve bunlara e�it degil ise d�ng�ye girer. karakter kabul etmemektedir. do-while d�ng�s� her yeni denemede bir kere �al���r.
		
		switch(islem) {
		case '1':
			do {
				Random ran = new Random();
				int dice1 = ran.nextInt(6)+1;
				int dice2 = ran.nextInt(6)+1;
				System.out.println("1. Zar de�eri = "+dice1+", 2.Zar de�eri "+dice2);
				
				System.out.print("De�erleri Kaydetmek �stermisiniz? Evet(E)/Hay�r(H) = ");
				save = zarOku.next().toUpperCase().charAt(0);//Girilen degeri b�y�k harfe �evirerek al�r.
				if(save=='E'){//E�er save e�it ise 'E' karakterine kay�t edecektir.
					kaydet(dice1,dice2);
				}
				System.out.print("Tekrar Zar Atmak �stermisiniz Evet(E)/Hay�r(H)=");
				DiceR = zarOku.next().toUpperCase().charAt(0);//Girilen degeri b�y�k harfe �evirerek al�r.
			  }while(DiceR=='E');//D�ng�n�n ba��na d�ner ve i�lemleri tekrar eder.
			break;
			
		case '2':
			listele();
			break;
		default: System.out.println("Yanl�� Bir ��lem Yapt�n�z L�tfen Kontrol Edip Tekrar Deneyiniz.");
		}
	
	}	
}

