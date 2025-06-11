package Bai12_PhamViTruyCap_HamXayDungContructor.PhamViTruyCap;

public class DemoPrivate {

  private String name = "Linh Ngoc";

  public int age = 27;

  private void showInfor(){
    System.out.println("Hello, i'm " + name);
  }


  private int VAT = 10;
  private int tongTien = 1500000;
  private int c;

  public int tinhLaiSuat(){
    return ((tongTien * VAT) / 100)*12;
  }

}
