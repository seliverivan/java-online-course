public class Module2Theme8task1 {
    public static void main(String[] args) {
        
        char c0 = 'D';
        char c1 = 'A';
        char c2 = 'H';

        while (true) { 
            System.out.println(c1);
            c1++;
            if(c1 == c0){
                break;
            }
        }
        /*
        A
        B
        C
        */

        System.out.println();
        do{
            System.out.println(c1);
            c1++;
            if(c1 == c2){
                break;
            }
        }while(true);
        
        /*
        D
        E
        F
        G
        */

        System.out.println();

        for(int i = 0; i <= 20; i++){
            if(i % 3 != 0){
                continue;
            }
            System.out.println(i);
            if(i == 18){
                System.out.println("i = 18");
                break;
            }
        }
        /*
        0
        3
        6
        9
        12
        15
        18
        i = 18
        */
    }
}
