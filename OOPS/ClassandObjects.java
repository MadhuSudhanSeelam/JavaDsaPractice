public class ClassandObjects {

    // Student class
    static class Student {
        String name;
        int roll;
        int batch;

        void print() {
            System.out.println("Name: " + name+"\nRoll No: " + roll+"\nBatch: " + batch+"\n");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "MADHUREDDY";
        s1.roll = 22;
        s1.batch = 1;
        s1.print();

        Student s2 = new Student();
        s2.name = "GURIVIREDDY";
        s2.roll = 35;
        s2.batch = 1;
        s2.print();

        Student s3 = new Student();
        s3.name = "YASWANTH";
        s3.roll = 62;
        s3.batch = 2;
        s3.print();

        Student s4 = new Student();
        s4.name = "KARTHIK";
        s4.roll = 10;
        s4.batch = 1;
        s4.print();
    }
}