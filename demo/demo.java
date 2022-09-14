/*This program is a demonstration of Annotations in Java*/

import java.util.*;

class Rectangle{
    public void printNameOfClass(){
        System.out.println("Rectangle");
    }
}

class Square extends Rectangle{
    @Override /*Override annotation will check for the method in parent class*/
    public void printNameOfClass(){
        System.out.println("Square");
    }
	@Deprecated /*Deprecated annotation is used to indicate that the method is old and may not be used in new codes or lines */

	public void showNameOfClass(){
		System.out.println("Sqr");
	}
}

public class demo{
    public static void main(String[] args){
        Square s = new Square();
        s.printNameOfClass();
	s.showNameOfClass();

        Rectangle r = new Rectangle();
        r.printNameOfClass();
    }
}
