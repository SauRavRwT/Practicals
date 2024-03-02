//3. wap to demonstrate hybrid inheritence.

class Parent {

  void displayParent() {
    System.out.println("This is the parent class");
  }
}

class Child1 extends Parent {

  void displayChild1() {
    System.out.println("This is the first child class");
  }
}

class Child2 extends Parent {

  void displayChild2() {
    System.out.println("This is the second child class");
  }
}

class Grandchild extends Child1 {

  void displayGrandchild() {
    System.out.println("This is the grandchild class");
  }
}

public class exp3 {
  
  public static void main(String[] args) {
    Grandchild grandchild = new Grandchild();
    grandchild.displayParent();
    grandchild.displayChild1();
    grandchild.displayGrandchild();
    
    Child2 child2 = new Child2();
    child2.displayParent();
    child2.displayChild2();
    System.out.println("Saurav Rawat");
  }
}
