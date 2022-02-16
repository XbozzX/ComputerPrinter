package com.learnProgramming;

public class Printer {
    //declare the field
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    //create the constructor for init the field
    public Printer(int tonerLevel, boolean duplex){

        if (this.tonerLevel < 0 && this.tonerLevel > 100){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    //create the getter
    public int getPagesPrinted() {
        return pagesPrinted;
    }

    //create a method for the printer function

    //valid the amount toner been added
    public int addToner(int tonerAmount){
        if (tonerAmount > 0 & tonerAmount <=100){
            if (this.tonerLevel + tonerAmount > 100){
                this.tonerLevel = -1;
                return this.tonerLevel;
            }
            this.tonerLevel = tonerAmount;
            return this.tonerLevel;
        } else {
            this.tonerLevel = -1;
            return this.tonerLevel;
        }
    }

    //valid the amount of paper been print and check weather been printing duplex mode or not
    public int printPages(int pages){
        int pagesToPrint = pages;

        if (this.duplex == true){
            pagesToPrint = ((pages / 2) + (pages % 2));
            //System.out.println((pages % 2));
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        } else {
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

    }

}
