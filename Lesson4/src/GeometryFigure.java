import java.util.List;

public class GeometryFigure {

    static private List<iShape> toolbox;
    public GeometryFigure() {
        toolbox = new List<iShape>();
    }

    // Метод для добаления новой фигуры
    public void add(iShape figure) {
        toolbox.add(figure);
    }

    // Метод для удаления фигуры
    public void delete(iShape figure) {
        toolbox.remove(figure);
    }

    // Метод поиска необходимой фигуры
    

    // Метод отображения подробной информации о фигуре
    // public void getInfo(int num) {
    //     if (...) {
    //         ...
    //     }
    //     iShape figure = toolbox[num];
    //     System.out.ptintln(figure.getArea(), figure.getPerimeter());
    // }
}
