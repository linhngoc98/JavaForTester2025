package Bai14_DongGoi;

public class ThongTin {

  public static void main(String[] args) {

    Student student = new Student();

    //Gan gia tri thong qua ham xay dung set
    student.setName("Linh");
    student.setAge(27);
    student.setPhone("12345");

    System.out.println(student.getName());

    System.out.println(student.getAge());
  }
}
