package ImportantStringBuilderMethods;

public class ImportantMethods {
    public static void main(String[] args) {
        /* charAt(), indexOf(), length(), and substring() work exactly the same as the String class */

        /* append() - adds the parameter to the StringBuilder and returns a
        reference to the current StringBuilder*/
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

        /* insert() - adds characters to the StringBuilder at the requested index and
        returns a reference to the current StringBuilder. */
        StringBuilder sb1 = new StringBuilder("animals");
        sb1.insert(7, "-"); // sb = animals-
        sb1.insert(0, "-"); // sb = -animals-
        sb1.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb1);

        /* delete() and deleteCharAt() - detele() removes characters from
        the sequence and returns a reference to the current StringBuilder.
        deleteCharAt() - is convenient when you want to delete only one character.
        */
        StringBuilder sb2 = new StringBuilder("abcdef");
        sb2.delete(1, 3); // sb = adef
        sb2.deleteCharAt(5); // throws an exception
        System.out.println(sb2);

        /* reverse() - does just what it sounds like: it reverses the
        characters in the sequences and returns a reference to the current
        StringBuilder */
        StringBuilder sb3 = new StringBuilder("ABC");
        sb3.reverse();
        System.out.println(sb3); //CBA

        /* toString() - The last method converts a StringBuilder into a String. */
        StringBuilder sb4 = new StringBuilder();
        String s = sb4.toString();
    }
}
