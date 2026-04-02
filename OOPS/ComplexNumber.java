
public class ComplexNumber{
    public static void main(String[] args) {
      Complex z1 = new Complex(2,-3); 
      Complex z2 = new Complex(3,5);
      z1.print();
      z2.print();
      System.out.println("\nThe Addtion of Two ComplexNumbers");
      
      z1.add(z2);
      z1.print();
      System.out.println("\nThe Multiplication of Two ComplexNumbers");
      
      z2.multipy(z1);
      z2.print();
      System.out.println("\nThe Division of Two ComplexNumbers");
      
      z2.divide(z1);
      z2.print();
      System.out.println();
    }
}


class Complex {
  int x;
  int y;

  Complex(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void add(Complex val) {
    x += val.x;
    y += val.y;
  }

  void multipy(Complex z) {
    int real = x * z.x - y * z.y;
    int imag = x * z.y + y * z.x;
    x = real;
    y = imag;
  }

  void divide(Complex z) {
    int den = z.x * z.x + z.y * z.y;
    int real = (x * z.x + y * z.y) / den;
    int imag = (y * z.x - x * z.y) / den;
    x = real;
    y = imag;
  }

  void print() {
    if (y >= 0)
      System.out.println(x + " + " + y + "i");
    else
      System.out.println(x + " - " + (-y) + "i");
  }
}
