package class1;

public class ClassStart2 {
    public static void main(String[] args) {
  // 배열로 코드 변경을 최소화가 가능하지만 세개의 배열로 나누어져있어, 데이터 관리가 항상 정확히 수정 해야한다.
        // 이를 해결하기위해 클래스를 사용 한다
        String [] studentNames = {"학생1", "학생2","학생3","학생4"};
        int[] studentAge = {15,16,20,22};
        int[] studentGrade = {70,50,60,90};

        for(int i = 0; i<studentNames.length; i++){
            System.out.println("이름:"+studentNames[i]+"나이:"+studentAge[i]+ "성적:"+studentGrade[i]);
        }




    }
}
