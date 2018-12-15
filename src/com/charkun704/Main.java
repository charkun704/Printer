package com.charkun704;

public class Main {

    public static void main(String[] args) {
        Printer brother = new Printer("Desk Printer",false);
        brother.printPages(10);
        brother.printPages(50);
        brother.printPages(200);
        brother.fillToner();
        brother.printPages(100);
        System.out.println(brother.toString());



    }
}
