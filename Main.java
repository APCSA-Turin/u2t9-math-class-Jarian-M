public class Main {
    public static void main(String[] args) {
        RightTriangle rtri1 = new RightTriangle(3, 4);
        String hypo1 = "" + rtri1.hypotenuse();
        System.out.println(hypo1);

        RightTriangle rtri2 = new RightTriangle(6.5, 10.7);
        String hypo2 = "" + rtri2.hypotenuse();
        System.out.println(hypo2);
    }
}