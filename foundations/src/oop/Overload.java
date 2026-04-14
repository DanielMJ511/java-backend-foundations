package oop;

public class Overload {

    public double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public double convertToCentimeters(int heightFeet, double heightInches) {
        return heightInches * 2.54 + heightFeet * 30.48;
    }
}

