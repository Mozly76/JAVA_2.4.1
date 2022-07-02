package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int x, int y) {
        int nsqr = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x && i * i <= y) {
                nsqr++;
            }
            if (i * i > y)
                return nsqr;
        }
        return -1;
    }
}