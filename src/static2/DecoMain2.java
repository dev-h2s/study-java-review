package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
//        DecoUtil utils = new DecoUtil();
//        String deco = utils.deco(s);
        String deco = DecoUtil2.deco(s); // 클래스 접근해서 가져오기


        System.out.println("before " + s);
        System.out.println("before " + deco);

    }
}
