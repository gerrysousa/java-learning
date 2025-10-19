package com.patterns.learn.estructuralpatterns.adapter.tvPort.devices;

import com.patterns.learn.estructuralpatterns.adapter.tvPort.intefaces.HDMI;

public class TV implements HDMI {
	
	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println(">>> This is your sound: " + sound);
	}

}
