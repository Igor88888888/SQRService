package ru.netology.sqr.javasqds.services;


public class SQRService {

    public int calcSQR(int num1, int num2) {


        int sqr = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= num1 && i * i <= num2) {
                sqr++;
            }

        }
        return sqr;


    }

}


