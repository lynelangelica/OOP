import java.util.*;

public class intro {
  int x = 99;
  String nama = "anton";
  
  // constructor
  // public intro(){
  //   System.out.print("Welcome " + nama + (x+x));
  // }
  
  public Scanner sc;
  public intro(){
    sc = new Scanner(System.in);
    String nama = sc.nextLine();
    System.out.print(nama);
    System.out.print(Math.cos(88));
    intro.Hello();
  }
  
  public static void Hello(){
    System.out.print("static function");
  }
  
  public intro(int a){
    x = 88 + a;
    System.out.print(x);
  }
  
  public static void main(String[] args) {
    new intro(); // create object from class
    // new Main(100);
  }
}