import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        String key = sc.nextLine();

        String[] words = s.split(" +");
        StringBuilder sentence = new StringBuilder();
        StringBuilder acronym = new StringBuilder();

        String longest = "";
        int keyCount = 0;

        for (String word : words) {
            String w = word.substring(0, 1).toUpperCase()
                    + word.substring(1).toLowerCase();

            if (sentence.length() > 0)
                sentence.append(" ");
            sentence.append(w);

            acronym.append(w.charAt(0));

            if (w.length() > longest.length())
                longest = w;

            if (word.equalsIgnoreCase(key))
                keyCount++;
        }

        System.out.println("Formatted: " + sentence);
        System.out.println("Words: " + words.length);
        System.out.println("Longest word: " + longest);
        System.out.println("Keyword count: " + keyCount);
        System.out.println("Acronym: " + acronym);

        sc.close();
    }
}