package com.java;
import com.java1.Demo2;
public class Demo1 {

	public void print() {
		System.out.println("Printing from com.java.Demo1");
	}
	
	public static void main(String args[]) {
		Demo1 obj1= new Demo1();
		obj1.print();
		Demo2 obj2= new Demo2();
		obj2.print();
	}
}
