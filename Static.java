public class Static {
  String name;
  static String college="ABC College";
  void display(){
    System.out.println("My name is "+name);
    System.out.println("My college is "+college);
  }
  public static void main(String[] args){
    Static obj1=new Static();
    //obj1.college="XYZ College";
    obj1.name="Rajkumar";
    System.out.println("Object 1 details:"+obj1.name+", "+college);
  }
}
