package proje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		
		char secim='0';
		Scanner tara = new Scanner(System.in);
		
		StringBuilder menu = new StringBuilder();
		menu.append("======"+"Uygulamalar"+"======\n");
		menu.append("===1==="+" Ok Tuşları"+"======\n");
		menu.append("===2==="+" İsim Tahmin Uygulaması"+"======\n");
		menu.append("===3==="+" Kelime İçersinde Harf Arama"+"======\n");
		menu.append("===4==="+" Kütüphane Uygulaması"+"======\n");
		menu.append("===5==="+" Zar Uygulaması"+"======\n");
		menu.append("===6==="+" Matematiksel İşlemler"+"======\n");
		menu.append("===7==="+" Uygulamadan Çıkış Yap"+"======\n");
	
		while(secim!='7') {
			System.out.println(menu);
			do {	
				System.out.println("Lütfen Geçerli Bir Değer Giriniz= ");
				secim=tara.next().charAt(0);
			}while(!(secim>='1' && secim<='7'));
			
		switch(secim)
		{
		
		case '1':
			break;
		
		case '2':
		System.out.println("İsim Tahmin uygulamasını seçtiniz\n");
		RandomName randOperation = new RandomName();
		break;
		
		case '3':
			TextualOperation islem  = new TextualOperation();
			islem.textualOperation();
		break;
		
		case '4':
			break;
		
		case '5'://zar uygulaması
			DiceOperation diceOperation = new DiceOperation();
			diceOperation.zarUygulama();
			break;
			
			
		case '6'://matematiksel işlemler
			 MathOperation mathOperations=new MathOperation();
			 mathOperations.mathOperations();
			break;
		
		case '7':
			System.out.println("Programdan çıkış yaptınız.\n\n");		
			DiceOperation diceOperation1 = new DiceOperation();
			diceOperation1.dosyasil();
			break;
		
		default:
		System.out.println("Yanlış bir seçim yaptınız\n");
		
		}
	}
		
		}
	
	}
