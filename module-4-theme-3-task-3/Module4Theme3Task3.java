public class Module4Theme3Task3 {
    public static void main(String[] args) {
        
    }
}

class A {
    int a, b, c, z;

    // Базовый конструктор, инициализирующий z
    public A() {
        z = 1;
    }

    public A(int a) {
        this();         // вызывает A()
        this.a = a;
    }

    public A(int a, int b) {
        this(a);        // вызывает A(int)
        this.b = b;
    }

    public A(int a, int b, int c) {
        this(a, b);     // вызывает A(int, int)
        this.c = c;
    }
}