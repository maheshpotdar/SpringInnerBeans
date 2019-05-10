package com.mahesh.model;

public class TwoWheeler {
	private String nameof2Wheeler;
	private int avg;

	public TwoWheeler() {
		// TODO Auto-generated constructor stub
	}

	public String getNameof2Wheeler() {
		return nameof2Wheeler;
	}

	public void setNameof2Wheeler(String nameof2Wheeler) {
		this.nameof2Wheeler = nameof2Wheeler;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "TwoWheeler [nameof2Wheeler=" + nameof2Wheeler + ", avg=" + avg + "]";
	}

}
