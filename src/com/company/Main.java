package com.company;

public class Main {

    public static void main(String[] args) {
        int mashaPerMonth = 50;
        int petyaPerMonth = (4 * mashaPerMonth) / 5;
        int lazyVasyaPerMonth = mashaPerMonth / 2;
        int fastVasyaPerMonth = mashaPerMonth;

        int totalcredits = 0;
        int numMonth = 0;
        while (totalcredits <= 2100) {
            if (totalcredits < 1370) {
                totalcredits += mashaPerMonth + petyaPerMonth + lazyVasyaPerMonth;

            } else {
                totalcredits += mashaPerMonth + petyaPerMonth + fastVasyaPerMonth;
            }
            numMonth++;
        }
        System.out.println(numMonth);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

