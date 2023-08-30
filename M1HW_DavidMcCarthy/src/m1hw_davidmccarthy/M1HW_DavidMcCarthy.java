/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1hw_davidmccarthy;

import java.util.InputMismatchException;
import java.util.Scanner;
//David McCarthy
//CTS-285
//8/30/2023
//All values end in a decimal because I used floats for all of my calculations
/**
 *
 * @author McCarthD3455
 */
public class M1HW_DavidMcCarthy
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        LoadCalculator();
    }
    public static void LoadCalculator()
    {
        Scanner scnr = new Scanner(System.in);
        int mainMenuInput;
        
            MainMenuUI.CreateUI();
            System.out.print("Enter a number: ");
            try
        {
            mainMenuInput = scnr.nextInt();
            MainMenuUI.SetMenuInput(mainMenuInput);
        }
        catch (InputMismatchException MainMenuError)
        {
          MainMenuUI.ErrorMenuPopUp();
        }
        MainMenuUI.MenuSwitchStatement();
    }
}
