package com.israelmesa;

public class Printer {
    private double tonerLevel = 0;
    private double numberPagesPrinted = 0;
    private boolean duplexPrinter;

    public Printer(boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberPagesPrinted = numberPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner() {
        if (tonerLevel < 100) {
            this.tonerLevel = 100;
        }
        System.out.println("Toner is at " + tonerLevel + "%");
    }

    public void print(double numberPages) {

        if (tonerLevel >= (numberPages * 5)){
            if (duplexPrinter){
                this.numberPagesPrinted += (numberPages / 2);
                System.out.println(numberPagesPrinted + " double sided pages have been printed");
            } else {
                this.numberPagesPrinted += numberPages;
                System.out.println(numberPagesPrinted + " pages have been printed");
            }
            this.tonerLevel -= (numberPages * 5);
            System.out.println("Toner level is at: " + getTonerLevel() + "%");
            if (tonerLevel == 0) {
                System.out.println("Toner needs to be filled");
            }
        } else {
            System.out.println("Toner needs to be filled");
        }

    }

    public double getTonerLevel() {
        return tonerLevel;
    }
}
