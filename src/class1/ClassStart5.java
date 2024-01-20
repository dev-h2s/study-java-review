package class1;

public class ClassStart5 {
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

        Student[] students2 = new Student[2];
        students2[0] =student1 ;
        students2[1] =student2 ;
//        // 배열 최적화 =>
        Student[] students1 = new Student[] { student1, student2};
//        // 배열 최적화 =>
        Student[] students =  { student1, student2};

        for( int i  = 0; i< students.length; i++){
            System.out.println("이름:"+students[i].name +"나이:"+students[i].age+"성적:"+ students[i].grade);
        }
        //for 문 최적화 =>
        for( int i = 0; i< students.length; i++){
            Student s = students[i];
            System.out.println("이름:"+s.name+"나이:"+s.age+"성적:"+s.grade);
        }
        //for 문 최적화 =>
        for (Student s : students){
            System.out.println("이름:"+s.name+"나이:"+s.age+"성적:"+s.grade);

        }
        // 단축키 iter

    }
}
