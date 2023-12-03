// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Strings are printable");
        String str1 = "First message ";
        str1 += " was changed";
        System.out.println(str1);
        String str2 = "Adding string and int gives ";
        str2 += 1024;
        str2 += "/" + (1 + 1 + 1 + 1 + 1);
        System.out.println(str2);
        if(str2 != str1) {
            System.out.println("str1 and str2 check for equality failed");
        }
        String str3 = "JohnDoe";
        if(str3 == "JohnDoe") {
            System.out.println("str3" + " = " + str3);
        }
        if(!str3.equals((str1))) {
            System.out.println("str3 " + "is not " + "str1");
        }
        String str4 = null;
        String str5 = "";
        if(str5 == str4) {
            System.out.println("Empty string is the same as null");
        }
        else {
            System.out.println("Empty string is not null");
        }
        String s6 = "JOHNDOE";
        System.out.println(s6 + " is all caps");
        if(s6.equalsIgnoreCase(str3)) {
            System.out.println("str6 and str3 have the same letters");
        }
        String str7 = "       String with whitespace     ";
        System.out.println("str7.length() : " + str7.length());
        System.out.println("str7.trim().length() : " + str7.trim().length());
        String str8 = str7.substring(1, str7.length() - 1);
        System.out.println("s8.length() : " + str8.length());
        System.out.println(String.join(".", "str", "trim()", "length()"));
    }
}