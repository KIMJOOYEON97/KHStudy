package todayToMe.model.vo;

import java.io.Serializable;

public class Ttm implements Serializable{

	//점수 합계
	private int sumPrice;
	private int sumTemp;
	private int sumSocial;
	private int sumIndividual;
	public Ttm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ttm(int sumPrice, int sumTemp, int sumSocial, int sumIndividual) {
		super();
		this.sumPrice = sumPrice;
		this.sumTemp = sumTemp;
		this.sumSocial = sumSocial;
		this.sumIndividual = sumIndividual;
	}
	public int getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(int sumPrice) {
		this.sumPrice = sumPrice;
	}
	public int getSumTemp() {
		return sumTemp;
	}
	public void setSumTemp(int sumTemp) {
		this.sumTemp = sumTemp;
	}
	public int getSumSocial() {
		return sumSocial;
	}
	public void setSumSocial(int sumSocial) {
		this.sumSocial = sumSocial;
	}
	public int getSumIndividual() {
		return sumIndividual;
	}
	public void setSumIndividual(int sumIndividual) {
		this.sumIndividual = sumIndividual;
	}
	@Override
	public String toString() {
		return "Ttm [sumPrice=" + sumPrice + ", sumTemp=" + sumTemp + ", sumSocial=" + sumSocial + ", sumIndividual="
				+ sumIndividual + "]";
	}
	
	
	
}
