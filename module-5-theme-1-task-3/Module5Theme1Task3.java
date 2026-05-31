public class Module5Theme1Task3 {
    public static void main(String[] args) {
        // Чтобы создать объект нестатического внутреннего класса, нужен экземпляр внешнего
        Outer outer = new Outer();
        outer.accessInnerMembers();
    }

    static class Outer {
        void accessInnerMembers() {
            // Создаём объект внутреннего класса
            Inner inner = new Inner();
            
            // Внешний класс имеет доступ к ЛЮБЫМ полям/методам внутреннего,
            // включая private, но только через объект внутреннего класса.
            System.out.println(inner.privateField);  
            System.out.println(inner.publicField);   
            System.out.println(inner.protectedField); 
            System.out.println(inner.packageField);  
            
            inner.privateMethod(); 
            inner.publicMethod();   
        }
        
        class Inner {
            private int privateField = 1;
            public int publicField = 2;
            protected int protectedField = 3;
            int packageField = 4;
            
            private void privateMethod() {
                System.out.println("  -> privateMethod() вызван");
            }
            
            public void publicMethod() {
                System.out.println("  -> publicMethod() вызван");
            }
        }
    }
}
