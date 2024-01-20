package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 새로운 학생의 정보를 student1에 담는다 객체나 인스턴스라 부름
        student1.name = "학생1";
        student1.age = 20;
        student1.grade = 90;

        Student student2 = new Student(); //객체나 인스턴스라 부름
        student2.name = "학생2";
        student2.age = 15;
        student2.grade = 60;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:"+students[1].name +"나이:"+students[1].age+"성적:"+ students[1].grade);
        System.out.println("이름:"+students[0].name +"나이:"+students[0].age+"성적:"+ students[0].grade);

        
    }
}
