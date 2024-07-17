public class StringCompareExam {
    public static void main(String[] args) {

        String apple1 = "사과";
        String apple2 = "사과";
        String apple3 = new String("사과");

        // 비교
        System.out.println("apple1 == apple2 : " + (apple1 == apple2));
        System.out.println("apple3 == apple2 : " + (apple3 == apple2));

        // 객체의 위치값 출력
        System.out.println("apple1 : " + System.identityHashCode(apple1));
        System.out.println("apple2 : " + System.identityHashCode(apple2));
        System.out.println("apple3 : " + System.identityHashCode(apple3));

        System.out.println("apple1 == apple2 : " + (apple1.equals(apple2)));
        System.out.println("apple3 == apple2 : " + (apple3.equals(apple2)));
    }
}