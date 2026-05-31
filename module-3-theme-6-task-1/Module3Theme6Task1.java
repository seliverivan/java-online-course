public class Module3Theme6Task1 {
    public static void main(String[] args) {
        A a0 = new A();
        B b0 = new B(1);
        C c0 = new C();
    }
}

class A {
    public final int a;

    public A() {
    a = 10;   // инициализация в конструкторе
    }

}

class B {
    public final int b;

    public B() {
        this(100); // вызывает конструктор с параметром
    }

    public B(int val) {
        b = val;   // инициализация только здесь
    }
}

class C {
    public final int c;

    {
        c = 100;
    }

    public C(){   
    }
}