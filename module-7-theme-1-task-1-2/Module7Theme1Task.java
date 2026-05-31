public class Module7Theme1Task {
    public static void main(String[] args) {

        Circle c = new Circle(5.0);
        // Вызов переопределённого default-метода через объект
        System.out.println("Type: " + c.getType());
        // Вызов абстрактного метода
        System.out.printf("Area: %.2f%n", c.area());
        // Вызов статического метода интерфейса – только через имя интерфейса
        Figure.description();
        // Вызов default метода через ссылку типа интерфейс
        Figure fig = new Circle(3.0);
        System.out.println("Type via interface ref: " + fig.getType());
        
        //Как выйти из положения?
        //Переопределить метод в классе – самый надёжный способ.
        //В переопределённом методе через Интерфейс.super.метод() вызвать нужную реализацию.
        //Либо полностью заменить реализацию своей логикой.
        
        FigureWithColor fwc = new FigureWithColor();
        fwc.draw();
    }
}

interface Figure {
    double area();                     // абстрактный метод
    default String getType() {         // неабстрактный (default) метод
        return "Generic Figure";
    }
    static void description() {        // статический метод интерфейса
        System.out.println("This is a geometric figure");
    }
}

class Circle implements Figure {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    // Переопределяем default-метод (можно и не переопределять)
    @Override
    public String getType() {
        return "Circle";
    }
}


interface Drawable {
    default void draw() {
        System.out.println("Drawing from Drawable");
    }
}

interface Colored {
    default void draw() {
        System.out.println("Drawing from Colored");
    }
}

// Класс, реализующий оба интерфейса – конфликт default-методов
class FigureWithColor implements Drawable, Colored {
    // Обязательное переопределение метода draw()
    @Override
    public void draw() {
        // Выбираем одну из реализаций интерфейсов
        Drawable.super.draw();   // вызываем из Drawable
        // Colored.super.draw(); // или из Colored
        System.out.println("Figure's own draw");
    }
}
