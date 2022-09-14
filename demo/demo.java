import java.util.*;

class Rectangle{
    public void printNameOfClass(){
        System.out.println("Rectangle");
    }
}

class Square extends Rectangle{
    @Override
    public void printNameOfClass(){
        System.out.println("Square");
    }
	@Deprecated
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
