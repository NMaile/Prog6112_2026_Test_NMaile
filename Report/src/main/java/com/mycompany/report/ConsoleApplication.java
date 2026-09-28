/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.report;

/**
 *
 * @author maile
 */
public class ConsoleApplication {
   

interface IConsole {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

abstract class Console implements IConsole {
    protected String consoleType;
    protected String storeName;
    protected int totalSales;

    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() { return consoleType; }
    @Override
    public String getStore() { return storeName; }
    @Override
    public int getTotalSales() { return totalSales; }
}
}



