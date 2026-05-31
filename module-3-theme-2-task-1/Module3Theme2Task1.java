public class Module3Theme2Task1{
    public static void main(String[] args) {
        Rect r = new Rect(1,1);
        r.setA(20.5);//вызов public
        r.setB(52.76);//вызов protected

        r.printInfo();//вывод результата
    }
}

class Rect{
    private double a;
    private double b;

    public void setA(double a0){ // public метод, доступен всем другим классам
        this.a = a0;
    }

    protected void setB(double b0){ // protected метод, в рамках одного пакета отличий от public нет
        this.b = b0;
    }

    private double perimiter(){ // private метод, может быть вызван только внутри этого класса
        return 2*(this.a+this.b);
    }

    double square(){ // без спецификатора, package-private метод, доступен любому классу в этом пакете
        return this.a * this.b;
    }

    public void printInfo(){
        System.out.println(this.a + " " + this.b + " P=" + perimiter() + " S=" + square()); //вызов private метода и метода без спецификатора
    }

    public Rect(double a0, double b0){
        this.a = a0;
        this.b = b0;
    }
}