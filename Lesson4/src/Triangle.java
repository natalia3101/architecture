public class Triangle implements iShape{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        // Calculate the semi-perimeter
        double s = (sideA + sideB + sideC) / 2;
        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB + sideC);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
        
}
