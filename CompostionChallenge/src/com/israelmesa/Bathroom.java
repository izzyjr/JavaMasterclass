package com.israelmesa;

public class Bathroom {
    private Sink sink;
    private Toilet toilet;
    private Shower shower;

    public Bathroom(Sink sink, Toilet toilet, Shower shower) {
        this.sink = sink;
        this.toilet = toilet;
        this.shower = shower;
    }

    public void turnShowerOn(String waterTemperature) {
        shower.turnWaterOn(waterTemperature);
        System.out.println("Shower is on");
    }

    public void turnSinkOn(String waterTemperature) {
        sink.turnWaterOn(waterTemperature);
        System.out.println("Sink is on");
    }

    public void flush(int flushes) {
        toilet.pressFlushLever(flushes);
        System.out.println("Toilet has been flushed");
    }
}
