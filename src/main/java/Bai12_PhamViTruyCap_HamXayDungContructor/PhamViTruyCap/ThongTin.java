package Bai12_PhamViTruyCap_HamXayDungContructor.PhamViTruyCap;

import Bai12_PhamViTruyCap_HamXayDungContructor.HamXayDungContractor.Student;

// Từ khoá extends đại diện cho sự kế thừa class
public class ThongTin extends Student {

  public static void main(String[] args) {

    DemoPrivate demoPrivate = new DemoPrivate();
    System.out.println(demoPrivate.age);

    DemoDefault demoDefault = new DemoDefault();
    System.out.println(demoDefault.age);


    //Day la pham vi procted khi cung package, khong can extends
    DemoProtected demoProtected = new DemoProtected();
    demoProtected.getAddress();

    ThongTin thongTin = new ThongTin();
    thongTin.getName(); //gọi được phạm vi protected khi khác package khi kế thừa, phai dung extends

    Student student = new Student();
    student.getAge();

    System.out.println("Day la ham public su dung nhung ham/bien private de xu ly: " + demoPrivate.tinhLaiSuat());
  }
}
