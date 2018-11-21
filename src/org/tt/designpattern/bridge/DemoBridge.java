package org.tt.designpattern.bridge;

import org.tt.designpattern.bridge.device.Device;
import org.tt.designpattern.bridge.device.Radio;
import org.tt.designpattern.bridge.device.Tv;
import org.tt.designpattern.bridge.remote.AdvancedRemote;
import org.tt.designpattern.bridge.remote.BasicRemote;

public class DemoBridge {
	
	 public static void main(String[] args) {
	        testDevice(new Tv());
	        testDevice(new Radio());
	    }

	    public static void testDevice(Device device) {
	        System.out.println("Tests with basic remote.");
	        BasicRemote basicRemote = new BasicRemote(device);
	        basicRemote.power();
	        device.printStatus();

	        System.out.println("Tests with advanced remote.");
	        AdvancedRemote advancedRemote = new AdvancedRemote(device);
	        advancedRemote.power();
	        advancedRemote.mute();
	        device.printStatus();
	    }

}
