package com.learnProgramming;

public class PCPrinter {
    //declare the field
    private int tonerLevel;
    private int numberPagesPrinted;
    private boolean duplexPrinter;
    private int ClientID;

    //create the constructor for init the field
    public PCPrinter(int tonerLevel, int numberPagesPrinted, boolean duplexPrinter, int ClientID){

        if (this.tonerLevel < 0 && this.tonerLevel > 100){
            System.out.println("Error");
        } else {
            this.tonerLevel = tonerLevel;
        }


        this.numberPagesPrinted = numberPagesPrinted;
        this.duplexPrinter = duplexPrinter;
        this.ClientID = ClientID;
    }

    //create the getter
    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberPagesPrinted() {
        return numberPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public int getClientID() {
        return ClientID;
    }

    public void canDuplexPrinter(){
        System.out.println("Duplex Printer: " + this.duplexPrinter);
    }

    public int tonerFill(int amountToner){
        if (this.tonerLevel == 100) {
             return 100;
        } else {
             return this.tonerLevel += amountToner;
        }
    }

    public void StartPrint(int TotalPrint, int clientID){
        this.ClientID = clientID;
        int print = 1;
        while (print <= TotalPrint){
            System.out.println("Printing...");
            print++;
        }
        this.numberPagesPrinted = numberPagesPrinted + TotalPrint;
    }

    public int totalPaperPrinted(int TotalPrint){
        return numberPagesPrinted;
    }
}
