/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1hw_davidmccarthy;

/**
 *
 * @author david
 */
public class Calculations 
{
    public static float userNum1;
    public static float userNum2;
    public static float userSum; //used to send back Addition answer
    public static float userDifference; //used to send back Subtraction answer
    public static float userProduct;//used to send back Multiplication answer
    public static float userQuotient;//used to send back Division answer
    static float AdditionCalculations()
    {
        LoadNumbers(); //Will load the numbers everytime the method is called
        userSum = userNum1 + userNum2;
        return userSum;
    }
    static float SubtractionCalculations()
    {
        LoadNumbers(); //Will load the numbers everytime the method is called
        userDifference = userNum1 - userNum2;
        return userDifference;
    }
    static float MultiplicationCalculations()
    {
        LoadNumbers(); //Will load the numbers everytime the method is called
        userProduct = userNum1 * userNum2;
        return userProduct;
    }
    static float DivisionCalculations()
    {
        LoadNumbers(); //Will load the numbers everytime the method is called
        userQuotient = userNum1 / userNum2;
        return userQuotient;
    }
    static void LoadNumbers() //This method is used to load the numbers
    {
        userNum1 = MainMenuUI.GetUserNum1();
        userNum2 = MainMenuUI.GetUserNum2();
    }
}
