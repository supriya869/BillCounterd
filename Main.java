package com.supriya.beans.main;

import java.util.Scanner;
import com.supriya.beans.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor p = new PaymentProcessor();
        Scanner sc = new Scanner(System.in);
        
        // Take card type input from the user
        System.out.println("Enter card type (DEBIT_CARD / CREDIT_CARD / ZETA_CARD): ");
        String cardType = sc.nextLine();  // Read card type input

        // Take bill amount input from the user
        System.out.println("Enter bill amount: ");
        double billAmt = sc.nextDouble();  // Read bill amount input
        
        // Call the payment processor with user inputs
        boolean dopayment = p.dopayment(cardType, billAmt);

        // Check if payment was successful
        if (dopayment) {
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment not processed successfully.");
        }

        // Close the scanner
        sc.close();
    }
}
