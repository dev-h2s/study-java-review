package class1;

public class ClassStart3 {
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

        System.out.println(student2);
        System.out.println(student1);

        System.out.println("이름:"+student1.name +"나이:"+student1.age+"성적:"+ student1.grade);
        System.out.println("이름:"+student2.name +"나이:"+student2.age+"성적:"+ student2.grade);


    }
}
