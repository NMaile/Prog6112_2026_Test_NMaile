/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.report;

import java.util.Scanner;

/**
 *
 * @author maile
 */
public class RunApplication {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the console device type (e.g., PS5, XBOX, Switch): ");
        String consoleType = scanner.nextLine();

        System.out.print("Enter the store name (e.g., Number 1 Electronics - Pretoria): ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total amount of sales for the electronics store: ");
        int totalSales = scanner.nextInt();

        System.out.println();

        ConsoleSales report = new ConsoleSales(consoleType, storeName, totalSales);
        report.printConsoleReport();

        scanner.close();
    }
}
    


    

