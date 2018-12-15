package com.charkun704;

public class Printer {
    private int tonerLevel;
    private boolean isDuplex;
    private int pagesPrinted;
    private String printerName;

    public Printer(String printerName,boolean isDuplex) {
        this.isDuplex = isDuplex;
        this.printerName = printerName;
        this.tonerLevel = 100;
        this.pagesPrinted = 0;
    }

    public void fillToner(){
        this.tonerLevel = 100;
        System.out.println("NOTICE: Toner full.");
    }

    public void printPages(int pagesToPrint) {
        this.tonerLevel -= (pagesToPrint * 0.5);
        if (this.tonerLevel < 1) {
            System.out.println("ERROR: Toner empty.");
        } else {
            this.pagesPrinted += pagesToPrint;
            System.out.println("NOTICE: Pages printing.");
        }
    }

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevel=" + tonerLevel +
                ", isDuplex=" + isDuplex +
                ", pagesPrinted=" + pagesPrinted +
                ", printerName='" + printerName + '\'' +
                '}';
    }
}
