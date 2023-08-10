public class MethodOverloading {
    public static void display(String name) {
        System.out.println("Studnet name : "+name);
    }
    public static void display(String name, String rollno) {
        display(name);
        System.out.println("Studnet rollno : "+rollno);
    }
    public static void display(String name, String rollno,int marks) {
        display(name,rollno);
        System.out.println("Studnet marks : "+marks);
    }
    public static void main(String[] args) {
        display("Name1","7201",100);
        display("Name2","7202");
        display("Name3");
    }
    
}
