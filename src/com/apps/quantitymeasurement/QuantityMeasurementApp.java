package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    // Inner class representing Feet
    public static class Feet {
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {

            // Same reference (reflexive)
            if (this == obj) {
                return true;
            }

            // Null check
            if (obj == null) {
                return false;
            }

            // Type check
            if (this.getClass() != obj.getClass()) {
                return false;
            }

            // Cast safely
            Feet other = (Feet) obj;

            // Compare values safely
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Optional main method (for manual testing)
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        System.out.println(f1.equals(f2)); // true
    }
}