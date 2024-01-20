package ref;


public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
//        student1.name = "학생1";
//        student1.age = 20;
//        student1.grade = 90;
            initStudent(student1,"학생1",15,20);

        Student student2 = new Student(); //객체나 인스턴스라 부름
//        student2.name = "학생2";
//        student2.age = 15;
//        student2.grade = 60;
        initStudent(student2,"학생2",30,40);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;

    }
    static void printStudent(Student student){
        System.out.println("이름:"+student.name+"나이:"+student.age+"성적:"+student.grade);
    }
}
