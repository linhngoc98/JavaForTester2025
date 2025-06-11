package Bien;

public class SinhVien {

  public String thongtinchung; //instance

  public static void main(String[] args) {
    String name = "Nguyen Thi Ngoc Linh"; //local
    int age = 27; //local

    SinhVien sinhvien = new SinhVien(); // khai báo cho đối tượng non-static thongtinchung phía trên
    System.out.println(sinhvien.thongtinchung = name + " + " + age + " + " + ThongTin.nameSchool + " + " + ThongTin.addressSchool);
  }


}