package com.israelmesa;

public class Sink {
    private int toothBrushes;
    private int toothePaste;
    private int soap;
    private int handTowel;

    public Sink(int toothBrushes, int toothePaste, int soap, int handTowel) {
        this.toothBrushes = toothBrushes;
        this.toothePaste = toothePaste;
        this.soap = soap;
        this.handTowel = handTowel;
    }

    public void turnWaterOn(String waterTemperature) {
        System.out.println("The water is: " + waterTemperature);
    }

    public int getToothBrushes() {
        return toothBrushes;
    }

    public int getToothePaste() {
        return toothePaste;
    }

    public int getSoap() {
        return soap;
    }

    public int getHandTowel() {
        return handTowel;
    }
}
