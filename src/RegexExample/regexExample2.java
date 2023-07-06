package RegexExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExample2 {
    public static void main(String[] args) {
        /*
        kwantyfikatory: *, +, ?, {}
        -- a*b ->  zero lub więcej wystąpień litery a i dokładn ie jedna litera b
        -- a+b -> jedno lub więcej litery a i dokładnie tyle samo litery b
        -- a?b -> jedno lub zero wystąpień litery a i ......
        --a{4,8}b -> od 4 do 8 wystąpień a i jedno litery b
        --a{4,}b -> conajmniej 4 litery a i jedno b
        --a{,8}b -> maksymalnie 8 liter a i jedno b
        --a{7}b -> dokładn nie 7 liter a i jedno b
        --
        --         */

        Pattern pattern = Pattern.compile("a{4,8}b");

        Matcher matcher = pattern.matcher("aaaaaaaaab");
        Matcher matcher2 = pattern.matcher("aaaaaaaaaabbbbbbbbb");
        Matcher matcher3 = pattern.matcher("b");
        Matcher matcher4 = pattern.matcher("baaaaaaaa");

        System.out.println("matches: " + matcher.matches());
        System.out.println("matches: " + matcher2.matches());
        System.out.println("matches: " + matcher3.matches());
        System.out.println("matches: " + matcher4.matches());
    }
}
