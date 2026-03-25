package Slide1;

public class Xe {
	private String hangXe ;
	private int namSanXuat ; 
	
	public String gethangXe() {
		return this.hangXe ;
	};
	public void sethangXe(String hangXe) {
		this.hangXe = hangXe;
	}
	public int getNamSanXuat() {
		return namSanXuat;
	}
	public void setNamSanXuat(int namSanXuat) {	
		this.namSanXuat = namSanXuat;
	}
	@Override
	public String toString() {
		return "Xe [hangXe=" + hangXe + ", namSanXuat=" + namSanXuat + "]";
	}
	
}
