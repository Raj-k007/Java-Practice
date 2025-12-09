public class Main1 {
  public static void main(String[] args) {
    Professor person = new Professor("Alice", 30,"Computer Science");
    person.display();
  }
}
class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Person created: " + name + ", Age: " + age);
  }
}
class Professor extends Person{
  String department=null;
  Professor(String name, int age, String dept){
    super(name,age);
    department=dept;
    System.out.println("Professor created in department: "+department);
  }
  // void setDepartment(String dept){
  //   department=dept;
  // }
  void display(){
    System.out.println("Department: "+department);
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
  }
}