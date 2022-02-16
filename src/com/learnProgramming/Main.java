package com.learnProgramming;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer(50,true);

        System.out.println("Adding toner: " + printer1.addToner(60));

        System.out.println("Initial pages been Printed: " + printer1.getPagesPrinted());

        int pagesPrinted = printer1.printPages(1100);

        System.out.println("print pages: " + pagesPrinted + "\n new total pages have been print:" + printer1.getPagesPrinted());

        pagesPrinted = printer1.printPages(1510);

        System.out.println("print pages: " + pagesPrinted + "\n new total pages have been print:" + printer1.getPagesPrinted());

    }
}
