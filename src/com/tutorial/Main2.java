package com.tutorial;
import javax.swing.*;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        int makanan = 10000;
        int minuman = 5000;
        String pesan = JOptionPane.showInputDialog("Mau pesan makanan apa");
        String pesan2 = JOptionPane.showInputDialog("Mau pesan minuman apa");

        int total = makanan + minuman;
        JOptionPane.showMessageDialog(null, "Harga " + pesan + " = " + makanan + " dan harga minuman " + minuman + "\n Total harga " + total);

    }
}
