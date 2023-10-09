package org.example;

public class Main {

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {

        int minInterval = 25;
        int maxInterval = 100;

        if (n <= 100 && n >= 25){
            return true;
        }
        return false;

    }
}