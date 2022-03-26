package diamond;

public class string_methods {
    public static void main(String[] args) {
        String str = "Tanishq";

        System.out.printf("string in lower case :%s\n", str.toLowerCase());
        System.out.printf("string in Upper case :%s\n", str.toUpperCase());
        System.out.printf("length of string : %d\n", str.length());
        String str1 = "   TAnishq ";
        System.out.printf("trimmed string by removing leading and trailing spaces :%s\n", str1.trim());
        System.out.printf("getting substring :%s\n", str.substring(2));
        System.out.printf("getting substring :%s\n", str.substring(2, 6));
        System.out.printf("replacing chars :%s\n", str.replace('q', 'a'));
        System.out.printf("replacing substring :%s\n", str.replace("ishq", "abc"));
        System.out.printf("checking whether starts with : %b\n", str.startsWith("tan"));
        System.out.printf("checking whether ends with : %b\n", str.endsWith("q"));
        System.out.printf("char at index :%c\n", str.charAt(4));
        System.out.printf("index of char :%d\n", str.indexOf("sh"));
        System.out.printf("last index of any char :%d\n", str.lastIndexOf("q"));
        String str2 = "abcbbsscca";
        System.out.printf("last index of a char :%d\n", str2.lastIndexOf("a"));
        System.out.printf("last index of a char :%d\n", str2.lastIndexOf("a", 19));
        System.out.printf("whether string equals to :%b\n", str.equals("tanishq"));
        System.out.printf("whether string is equal to by ignoring case :%b\n", str.equalsIgnoreCase("tanishq"));
    }
}
