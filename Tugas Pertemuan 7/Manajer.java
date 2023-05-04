//Nama : Manajer.java 04/05/2023
//Penulis : Mutiara Permata Putri
//Deskripsi : representasi dasar dari Manajer IS-A Pegawai

public class Manajer extends Pegawai {
	private int tunjangan = 700000;
	
	public Manajer(String nama) {
		setNama(nama);
	}
	public void tampilData() {
		super.tampilData();
		System.out.printf("Tunjangan : %d\n", tunjangan);
	}
} 