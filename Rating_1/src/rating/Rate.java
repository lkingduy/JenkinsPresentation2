/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rating;

/**
 *
 * @author Admin
 */
public class Rate {
    public static String rate(double point) {
        if(point > 10)
            return "Invalid";
        else if(point >= 9 && point <= 10)
            return "Excellence";
        else if(point >= 8)
            return "Good";
        else if(point >= 7)
            return "Fair";
//        else if(point >= 5)
//            return "Average";
        else
            return "Bad";
        
    }    
}
