public class StrategyDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        String input = "hello world from strategy pattern";

        editor.setFormatter(new UpperCaseFormatter());
        editor.publishText(input);

        editor.setFormatter(new LowerCaseFormatter());
        editor.publishText(input);

        editor.setFormatter(new TitleCaseFormatter());
        editor.publishText(input);
    }
}
