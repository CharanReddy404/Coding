package com.company;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel>=0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else {
            tonerLevel=-1;
        }
        this.printedPages = 0;
        this.duplexPrinter = duplexPrinter;
    }


    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;
            }
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint/=2;
            pages %=2;
            pagesToPrint+=pages;
            System.out.println("Printing in Duplex Mode");
        }else {
            this.printedPages += pages;
            System.out.println("Printing in Normal Mode");
        }
        return pagesToPrint;
    }
}
