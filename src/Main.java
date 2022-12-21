public class Main {
    private static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        WordsChecker wordsChecker = new WordsChecker(text);
        boolean lorem = wordsChecker.hasWord("Lorem");
        boolean b = wordsChecker.hasWord("123");
        boolean nostrud = wordsChecker.hasWord("nostrud");
        boolean excepteur = wordsChecker.hasWord("Excepteur");
        System.out.println(lorem + " " + b);
        System.out.println(nostrud + " " + excepteur);
    }
}