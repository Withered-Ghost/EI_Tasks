public class TitleCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
