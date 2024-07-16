package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
@Test
public void testWithPostitives() {
	Arithmetic arr = new Arithmetic();
    int excepted=300;
    int actual=arr.sum(100, 200);
    assertEquals(excepted, actual);
}
@Test
public void testWithNegatives() {
	Arithmetic arr = new Arithmetic();
    int excepted=-300;
    int actual=arr.sum(-100, -200);
    assertEquals(excepted, actual);
}
@Test
public void testWithZeroes() {
	Arithmetic arr = new Arithmetic();
    int excepted=0;
    int actual=arr.sum(0, 0);
    assertEquals(excepted, actual);
}
}
