package ro.fasttrackit.curs10.homework;

public class StringUtils {
    public static String ensureNotEmpty(String word) {
        return word == null || "".equals(word.trim()) ? "n/a" : word;
    }
}
