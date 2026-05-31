public class Module4Theme2Tasks {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();             // вызван переопределённый метод
        c.calculateArea();    // вызывается метод суперкласса
    }
}

class Figure {
    // Обычный метод — можно переопределить
    public void draw() {
        System.out.println("Рисуем фигуру");
    }
    
    // final-метод — переопределить нельзя
    public final void calculateArea() {
        System.out.println("Вычисляем площадь");
    }
}

class Circle extends Figure {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
    
    // Попытка переопределить final-метод вызовет ошибку компиляции
    /*
    @Override
    public void calculateArea() {
        System.out.println("Вычисляем площадь круга");
    }
    */
}