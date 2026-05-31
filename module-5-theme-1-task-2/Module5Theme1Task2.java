public class Module5Theme1Task2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.accessOuter();
    }
    
    static class Outer {
        private int privateField = 10;
        public int publicField = 20;
        protected int protectedField = 30;
        int packageField = 40;
        
        private void privateMethod() {
            System.out.println("Private method");
        }
        
        class Inner {
            void accessOuter() {
                // Доступ к любым полям внешнего класса
                System.out.println(privateField);   
                System.out.println(publicField);    
                System.out.println(protectedField); 
                System.out.println(packageField);   

                // Доступ к любым методам внешнего класса
                privateMethod();            
            }
        }
    }
}
