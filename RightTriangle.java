public class RightTriangle {
    double base;
    double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double hypotenuse(){
        double c = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return c;
    }
}