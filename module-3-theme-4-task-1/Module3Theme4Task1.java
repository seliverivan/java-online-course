
public class Module3Theme4Task1 {
    public static void main(String[] args) {  
        Summer s = new Summer();
        s.summ(1, 2);
        s.summ(1.2, 2.4);
        s.summ(1, 2, 3);
        //пример перегруза

        Greet g1 = new Greet();
        NameGreet g2 = new NameGreet("Ivan");
        g1.greeting();
        g2.greeting();
        //пример override
    }
}

class Summer{

    void summ(int a, int b){
        System.out.println(a+b);
    }

    void summ(double a,double b){//перешрузка по типу
        System.out.println(a+b);
    }

    void summ(int a, int b, int c){//перегрузка по значению
        System.out.println(a+b+c);
    }

    public Summer() {
    }

}

class Greet{
    
    void greeting(){
        System.out.println("Hello world from greet class!");
    }
    public Greet() {
    }
}

class NameGreet extends Greet{

    String name;

    @Override
    void greeting(){  
        System.out.println("Hello world from " + name + "!");//переопределение
    }

    public NameGreet(String s) {
        this.name = s;
    }
}