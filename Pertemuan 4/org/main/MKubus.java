//Nama : MKubus.java 15/03/2023
//Penulis : Mutiara Permata Putri
//Deskripsi : main dari Kubus


package org.main;

import org.bangunruang.Kubus;
import org.bangundatar.BujurSangkar;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+kubus.hitungLuasAlas());
		System.out.println("Volume Kubus dengan Panjang Sisi 4 sauan : "+kubus.hitungVolume());
	}
}