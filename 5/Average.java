class Average {

  static double avrg(double[] arr) {
    double sum = 0;
    for(double x: arr) {
      sum += x;
    }
    return sum /= arr.length;
  }

  public static void main(String args[]){
    double nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(avrg(nums));
  }
}
