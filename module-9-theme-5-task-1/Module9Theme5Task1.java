public class Module9Theme5Task1 {
    public static void main(String[] args) {
        try {
            Circle good = new Circle(5.0);
            System.out.println("Площадь круга: " + good.getArea());
            
            Circle bad = new Circle(-3.0); // выбросит FigureException
        } catch (FigureException e) {
            System.out.println("Перехвачено собственное исключение: " + e.getMessage());
            // e.printStackTrace(); // при необходимости
        }
    }
}
    
// Собственное исключение для геометрических фигур
    class FigureException extends Exception {
        
        // 1. Конструктор без параметров
        public FigureException() {
            super();
        }
        
        // 2. Конструктор с сообщением об ошибке
        public FigureException(String message) {
            super(message);
        }
        
        // 3. Конструктор с сообщением и причиной (Throwable)
        public FigureException(String message, Throwable cause) {
            super(message, cause);
        }
        
        // (опционально) 4. Конструктор только с причиной
        public FigureException(Throwable cause) {
            super(cause);
        }
    }

    // Класс, представляющий круг
    class Circle {
        private double radius;
        
        public Circle(double radius) throws FigureException {
            if (radius <= 0) {
                throw new FigureException("Радиус должен быть положительным: " + radius);
            }
            this.radius = radius;
        }
        
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
