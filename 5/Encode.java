class Encode {

  static String encode(String message, String key) {
    String encmsg = "";
    for(int i = 0; i < message.length(); i++) {
      encmsg += (char)(message.charAt(i) ^ key.charAt(i % key.length()));
    }
    return  encmsg;
  }

  static String decode(String message, String key) {
    String decmsg = "";
    for(int i = 0; i < message.length(); i++) {
      decmsg += (char)(message.charAt(i) ^ key.charAt(i % key.length()));
    }
    return decmsg;
  }
}

class EncodeDemo {
  public static void main(String args[]) {
    String msg = "This is test";
    String k = "abcdefgh";

    System.out.print("исходное сообщение: ");
    System.out.println(msg);

    msg = Encode.encode(msg, k);
    System.out.print("зашифрованное сообщение: ");
    System.out.println(msg);

    msg = Encode.decode(msg, k);
    System.out.print("дешифровнное сообщение: ");
    System.out.println(msg);
  }
}
