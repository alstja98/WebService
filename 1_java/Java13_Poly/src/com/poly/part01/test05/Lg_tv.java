package com.poly.part01.test05;

public class Lg_tv implements Tv{
	private int vol;

	public Lg_tv() {
		System.out.println("Lg TV�� �������ϴ�.");
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public int volUp() {
		setVol(getVol()+1);
		return getVol();
	}

	@Override
	public int volDown() {
		vol = vol-1;
		return vol;
	}
	
	public void tvClosed() {
		System.out.println("Lg TV�� �������ϴ�.");
	}
}

