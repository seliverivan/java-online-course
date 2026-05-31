public class Module4Theme3Tasks {
    public static void main(String[] args) {
        B b = new B(1,2,3);
        b.printSumm();
    }
}

class A{
    private final int num1;
    protected int num2;
    A(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    int getNum(){
        return num1;
    }
}

class B extends A{
    private final int bnum;

    B(int an1, int an2, int bn){
        super(an1, an2); //super для конструктора
        bnum = bn;
    }

    void printSumm(){
        System.out.println( super.num2 + super.getNum() + bnum); //super для метода и поля
    }
}