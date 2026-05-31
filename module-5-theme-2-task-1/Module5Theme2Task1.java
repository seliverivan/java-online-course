public class Module5Theme2Task1 {
    public static void main(String[] args) {

        A.Nested.staticGreetNested();

        A.Nested nested = new A.Nested();
        nested.greetNested();
        
    }
}

interface A{
    class Nested{
        public void greetNested(){
            System.out.println("It's a nested");
        }
        public static void staticGreetNested(){
            System.out.println("It's a nested from static");
        }

    } 
}