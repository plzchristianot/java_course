package MethodChaining;

public class MethodChaining {
    public static void main(String[] args) {
        String start = "AniMaL";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); // "animal"
        String result = lowercase.replace('a', 'A'); // "Animal"
        System.out.println(result);
    }
}
