//1. wap to demonstarte dynamic polymorphism.

class student {

  void me() {
    int a = 1, b = 2, c = a + b;
    System.out.println("The value at student: " + c);
  }
}

class child extends student {

  void me() {
    int a = 4, b = 3, c = a + b;
    System.out.println("The value of child: " + c);
  }
}

class tony extends child {

  void me() {
    int a = 43, b = 33, c = a + b;
    System.out.println("The value of child: " + c);
  }
}

class robert extends tony {

  void me() {
    int a = 43, b = 33, c = a + b;
    System.out.println("The value of child: " + c);
  }
}

class exp1 {

  public static void main(String[] args) {
    student random = new child();
    student random1 = new tony();
    student random2 = new robert();

    random.me();
    random1.me();
    random2.me();
    System.out.println("Hello");
  }
}
