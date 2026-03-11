public class GettersandSetters {
    public static void main(String[] args) {
      Students s1 = new Students();
      s1.Name="Madhu";
      // s1.roll = 20; //Error
      s1.cgpa = 7.8;
      s1.print();
      s1.GetRoll(20);
      s1.print();
    }
    
}
class Students{
  String Name;
  private int roll;
  double cgpa;
  void print(){ // getters-> get values in private Values
    System.out.println("Name: "+Name+"\nRoll No: "+roll+"\nCGPA: "+cgpa+"\n");
  }
  void GetRoll(int a){ // Seters-> set values in private Values
    roll = a;
    System.out.println("Roll No: "+roll);
  }
}