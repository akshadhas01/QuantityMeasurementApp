package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println(
                new Length(1.0, Length.LengthUnit.YARDS)
                        .equals(new Length(36.0, Length.LengthUnit.INCHES))
        );

        System.out.println(
                new Length(1.0, Length.LengthUnit.CENTIMETERS)
                        .equals(new Length(0.393701, Length.LengthUnit.INCHES))
        );
    }
}