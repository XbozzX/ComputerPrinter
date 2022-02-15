package com.learnProgramming;

public class Main {

    public static void main(String[] args) {
        PCPrinter pcPrinter1 = new PCPrinter(50,0,false,1);

        pcPrinter1.StartPrint(10,2);
        System.out.println("ID: " + pcPrinter1.getClientID());

        pcPrinter1.tonerFill(20);
        System.out.println(pcPrinter1.getTonerLevel());

        System.out.println(pcPrinter1.isDuplexPrinter());

        System.out.println(pcPrinter1.getNumberPagesPrinted());
    }
}
