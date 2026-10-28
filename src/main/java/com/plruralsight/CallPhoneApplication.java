package com.plruralsight;
import java.util.Scanner;

public class CallPhoneApplication {
    public static void main(String[] args){

        //create the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);



        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number?")));
        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number?")));
        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number?")));
        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number?")));
        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is the serial number?")));

        //System.out.println(newPhoneWhoDis.toString());

        System.out.println("Serial Number: " + + newPhoneWhoDis.getSerialNumber());
        System.out.println("Model: " + + newPhoneWhoDis.getSerialNumber());
        System.out.println("Carrier " + + newPhoneWhoDis.getSerialNumber());
        System.out.println("Owner: " + + newPhoneWhoDis.getSerialNumber());
        System.out.println("Phone Number: " + + newPhoneWhoDis.getSerialNumber());
    }

    public static String askQuestion(Scanner scanner, String question){

        System.out.print(question + ": ");
        return scanner.nextLine().trim();
    }

    public static void display (CellPhone somePhone){

        System.out.println("Serial Number: " + + somePhone.getSerialNumber());
        System.out.println("Model: " + + somePhone.getSerialNumber());
        System.out.println("Carrier " + + somePhone.getSerialNumber());
        System.out.println("Owner: " + + somePhone.getSerialNumber());
        System.out.println("Phone Number: " + + somePhone.getSerialNumber());


    }
}
