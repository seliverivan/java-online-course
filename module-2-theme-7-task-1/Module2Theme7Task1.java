public class Module2Theme7Task1 {

    
    enum DayTime { MORNING, AFTERNOON, EVENING, NIGHT };
    public static void main(String[] args) {
        
        //примеры switch case с различными типами данных и оболочками

        byte b = 1;
        switch (b) {
            case 0:
                System.out.println("b = 0");
                break;
            case 1:
                System.out.println("b = 1");
                break;
            default:
                System.out.println("b != 0 and b != 1");
                break;
        }
        //1

        short sh = 7;
        switch (sh) {
            case 0:
                System.out.println("sh = 0");
                break;
            case 1:
                System.out.println("sh = 1");
                break;
            default:
                System.out.println("sh != 0 and sh != 1");
                break;
        }
        //sh != 0 and sh != 1


        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("c = A");
                break;
            case 'B':
                System.out.println("c = B");
                break;
            default:
                System.out.println("c != A and c != B");
                break;
        }
        //c = A

        int i = 0;
        switch (i) {
            case 0:
                System.out.println("i = 0");
                break;
            case 1:
                System.out.println("i = 1");
                break;
            default:
                System.out.println("i != 0 and i != 1");
                break;
        }
        //i = 0

        //оболочки aналогично
        Byte B = 1;
        switch (B) {
            case 0:
                System.out.println("B = 0");
                break;
            case 1:
                System.out.println("B = 1");
                break;
            default:
                System.out.println("B != 0 and B != 1");
                break;
        }


        Short Sh = 7;
        switch (Sh) {
            case 0:
                System.out.println("Sh = 0");
                break;
            case 1:
                System.out.println("Sh = 1");
                break;
            default:
                System.out.println("Sh != 0 and Sh != 1");
                break;
        }

        Character C = 'A';
        switch (C) {
            case 'A':
                System.out.println("C = A");
                break;
            case 'B':
                System.out.println("C = B");
                break;
            default:
                System.out.println("C != A and C != B");
                break;
        }

        Integer I = 0;
        switch (I) {
            case 0:
                System.out.println("I = 0");
                break;
            case 1:
                System.out.println("I = 1");
                break;
            default:
                System.out.println("I != 0 and I != 1");
                break;
        }

        //string и enum

        String str = "You";
        switch (str) {
            case "I":
                System.out.println(str + " am");
                break;
            case "You":
                System.out.println(str + " are");
                break;
            case "It":
                System.out.println(str + " is");
                break;
            default:
                System.out.println("another case");
                break;
        }
        //You are

        DayTime dt = DayTime.MORNING;
        switch (dt) {
            case MORNING:
                System.out.println("Breakfast");
                break;
            case AFTERNOON:
                System.out.println("Lunch");
                break;
            case EVENING:
                System.out.println("Dinner");
                break;
            default:
                System.out.println("You must sleep");
                break;
        }
        //Breakfast
    }
}
