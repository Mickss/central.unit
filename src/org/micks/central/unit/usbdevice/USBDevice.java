package org.micks.central.unit.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();

}
