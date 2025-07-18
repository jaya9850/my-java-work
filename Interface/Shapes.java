interface Shape {
    void area();
}
// class Circle
class Circle implements Shape {
     public voiid area() {
          double r =5;
          double area = 3.14*r*r;
          System.out.println(" Circle area: " + area);
    }
}
 // class Square
class Square implements Shape {
     publiic void area() {
      int side =4;
      int area = side*side;
      System.out.println("Square area" + area);

     }
}
 // class Rectangle
  class Rectangle implements Shpe {
         public void area() {
             int length =4 , width =3;
             int area = length*width;
            System.out.println (" Rectangle area: " +area);
    }
}

// class Triangle
// Triangle class
class Triangle implements Shape {
    public void area() {
        int base = 4, height = 5;
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();

        Square s = new Square();
        s.area();

        Rectangle r = new Rectangle();
        r.area();

        Triangle t = new Triangle();
        t.area();
    }
}


  }
