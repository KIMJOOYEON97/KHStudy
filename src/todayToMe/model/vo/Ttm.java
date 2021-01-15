package todayToMe.model.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ttm implements Serializable{

	//점수 합계
	private String name;
	private int sumPrice;
	private int sumTemp;
	private int sumSocial;
	private int sumIndividual;
	
	

	int i = 0;
	
	
	public Ttm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ttm(String name) {
		this.name = name;
	}
	
	public Ttm (int sumPrice, int sumTemp, int sumSocial, int sumIndividual) {
		this.sumPrice = sumPrice;
		this.sumTemp = sumTemp;
		this.sumSocial = sumSocial;
		this.sumIndividual = sumIndividual;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(int sumPrice) {
		TtmSum.addPrice(sumPrice);
	}
	public int getSumTemp() {
		return sumTemp;
	}
	public void setSumTemp(int sumTemp) {
		TtmSum.addTemp(sumTemp);
	}
	public int getSumSocial() {
		return sumSocial;
	}
	public void setSumSocial(int sumSocial) {
		TtmSum.addSocial(sumSocial);
	}
	public int getSumIndividual() {
		return sumIndividual;
	}
	public void setSumIndividual(int sumIndividual) {
		TtmSum.addIndividual(sumIndividual);
	}
	@Override
	public String toString() {
		return "Ttm [name=" + name + ", sumPrice=" + sumPrice + ", sumTemp=" + sumTemp + ", sumSocial=" + sumSocial
				+ ", sumIndividual=" + sumIndividual + "]";
	}

	
	
}
