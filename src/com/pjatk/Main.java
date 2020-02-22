package com.pjatk;

public class Main {

    public static void main(String[] args) {
        String example = "Hello PJATK!";
	    System.out.println(example);
        System.out.println("fajny skrot");
        int myFirstNumber = 35;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber + mySecondNumber;
        System.out.println(myThirdNumber);
        //byte, long, short, int  < typy liczbowe
        int intmaxValue = Integer.MAX_VALUE;
        int intminValue = Integer.MIN_VALUE;
        System.out.println(intmaxValue);
        System.out.println(intminValue);
        int bytemaxValue = Byte.MAX_VALUE;
        int byteminValue = Byte.MIN_VALUE;
        System.out.println(bytemaxValue);
        int shortmaxValue = Short.MAX_VALUE;
        System.out.println(shortmaxValue);
        long longmaxValue = Long.MAX_VALUE;
        System.out.println(longmaxValue);
        // rzutowanie
        short bigShortValue = 32767;
        int MyTotal = (byteminValue/2);
        // short myNewShortValue = bytemaxValue/2 <--- nie działa
        short myNewShortValue = (short) MyTotal; // rzutowanie: nazwa pożądanej zmiennej w nawiasie
        System.out.println("My new casted value = " + myNewShortValue);
        String x = myNewShortValue + "my new casted value = " ; // ze stringiem jakoś to działa
        System.out.println(x);

        byte a = 1;
        short b = 1;
        int c = 1;
        long i = (50000 + 10 * (a + b + c));
        System.out.println(i);

// dzielenie : int zaokrągla (modulo), float i double liczy ale double dokładniej
        double myDoubleValue = 5.00/3.00; // zapis z dziesiętnymi
        System.out.println(myDoubleValue);
        // ify
        String not = "Not";
        boolean isReady = false;
        boolean isReady2 = false;
        isReady2 = not.equals(not) ? true : false; // do zmiennej przypisz wartość jeżeli spring nie jest równy springowy coś tam coś tam
        if (isReady){
            System.out.println(isReady);
        } else {
            System.out.println(not);
        }

        // zadanie 2
        System.out.println("zadanie 2");
        double a1 = 20;
        double b1 = 40;
        double c1 = (a1+b1) * 100;
        boolean isReady3 = c1 % b1 == 0;
        if (!isReady3) {
            System.out.println(c1 % b1);
        }
        else System.out.println("0");



    }
}
