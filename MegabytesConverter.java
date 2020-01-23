package com.company;

public class MegabytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2048);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            int megaBytes = kiloBytes / 1024;
            int kiloBytesRest = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRest + " KB");
        }
    }
}
