abstract class TwoDShape {
  private double width;
  private double height;
  private String name;

  TwoDShape() {
    width = height = 0.0;
    name = "None";
  }

  TwoDShape(double w, double h, String  n) {
    width = w;
    height = h;
    name  =n;
  }

  TwoDShape(double x, String n) {
    width = height = x;
    name = n;
  }

  TwoDShape(TwoDShape ob) {
    width = ob.width;
    height = ob.height;
    name = ob.name;
  }

  double getWidth() { return width; }
  double getHeight() { return height; }
  void setWidth(double w) { width = w; }
  void setHeight(double h) { height = h; }
  String getName() { return name; }

  void showDim() {
    System.out.println("ширина и высота - " + width + " и " + height);
  }

  abstract double area();
}

class Circle extends TwoDShape {
  Circle() {
    super();
  }

  Circle(double x) {
    super(x, "Circle");
  }

  Circle(Circle ob) {
    super(ob);
  }

  double area() {
    return Math.PI * (getWidth() / 2) * (getWidth() / 2);
  }
}
