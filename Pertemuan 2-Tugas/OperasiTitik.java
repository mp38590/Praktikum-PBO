public class OperasiTitik
{
	private void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
	}
	private void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
	public Titik refleksiY(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	public Titik refleksiX(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
}
