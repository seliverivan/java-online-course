public class Module5Theme1Task1 {
    public static void main(String[] args) {
        
        O outer = new O();

        // доступны извне, потому что методы public
        outer.privateInnerOut();
        outer.protectedInnerOut();
        outer.publicInnerOut();
        outer.innerOut();

        // public внутренний класс через объект внешнего класса
        O.PublicInner publicInner = outer.new PublicInner();
        publicInner.print();

        // default / protected / private внутренние классы из другого файла обычно напрямую недоступны
    }
}

class O{

    private class PrivateInner{
        public void print(){
            System.out.println("privateInner");
        }
    }
    protected class ProtectedInner{
        public void print(){
            System.out.println("protectedInner");
        }
    };

    public class PublicInner{
        public void print(){
            System.out.println("publicInner");
        }
    };

    class Inner{
        public void print(){
            System.out.println("JustInner");
        }
    }
    
    public void privateInnerOut(){
        PrivateInner tmp = new PrivateInner();
        tmp.print();
    }

    public void protectedInnerOut(){
        ProtectedInner tmp = new ProtectedInner();
        tmp.print();
    }

    public void publicInnerOut(){
        PublicInner tmp = new PublicInner();
        tmp.print();
    }

    public void innerOut(){
        Inner tmp = new Inner();
        tmp.print();
    }
}
