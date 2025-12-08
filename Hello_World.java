class Hello_World{
  public static void main(String[] args){
    System.out.println("Hello World!");
    String name="Rajkumar";
    String x="Rajkumar";
    System.out.println("My name is "+name);
    String name1=new String("Rajkumar");
    String name2=new String("Rajkumar");
    System.out.println("my name is "+name1);
    if(name1==name2){
      System.out.println("Both are same");}
    else{
      System.out.println("Both are different");}
  }
} 