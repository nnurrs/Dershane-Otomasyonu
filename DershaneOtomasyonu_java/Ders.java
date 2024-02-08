//Nadire Nur Sağlam

package nesneOdev;

import java.io.File;

public class Ders {
	private int dersId;
	private static int syc1=1000;
	private String dersAd;
	
	public int getDersId() {
		return dersId;
	}
	public void setDersId(int dersId) {
		this.dersId = dersId;
	}
	
	public String getDersAd() {
		return dersAd;
	}
	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}
	public Ders(String dersAd) {
		this.dersAd=dersAd;
		this.dersId=syc1;
		syc1=syc1+10;
	}
	public void dersYazdir() {
		System.out.println(dersId+"      "+dersAd);
		
	}
	File ders = new File("D:\\Eclipse workspace\\Nadireodev\\src\\nyp_odev2\\ders.txt");
}
