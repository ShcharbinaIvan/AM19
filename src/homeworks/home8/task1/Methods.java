package homeworks.home8.task1;

public class Methods {
    public static void getNum(String str) {
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.substring(0, 4) + "" + builder.substring(9, 13));
    }

    public static void change(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.replace(5, 8, "***");
        builder.replace(14, 17, "***");
        System.out.println(builder);

    }

    public static void words(String str) {
        System.out.println(str.replaceAll("[^A-Za-z]+", "/").toLowerCase());
    }

    public static void changeWords(String str) {
        String builder = "Letters:" +
                str.replaceAll("[^A-Za-z]+", "/").toUpperCase();
        System.out.println(builder);
    }

    public static void check(String str, String checkWord) {
        if (!str.toLowerCase().contains(checkWord.toLowerCase())) {
            System.out.println("Подстроки нету.");
        } else {
            System.out.println("Подстрока есть.");
        }
    }

    public static void checkFirst(String str, String checkWord) {
        if (str.startsWith(checkWord)) {
            System.out.println("Начинается.");
        } else {
            System.out.println("Не начинается.");
        }
    }

    public static void checkLast(String str, String checkWord) {
        if (str.endsWith(checkWord)) {
            System.out.println("Заканчивается.");
        } else {
            System.out.println("Не заканчивается.");
        }
    }
}
