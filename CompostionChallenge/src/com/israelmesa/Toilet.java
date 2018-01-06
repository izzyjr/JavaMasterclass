package com.israelmesa;

public class Toilet {
    private int toiletPaper;

    public Toilet(int toiletPaper) {
        this.toiletPaper = toiletPaper;
    }

    public void pressFlushLever(int flushes) {
        System.out.println("Flush lever has been pressed " + flushes + " times!");
    }

    public int getToiletPaper() {
        return toiletPaper;
    }
}
