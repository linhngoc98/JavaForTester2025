package Bai10_ThuocTinh_PhuongThuc;

import java.util.ArrayList;

public class DemoPhuongThuc {

  //Khai báo hàm không trả về giá trị
  public void displayInfor(){
    System.out.println("Hello Student");
    System.out.println("Dia chi cua toi la: " + getAddress());
  }

  //Khai báo hàm có trả về giá trị Kiểu String
  public String getAddress(){
    System.out.println("shsfhh");
    return "Ha Noi";
  }

  public float chieuDai(){
    return 13.5F;
  }

  public int chieuRong(){
    return 18;
  }

  //  public String chieuRong1(){
  //    return "18";
  //  }

  public static float tinhDienTich(){
    DemoPhuongThuc tinhDienTich = new DemoPhuongThuc();
    tinhDienTich.chieuDai();
    tinhDienTich.chieuRong();
    System.out.println(tinhDienTich.chieuDai() *  tinhDienTich.chieuRong());
    return tinhDienTich.chieuDai() *  tinhDienTich.chieuRong();
  }

  public static float tinhChuVi(){
    DemoPhuongThuc tinhChuVi = new DemoPhuongThuc();
    tinhChuVi.chieuDai();
    tinhChuVi.chieuRong();
    return (tinhChuVi.chieuDai() + tinhChuVi.chieuRong()*2);
  }

  public void kiemTraSo(){
    int number = 20;
    if (number % 2 == 0){
      System.out.println("Day la so chan");
    }else {
      System.out.println("Day la so le");
    }
  }

  public ArrayList<Integer> timSoChan(int number1){

    //Khai bao ham cho 1 mang
    ArrayList<Integer> arrayList = new ArrayList();
    for (int i = 0; i < number1; i++) {
      if (i % 2 == 0) {
        //them gia tri thoa man vao mang: ten bien.add
        arrayList.add(i);
      }
    }
    return arrayList;
  }


  public static void main(String[] args) {

    //Khởi tạo lớp nếu hàm là non-static, do hàm không có từ khoá stat nên cần thông qua đối tượng class
    //Tên class tên biến mới = new Tên class()
    //tên biến mới.hàm cần dùng()
    DemoPhuongThuc demo = new DemoPhuongThuc();
    demo.displayInfor();

    System.out.println("--------");

    System.out.println(tinhChuVi());
    tinhDienTich();

    System.out.println("--------");
    demo.kiemTraSo();

    System.out.println("--------");
    for (int soChan : demo.timSoChan(50)) {
      System.out.print(soChan + ", ");
    }
  }

}
