/**
 * File : BangunDatarGeneric.java 17/05/2023
 * Nama : Mutiara Permata Putri
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */
public class BangunDatarGeneric<T24 extends BangunDatar>{
	private T24 bangunDatar;

	public void set(T24 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}

	public T24 get(){
		return bangunDatar;
	}

	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//ketika T diubah T24 output yang dihasilkan akan error karena jika menggunakan T akan mengeluarkan output yang sesuai