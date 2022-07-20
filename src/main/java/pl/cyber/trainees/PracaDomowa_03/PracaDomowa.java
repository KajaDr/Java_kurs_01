package pl.cyber.trainees.PracaDomowa_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;


public class PracaDomowa {
    public static void main(String[] args) throws IOException {
        System.out.println("Hey you! give me:");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader((System.in))
        );
        //odczytujemy dane z klawiatury
        System.out.println("value a: ");

        String a = reader.readLine();
        Integer a1 = Integer.valueOf(a);
        String s = "If you multiplay by 10 you get = " +(a1*10)
                +"\nIf you divide by 2 you get = " +(a1/2);
        System.out.println(s);

        System.out.println("value b:");
        String b = reader.readLine();
        Integer b1 = Integer.valueOf(b);
        String s1 = "If you multiplay by 10 you get = " +(b1*10)
                +"\nIf you divide by 2 you get = " +(b1/2)
                + "\nIf you add previous value you will get " + (a1+b1) ;
        System.out.println(s1);

        System.out.println("value c:");
        String c = reader.readLine();
        Integer c1 = Integer.valueOf(c);
        String s2 = "If you multiplay by 10 you get = " +(c1*10)
                +"\nIf you divide by 2 you get = " +(c1/2)
                + "\nIf you add previous value you will get " + (a1+b1+c1) ;
        System.out.println(s2);

        System.out.println("value d:");
        String d = reader.readLine();
        Integer d1 = Integer.valueOf(d);
        String s3 = "If you multiplay by 10 you get = " +(d1*10)
                +"\nIf you divide by 2 you get = " +(d1/2)
                + "\nIf you add previous value you will get " + (a1+b1+c1+ d1) ;
        System.out.println(s3);

        System.out.println("value e:");
        String e = reader.readLine();
        Integer e1 = Integer.valueOf(e);
        String s4 = "If you multiplay by 10 you get = " +(e1*10)
                +"\nIf you divide by 2 you get = " +(e1/2)
                + "\nIf you add previous value you will get " + (a1+b1+c1+ d1+e1) ;
        System.out.println(s4);

        System.out.println("Hey you! give me some BIGDECIMALS");

        System.out.println("value Bg1:");

        BigDecimal bg11,bg22,bg33,bg44,bg55;
        Scanner scan = new Scanner(System.in);
        BigDecimal bg1=scan.nextBigDecimal();
        BigDecimal bg1m= bg1.multiply(BigDecimal.valueOf(10.00));
        BigDecimal bg1a= bg1.divide(BigDecimal.valueOf(2.00));
        System.out.println("If you multiplay by 10 you get = " + bg1m +
                        "\nIf you divide by 2 you get = " + bg1a);


        System.out.println("value Bg2:");
        BigDecimal bg2=scan.nextBigDecimal();
        BigDecimal bg2m= bg2.multiply(BigDecimal.valueOf(10));
        BigDecimal bg2a= bg2.divide(BigDecimal.valueOf(2));
        BigDecimal sum = bg2.add(bg2);
        System.out.println("If you multiplay by 10 you get = " + bg2m +
                "\nIf you divide by 2 you get = " + bg2a+
                "\nIf you add previous value you will get " + sum);

        System.out.println("value Bg3:");
        BigDecimal bg3=scan.nextBigDecimal();
        BigDecimal bg3m= bg3.multiply(BigDecimal.valueOf(10));
        BigDecimal bg3a= bg3.divide(BigDecimal.valueOf(2));
        BigDecimal sum1 = sum.add(bg3);
        System.out.println("If you multiplay by 10 you get = " + bg3m +
                "\nIf you divide by 2 you get = " + bg3a+
                "\nIf you add previous value you will get " + sum1);

        System.out.println("value Bg4:");
        BigDecimal bg4=scan.nextBigDecimal();
        BigDecimal bg4m= bg4.multiply(BigDecimal.valueOf(10));
        BigDecimal bg4a= bg4.divide(BigDecimal.valueOf(2));
        BigDecimal sum2 = sum1.add(bg4);
        System.out.println("If you multiplay by 10 you get = " + bg4m +
                "\nIf you divide by 2 you get = " + bg4a+
                "\nIf you add previous value you will get " + sum2);

        System.out.println("value Bg5:");
        BigDecimal bg5=scan.nextBigDecimal();
        BigDecimal bg5m= bg5.multiply(BigDecimal.valueOf(10));
        BigDecimal bg5a= bg5.divide(BigDecimal.valueOf(2));
        BigDecimal sum3 = sum2.add(bg5);
        System.out.println("If you multiplay by 10 you get = " + bg5m +
                "\nIf you divide by 2 you get = " + bg5a+
                "\nIf you add previous value you will get " + sum3);


    }
}
