package HomeWork;

import java.util.Scanner;

public class HinhTamGiacCan {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      //in khoảng trắng
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      //in dấu *
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      //in xuống dòng để ra hình tam giác cân
      System.out.println();
    }
  }
}
