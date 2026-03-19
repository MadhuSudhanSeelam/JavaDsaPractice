public class FractionNumber {
    public static void main(String[] args) {
      Fraction f1 = new Fraction(3,7);
      Fraction f2 = new Fraction(7,3);
      f1.multipy(f2);
      f1.print();
      f1.divide(f2);
      f1.print();
      Fraction f3 = new Fraction(7,-13);
      f3.print();
    }
}



class Fraction{
  int num;
  int den;
  Fraction(int num,int den){
    this.num = num;
    this.den = den;
    simply();
    
  }
  void add(Fraction f){
    num = num*f.den + den*f.num;
    den = den*f.den;
    simply();
  }
  
  void multipy(Fraction f){
   num = num * f.num; 
   den = den * f.den; 
    simply();
  }
  
  void divide(Fraction f){
   num = num * f.den; 
   den = den * f.num; 
    simply();
  }
  void print(){
    System.out.print(num+"/"+den);
    System.out.println();
  }
  
  void simply(){
    boolean isNeg = (num*den < 0)?true:false;
    num = Math.abs(num);
    den = Math.abs(den);
    int gcd = hcf(num,den);
    num = num/gcd;
    den = den/gcd;
    if(isNeg) num = -num;
  }
  
  int hcf(int a,int b){
    if(a==0)return b;
    return hcf(b%a,a);
  }
}

