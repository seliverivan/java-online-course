public class Module4Theme4Tasks {
    public static void main(String[] args) {
        Figure fig = new Figure();
        Circle circ = new Circle(5.0);
        
        System.out.println("Перегрузка (overloading)");
        System.out.println("area() = " + fig.area());
        System.out.println("area(3.0) круг = " + fig.area(3.0));
        System.out.println("area(4.0, 5.0) прямоугольник = " + fig.area(4.0, 5.0));
        System.out.println("area(3,4,5) треугольник = " + fig.area(3,4,5));
        
        System.out.println("\n Переопределение (overriding)");
        fig.draw();
        circ.draw();
    }
}

class Figure {
    //ПЕРЕГРУЖЕННЫЕ МЕТОДЫ area()
    double area() {                       // без параметров
        return 0;
    }
    
    double area(double radius) {          // для круга
        return Math.PI * radius * radius;
    }
    
    double area(double width, double height) {  // для прямоугольника
        return width * height;
    }
    
    double area(double a, double b, double c) { // для треугольника (формула Герона)
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }  
    
    void draw() {
        System.out.println("Drawing a generic figure");
    }
}

// ========== Класс Circle, наследник Figure ==========
class Circle extends Figure {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    //ПЕРЕОПРЕДЕЛЕНИЕ метода draw()
    @Override
    void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    // Будет ошибка: несовместимый возвращаемый тип
    /*
    @Override
    int getSomething() {   // ошибка: возвращаемый тип не подходит
        return 5;
    }
    */
    
    //Пример, где @Override помогает найти ошибку (опечатка в имени) ---
    /*
    @Override
    void drow() {   // опечатка: должно быть "draw"
        System.out.println("Draw circle");
    }
    */
}