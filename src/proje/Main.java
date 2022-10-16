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
		menu.append("===1==="+" Ok Tu�lar�"+"======\n");
		menu.append("===2==="+" �sim Tahmin Uygulamas�"+"======\n");
		menu.append("===3==="+" Kelime ��ersinde Harf Arama"+"======\n");
		menu.append("===4==="+" K�t�phane Uygulamas�"+"======\n");
		menu.append("===5==="+" Zar Uygulamas�"+"======\n");
		menu.append("===6==="+" Matematiksel ��lemler"+"======\n");
		menu.append("===7==="+" Uygulamadan ��k�� Yap"+"======\n");
	
		while(secim!='7') {
			System.out.println(menu);
			do {	
				System.out.println("L�tfen Ge�erli Bir De�er Giriniz= ");
				secim=tara.next().charAt(0);
			}while(!(secim>='1' && secim<='7'));
			
		switch(secim)
		{
		
		case '1':
			break;
		
		case '2':
		System.out.println("�sim Tahmin uygulamas�n� se�tiniz\n");
		RandomName randOperation = new RandomName();
		break;
		
		case '3':
			TextualOperation islem  = new TextualOperation();
			islem.textualOperation();
		break;
		
		case '4':
			break;
		
		case '5'://zar uygulamas�
			DiceOperation diceOperation = new DiceOperation();
			diceOperation.zarUygulama();
			break;
			
			
		case '6'://matematiksel i�lemler
			 MathOperation mathOperations=new MathOperation();
			 mathOperations.mathOperations();
			break;
		
		case '7':
			System.out.println("Programdan ��k�� yapt�n�z.\n\n");		
			DiceOperation diceOperation1 = new DiceOperation();
			diceOperation1.dosyasil();
			break;
		
		default:
		System.out.println("Yanl�� bir se�im yapt�n�z\n");
		
		}
	}
		
		}
	
	}
