package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testEquality_FeetToFeet_SameValue() {
        assertTrue(new Length(1.0, Length.LengthUnit.FEET)
                .equals(new Length(1.0, Length.LengthUnit.FEET)));
    }

    @Test
    public void testEquality_InchToInch_SameValue() {
        assertTrue(new Length(1.0, Length.LengthUnit.INCHES)
                .equals(new Length(1.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testEquality_FeetToInch_EquivalentValue() {
        assertTrue(new Length(1.0, Length.LengthUnit.FEET)
                .equals(new Length(12.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testEquality_InchToFeet_EquivalentValue() {
        assertTrue(new Length(12.0, Length.LengthUnit.INCHES)
                .equals(new Length(1.0, Length.LengthUnit.FEET)));
    }

    @Test
    public void testEquality_FeetToFeet_DifferentValue() {
        assertFalse(new Length(1.0, Length.LengthUnit.FEET)
                .equals(new Length(2.0, Length.LengthUnit.FEET)));
    }

    @Test
    public void testEquality_InchToInch_DifferentValue() {
        assertFalse(new Length(1.0, Length.LengthUnit.INCHES)
                .equals(new Length(2.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testEquality_NullComparison() {
        assertFalse(new Length(1.0, Length.LengthUnit.FEET).equals(null));
    }

    @Test
    public void testEquality_SameReference() {
        Length l = new Length(1.0, Length.LengthUnit.FEET);
        assertTrue(l.equals(l));
    }

    @Test
    public void testEquality_InvalidUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Length(1.0, null);
        });
    }
}