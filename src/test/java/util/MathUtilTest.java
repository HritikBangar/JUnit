package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void add() {
        MathUtil mathUtil=new MathUtil();
        int expected=2;
        int actual= mathUtil.add(1,1);
        assertEquals(expected,actual,"add method should add 2 numbers");
    }

}