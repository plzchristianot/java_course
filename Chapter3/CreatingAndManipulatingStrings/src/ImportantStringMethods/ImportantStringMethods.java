package ImportantStringMethods;

public class ImportantStringMethods {
    public static void main(String[] args) {
        /* length() - Returns the number of characters in the String */
        String string = "animals";
        System.out.println(string.length());  // 7

        /* charAt() - Lets you query the string to find out what character is at a specific index. */
        System.out.println(string.charAt(6)); // s
        System.out.println(string.charAt(7)); //Throws exception

        /* indexOf() - Looks at the characters in the string and finds the first index that
        matches the desired value */
        System.out.println(string.indexOf('a', 4)); //4
        System.out.println(string.indexOf("al", 5)); //-1 It returns -1 when the value is not found

        /* substring() - Looks for characters in a string. Returns parts of the string */
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals

        /* toLowerCase() and toUpperCase() - toUpperCase() converts any lowercase characters to
        uppercase in the returned string. toLowerCase() converts any uppercase characters to
        lowercase in the returned string. */
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        /* equals() and equalsIgnoreCase() - The equals() method checks whether two String objects contain exactly the same
        characters in the same order. The equalsIgnoreCase() method checks whether two String
        objects contain the same characters with the exception that it will convert the characters’
        case if needed */
        System.out.println("abc".equals("ABC")); //false
        System.out.println("ABC".equals("ABC")); //true
        System.out.println("abc".equalsIgnoreCase("ABC")); //true

        /* startsWith() and endsWith() - The startsWith() and endsWith() methods
        look at whether the provided value matches part of the String. */
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        /* contains() - looks for matches in the String. It isn’t as particular as
        startsWith() and endsWith()—the match can be anywhere in the String.*/
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        /* replace() - There’s a version that takes char parameters as well as a
        version that takes CharSequence parameters. */
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

        /* trim() - removes whitespace from the beginning and end of a String. */
        System.out.println("abc".trim());// abc
        System.out.println("\t   a b c\n".trim()); // a b c
    }
}
