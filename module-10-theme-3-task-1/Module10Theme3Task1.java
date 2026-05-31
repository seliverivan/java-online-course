import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Module10Theme3Task1 {
    public static void main(String[] args) {
        // Указываем путь к файлу (можно указать полный или относительный)
        File file = new File("input.txt");
        
        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(file)) {
            // Чтение файла построчно
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}