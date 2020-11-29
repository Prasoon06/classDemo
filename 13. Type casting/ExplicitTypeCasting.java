class ExplicitTypeCasting {
  public static void main(String[] args) {
    // create double type variable
    double num = 10.99;
    System.out.println("The double value: " + num);

    // convert into int type
    int data = (int)num;
    System.out.println("The integer value: " + data);

    // converts int to string type
    String str = String.valueOf(data);
    System.out.println("The string value is: " + str);

    // convert string variable to int
    int num1 = Integer.parseInt(str);
    System.out.println("The integer value is: " + num1);
  }
}