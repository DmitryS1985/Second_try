package SkillLift;
import java.util.Scanner;

public class Rectangle {

    public double side1;

    Scanner scan1 = new Scanner(System.in);
    double number1 = scan1.nextInt();

    public double side2;
    Scanner scan2 = new Scanner(System.in);
    double number2 = scan2.nextInt();
    public double perimetr;
    public double square;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPerimetr(double perimetr) {
        this.perimetr = perimetr;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void viewRestangle () {
        System.out.println("side1" + side1);
        System.out.println("side2" + side2);
    }

}

