package Bai12_PhamViTruyCap_HamXayDungContructor.HamXayDungContractor;

public class DemoHamXayDung {

  //Hàm xây dựng được thực thi trước hàm Main()
  //Công dụng: Khởi tạo giá trị ban đầu của trường hợp nào đó

  public String name;
  public int age;

  public DemoHamXayDung(){
    System.out.println("Day la ham xay dung 0 tham so");

    //Từ khoá this đại diện cho các biến trong class trong trường hợp tên biến trùng nhau
    //Khởi tạo giá trị
    this.name = name;
    this.age = age;

  }

  //Khai bao ham xay dung
  public DemoHamXayDung(String name, int age){
    System.out.println("Day la ham xay dung 2 tham so");

    //Từ khoá this đại diện cho các biến trong class trong trường hợp tên biến trùng nhau
    //Khởi tạo giá trị
    this.name = name;
    this.age = age;
  }

  public DemoHamXayDung(String name, int age, String address){
    System.out.println("Day la ham xay dung 3 tham so");

    //Từ khoá this đại diện cho các biến trong class trong trường hợp tên biến trùng nhau
    //Khởi tạo giá trị
    this.name = name;
    this.age = age;

  }

  public void showInfor(){
    System.out.println("Ten: " + name);
    System.out.println("SDT: " + age);
  }

  public static void main(String[] args) {
       DemoHamXayDung demoHamXayDung1 = new DemoHamXayDung("Linh Ngoc", 27);
       demoHamXayDung1.showInfor();

       DemoHamXayDung demoHamXayDung2 = new DemoHamXayDung("Ha My", 7);
       demoHamXayDung2.showInfor();

       DemoHamXayDung demoHamXayDung3 = new DemoHamXayDung("Hong Anh", 1);
       demoHamXayDung3.showInfor();

    DemoHamXayDung demoHamXayDung4 = new DemoHamXayDung("Hong Anh", 1, "Thai Binh");
    demoHamXayDung4.showInfor();

    DemoHamXayDung demoHamXayDung5 = new DemoHamXayDung();
    demoHamXayDung5.showInfor();


  }
}
