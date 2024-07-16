package com.nt.main;

import com.nt.service.Arithmetic;

public class ApplicationRun {

	public static void main(String[] args) {
     Arithmetic arr = new Arithmetic();
     System.out.println("The sum is "+arr.sum(100,200));
	}

}
