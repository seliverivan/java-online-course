public class Module2Theme3Task1 {
    public static void main(String[] args) {
        double testlVal = 5.2;

        System.out.println(testlVal += 5);//10.2
        System.out.println(testlVal *= 20);//204.0
        System.out.println(testlVal /= 5);//40.8
        System.out.println(testlVal -= 4.8);//36.8
        System.out.println(testlVal %= 5);//1.0

        System.out.println(testlVal == 1);//true
        System.out.println(testlVal !=  1);//false
        
        System.out.println(testlVal > 0 ? "Yes" : "No");//Yes
        System.out.println(testlVal > 1 ? "Yes" : "No");//No

        boolean a = true;
        boolean b = false;

        System.out.println(a || b);//true
        System.out.println(false || b);//false
        System.out.println(a && b);//false
        System.out.println(a && true);//true

        System.out.println(0 >= 0);//true
        System.out.println(-1 >= 0);//false
        System.out.println(0 >= -1);//true

        System.out.println(0 <= 0);//true
        System.out.println(-1 <= 0);//true
        System.out.println(0 <= -1);//false

        int c = 14;
        int d = 5;

        System.out.println(c | d);//15
        System.out.println(c & d);//4
        System.out.println(c ^ d);//11
        System.out.println(~d);//-6
        System.out.println(d << 1);//10
        System.out.println(14 >> 1);//7

        int e = -7;

        System.out.println(e >> 1);//-4
        System.out.println(e >>> 1);//2147483644

        System.out.println(2+2);//4
        System.out.println(2*2);//4
        System.out.println(2-2);//0
        System.out.println(6/2);//3
        System.out.println(7%2);//1

        System.out.println(e++);//-7 изменение после выполнения
        System.out.println(e);//-6

        System.out.println(e--);//6 изменение после выполнения
        System.out.println(e);//-7

        System.out.println(++e);//-6 изменение перед выполнением
        System.out.println(e);//-6

        System.out.println(--e);//-7 изменение перед выполнением
        System.out.println(e);//-7

        System.out.println(!true);//false

        System.out.println(2+2*2);//6
        System.out.println((2+2)*2);//8

        double[] arr = {1.1, 1.2, 1.3};
        System.out.println(arr[0]);//1.1

        String p = "clon";
        String p2 = p; //присваивание ссылки
        System.out.println("I " + "am");//I am
        System.out.println(p+="e");//clone
        
        System.out.println(p2);//clon

        System.out.println(p2 instanceof String);//true
        System.out.println(null instanceof String);//false для null с любым классом
    }
}
