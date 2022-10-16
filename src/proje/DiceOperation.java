package proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.*;


public class DiceOperation {
	
	
	public void dosyasil(){//Dosya silme iþlemi
	    File file = new File("zarlarým.txt");
	    if(file.exists())//dosya var mý ?
	    {
	        file.delete();//Dosyayý siler.
	    }else {
	    	file.delete();
	    }  
	}
	
	public static void listele() throws IOException {
		File file = new File("zarlarým.txt");//Nesne oluþturuldu ve bu nesne üzerinden iþlem yapýlýr.
		if(file.exists()){//dosya var mý ?			
			System.out.println("Zar Deðerleri...");
	        Scanner dosya = new Scanner(file);
	        while(dosya.hasNextLine())//dosya içindeki degerleri satýr satýr okur.
	        {
	            System.out.println(dosya.nextLine());//dosya içindeki degerleri consola yazdýrdýk.
	        }
		}else {
			System.out.println("Gösterilecek bir Zar Deðeri Yoktur Lütfen Zar Atýnýz");
		}
	}
	
	public static void kaydet(int dice1, int dice2) throws IOException {
		File file = new File("zarlarým.txt");
		FileWriter fileWriter = new FileWriter(file,true);//true deðeri dosyadaki bilgilerin devamýna ekleme yapar.
		String deger="1.Zar deðeri: "+dice1+" "+" 2.Zar deðeri: "+dice2+"\n";
		fileWriter.write(deger);//dosyaya degerler yazýldý.
		fileWriter.close();//Baðlantý kapatýldý.
	}


public void zarUygulama() throws IOException {
		
		Scanner zarOku = new Scanner(System.in);
		char DiceR,save;
		char islem;

		System.out.println("======"+"1.Rastgele Zar At "+"======");
		System.out.println("======"+"2.Kaydedilen Tüm Kayýtlarý Göster."+"======");
		do{
			System.out.println("Lütfen Geçerli Bir Deðer Giriniz=  ");
		islem = zarOku.next().charAt(0);
		}while(!(islem>='1' && islem<='2'));
		//1'den büyük 7'den küçük ise ve bunlara eþit degil ise döngüye girer. karakter kabul etmemektedir. do-while döngüsü her yeni denemede bir kere çalýþýr.
		
		switch(islem) {
		case '1':
			do {
				Random ran = new Random();
				int dice1 = ran.nextInt(6)+1;
				int dice2 = ran.nextInt(6)+1;
				System.out.println("1. Zar deðeri = "+dice1+", 2.Zar deðeri "+dice2);
				
				System.out.print("Deðerleri Kaydetmek Ýstermisiniz? Evet(E)/Hayýr(H) = ");
				save = zarOku.next().toUpperCase().charAt(0);//Girilen degeri büyük harfe çevirerek alýr.
				if(save=='E'){//Eðer save eþit ise 'E' karakterine kayýt edecektir.
					kaydet(dice1,dice2);
				}
				System.out.print("Tekrar Zar Atmak Ýstermisiniz Evet(E)/Hayýr(H)=");
				DiceR = zarOku.next().toUpperCase().charAt(0);//Girilen degeri büyük harfe çevirerek alýr.
			  }while(DiceR=='E');//Döngünün baþýna döner ve iþlemleri tekrar eder.
			break;
			
		case '2':
			listele();
			break;
		default: System.out.println("Yanlýþ Bir Ýþlem Yaptýnýz Lütfen Kontrol Edip Tekrar Deneyiniz.");
		}
	
	}	
}

