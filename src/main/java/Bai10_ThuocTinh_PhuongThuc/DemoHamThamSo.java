package Bai10_ThuocTinh_PhuongThuc;

public class DemoHamThamSo {

  //Khai báo ham có 2 tham số với
  public int tong2SoNguyen(int number1, int number2){
    return number1 + number2;
  }

  //Sửa tên hàm: refactor => name vào đúng tên hàm đó => sửa đồng loạt
  public void informationUser(String name, int age, String address){
    System.out.println("Ho va ten: " + name);
    System.out.println("Tuoi: " + age);
    System.out.println("Dia chi: " + address);
  }

  public float tinhDienTichHCM(float chieuDai, float chieuRong){
    return chieuDai * chieuRong;
  }

  public static void main(String[] args) {

    DemoHamThamSo hamThamSo = new DemoHamThamSo();
    System.out.println("------In ra ham tong2SoNguyen--------");
    System.out.println("Tổng 2 số nguyên là: " + hamThamSo.tong2SoNguyen(40 ,3));

    System.out.println("------In ra ham inforUser--------");
    hamThamSo.informationUser("Linh", 24, "Ha Noi");
    hamThamSo.informationUser("My", 7, "Thai Binh");
    hamThamSo.informationUser("Hong Anh", 1, "Thai Binh");

    System.out.println("------In ra ham tinhDienTich--------");
    System.out.println("Dien tich = " + hamThamSo.tinhDienTichHCM(12.4F, 12.5F));
  }

}
