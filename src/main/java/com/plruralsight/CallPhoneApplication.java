package com.plruralsight;
import java.util.Scanner;
public class Cellphone {
    public static void main(String[] args){

        //create the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);



        newphoneDis.setSerialNumber(Integers.parseInt(askQuestions(input, "What is the serial number?")))
    }

    public static String askQuestion(Scanner scanner, String Question){

        System.out.print(question + ": ");
        return scanner.nextLine().trim();
    }
}
