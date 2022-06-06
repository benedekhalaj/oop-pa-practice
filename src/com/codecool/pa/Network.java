package com.codecool.pa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Network implements LightweightInfo, NormalInfo {
    private final List<Device> devices = new ArrayList<>();

    public void registerDevice(Device device) {
        devices.add(device);
    }

    @Override
    public int getLightweightDeviceCount() {
        return devices.stream()
                .filter(device -> device instanceof Lightweight)
                .toList()
                .size();
    }

    @Override
    public int getNormalDeviceCountInBatteryRange(int base, int range) {
        return devices.stream()
                .filter(device -> device instanceof Normal)
                .filter(device ->
                        device.calculateRemainingPower() >= base - range &&
                        device.calculateRemainingPower() <= base + range)
                .toList()
                .size();
    }
}
