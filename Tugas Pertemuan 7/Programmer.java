//Nama : Programmer.java 04/05/2023
//Penulis : Mutiara Permata Putri
//Deskripsi : representasi dasar dari Programmer IS-A Pegawai

public class Programmer extends Pegawai {
	private int bonus = 450000;
	
	public Programmer(String nama) {
		setNama(nama);
	}
	public void tampilData() {
		super.tampilData();
		System.out.printf("Bonus : %d\n", bonus);
	}
} 