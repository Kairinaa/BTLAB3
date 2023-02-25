package HinhHoc;

public class HinhTron {
	private double r;

	
	public HinhTron(double r) {
		this.r = r;
	}
	
	public double chuVi() {
		double cv = 2 * Math.PI * this.r;
		return cv;
	}
	public double dienTich() {
		double dt = this.r * this.r * Math.PI;
		return dt;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	} 
	
}
