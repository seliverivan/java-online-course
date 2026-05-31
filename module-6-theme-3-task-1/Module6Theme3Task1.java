public class Module6Theme3Task1 {
        public static void main(String[] args) {
        Circle c = new Circle(5.0);
        
        // Использование метода area()
        System.out.println("Area: " + c.area());
        
        // Использование устаревшего метода (вызов вызовет предупреждение компилятора,
        // если не использовать @SuppressWarnings в вызывающем коде)
        c.printAreaLegacy();   // Компилятор выдаст предупреждение: deprecated API
        
        // Метод с подавлением предупреждений внутри себя
        c.someGenericMethod();
        
        // Метод, где предупреждение о deprecation уже подавлено
        c.useDeprecated();
    }
}

interface Figure {
    double area();
    
    // Устаревший метод. Вместо него рекомендуется использовать area()
    @Deprecated
    void printAreaLegacy();
    
    // Метод с подавлением предупреждения о непроверяемом приведении (демонстрация)
    @SuppressWarnings("unchecked")
    default void someGenericMethod() {
        // Пример: непроверяемое приведение – предупреждение подавлено
        Object obj = new String("test");
        String s = (String) obj;   // компилятор мог бы предупредить о unchecked, но мы подавили
        System.out.println("Suppressed warning: " + s);
    }
}

class Circle implements Figure {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Переопределение метода area() – аннотация @Override защищает от опечаток
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    // Реализация устаревшего метода
    @Override
    public void printAreaLegacy() {
        System.out.println("Legacy area: " + area());
    }
    
    // Метод, использующий устаревший API – подавляем предупреждение
    @SuppressWarnings("deprecation")
    public void useDeprecated() {
        printAreaLegacy();   // вызов устаревшего метода – предупреждение подавлено
    }
}
