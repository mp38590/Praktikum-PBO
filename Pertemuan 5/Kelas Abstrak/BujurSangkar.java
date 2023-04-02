//Nama : BujurSangkar.java 02/04/2023
//Penulis : Mutiara Permata Putri
//Deskripsi : kelas yang membuat implementasi metode abstrak pada bangun datar

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
}

//Soal
//Apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar ? jelaskan !
//Jawaban
//Akan terjadi error. Pada saat kompilasi program pada file MBujurSangkar akan mengeluarkan output error yang menyatakan kelas BujurSangkar harus diubah menjadi kelas abstrak.