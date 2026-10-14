package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[+78]+[-(]+[0-9)]+-|[0-9]+");
        Matcher matcher = pattern.matcher("+7-(953)284-93-74");
        System.out.println(matcher.find());
    }
}
