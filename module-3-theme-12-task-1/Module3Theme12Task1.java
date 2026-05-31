public class Module3Theme12Task1 {
        public static void main(String[] args) {
        Concatentaor.concatNumbers(1, 2, 3, 4, 5, 6); // 123456
        Concatentaor.concatStrings("a", "bc", "def", "gh", "i"); // abcdefghi
    }
}

class Concatentaor{
    public static void concatNumbers(Integer... numbers) {
        String finalString = "";
        for (Integer num : numbers) {
            finalString += num.toString();
        }
        System.out.println(finalString);
    }

    public static void concatStrings(String... strings) {
        String finalString = "";
        for (String str : strings) {
            finalString += str;
        }
        System.out.println(finalString);
    }
}