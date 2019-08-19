class Quicksort {

  private static void qs(char items[], int left, int right) {
    int i, j;
    char x, temp;

    i = left;
    j = right;
    x= items[(left+right)/2];

    do {
      while((items[i] < x) && (i < right)) i++;
      while((x < items[j]) && (j > left)) j--;

      if(i <= j) {
        temp = items[i];
        items[i] = items[j];
        items[j] = temp;
        i++;
        j--;
      }
    } while(i <= j);

    if(left < j) qs(items, left, j);
    if(i < right) qs(items, i, right);
  }

  static void qsort(char items[]) {
    qs(items, 0, items.length - 1);
  }
}

class QSDemo {
  public static void main(String args[]) {
    char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};

    System.out.print("исходный массив: ");
    for(int i = 0; i < a.length; i++)
      System.out.print(a[i]);
    System.out.println();

    Quicksort.qsort(a);

    System.out.print("отсортированный массив: ");
    for(int i = 0; i < a.length; i++)
      System.out.print(a[i]);
  }
}
