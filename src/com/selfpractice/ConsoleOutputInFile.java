package com.selfpractice;

/*SAVE CONSOLE OUTPUT INTO A FILE.
Date :  17/02/2023
Author : Neha Kumari
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ConsoleOutputInFile {
    public static void main(String[] args) {
        try {
            PrintStream myConsole = new PrintStream(new File("N:\\LearnJava2023\\KunalTutorial\\TestFile.txt"));
            System.setOut(myConsole);
            myConsole.print("Hello Neha ji!");
        } catch (FileNotFoundException fx) { //here fx is used to refer to the FileNotFoundException error
            System.out.println(fx);
        }
    }
}