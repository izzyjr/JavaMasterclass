package com.israelmesa;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolotion;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolotion) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolotion = nativeResolotion;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " +  x + ", " +  y + " in color " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolotion() {
        return nativeResolotion;
    }
}
