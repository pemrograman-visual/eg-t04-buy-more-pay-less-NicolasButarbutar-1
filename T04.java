// 12S24038 - NICOLAS J GRACE BUTARBUTAR
// 12S24026 - GRISELDA TABITHA NATHANIA HUTAHEAN

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        int nol, satu, dua;
        double finalPrice;
        double[] totalPrice = new double[3];
        double[] price = new double[3];

        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        int[] jumlahBuku = new int[3];

        jumlahBuku[0] = 0;
        jumlahBuku[1] = 0;
        jumlahBuku[2] = 0;
        int jumlahBuku0, jumlahBuku1, jumlahBuku2;

        jumlahBuku0 = 0;
        jumlahBuku1 = 0;
        jumlahBuku2 = 0;
        double[] totalHarga = new double[3];

        totalHarga[0] = 0;
        totalHarga[1] = 0;
        totalHarga[2] = 0;
        String buku0, buku1, buku2;

        buku0 = "tralala";
        buku1 = "tralala";
        buku2 = "tralala";
        nol = 0;
        satu = 0;
        dua = 0;
        int x;

        x = 0;
        while (x < 3) {
            iSBN[x] = input.nextLine();
            if (iSBN[x].equals("---")) {
                x = 3;
            } else {
                if (iSBN[x].equals(iSBN[0])) {
                    if (nol == 0) {
                        buku0 = iSBN[x];
                    }
                    if (iSBN[0].equals(buku0)) {
                        x = 0;
                        price[x] = Double.parseDouble(input.nextLine());
                        jumlahBuku[x] = Integer.parseInt(input.nextLine());
                        jumlahBuku0 = jumlahBuku0 + jumlahBuku[x];
                        nol = 3;
                        x = x + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = iSBN[x];
                        }
                        if (iSBN[0].equals(buku1)) {
                            x = 1;
                            price[x] = Double.parseDouble(input.nextLine());
                            jumlahBuku[x] = Integer.parseInt(input.nextLine());
                            jumlahBuku1 = jumlahBuku1 + jumlahBuku[x];
                            nol = 3;
                            x = x + 1;
                        } else {
                            x = 2;
                            price[x] = Double.parseDouble(input.nextLine());
                            jumlahBuku[x] = Integer.parseInt(input.nextLine());
                            jumlahBuku2 = jumlahBuku2 + jumlahBuku[x];
                            nol = 3;
                            x = 0;
                        }
                    }
                } else {
                    if (iSBN[x].equals(iSBN[1])) {
                        if (satu == 0) {
                            buku1 = iSBN[x];
                        }
                        if (iSBN[1].equals(buku1)) {
                            x = 1;
                            price[x] = Double.parseDouble(input.nextLine());
                            jumlahBuku[x] = Integer.parseInt(input.nextLine());
                            jumlahBuku1 = jumlahBuku1 + jumlahBuku[x];
                            satu = 3;
                            x = x + 1;
                        } else {
                            x = 2;
                            price[x] = Double.parseDouble(input.nextLine());
                            jumlahBuku[x] = Integer.parseInt(input.nextLine());
                            jumlahBuku2 = jumlahBuku2 + jumlahBuku[x];
                            satu = 3;
                            x = 0;
                        }
                    } else {
                        if (iSBN[x].equals(iSBN[2])) {
                            if (dua == 2) {
                                buku2 = iSBN[x];
                            }
                            if (iSBN[1].equals(buku1)) {
                                x = 1;
                                price[x] = Double.parseDouble(input.nextLine());
                                jumlahBuku[x] = Integer.parseInt(input.nextLine());
                                jumlahBuku2 = jumlahBuku1 + jumlahBuku[x];
                                dua = 3;
                                x = 0;
                            }
                        }
                    }
                }
            }
        }
        if (jumlahBuku0 >= 20) {
            price[0] = price[0] - price[0] * 0.12;
        } else {
            if (jumlahBuku0 >= 10) {
                price[0] = price[0] - price[0] * 0.05;
            } else {
                if (jumlahBuku0 >= 5) {
                    price[0] = price[0] - price[0] * 0.02;
                }
            }
        }
        totalPrice[0] = price[0] * jumlahBuku0;
        if (jumlahBuku1 >= 20) {
            price[1] = price[1] - price[1] * 0.12;
        } else {
            if (jumlahBuku1 >= 10) {
                price[1] = price[1] - price[1] * 0.05;
            } else {
                if (jumlahBuku1 >= 5) {
                    price[1] = price[1] - price[1] * 0.02;
                }
            }
        }
        totalPrice[1] = price[1] * jumlahBuku1;
        if (jumlahBuku2 >= 20) {
            price[2] = price[2] - price[2] * 0.12;
        } else {
            if (jumlahBuku2 >= 10) {
                price[2] = price[2] - price[2] * 0.05;
            } else {
                if (jumlahBuku2 >= 5) {
                    price[2] = price[2] - price[2] * 0.02;
                }
            }
        }
        totalPrice[2] = price[2] * jumlahBuku2;
        finalPrice = totalPrice[0] + totalPrice[1] + totalPrice[2];
        System.out.println(toFixed(finalPrice,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
