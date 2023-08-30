/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1hw_davidmccarthy;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author McCarthD3455
 */

public class MainMenuUI
{
    private static int menuUserInput;
    public static float userNum1;
    public static float userNum2;
    public static float userAnswer;
    public static void CreateUI() //Creates the Menu
    {
        System.out.println("Welcome to the calculator program");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide");
        System.out.println("4. Multiply");
        System.out.println("5. Exit");
    }
    static void SetMenuInput(int mainMenuInput) //Sets menu input so it can be used in other methods
    {
        menuUserInput = mainMenuInput;
    }
    static void SetUserNum1(float userInput1) //Sets user input so it can be used in other methods
    {
        userInput1 = userNum1;
    }
    public static float GetUserNum1() //Gets user number so it can be used in the calculations class
    {
      return userNum1;
    }
    static void SetUserNum2(float userInput2) //Sets user input so it can be used in other methods
    {
        userInput2 = userNum2;
    }
    public static float GetUserNum2() //Gets user number so it can be used in the calculations class
    {
      return userNum2;
    }
    static void MenuSwitchStatement() //Creates the main menu switch
    {
      Scanner scnr = new Scanner(System.in);
      switch (menuUserInput)
      {
          case 1:
              System.out.println("Add");
              TestUserNum1();
              TestUserNum2();
              userAnswer = Calculations.AdditionCalculations();
              System.out.println(userNum1 + " + " + userNum2 + " = " + userAnswer);
              SecondaryMenuUI.LoadSecondaryMenu();
              break;
          case 2:
              System.out.println("Subtract");
              TestUserNum1();
              TestUserNum2();
              userAnswer = Calculations.SubtractionCalculations();
              System.out.println(userNum1 + " - " + userNum2 + " = " + userAnswer);
              SecondaryMenuUI.LoadSecondaryMenu();
              break;
          case 3:
              System.out.println("Divide");
              TestUserNum1();
              TestUserNum2();
              userAnswer = Calculations.DivisionCalculations();
              System.out.println(userNum1 + " / " + userNum2 + " = " + userAnswer);
              SecondaryMenuUI.LoadSecondaryMenu();
              break;
          case 4:
              System.out.println("Multiply");
              TestUserNum1();
              TestUserNum2();
              userAnswer = Calculations.MultiplicationCalculations();
              System.out.println(userNum1 + " * " + userNum2 + " = " + userAnswer);
              SecondaryMenuUI.LoadSecondaryMenu();
              break;
          case 5:
              System.out.println("Goodbye");
              System.exit(0);
              break;
          default:
              ErrorMenuPopUp();
              break;
      } 
    }
    static void ErrorMenuPopUp() //Deploys the Error pop up
    {
        Scanner scnr = new Scanner(System.in);
        int errorInput;
        CreateErrorUI();
        System.out.print("Enter a number: ");
        try
        {
            errorInput = scnr.nextInt();
            menuUserInput = errorInput;
        }
        catch(InputMismatchException mainMenuError)
        {
            ErrorMenuPopUp();
        }
            MenuSwitchStatement();
    }
    static void CreateErrorUI() //Creates the Menu
    {
       System.out.println("ERROR!!! PLEASE ENTER NUMBER BETWEEN 1 AND 5");
       System.out.println("--------------------------------------------");
       System.out.println("1. Add");
       System.out.println("2. Subtract");
       System.out.println("3. Divide");
       System.out.println("4. Multiply");
       System.out.println("5. Exit");
    }
    static void CreateUserNum1ErrorUI() //This will create the error menu for if the user enters in anything but a number for userNum1
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("ERROR!!! PLEASE ENTER IN NUMERICAL VALUES");
        TestUserNum1();
    }
    static void CreateUserNum2ErrorUI() //This will create the error menu for if the user enters in anything but a number for userNum2
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("ERROR!!! PLEASE ENTER IN NUMERICAL VALUES");
        TestUserNum2();
    }
    static void TestUserNum1() //This will test the input to make sure it won't crash the program if it does the Error menu will pop up 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        try
        {
         userNum1 = scnr.nextFloat();
        }
        catch(InputMismatchException userNum1Error)
        {
          CreateUserNum1ErrorUI();
        }
    }
    static void TestUserNum2() //This will test the input to make sure it won't crash the program if it does the Error menu will pop up 
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a number 2: ");
        try
        {
         userNum2 = scnr.nextFloat();
        }
         catch(InputMismatchException userNum2Error)
        {
         CreateUserNum2ErrorUI();
        }
    }
}

