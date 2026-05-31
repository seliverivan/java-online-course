import java.util.StringJoiner;

public class Module8Theme1Task1 {
    public static void main(String[] args) {
        String str = "  Java Programming  ";
        String str2 = "java programming";
        
        // 1. length() – возвращает количество символов (включая пробелы)
        System.out.println("1. length(): " + str.length()); // 21
        
        // 2. charAt(int index) – символ по индексу (0-базовый)
        System.out.println("2. charAt(2): " + str.charAt(2)); // 'J' (после двух пробелов)
        
        // 3. toLowerCase() / toUpperCase() – смена регистра
        System.out.println("3. toLowerCase(): " + str.toLowerCase()); // "  java programming  "
        System.out.println("   toUpperCase(): " + str.toUpperCase()); // "  JAVA PROGRAMMING  "
        
        // 4. trim() – удаляет пробелы в начале и конце
        System.out.println("4. trim(): '" + str.trim() + "'"); // "Java Programming"
        
        // 5. substring(int begin, int end) – извлечение подстроки
        System.out.println("5. substring(2, 6): " + str.substring(2, 6)); // "Java"
        
        // 6. equalsIgnoreCase() – сравнение без учета регистра
        System.out.println("6. equalsIgnoreCase: " + str.trim().equalsIgnoreCase(str2)); // true
        
        // 7. contains(CharSequence) – проверка наличия подстроки
        System.out.println("7. contains(\"gram\"): " + str.contains("gram")); // true
        
        // 8. replace(char old, char new) – замена символов
        System.out.println("8. replace('a', 'o'): " + str.replace('a', 'o')); // "  Jovo Progromming  "
        
        // 9. split(String regex) – разбиение на массив строк
        String[] words = str.trim().split(" ");
        System.out.print("9. split(): ");
        for (String w : words) System.out.print(w + " | ");
        System.out.println();
        
        // 10. isBlank() (Java 11+) – проверка, состоит ли строка только из пробелов
        System.out.println("10. isBlank() на \"   \": " + "   ".isBlank()); // true
        System.out.println("    isBlank() на \"" + str + "\": " + str.isBlank()); // false

        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("Apple").add("Banana").add("Orange");
        System.out.println("1. " + sj1); // Apple, Banana, Orange
        
        // 2. С префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("Red").add("Green").add("Blue");
        System.out.println("2. " + sj2); // [Red, Green, Blue]
        
        // 3. Объединение (merge)
        StringJoiner sj3 = new StringJoiner("; ", "{", "}");
        sj3.add("One").add("Two");
        StringJoiner sj4 = new StringJoiner("; ", "{", "}");
        sj4.add("Three"). add("Four");
        sj3.merge(sj4);
        System.out.println("3. " + sj3); // {One; Two; Three; Four}
        
        // 4. Пустое значение и setEmptyValue
        StringJoiner sj5 = new StringJoiner(" | ");
        System.out.println("4. Пустой: '" + sj5 + "'"); // '' (пустая строка)
        sj5.setEmptyValue("EMPTY");
        System.out.println("   После setEmptyValue: '" + sj5 + "'"); // EMPTY
        sj5.add("Hello");
        System.out.println("   После добавления: '" + sj5 + "'"); // Hello
    }
}