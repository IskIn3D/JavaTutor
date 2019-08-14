class  Bubble {
  public static void main(String args[]) {
    int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

    int num, temp;

    System.out.print("исходный массив:");
    for(int i=0; i < nums.length; i++)
      System.out.print(" " + nums[i]);
    System.out.println();

    for(int i = 1; i < nums.length; i++)
      for(num = nums.length-1; num >= i; num--) {
        if(nums[num-1] > nums[num]) {
          temp = nums[num-1];
          nums[num-1] = nums[num];
          nums[num] = temp;
        }
      }
    System.out.print("отсортированный массив:");
    for(int i=0; i < nums.length; i++)
      System.out.print(" " + nums[i]);
    System.out.println();
  }
}
