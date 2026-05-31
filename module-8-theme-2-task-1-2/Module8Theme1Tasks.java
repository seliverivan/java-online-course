public class Module8Theme1Tasks {
    public static void main(String[] args) {

        System.out.println("========== 10 методов StringBuffer / StringBuilder ==========");
        
        // Используем StringBuilder (аналогично StringBuffer, но без синхронизации)
        StringBuilder sb = new StringBuilder("Hello");
        
        // 1. append() – добавляет строку/символ/число в конец
        sb.append(" World");
        System.out.println("1. append: " + sb); // Hello World
        
        // 2. insert(int offset, ...) – вставляет подстроку в указанную позицию
        sb.insert(5, ",");
        System.out.println("2. insert: " + sb); // Hello, World
        
        // 3. delete(int start, int end) – удаляет символы от start до end-1
        sb.delete(5, 6); // удаляем запятую
        System.out.println("3. delete: " + sb); // Hello World
        
        // 4. reverse() – переворачивает последовательность символов
        sb.reverse();
        System.out.println("4. reverse: " + sb); // dlroW olleH
        sb.reverse(); // вернём обратно
        
        // 5. replace(int start, int end, String str) – заменяет часть строки
        sb.replace(6, 11, "Java");
        System.out.println("5. replace: " + sb); // Hello Java
        
        // 6. substring(int start, int end) – возвращает подстроку (String)
        String sub = sb.substring(6, 10);
        System.out.println("6. substring: " + sub); // Java
        
        // 7. capacity() – возвращает текущую ёмкость буфера
        System.out.println("7. capacity: " + sb.capacity()); // обычно 16 + длина
        
        // 8. length() – возвращает длину последовательности
        System.out.println("8. length: " + sb.length()); // 10
        
        // 9. setLength(int newLength) – урезает или дополняет нулями
        sb.setLength(5);
        System.out.println("9. setLength(5): " + sb); // Hello
        
        // 10. charAt(int index) – возвращает символ по индексу
        char ch = sb.charAt(0);
        System.out.println("10. charAt(0): " + ch); // H
        // Дополнительно: toString() – преобразует в String

        System.out.println("\n========== Преобразования String, StringBuffer, StringBuilder ==========");
        
        // 1. String -> StringBuffer
        String str = "Hello";
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("String -> StringBuffer: " + sbf);
        
        // 2. String -> StringBuilder
        StringBuilder sbd = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + sbd);
        
        // 3. StringBuffer -> String
        String fromSbf = sbf.toString();
        System.out.println("StringBuffer -> String: " + fromSbf);
        
        // 4. StringBuilder -> String
        String fromSbd = sbd.toString();
        System.out.println("StringBuilder -> String: " + fromSbd);
        
        // 5. StringBuffer -> StringBuilder
        StringBuilder sbdFromSbf = new StringBuilder(sbf.toString());
        System.out.println("StringBuffer -> StringBuilder: " + sbdFromSbf);
        
        // 6. StringBuilder -> StringBuffer
        StringBuffer sbfFromSbd = new StringBuffer(sbd.toString());
        System.out.println("StringBuilder -> StringBuffer: " + sbfFromSbd);
        
        // Также можно напрямую через append()
        StringBuffer sbf2 = new StringBuffer().append(str);
        StringBuilder sbd2 = new StringBuilder().append(str);
        System.out.println("Через append: StringBuffer = " + sbf2 + ", StringBuilder = " + sbd2);
    }
}
