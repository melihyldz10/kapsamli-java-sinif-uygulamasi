package proje;
import java.util.Scanner;

public class TextualOperation {
	String cumle;
	Scanner deger = new Scanner(System.in);
	
	
	public void harfBul(String cumle,char harf) {
        int sayac = 0;
        for(int i = 0; i <cumle.length(); i++)//c�mlenin uzunlugu kadar d�nd�r�r�z.
        {
            if(cumle.charAt(i) == harf) {//cumleyi harf i�indeki degere e�it olana kadar d�nd�r�r�z. e�er e�it ise sayac� bir artt�r�yoruz.
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelimede " + sayac + " tane '" + harf + "' vard�r");
    }
		
	
	public void textualOperation(){
		char islem;
		Scanner VeriAl = new Scanner(System.in);
		System.out.println("Metinsel ��lemleri Se�tiniz L�tfen Bir Kelime Giriniz: \n");
		String cumle = VeriAl.nextLine();
		
		System.out.println("Girdiginiz Kelime: "+cumle);	
		System.out.println("======"+"1. Kelime ��inde Belirtilen Harfin Kar��la��lan ilk Yeri. "+"======");
		System.out.println("======"+"2. Kelime ��inde Belirtilen Harfin Kar��la��lan Son Yeri. "+"======");
		System.out.println("======"+"3. Kelime ��inde Belirtilen Harten Ka� adet vard�r. "+"======");
		System.out.println("======"+"4. Kelime ��inde x-y aras�ndaki par�as�n� yazd�rma. "+"======");
		
		do {	
			System.out.println("L�tfen Ge�erli Bir De�er Giriniz= ");
			islem=VeriAl.next().charAt(0);
		}while(!(islem>='1' && islem<='4'));
		

	switch(islem) {
	case '1':
		System.out.println("Se�tiginiz i�lem: "+"Kelime ��inde Belirtilen Harfin Kar��la��lan ilk Yerini Bulma ");
		System.out.println("L�tfen Harfi Giriniz: ");
		String kelime�lk = deger.nextLine();//Kullan�c� taraf�ndan Girilen deger kelime�lk degi�keninde tutulur.
		System.out.println("Kar��la��lan Harfin ilk Yeri: "+cumle.indexOf(kelime�lk));//String S�n�f� �yelerinden indexOf ile kar��la��lan ilk degeri verir indis olarak.
		break;
		
	case '2':
		System.out.println("Se�tiginiz i�lem: "+" Kelime ��inde Belirtilen Harfin Kar��la��lan Son Yerini Bulma");
		System.out.println("L�tfen Harfi Giriniz: ");
		String kelimeSon = deger.nextLine();//Kullan�c� taraf�ndan Girilen deger kelimeSon degi�keninde tutulur.
		System.out.println("Kar��la��lan Harfin Son Yeri: "+cumle.lastIndexOf(kelimeSon));//LastIndexOf harfin  kar��la��lan son indis degerini verir.
		break;
		
	case '3':
		int tane = 0;
		System.out.println("Se�tiginiz i�lem: "+" Kelime ��inde Belirtilen Harten Ka� adet vard�r");
		System.out.println("L�tfen Harfi Giriniz: ");
		char harf = deger.next().charAt(0);//Girilen harfi al�r�z.
		harfBul(cumle,harf);//harf bul metodu yukar�da a��klanm��t�r.
		break;
		
	case '4':
		System.out.println("Se�tiginiz i�lem: "+" Kelime ��inde x-y aras�ndaki par�as�n� yazd�rma. ");
		System.out.println("L�tfen ba�lang�c degerini giriniz: ");
		int baslang�c = deger.nextInt();//Kullan�c� taraf�ndan Girilen int t�r�ndeki deger baslang�c degi�keninde tutulur.
		System.out.println("L�tfen biti� degerini giriniz: ");
		int bitis = deger.nextInt();//Kullan�c� taraf�ndan Girilen int t�r�ndeki deger bitis degi�keninde tutulur.
		
		if(baslang�c==0) 
			baslang�c=1;//ba�lang�ca 1 degeri atan�r.
		if(bitis==0) 
			bitis=cumle.length();//c�mlenin uzunlugu bitis degi�kenine atan�r.
		
		//e�er ba�lang�c bir ise 0 indis degerinden ba�lar ve bitis degeri kadar gider. 
		//E�er bitis degeri 0 ise cumlenin uzunlugu kadar ba�lang�� degerinden ba�layarak ekrana yazar.
		System.out.println(cumle+" Kelimesinin"+" �slemi G�rm�� Sonucu : "+cumle.substring(baslang�c-1,bitis));
		
		System.out.println("\n\n");
		break;
		

	default: System.out.println("L�tfen Tekrar Deneyiniz!!");
	}
}
	
	
	
	
	
	
}
