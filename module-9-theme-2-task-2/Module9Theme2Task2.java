public class Module9Theme2Task2 {
    public static void main(String[] args) {
        // 1. Перехваченное исключение
        try {
            int result = 10 / 0; // генерирует ArithmeticException
            System.out.println("Результат: " + result); // не выполнится
        } catch (ArithmeticException e) {
            System.out.println("[Обработано] Перехвачено исключение: " + e);
        }
        
        // 2. Неперехваченное исключение – вызывает аварийную остановку
        String text = null;
        int length = text.length(); // генерирует NullPointerException
        System.out.println("Длина строки: " + length); // не выполнится
    }
}