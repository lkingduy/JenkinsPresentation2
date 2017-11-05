package tdd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import rating.Rate;

/**
 *
 * @author Admin
 */
public class RatingTest {
    
    public RatingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testRating() {
        //day la ham dung`de? test code chinh'
//        assertEquals("Excellence", Rate.rate(10));
        assertEquals("Good", Rate.rate(8));
        assertEquals("Fair", Rate.rate(7));
        assertEquals("Average", Rate.rate(5));
        assertEquals("Bad", Rate.rate(4));
        assertEquals("Invalid", Rate.rate(40));
        //ta hi vong rang Rate.rate(10) thi se nhan ve` chu excellence
        //neu ko nhan ve chu nay`, thi` ham` so sanh' assert se fail, bao' mau` do? -> code van' de`
        //pass -> den` xanh,bao' thong thuong`
    }
}
