package pjt06_01.toy;

import pjt06_01.battery.Battery;

public class ElectronicRadioToy {
	
	private Battery battery;
	
	public ElectronicRadioToy(Battery battery) {
		this.battery = battery;
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
}
