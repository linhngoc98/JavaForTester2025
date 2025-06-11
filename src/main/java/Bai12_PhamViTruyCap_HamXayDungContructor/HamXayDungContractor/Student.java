package Bai12_PhamViTruyCap_HamXayDungContructor.HamXayDungContractor;

public class Student {

  int age = 27;
  String name = "Linh Ngoc";

  protected String getName(){
    System.out.println("Day la ham goi ra cua Protected khac package: " + name);
    return name;
  }

  public int getAge(){
    System.out.println("Day la ham goi ra cua Public giua cac package: " + age);
    return age;
  }

  public static void main(String[] args) {

  }
}
