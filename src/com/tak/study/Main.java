package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //시간
        int a = sc.nextInt();
        //분
        int b = sc.nextInt();

        //소요 분
        int c = sc.nextInt();

        //시 -> 분
        int minute = 60 *  a + b;
        minute += c;

        int hour = (minute / 60) % 24;  //더한 값을 시간 환산
        int min = minute % 60;          //더한 값을 분 환산

        System.out.println(hour + " " + min);

    }

}
