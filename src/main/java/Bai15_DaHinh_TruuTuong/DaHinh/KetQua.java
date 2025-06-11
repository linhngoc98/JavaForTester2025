package Bai15_DaHinh_TruuTuong.DaHinh;

public class KetQua {

  public static void main(String[] args) {

    Calculator calculator = new Calculator();
    System.out.println(calculator.tinhTong(12, 14));
    System.out.println(calculator.tinhTong(12, 14, 34));
    System.out.println(calculator.phepNhan(12, 14));
  }
}

