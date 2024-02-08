//Nadire Nur Sağlam


package nesneOdev;

import java.io.*;
import java.util.*;

public class Anasayfa {
	static ArrayList<Ders> Dersler = new ArrayList<Ders>();
	static ArrayList<Ogrenci> Ogrenciler = new ArrayList<Ogrenci>();
	static File dosya1 = new File("ogrenci.txt");
	static File dosya2 = new File("ders.txt");

	static Scanner veriAl = new Scanner(System.in);
	static Scanner stringAl = new Scanner(System.in);
	static FileWriter fw2;
	static FileWriter fw1;
	static String dersKontrol;

	static void DersEkle() {
		System.out.println("Eklenecek Dersin Adını giriniz: ");
		String yeniders = stringAl.nextLine();
		Ders dersler = new Ders(yeniders);
		Dersler.add(dersler);
	}

	static public void DersListele() {
		System.out.println("Ders Id   Ders Adı");
		int x = Dersler.size();
		for (int j = 0; j < x; j++) {
			Dersler.get(j).dersYazdir();
		}
	}

	static public void DersAra() {
		boolean s1 = true;
		System.out.println("Aranacak Dersin İsmini Giriniz:");
		String arananDers = stringAl.nextLine();

		for (int h = 0; h < Dersler.size(); h++) {
			if (arananDers.equals(Dersler.get(h).getDersAd())) {
				Dersler.get(h).dersYazdir();
				s1 = false;
			}
		}
		if (s1) {
			System.out.println("Aranan Ders Bulunamadı!!!");
		}
	}

	static public void DersSil() {
		System.out.println("Silinecek Dersin Adını giriniz: ");
		String SilinecekDers = stringAl.nextLine();
		boolean s1 = true;

		for (int h = 0; h < Dersler.size(); h++) {
			if (SilinecekDers.equals(Dersler.get(h).getDersAd())) {
				s1 = false;

				for (int k = 0; k < Ogrenciler.size(); k++) {
					for (int i = 0; i < Ogrenciler.get(k).alinanDersler.size(); i++) {
						dersKontrol = Ogrenciler.get(k).alinanDersler.get(i).getDersAd();
					}
				}
				if (!Dersler.get(h).getDersAd().equals(dersKontrol)) {
					Dersler.remove(h);
					System.out.println("Ders başarı ile silindi!");
				} else {
					System.out.println("Dersi Alan var");
				}
			}
		}
		if (s1) {
			System.out.println("Aranan Ders Bulunamadı!!!");
		}

	}

	static public void OgrenciEkle() {
		System.out.println("Eklenecek Öğrencinin Adını ve Soyadını Giriniz: ");
		String yeniOgrenci = stringAl.nextLine();
		System.out.println("eklenecek Öğrencinin Yaşını Giriniz:");
		int yeniYas = veriAl.nextInt();
		System.out.println("Eklenecek Öğrenci için Id Giriniz:");
		int yeniId = veriAl.nextInt();
		Ogrenci ogrenci = new Ogrenci(yeniOgrenci, yeniYas, yeniId);
		Ogrenciler.add(ogrenci);
		System.out.println("Öğrencinin Alacağı Ders Sayısını Giriniz:");
		int dersSayisi = veriAl.nextInt();
		for (int i = 0; i < dersSayisi; i++) {
			System.out.println("Eklenecek Öğrencinin Aldığı dersi Giriniz:");
			String alinanDers = stringAl.nextLine();
			ogrenci.alinanDersler.add(new Ders(alinanDers));
		}
	}
	
	static public void OgrenciAra() {
		boolean s2 = true;
		System.out.println("Aranacak Öğrencinin İsmini Giriniz:");
		String arananOgrenci = stringAl.nextLine();

		for (int h = 0; h < Ogrenciler.size(); h++) {
			if (arananOgrenci.equals(Ogrenciler.get(h).getOgrAdSoyad())) {
				Ogrenciler.get(h).ogrenciYazdir();
				s2 = false;
			}
		}
		if (s2) {
			System.out.println("Aranan Ogrenci Bulunamadı!!!");
		}

	}

	static public void OgrenciSil() {
		System.out.println("Silinecek Öğrencinin Idsini Giriniz");
		int ogrenciId = veriAl.nextInt();
		boolean s5 = true;

		for (int j = 0; j < Ogrenciler.size(); j++) {
			if (Ogrenciler.get(j).getOgrId() == ogrenciId) {
				s5 = false;
				Ogrenciler.remove(j);
				System.out.println("Öğrenci Başarı İle Silindi");
			}
		}
		if (s5) {
			System.out.println("Aranan Idde Öğrenci Bulunamadı");
		}
	}

	static public void OgrenciListele() {
		System.out.println("Tüm Öğrenciler");
		int k = Ogrenciler.size();
		for (int j = 0; j < k; j++) {
			Ogrenciler.get(j).ogrenciYazdir();
		}
	}

	static public void OgrenciAyrıntılılistele() {
		System.out.println("Tüm Öğrenciler ve Aldıkları Dersler");
		int k = Ogrenciler.size();
		for (int j = 0; j < k; j++) {
			Ogrenciler.get(j).ogrenciYazdir();
			int x = Ogrenciler.get(j).alinanDersler.size();
			for (int i = 0; i < x; i++) {
				System.out.print("\t");
				Ogrenciler.get(j).alinanDersler.get(i).dersYazdir();
			}
		}
	}

	static public void OgrencilerinOdeyeceğiTutarHesaplama() {

		boolean s3 = true;
		System.out.println("Ödeyeceği Tutarı Hesaplanacak Öğrencinin Idsini Giriniz:");
		int arananOgrenciId = veriAl.nextInt();

		for (int h = 0; h < Ogrenciler.size(); h++) {
			if (arananOgrenciId == Ogrenciler.get(h).getOgrId()) {
				s3 = false;
				int aylikUcret = (Ogrenciler.get(h).alinanDersler.size() * 400) * 4;
				
				if (Ogrenciler.get(h).alinanDersler.size() == 1) {
					System.out
							.println("Ögrenci Sadece 1 Ders Aldığından Kampanya Uygulanmamıştır.\nAylık Ödenecek Tutar "+ (aylikUcret) + " TL");
				}
				// kampanya1
				else if (Ogrenciler.get(h).alinanDersler.size() == 2) {
					System.out.println("Ögrenci 2 Ders Aldığından Kampanya 1 Uygulanmıştır.\nAylık Ödenecek Tutar "+ aylikUcret * 0.975 + " TL");
				}
				// Kampanya2
				else if (Ogrenciler.get(h).alinanDersler.size() == 3) {
					System.out.println("Ögrenci 3 Ders Aldığından Kampanya 2 Uygulanmıştır.\nAylık Ödenecek Tutar "+ aylikUcret * 0.95 + " TL");
				}
				// kampanya3
				else if (Ogrenciler.get(h).alinanDersler.size() > 3) {
					System.out.println(
							"Ögrenci 3 ve Üzeri Ders  Aldığından Kampanya 3 Uygulanmamıştır.\nAylık Ödenecek Tutar "+ aylikUcret * 0.90 + " TL");
				} else {
					System.out.println("Bu Öğrennci Hiç Ders Almıyor!!!");
				}
			}
		}
		if (s3) {
			System.out.println("Ödeyeceği Tutarı Hesaplanacak Ogrenci Bulunamadı!!!");
		}

	}

	public static void main(String[] args) throws IOException {
		{

			try (BufferedReader br1 = new BufferedReader(new FileReader(dosya2))) {

				String line1 = null;
				String specialCharacter1 = "%";

				while ((line1 = br1.readLine()) != null) {
					String[] x = line1.split(specialCharacter1);
					Ders dersler = new Ders(x[1]);
					Dersler.add(dersler);
				}
			}

			try (BufferedReader br2 = new BufferedReader(new FileReader(dosya1))) {

				String line2 = null;
				String specialCharacter1 = "%";
				String specialCharacter2 = "+";

				Ogrenci ogrenciler = null;

				while ((line2 = br2.readLine()) != null) {
					if (line2.substring(0, 1).equals(specialCharacter2)) {
						String[] ogrenciBilgi = line2.split(specialCharacter1);
						ogrenciler = new Ogrenci(ogrenciBilgi[1], Integer.parseInt(ogrenciBilgi[2]),
								Integer.parseInt(ogrenciBilgi[0]));
						Ogrenciler.add(ogrenciler);
					} else {
						String[] ogrenciDersleri = line2.split(specialCharacter1);
						String alınanDersId = ogrenciDersleri[0].substring(1);
						for (int i = 0; i < Dersler.size(); i++) {
							if ((Dersler.get(i).getDersId()) == Integer.parseInt(alınanDersId)) {
								ogrenciler.alinanDersler.add(Dersler.get(i));
							}
						}
					}
				}
			}
			while (1 == 1) {
				System.out.println("\n-------------------------------------------------");
				System.out.println("(1) - Ders Ekle");
				System.out.println("(2) - Ders Listele");
				System.out.println("(3) - Ders Ara");
				System.out.println("(4) - Ders Sil");
				System.out.println("(5) - Öğrenci Ekle");
				System.out.println("(6) - Öğrenci Ara");
				System.out.println("(7) - Öğrenci Sil");
				System.out.println("(8) - Öğrenci Listele");
				System.out.println("(9) - Öğrencileri Ayrıntılı Listele");
				System.out.println("(10) - Öğrencinin Ödeyeceği Tutarı Hesapla");
				System.out.println("(11) - Çıkış");
				System.out.println("-------------------------------------------------\n");

				System.out.print("Seçiminiz: ");
				int secim = veriAl.nextInt();

				switch (secim) {
				case 1:
					DersEkle();
					break;
				case 2:
					DersListele();
					break;

				case 3:
					DersAra();
					break;

				case 4:
					DersSil();
					break;

				case 5:
					OgrenciEkle();
					break;

				case 6:
					OgrenciAra();
					break;

				case 7:
					OgrenciSil();
					break;

				case 8:
					OgrenciListele();
					break;

				case 9:
					OgrenciAyrıntılılistele();
					break;

				case 10:
					OgrencilerinOdeyeceğiTutarHesaplama();
					break;
				case 11:

					try {
						fw2 = new FileWriter(dosya2);
					} catch (IOException e) {
						e.printStackTrace();
					}
					BufferedWriter bw2 = new BufferedWriter(fw2);

					for (Ders gez : Dersler) {
						bw2.write(gez.getDersId() + "%" + gez.getDersAd() + "\n");
					}

					fw2.flush();
					bw2.flush();
					// ****************************
					try {
						fw1 = new FileWriter(dosya1);
					} catch (IOException e) {
						e.printStackTrace();
					}
					BufferedWriter bw1 = new BufferedWriter(fw1);

					for (Ogrenci gez2 : Ogrenciler) {
						bw1.write("+" + gez2.getOgrId() + "%" + gez2.getOgrAdSoyad() + "%" + gez2.getOgrYas() + "\n");
						for (int i = 0; i < gez2.alinanDersler.size(); i++) {
							bw1.write("*" + gez2.alinanDersler.get(i).getDersId() + "%"
									+ gez2.alinanDersler.get(i).getDersAd() + "\n");
						}
					}
					fw1.flush();
					bw1.flush();
					System.out.println("Menüden Çıkış Yapıldı");
					return;
				default:
					System.out.println("Yanlış tuşlama yaptınız!");
					////////////////////

				}

			}
		}

	}
}
