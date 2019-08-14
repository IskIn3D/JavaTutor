class  BubbleS {
  public static void main(String args[]) {
    String arr[] = {"this", "is", "a", "test", "of", "a", "string", "sort"};

    String temp;

    System.out.print("исходный массив:");
    for(int i=0; i < arr.length; i++)
      System.out.print(" " + arr[i]);
    System.out.println();

    for(int i = 1; i < arr.length; i++)
      for(int j = arr.length-1; j >= i; j--) {
        if(arr[j-1].compareTo(arr[j]) > 0) {
          temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    System.out.print("отсортированный массив:");
    for(int i=0; i < arr.length; i++)
      System.out.print(" " + arr[i]);
    System.out.println();
  }
}
