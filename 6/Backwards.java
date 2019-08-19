class Backwards {
  static void backward(String str){
    bckwrd(0, str);
  }

  private static void bckwrd (int index , String str) {
    if(index != str.length()-1) bckwrd(index + 1, str);
    System.out.print(str.charAt(index));
  }
}

class BDemo {
  public static void main(String args[]) {
    Backwards.backward("This is TEST!!!");
  }
}
