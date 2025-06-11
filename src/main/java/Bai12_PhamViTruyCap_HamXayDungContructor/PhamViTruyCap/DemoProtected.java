package Bai12_PhamViTruyCap_HamXayDungContructor.PhamViTruyCap;

public class DemoProtected {

  protected String address = "Ha Noi";

  protected String getAddress(){
    System.out.println("Day la ham protected trong cung 1 package: " + address);
    return address;
  }

  public static void main(String[] args) {

  }

}
