//Nadire Nur Sağlam

package nesneOdev;

import java.util.ArrayList;

public class Ogrenci {
	private int ogrId;
	public int getOgrId() {
		return ogrId;
	}
	public void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}
	private int ogrYas;
	public int getOgrYas() {
		return ogrYas;
	}
	public void setOgrYas(int ogrYas) {
		this.ogrYas = ogrYas;
	}
	private String ogrAdSoyad;
	public String getOgrAdSoyad() {
		return ogrAdSoyad;
	}
	public void setOgrAdSoyad(String ogrAdSoyad) {
		this.ogrAdSoyad = ogrAdSoyad;
	}
	public ArrayList<Ders> alinanDersler = new ArrayList<Ders>();
	
	public Ogrenci(String ogrAdSoyad,int ogrYas,int ogrId) {
		this.ogrAdSoyad=ogrAdSoyad;
		this.ogrYas=ogrYas;
		this.ogrId=ogrId;

	}
	public void ogrenciYazdir() {
		System.out.println(ogrId+"      "+ogrAdSoyad+"        "+ogrYas);
		
	}
}
