public class Mtitik {
    public static void main(String[] args){
		Titik t1;
		Titik t2;
		Titik t3;
		
		t1 = new Titik();
		t1.setAbsis(1);
		t1.setOrdinat(2);

		t2 = new Titik();
		t2.setAbsis(3);
		t2.setOrdinat(4);

		t3 = new Titik();
		t3.setAbsis(5);
		t3.setOrdinat(6);

		System.out.println("Absis dari t1: "+ t1.getAbsis());
		System.out.println("Ordinat dari t1: "+ t1.getOrdinat()+"\n");

		System.out.println("Absis dari t2: "+ t2.getAbsis());
		System.out.println("Ordinat dari t2: " +t2.getOrdinat()+"\n");

		System.out.println("Absis dari t3: "+ t3.getAbsis());
		System.out.println("Ordinat dari t3: "+ t3.getOrdinat()+"\n");

		System.out.println("jumlah objek titik: "+ t1.getCounterTitik()+"\n");
    }
}