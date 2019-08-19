class Stack {
  private char s[];
  private int top;

  Stack(int size) {
    s = new char[size];
    top = 0;
  }

  Stack(Stack ob) {
    s = new char[ob.s.length];
    top = ob.top;

    for(int i = 0; i < top; i++)
      s[i] = ob.s[i];
  }

  Stack(char a[]) {
    s = new char[a.length];
    top = 0;

    for(int i = 0; i < a.length; i++) push(a[i]);
  }

  void push(char ch) {
    if (top == s.length) {
      System.out.println(" - стек заполнен");
      return;
    }
    s[top] = ch;
    top++;
  }

  char pop() {
    if(top == 0) {
      System.out.println(" - стек пуст");
      return (char) 0;
    }
    top--;
    return s[top];
  }
}

class SDemo {
  public static void main(String args[]) {
    Stack stk1 = new Stack(10);
    for(int i = 0; i < 10; i++)
      stk1.push((char)('A'+i));

    char name[] = {'T', 'o', 'm'};
    Stack stk2 = new Stack(name);

    Stack stk3 = new Stack(stk1);

    System.out.print("содержимое stk1: ");
    for(int i = 0; i < 10; i++)
      System.out.print(stk1.pop());

    System.out.println();
    System.out.print("содержимое stk2: ");
    for(int i = 0; i < 3; i++)
      System.out.print(stk2.pop());

    System.out.println();
    System.out.print("содержимое stk3: ");
    for(int i = 0; i < 10; i++)
      System.out.print(stk3.pop());
  }
}
