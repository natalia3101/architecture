public class App {
    public static void main(String[] args)  {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        figureBox.add(circle1);

        Rectangle rectangle1 = new Rectangle(10, 5);
        figureBox.add(rectangle1);

        System.out.println(figureBox);

    }
}