import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        TextTransform textTransform = new TextTransform(OutputFormat.MARKDOWN);

        List<String> items = new ArrayList<>();
        items.add("Banana");
        items.add("Apple");
        items.add("Coconut");

        textTransform.setOutputFormat(new HtmlStrategy());
        textTransform.transformList(items);

        System.out.println(textTransform);
    }
}
