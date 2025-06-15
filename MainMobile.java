package com.samrin.java.mobileapp;

public class MainMobile {

	public static void main(String[] args) {
		Mobile myMobile=new Mobile(6,"Apple","ios");
		System.out.println(myMobile.getBatteryPercent());
		myMobile.takePicture();
		myMobile.recordVideo();
		myMobile.playGame();
	    System.out.println(myMobile.getBatteryPercent());
	}

	

}
