import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Module8Theme1Task2 {
    public static void main(String[] args) {
        System.out.println("========== 5 спецификаторов (таблица 1) ==========");
        
        // %b - логическое значение
        boolean flag = true;
        System.out.printf("1. Логическое значение (%%b): %b%n", flag);
        
        // %c - символ
        char ch = 'A';
        System.out.printf("2. Символ (%%c): %c%n", ch);
        
        // %d - целое десятичное
        int number = 255;
        System.out.printf("3. Десятичное целое (%%d): %d%n", number);
        
        // %f - число с плавающей точкой
        double pi = Math.PI;
        System.out.printf("4. Число с плавающей точкой (%%f): %.3f%n", pi);
        
        // %s - строковое представление
        String text = "Java";
        System.out.printf("5. Строка (%%s): %s%n", text);
        
        // %n - перевод строки (использован выше)
        // %% - знак процента
        System.out.printf("6. Знак процента (%%%%): 100%%%n");
        

        System.out.println("\n========== 5 спецификаторов даты/времени (таблица 2) ==========");
        // Для спецификаторов %t требуется аргумент типа Date, Calendar, Long или long.
        Date now = new Date(); // текущая дата/время
        
        // %tH - час (00–23)
        System.out.printf("1. Час (24-часовой) %%tH: %tH%n", now);
        
        // %tM - минуты (00–59)
        System.out.printf("2. Минуты %%tM: %tM%n", now);
        
        // %tB - полное название месяца
        System.out.printf("3. Месяц (полное имя) %%tB: %tB%n", now);
        
        // %tA - полное название дня недели
        System.out.printf("4. День недели %%tA: %tA%n", now);
        
        // %tY - год (4 цифры)
        System.out.printf("5. Год (4 цифры) %%tY: %tY%n", now);
        
        // Дополнительно: полное форматирование даты/времени
        System.out.printf("Полная дата и время: %tY-%tm-%td %tH:%tM:%tS%n", now, now, now, now, now, now);
        
        // Альтернативный способ с LocalDateTime (конвертация в Date для совместимости)
        LocalDateTime ldt = LocalDateTime.now();
        Date dateFromLdt = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        System.out.printf("Используя LocalDateTime: %tB %te, %tY%n", dateFromLdt, dateFromLdt, dateFromLdt);
    }
}