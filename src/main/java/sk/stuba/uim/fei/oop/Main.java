package sk.stuba.uim.fei.oop;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student(12, "Teodora", "Simon", 20);
        testStudent(s1);
    }
    public static void testStudent(Student student){
        System.out.println("ID: " + student.getId());
        System.out.println("Meno: "+ student.getMeno());
        System.out.println("Priezvisko: "+student.getPriezvisko());
        System.out.println("Vek: "+student.getVek());
    }
}
