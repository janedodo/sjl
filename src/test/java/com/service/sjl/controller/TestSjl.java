package com.service.sjl.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSjl {

        SjlDelegate sjlDelegate = new SjlDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello, " + name; // You should put the expect String type value here.

        String returnValue = sjlDelegate.helloworld("name");

        assertEquals(expactReturnValue, returnValue);
    }

}
