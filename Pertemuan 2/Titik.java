/**
 * File      : Titik.java		01/03/23
 * Penulis   : Mutiara Permata Putri
 * Deskripsi : Kelas yang berisi program dari Titik
 * 
 */

public class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik; //menghitung objek titik
	public Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	public void setAbsis(double a){
		absis = a;
	}
	public void setOrdinat(double o){
		ordinat = o;
	}
	public double getAbsis(){
		return absis;
	}
	public double getOrdinat(){
		return ordinat;
	}
	int getCounterTitik(){
		return counterTitik;
	}
}