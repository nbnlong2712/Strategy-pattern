public interface IListStrategy {
    default void start(StringBuilder sb) {}
    void addItem(StringBuilder sb, String item);
    default void end(StringBuilder sb) {}
}
