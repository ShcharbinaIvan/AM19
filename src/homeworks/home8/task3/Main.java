package homeworks.home8.task3;


public class Main {
    //    3. Дана строка произвольной длины с произвольными словами.
//    Найти слово, в котором число различных символов минимально.
//    Слово может содержать буквы и цифры.
//    Если таких слов несколько, найти первое из них.
//    Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        int s = 0;
        String str1 = "fffff ab f 1234 jkjk ";
        String[] words = str1.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] array = words[i].toCharArray();
            for (char c : array) {
                s += c;
            }
            if (sum < s) {
                sum = s;
                counter = i;
            }
            s = 0;
        }
        System.out.println(sum);
        System.out.println(counter);
        System.out.println(words[counter]);
    }
}
