class SumInt {
  static int sum(int...n){
    int result = 0;
    for(int i: n)
      result += i;
    return result;
  }
}

class SumDemo {
  public static void main(String args[]) {
    System.out.println("1+2+5+2: " + SumInt.sum(1, 2, 5, 2));
    System.out.println("9+1+8+2+3+7+5: " + SumInt.sum(9, 1, 8, 2, 3, 7, 5));
  }
}
