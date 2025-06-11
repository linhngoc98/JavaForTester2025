import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoArrayList {
  public static void main(String[] args) {

    //Khai báo kiểu ArrayList dang String trong List
    //List<Kieu du lieu muon khai bao> ten bien = new Kieu du lieu da khai bao phia truoc<>();
    List<String> sinhVien = new ArrayList<String>();

    //ten bien.syntax();
    //Them moi gia tri vao collection: add
    sinhVien.add("A");
    sinhVien.add("B");
    sinhVien.add("C");
    sinhVien.add("D");
    sinhVien.add("G");

    //In ra toàn bộ danh sách
    System.out.println("-----in ra toan bo danh sach trong collection sinhVien theo dạng chuỗi hay là mảng-----");
      System.out.println(sinhVien);

    //In ra tổng phần tử có trong sinhVien: size, trả về giá trị so
    System.out.println("----in ra tong so phan tu co trong sinhVien-----");
    System.out.println(sinhVien.size());

    //Kiem tra collection bi trong khong
    System.out.println("----Kiem tra xem collection co rong khong------");
    System.out.println(sinhVien.isEmpty());

    //Kiểm tra phần từ có trong sinhVien: contain, trả về true/false
    System.out.println("-----Kiem tra ten co ton tai trong collection sinhVien khong-----");
    System.out.println(sinhVien.contains("B"));

    //Them 1 danh sach khac tu danh sach ban dau
    System.out.println("------Add them 1 list danh sach sinh vien khac va in ra collection do------");
   List<String> sinhVien1 = new ArrayList<>();
   sinhVien1.addAll(sinhVien);
    System.out.println(sinhVien1);


    //Xoa 1 phan tu co trong collection sinhVien1
    System.out.println("-----Xoa 1 phan tu trong sinhVien1-----");
    sinhVien1.remove("C");
    System.out.println(sinhVien1);


    System.out.println("-----Xoa 1 phan tu trong sinhVien-----");
    sinhVien.remove("G");
    System.out.println(sinhVien);


    //Truy xuất ra xem co giá trị tồn tại ở cả 2 collection sinhVien và sinhVien1: boolean
    System.out.println("-----------------");
    System.out.println("Co gia tri giong nhau khong: " + sinhVien.retainAll(sinhVien1));
    System.out.println("----In ra cac gia tri chung o ca 2 collection sau khi retainAll-----");
    System.out.println(sinhVien); //value = [A, B, D]


    //Xoá những phần tử chung ở collection sinhVien từ 2 collection sinhVien và sinhVien1
    System.out.println("-----Truy xuat ra cac gia tri con lai sau khi remove nhung gia tri chung------");
    System.out.println("Xoa du lieu chung chua: " + sinhVien1.removeAll(sinhVien));
    System.out.println(sinhVien1);


    //In ra từng giá trị của collection sinhVien
    System.out.println("------In ra tung gia tri trong collection sinhVien------");
    for (String value : sinhVien){
      System.out.println(value);
    }


    //In ra từng giá trị của collection sinhVien1
    System.out.println("------In ra tung gia tri trong collection sinhVien1------");
    for (String value : sinhVien1){
      System.out.println(value);
    }
  }

}
