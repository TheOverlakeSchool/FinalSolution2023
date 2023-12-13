    import java.util.StringJoiner;

public class HashSet<T> implements Set<T> {

    private Map<T, T> elements;

    HashSet() {
        elements = new HashMap<>();
    }

    @Override
    public void add(T value) {
        elements.put(value, null);
    }

    @Override
    public void remove(T value) {
        elements.remove(value);
    }

    @Override
    public boolean contains(T value) {
        return elements.contains(value);
    }


    public String toString() {
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (HashMap.Entry<T, T> element : elements) {
            sj.add(element.key.toString());
        }
        return sj.toString();
    }

}
