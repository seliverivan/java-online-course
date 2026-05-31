import java.io.*;

public class Module10Theme1Tasks{
    public static void main(String[] args) {
        
        System.out.println("=== Практика #1: InputStream.read() ===");
        byte[] data = {65, 66, 67, 68}; // байты: A, B, C, D
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data)) {
            int b;
            while ((b = bais.read()) != -1) {
                System.out.print((char) b + " ");
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        System.out.println("\n=== Практика #2: OutputStream.write(int) ===");
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.write(72); // 'H'
            baos.write(101); // 'e'
            baos.write(108); // 'l'
            baos.write(108); // 'l'
            baos.write(111); // 'o'
            System.out.println("Записано: " + baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Пример собственного класса, реализующего AutoCloseable
        class MyResource implements AutoCloseable {
            public void doWork() {
                System.out.println("Выполнение работы...");
            }
            @Override
            public void close() {
                System.out.println("Ресурс закрыт (AutoCloseable)");
            }
        }
        try (MyResource res = new MyResource()) {
            res.doWork();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}