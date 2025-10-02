public class TextEditor {
    private TextFormatter formatter;

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void publishText(String text) {
        if (formatter == null) {
            System.out.println("No formatter selected!");
        } else {
            System.out.println("Formatted: " + formatter.format(text));
        }
    }
}
