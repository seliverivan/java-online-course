
public class Module9Theme3Task1 {
    public static void main(String[] args) {
        
        // Ситуация 1: Несколько исключений обрабатываются одинаковым образом
        try {
            // Здесь может возникнуть ArithmeticException или NullPointerException
            int a = (int)(Math.random() * 2);
            if (a == 0) {
                int b = 10 / 0;  // ArithmeticException
            } else {
                String s = null;
                s.length();       // NullPointerException
            }
        } catch (ArithmeticException | NullPointerException e) {
            // Multi-catch – оба исключения обрабатываются идентично
            System.out.println("Обработано одинаково: " + e.getClass().getSimpleName());
        }
        
        // Ситуация 2: Иерархия исключений Ex1 <-- Ex2 <-- Ex3
        // Создаём свои классы исключений
        class Ex1 extends Exception {}
        class Ex2 extends Ex1 {}
        class Ex3 extends Ex2 {}
        
        try {
            int choice = 3;
            if (choice == 1) throw new Ex1();
            else if (choice == 2) throw new Ex2();
            else throw new Ex3();
        } catch (Ex3 e) {      // Самый специфичный – первый
            System.out.println("Поймано Ex3");
        } catch (Ex2 e) {      // Потом более общее
            System.out.println("Поймано Ex2");
        } catch (Ex1 e) {      // Самое общее – последним
            System.out.println("Поймано Ex1");
        }
        
        // Ошибка: multi-catch с иерархическими типами – не скомпилируется
        // try {
        //     throw new Ex2();
        // } catch (Ex1 | Ex2 e) { } // Ошибка! Ex2 является подклассом Ex1
    }
}