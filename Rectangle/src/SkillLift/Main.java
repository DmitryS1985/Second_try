package SkillLift;

import org.omg.CORBA.SetOverrideType;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Rectangle rectangle = new Rectangle();


    rectangle.perimetr = (rectangle.number1 + rectangle.number2)*2 ;
    rectangle.square = (rectangle.number1 * rectangle.number2);

    rectangle.setSide1(rectangle.number1);
    rectangle.getSide1();

    rectangle.setSide2(rectangle.number2);
    rectangle.getSide2();


        System.out.println("perimetr raven " +rectangle.perimetr);
        System.out.println("ploshadj ravna " +rectangle.square);



    }
}
