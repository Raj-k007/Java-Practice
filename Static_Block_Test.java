class Static_Block_Test {
  static int i;
  static {
    i = 10;
    //System.out.println("Static block executed. Value of i: " + i);
  } 
  public static void main(String[] args) {
    System.out.println("Value of i from Static_Block: " + Static_Block_Test.i);
  }
}