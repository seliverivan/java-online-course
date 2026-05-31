
public class Module3Theme13Tasks {
    public static void main(String[] args) {
        Painter.penSetup(Colors.Red); //вывод красного цвета
    }
}

enum Colors {
    Black("Черный"),
    White("Белый"),
    Red("Красный"),
    Green("Зеленый"),
    Blue("Синий"),
    Yellow("Желтый"),
    Orange("Оранжевый");

    private final String russianName;

    Colors(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}

class Painter {
    private static Double penWidth = 1.5;

    public static void penSetup(Colors col) {
        System.out.println("В палитре " + col.getRussianName() + " с толщиной кисти: " + penWidth); //класс с элементом перечисления
    }
}
