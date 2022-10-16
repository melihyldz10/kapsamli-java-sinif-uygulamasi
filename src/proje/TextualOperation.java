package proje;
import java.util.Scanner;

public class TextualOperation {
	String cumle;
	Scanner deger = new Scanner(System.in);
	
	
	public void harfBul(String cumle,char harf) {
        int sayac = 0;
        for(int i = 0; i <cumle.length(); i++)//cümlenin uzunlugu kadar döndürürüz.
        {
            if(cumle.charAt(i) == harf) {//cumleyi harf içindeki degere eþit olana kadar döndürürüz. eðer eþit ise sayacý bir arttýrýyoruz.
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelimede " + sayac + " tane '" + harf + "' vardýr");
    }
		
	
	public void textualOperation(){
		char islem;
		Scanner VeriAl = new Scanner(System.in);
		System.out.println("Metinsel Ýþlemleri Seçtiniz Lütfen Bir Kelime Giriniz: \n");
		String cumle = VeriAl.nextLine();
		
		System.out.println("Girdiginiz Kelime: "+cumle);	
		System.out.println("======"+"1. Kelime Ýçinde Belirtilen Harfin Karþýlaþýlan ilk Yeri. "+"======");
		System.out.println("======"+"2. Kelime Ýçinde Belirtilen Harfin Karþýlaþýlan Son Yeri. "+"======");
		System.out.println("======"+"3. Kelime Ýçinde Belirtilen Harten Kaç adet vardýr. "+"======");
		System.out.println("======"+"4. Kelime Ýçinde x-y arasýndaki parçasýný yazdýrma. "+"======");
		
		do {	
			System.out.println("Lütfen Geçerli Bir Deðer Giriniz= ");
			islem=VeriAl.next().charAt(0);
		}while(!(islem>='1' && islem<='4'));
		

	switch(islem) {
	case '1':
		System.out.println("Seçtiginiz iþlem: "+"Kelime Ýçinde Belirtilen Harfin Karþýlaþýlan ilk Yerini Bulma ");
		System.out.println("Lütfen Harfi Giriniz: ");
		String kelimeÝlk = deger.nextLine();//Kullanýcý tarafýndan Girilen deger kelimeÝlk degiþkeninde tutulur.
		System.out.println("Karþýlaþýlan Harfin ilk Yeri: "+cumle.indexOf(kelimeÝlk));//String Sýnýfý üyelerinden indexOf ile karþýlaþýlan ilk degeri verir indis olarak.
		break;
		
	case '2':
		System.out.println("Seçtiginiz iþlem: "+" Kelime Ýçinde Belirtilen Harfin Karþýlaþýlan Son Yerini Bulma");
		System.out.println("Lütfen Harfi Giriniz: ");
		String kelimeSon = deger.nextLine();//Kullanýcý tarafýndan Girilen deger kelimeSon degiþkeninde tutulur.
		System.out.println("Karþýlaþýlan Harfin Son Yeri: "+cumle.lastIndexOf(kelimeSon));//LastIndexOf harfin  karþýlaþýlan son indis degerini verir.
		break;
		
	case '3':
		int tane = 0;
		System.out.println("Seçtiginiz iþlem: "+" Kelime Ýçinde Belirtilen Harten Kaç adet vardýr");
		System.out.println("Lütfen Harfi Giriniz: ");
		char harf = deger.next().charAt(0);//Girilen harfi alýrýz.
		harfBul(cumle,harf);//harf bul metodu yukarýda açýklanmýþtýr.
		break;
		
	case '4':
		System.out.println("Seçtiginiz iþlem: "+" Kelime Ýçinde x-y arasýndaki parçasýný yazdýrma. ");
		System.out.println("Lütfen baþlangýc degerini giriniz: ");
		int baslangýc = deger.nextInt();//Kullanýcý tarafýndan Girilen int türündeki deger baslangýc degiþkeninde tutulur.
		System.out.println("Lütfen bitiþ degerini giriniz: ");
		int bitis = deger.nextInt();//Kullanýcý tarafýndan Girilen int türündeki deger bitis degiþkeninde tutulur.
		
		if(baslangýc==0) 
			baslangýc=1;//baþlangýca 1 degeri atanýr.
		if(bitis==0) 
			bitis=cumle.length();//cümlenin uzunlugu bitis degiþkenine atanýr.
		
		//eðer baþlangýc bir ise 0 indis degerinden baþlar ve bitis degeri kadar gider. 
		//Eðer bitis degeri 0 ise cumlenin uzunlugu kadar baþlangýç degerinden baþlayarak ekrana yazar.
		System.out.println(cumle+" Kelimesinin"+" Ýslemi Görmüþ Sonucu : "+cumle.substring(baslangýc-1,bitis));
		
		System.out.println("\n\n");
		break;
		

	default: System.out.println("Lütfen Tekrar Deneyiniz!!");
	}
}
	
	
	
	
	
	
}
