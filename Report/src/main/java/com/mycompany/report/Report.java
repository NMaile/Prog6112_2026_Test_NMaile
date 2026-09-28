/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.report;

import java.util.Scanner;

/**
 *
 * @author maile
 */
public class Report {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scanner = new Scanner(System.in);

        // Prompting user for sales inputs across the 3 cities and 3 consoles
        System.out.print("Enter the number of PS5 sales for Pretoria: ");
        int pretoriaPS5 = scanner.nextInt();
        System.out.print("Enter the number of XBOX sales for Pretoria: ");
        int pretoriaXbox = scanner.nextInt();
        System.out.print("Enter the number of Switch sales for Pretoria: ");
        int pretoriaSwitch = scanner.nextInt();

        System.out.print("Enter the number of PS5 sales for Port Elizabeth: ");
        int pePS5 = scanner.nextInt();
        System.out.print("Enter the number of XBOX sales for Port Elizabeth: ");
        int peXbox = scanner.nextInt();
        System.out.print("Enter the number of Switch sales for Port Elizabeth: ");
        int peSwitch = scanner.nextInt();

        System.out.print("Enter the number of PS5 sales for Cape Town: ");
        int ctPS5 = scanner.nextInt();
        System.out.print("Enter the number of XBOX sales for Cape Town: ");
        int ctXbox = scanner.nextInt();
        System.out.print("Enter the number of Switch sales for Cape Town: ");
        int ctSwitch = scanner.nextInt();

        // Displaying the Yearly Sales Report Table
        System.out.println("\n=========================================================");
        System.out.println("      NUMBER 1 ELECTRONICS FRANCHISE - YEARLY SALES       ");
        System.out.println("=========================================================");
        System.out.printf("%-16s | %-10s | %-10s | %-10s%n", "City", "PS5", "XBOX", "Switch");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-16s | %-10d | %-10d | %-10d%n", "Pretoria", pretoriaPS5, pretoriaXbox, pretoriaSwitch);
        System.out.printf("%-16s | %-10d | %-10d | %-10d%n", "Port Elizabeth", pePS5, peXbox, peSwitch);
        System.out.printf("%-16s | %-10d | %-10d | %-10d%n", "Cape Town", ctPS5, ctXbox, ctSwitch);
        System.out.println("=========================================================");

        // Displaying Total Sales for Each City
        System.out.println("\n=========================================================");
        System.out.println("            TOTAL YEARLY SALES FOR EACH CITY              ");
        System.out.println("=========================================================");
        System.out.printf("%-16s | %-10s%n", "City", "Total Sales");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-16s | %-10d%n", "Pretoria", (pretoriaPS5 + pretoriaXbox + pretoriaSwitch));
        System.out.printf("%-16s | %-10d%n", "Port Elizabeth", (pePS5 + peXbox + peSwitch));
        System.out.printf("%-16s | %-10d%n", "Cape Town", (ctPS5 + ctXbox + ctSwitch));
        System.out.println("=========================================================");

        scanner.close();
    
    }
}
