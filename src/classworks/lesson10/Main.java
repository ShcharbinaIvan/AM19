package classworks.lesson10;

public class Main {
    public static void main(String[] args) {
        String str = "123";
        String str1 = "456";
        String str2 = str.concat(str1);
        System.out.println(str2);
        int x = 123;
        String str3 = String.valueOf(x) + "asd";
        System.out.println(str3);
        String str4 = String.join("/", "qwe", "rty", "asd");
        System.out.println(str4);
        System.out.println(str.compareTo(str3));
        System.out.println(str.equals(str2));
        System.out.println(str4.indexOf("rty"));
        String str5 = str4.replace("rty", "123");
        System.out.println(str5);
        StringBuilder stringBuilder=new StringBuilder("Java");
        stringBuilder.setCharAt(0,'c');
        System.out.println(stringBuilder);
    }
}
