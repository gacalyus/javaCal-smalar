package odevBır;

public class Main {

	public static void main(String[] args) {
		
		//Tüm ders kodları bu sayfadadır.
		
		
		
		
		
		
		
		
		// System.out.println("Hello Java");
		// System.out.println("Hello Java2");

		// variable

		int sayı = 15;
		String mesaj = "öğrenci sayım :";
		// System.out.println(mesaj + sayı);

		double sayıKusurat = 25.96;
		// System.out.println(sayıKusurat);

		char karakter = 'd';
		boolean dogruyanlıs = true;

		// ŞartBlokları

		if (sayı < 15) {
			System.out.println("küçük");
		} else if (sayı == 15) {
			// System.out.println("eşit");
		} else {
			System.out.println("büyük");
		}

		// ReCap Demo 1
		int sayı1 = 15;
		int sayı2 = 45;
		int sayı3 = 70;
		int enBuyuk = sayı1;

		if (enBuyuk < sayı2) {
			enBuyuk = sayı2;
		}
		if (enBuyuk < sayı3) {
			enBuyuk = sayı3;
		}

		// System.out.println(enBuyuk);

		// SwitchBlokları

		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Geçtiniz");
			break;
		case 'B':
			System.out.println("Geçtiniz2");
			break;
		case 'C':
			System.out.println("Geçtiniz3");
			break;
		case 'F':
			// System.out.println("Kaldınız!");
			break;
		default:
			// System.out.println("Geçersiz Not");

		}

		// ForDöngüsü

		for (int i = 1; i < 10; i = i + 2) {
			// System.out.println(i);
		}

		// While Döngüsü

		// int i = 1;
		// while( i<10) {
		// System.out.println(i);
		// i++;
		// }

		// Do-While Döngüsü

		int j = 12;
		do {
			// System.out.println(j);
			j += 2;
		} while (j < 18);

		// Diziler Array

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "İsmail";
		ogrenciler[1] = "Selin";
		ogrenciler[2] = "Mert";
		ogrenciler[3] = "Derin";

		// for (int i=0; i < ogrenciler.length; i++) {
		// System.out.println(ogrenciler[i]);
		// }

		for (String ogrenci : ogrenciler) {
			// System.out.println(ogrenci);
		}

		// ReCap Demo 2

		double[] myList = { 2.45, 5.54, 4.54 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {

			if (max < number) {
				max = number;
			}
			total += number;

		}
		// System.out.println(max);
		// System.out.println(total);

		// Çok Boyutlu Diziler

		String[][] sehirler = new String[3][4];

		sehirler[0][0] = "istanbul";
		sehirler[0][1] = "Kırklareli";
		sehirler[0][2] = "Edirne";
		sehirler[0][3] = "Tekirdağ";

		sehirler[1][0] = "Aydın";
		sehirler[1][1] = "İzmir";
		sehirler[1][2] = "Balıkesir";
		sehirler[1][3] = "Denizli";

		sehirler[2][0] = "Ankara";
		sehirler[2][1] = "Kırıkkale";
		sehirler[2][2] = "Çankırı";
		sehirler[2][3] = "Çorum";

		int count = 0;
		for (int i = 0; i < 3; i++) {
			// System.out.println("----------Bölge" + i);
			for (int k = 0; k < 4; k++) {
				// System.out.println(sehirler[i][k]);
				count += 1;
			}
		}
		// System.out.println(count);

		// StringlerleÇalışmak1

		String mesajım = "       Bugün hava çok güzel          ";
		// System.out.println("Eleman sayısı:" + mesajım.length());
		// System.out.println("5. Eleman:" + mesajım.charAt(4));
		// System.out.println(mesajım.concat(" Yaşasın!"));
		// System.out.println(mesajım.startsWith("B"));

		// System.out.println(mesajım.endsWith("f"));
		char[] karakterler = new char[5];
		mesajım.getChars(0, 5, karakterler, 0);
		// System.out.println(karakterler);
		// System.out.println(mesajım.indexOf('ü'));
		// System.out.println(mesajım.lastIndexOf('ü'));

		// Stringlerle Çalışmak 2
		String yeniMesajım = mesajım.replace(' ', '-');
		// System.out.println(yeniMesajım);
		// System.out.println(yeniMesajım.substring(2,5));
		for (String kelime : mesajım.split(" ")) {
			// System.err.println(kelime);
		}
		// System.err.println(mesajım.toLowerCase());
		// System.err.println(mesajım.toUpperCase());
		// System.err.println(mesajım.trim());

		// MiniProje1-SayıAsalmı?
		// sadece kendisine ve 1 e bölünebilmeli;

		int primeNumber = 1013;
		// int remainder = primeNumber % 2;
		// System.err.println(remainder);
		boolean asalMı = false;

		for (int l = 2; l < primeNumber; l++) {
			// System.err.println(l);

			int remainder = primeNumber % l;
			if (remainder == 0) {
				asalMı = true;
			}
		}
		if (asalMı) {
			System.err.println("Sayı Assal değil");
		} else {
			//System.err.println("Sayı Assal");
		}

		// MiniProje2-KalınSesliveİnceSesliHarfler

		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.err.println("Kalı Sesli Harf");
			break;
		default:
			//System.err.println("İnce Sesli Harf");
		}
		
		// Mini Proje 4 - Arkadaş Sayılar
		
		
		int sayı111 = 220;
		int sayı222= 2824;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int s = 1; s < sayı111; s++) {
			if(sayı111 % s == 0) {
				toplam1 = toplam1 + s;
			}
		}
		for (int s = 1; s < sayı222; s++) {
			if(sayı222 % s == 0) {
				toplam2 = toplam2 + s;
				
			}
		}
		
		if(sayı111 == toplam2 &&  sayı222 == toplam1) {
			System.out.println("sayılar arkadaş");
		}else {
			//System.out.println("sayılar arkadaş değil!");
		}
		
		
		
		//Mini Proje 5 - Sayı Bulma
		
		
		int[] sayılarımız = new int[] {1,2,5,7,9,0};
		
		int aranacakSayı = 0;
		boolean değer = false;
		for (int g = 0; g < sayılarımız.length; g++) {
			
			if(sayılarımız[g] == aranacakSayı) {
				System.err.println("Sayı dizide mevcut");
				değer = true;
				break;
			}
		}
		if(!değer) {
			System.err.println("Sayı dizide mevcut değil");
		}
		
		
		
		
		

	}

}
