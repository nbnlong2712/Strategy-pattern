import java.util.List;

public class TextTransform {
    private StringBuilder sb = new StringBuilder();
    private IListStrategy iListStrategy;

    public TextTransform()
    {}

    public TextTransform(OutputFormat outputFormat)
    {
        setOutputFormat(outputFormat);
    }

    public void setOutputFormat(OutputFormat outputFormat)
    {
        switch (outputFormat)
        {
            case MARKDOWN:
                iListStrategy = new MarkdownStrategy();
                break;
            case HTML:
                iListStrategy = new HtmlStrategy();
                break;
        }
    }

    public void setOutputFormat(IListStrategy iListStrategy)
    {
        this.iListStrategy = iListStrategy;
    }

    public void transformList(List<String> items)
    {
        iListStrategy.start(sb);
        for (String item : items)
        {
            iListStrategy.addItem(sb, item);
        }
        iListStrategy.end(sb);
    }

    public void clear()
    {
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
