package oop;

public class Overload {

    public double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public double convertToCentimeters(int heightFeet, double heightInches) {
        return heightInches * 2.54 + heightFeet * 30.48;
    }

    public String getDurationString(int seconds) {
        if(seconds <= 0) return "Invalid duration";

        int minutes = seconds / 60;
        return getDurationString(seconds % 60, minutes);
    }

    public String getDurationString(int seconds, int minutes)
    {
        if(minutes < 0) return "Invalid duration";
        return String.format("%02d:%02d:%02d", minutes / 60, minutes % 60, seconds);
    }
}

