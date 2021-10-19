public class MarkdownStrategy implements IListStrategy {
    @Override
    public void addItem(StringBuilder sb, String item) {
        sb.append(" * ").append(item).append(System.lineSeparator());
    }
}
