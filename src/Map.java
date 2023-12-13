public interface Map<K, V> extends Iterable<HashMap.Entry<K, V>> {
    void put(K key, V value);
    void remove(K key);
    boolean contains(K key);
}
