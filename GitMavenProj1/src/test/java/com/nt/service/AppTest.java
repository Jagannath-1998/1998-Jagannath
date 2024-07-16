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
}
