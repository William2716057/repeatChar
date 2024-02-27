public class CharRepeat {
    public static String repeatAllChars(String input) {
        StringBuilder repeatedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            for (int j = 0; j < 3; j++) {
                repeatedString.append(currentChar);
            }
        }
        return repeatedString.toString();
    }

    public static void main(String[] args) {
        String originalString = "stringwords";
        String repeatedString = repeatAllChars(originalString);
        System.out.println("Repeated String: " + repeatedString);
    }
}
