package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
//        인스턴스 생성 막기
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total+= value;
        }

        return total;
    }

    public static double average(int[] values) {
    return (double)sum(values)/values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for(int i = 0; i < values.length-1; i++) {
            if (values[i] > values[i+1]){
                min = values[i+1];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for(int i = 0; i < values.length-1; i++) {
            if (values[i] < values[i+1]){
                max = values[i+1];
            }
        }
        return max;
    }
}
