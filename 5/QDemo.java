class Queue {
  char q[];
  int putloc, getloc;

  Queue(int size) {
    q = new char[size+1];
    putloc = getloc = 0;
  }

  void put(char ch) {
    if (putloc == q.length-1) {
      System.out.println(" - очередь заполнина");
      return;
    }
    putloc++;
    q[putloc] = ch;
  }

  char get() {
    if(getloc == putloc) {
      System.out.println(" - очередь пуста");
      return (char) 0;
    }
    getloc++;
    return q[getloc];
  }
}

class QDemo {
  public static void main(String args[]) {
    Queue bigQ = new Queue(100);
    Queue smallQ = new Queue(4);
    char ch;

    System.out.println("использовние очереди bigQ для сохранения алфавита");
    for(int i = 0; i < 26; i++)
      bigQ.put((char)('A' + i));

    System.out.println("содержимое очереди bigQ");
    for(int i = 0; i < 26;i++) {
      ch = bigQ.get();
      if(ch != (char) 0) System.out.print(ch);
    }

    System.out.println("\n");

    System.out.println("использовние очереди bigQ для генерации ошибок");
    for(int i =0; i < 5; i++) {
      System.out.print("попытка сохранения " + (char)('Z' - i));
      smallQ.put((char)('Z' - i));
      System.out.println();
    }
    System.out.println();

    System.out.print("содержимое smallQ: ");
    for( int i = 0; i < 5; i++) {
      ch = smallQ.get();
      if(ch != (char) 0) System.out.print(ch);
    }
  }
}
