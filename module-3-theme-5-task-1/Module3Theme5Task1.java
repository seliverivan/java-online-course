public class Module3Theme5Task1 {
    public static void main(String[] args) {
        //1)Через имя класса:
        A.printVars();
        //2)Через экземпляр класса:
        A obj = new A();
        obj.printVars();
        //3)Без имени класса внутри того же класса – если вызов происходит внутри любого метода (статического или экземплярного) класса A:
        obj.methodnst();
        obj.methodst();
        //4)Через null-ссылку:
        A obj2 = null;
        obj2.printVars();
    }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    void methodnst(){
        printVars();
    }

    static void methodst(){
        printVars();
    }
}
