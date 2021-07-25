package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    public MathUtil mathUtil=new MathUtil();

    @Test
    void add() {

        int expected=2;
        int actual= mathUtil.add(1,1);
        assertEquals(expected,actual,"add method should add 2 numbers");
    }

    @Test
    void divide(){
        assertThrows(ArithmeticException.class,()->mathUtil.divide(1,0));
    }

}