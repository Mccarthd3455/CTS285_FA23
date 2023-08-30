/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1hw_davidmccarthy;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class SecondaryMenuUI 
{
    private static int user2ndMenuInput;
    static void CreateSecondaryMenu() //Creates the Secondary Menu without the switch in it
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("1. Repeat");
        System.out.println("2. Main Menu");
        System.out.print("Enter a number: ");
        //use of try catch to not crash the program
        try
        {
        user2ndMenuInput = scnr.nextInt();
        }
        catch (InputMismatchException secondaryMenuError)
        {
            Error2ndMenuPopUp();
        }
        
    }
    static void SecondaryMenuSwitch()
    {
        //Switch statement for second menu
        switch (user2ndMenuInput)
        {
            case 1:
                MainMenuUI.MenuSwitchStatement(); //This method is used for the repeat option for the second menu
                break;
            case 2:
                M1HW_DavidMcCarthy.LoadCalculator(); //used to load the main menu of the calculator 
                break;
            default:
                Error2ndMenuPopUp(); //if 1 or 2 isnt entered it will pop up with an error
        }
    }
    static void LoadSecondaryMenu()
    {
        //This method contains the methods that create the secondary menu and its switch statement
        CreateSecondaryMenu();
        SecondaryMenuSwitch();
    }
    static void Error2ndMenuPopUp()
    {
        //This method deploys the error popup for the 2nd menu
        Scanner scnr = new Scanner(System.in);
        int error2ndInput;
        CreateError2ndMenu();
        error2ndInput = scnr.nextInt();
        user2ndMenuInput = error2ndInput;
        SecondaryMenuSwitch();
    }
    static void CreateError2ndMenu()
    {
        //This method creates the text you will see if you cause an error on the 2nd menu
       System.out.println("ERROR!!! PLEASE ENTER 1 OR 2");
       System.out.println("----------------------------");
       System.out.println("1. Repeat");
       System.out.println("2. Main Menu");
       System.out.print("Enter a number: "); 
    }
}
