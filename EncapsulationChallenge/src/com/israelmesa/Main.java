package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(true);
        printer.fillToner();
        printer.getTonerLevel();
        printer.print(20);
        printer.getTonerLevel();

        System.out.println("...........................");

        Printer printer2 = new Printer(true);
        printer2.fillToner();
        printer2.getTonerLevel();
        printer2.print(18);
        printer2.getTonerLevel();

        System.out.println("...........................");

        TimPrinter timPrinter = new TimPrinter(false, 50);
        System.out.println("Initial pages printed count: " + timPrinter.getPagesPrinted());
        int pagesPrinted = timPrinter.printPages(4);
        System.out.println("Pages printed was: " + pagesPrinted + " new total count for printer: " + timPrinter.getPagesPrinted());

        pagesPrinted = timPrinter.printPages(10);
        System.out.println("Pages printed was: " + pagesPrinted + " new total count for printer: " + timPrinter.getPagesPrinted());

    }
}
