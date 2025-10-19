package com.patterns.learn.estructuralpatterns.adapter.tvPort.devices;

import com.patterns.learn.estructuralpatterns.adapter.tvPort.intefaces.VGA;

public class OldMonitor implements VGA {

	@Override
	public void setImage(String image) {
		System.out.println(">>> This is your video: " + image);
	}
	
}
