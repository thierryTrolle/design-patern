package org.tt.designpattern.bridge.remote;

import org.tt.designpattern.bridge.device.Device;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
