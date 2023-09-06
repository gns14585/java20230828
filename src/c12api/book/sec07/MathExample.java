package c12api.book.sec07;

import java.util.Arrays;

public class MathExample {
    public static void main(String[] args) {
        // 소수점 올림
        double v1 = Math.ceil(5.3);
        double v2 = Math.floor(5.3);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

        long v3 = Math.max(3,7);
        long v4 = Math.min(3,7);
        System.out.println("max = " + v3);
        System.out.println("min = " + v4);

        double value = 12.3456;
        double temp1 = value * 100;
        System.out.println("temp1 = " + temp1);
        long temp2 = Math.round(temp1);
        System.out.println("temp2 = " + temp2);
        double v5 = temp2 / 100.0;
        System.out.println("v5 = " + v5);

    }
}
