package com.samrin.java.mobileapp;

public class Mobile {
	
		private int screenSize;
		private String companyName;
		private String os;
		private int batteryPercent;
		public Mobile(int screenSize, String companyName, String os) {
			this.screenSize = screenSize;
			this.companyName = companyName;
			this.os = os;
			batteryPercent=100;
		}
		public int getScreenSize() {
			return screenSize;
		}
		public void setScreenSize(int screenSize) {
			this.screenSize = screenSize;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getOs() {
			return os;
		}
		public void setOs(String os) {
			this.os = os;
		}
		public int getBatteryPercent() {
			return batteryPercent;
		}
		public void takePicture(){
			if(batteryPercent<10){
				System.out.println("battery is dead plug charger");
			}
			else{
				System.out.println("picture taken");
				batteryPercent=batteryPercent-10;
			}
		}
		public void recordVideo(){
			if(batteryPercent<30){
				System.out.println("battery is dead plug charger");
			}
			else{
				System.out.println("video recorded");
				batteryPercent=batteryPercent-30;
			}
		}
			public void playGame(){
				if(batteryPercent<60){
					System.out.println("battery is dead plug charger");
				}
				else{
					System.out.println("playing video game");
					batteryPercent=batteryPercent-60;
				}
			}
			public void charge(){
				batteryPercent=100;
				System.out.println("battery is charged");
			}
		
		

	}



	





