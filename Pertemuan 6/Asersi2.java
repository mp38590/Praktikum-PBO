//Nama : Asersi2.java 02/04/2023
//Penulis : Mutiara Permata Putri
//Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol

//class Lingkaran
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

//class Asersi2
public class Asersi2{
	public static void main(String[] args){
		double jariJari = 3;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

//Soal
//Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
//Jawaban
//Ya, karena perintah dari assert jari-jari harus lebih dari 0, tetapi masukan jari-jari bernilai 0. Sehingga agar program tersebut dapat berjalan, maka masukan jari-jari harus diubah menjadi nilai lebih dari 0. Misalnya jariJari = 3, maka hasilnya adalah 18,85