package me.ohwhite.crackme1;

import java.util.ArrayList;
import java.util.Scanner;

/* loaded from: CrackMe1.jar:me/ohwhite/crackme1/eahUaRpTUmfhN.class */
public class eahUaRpTUmfhN {
    static ArrayList<Integer> jOloNtfoGORHw = new ArrayList<>();
    static ArrayList<String> ALLCxOoknIHmZ = new ArrayList<>();

    public static void main(String[] SqbnompFlDpDc) {
        CEQfFrKZdrnMK();
        bzoLCpGWzMFbU();
        System.out.println(ALLCxOoknIHmZ.get(0));
        Scanner lqTIpsmUOSJks = new Scanner(System.in);
        try {
            int hVGPdJleexhgA = lqTIpsmUOSJks.nextInt();
            if (hVGPdJleexhgA != jOloNtfoGORHw.get(0).intValue()) {
                return;
            }
        } catch (Exception e) {
            System.exit(-7);
        }
        System.out.println(ALLCxOoknIHmZ.get(1));
    }

    public static void bzoLCpGWzMFbU() {
        jOloNtfoGORHw.add(5256);
    }

    public static void CEQfFrKZdrnMK() {
        ALLCxOoknIHmZ.add("Enter an 8 digit code: ");
        ALLCxOoknIHmZ.add("You have successfully logged in!");
    }
}