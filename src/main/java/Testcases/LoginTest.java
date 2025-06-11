package Testcases;

import common.BaseTest;
import common.Constants;

public class LoginTest {

  String email = "admin@example.com";
  String inputEmail = "//input[@id='email']";
  int password = 123456;

  public void inforLogin(){
    System.out.println("Dien gia tri email: " + email);
    System.out.println("Doi tuong email: " + inputEmail);
    System.out.println("Dien gia tri password: " + password);
  }

  public String clickButtonLogin(){
    return "//button[normalize-space()='Login']";
  }

  public void verifyLoginSuccess(){
    System.out.println("Verify login success");
  }

  public void verifyLoginFail(){
    System.out.println("Verify login failed");
  }

  public static void main(String[] args) {

    //Testcase Login Success
    System.out.println("------Testcase Login success-------");
    BaseTest.createDrive();
    System.out.println("Di den trang web: " +Constants.linkBrowser);
    System.out.println("Trinh duyet co chay ngam khong: " + Constants.headLess);
    LoginTest loginTest = new LoginTest();
    loginTest.inforLogin();
    System.out.println("Click vao button: "+loginTest.clickButtonLogin());
    loginTest.verifyLoginSuccess();
    BaseTest.closeDrive();
    System.out.println("Co lam bao cao khong: " + Constants.Report);


    //Testcase Login Failed
    System.out.println("------Testcase Login failed-----");
    System.out.println("Di den trang web: " +Constants.linkBrowser);


  }
}
