package ua.pp.kris.mymap;

import java.util.HashMap;

public class MyMap<K,V> {
    private MySet<Pair<K,V>> pairSet = new MySet<>();

    public static class Pair<K,V>{
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return key.equals(pair.key);
        }

        @Override
        public int hashCode() {
            return key.hashCode();
        }
    }

    public void put(K key, V value){
        Pair<K,V> elem = new Pair<>(key, value);
        pairSet.add(elem);
    }

    public boolean containsKey(K key){
        Pair <K,V> elem = new Pair<>(key, null);
        return pairSet.contains(elem);
    }

    public V get(K key){
        Pair <K,V> elem = new Pair<>(key, null);
        return pairSet.find(elem).value;
    }

    public MySet<Pair<K,V>> pairSet(){
        return this.pairSet;
    }

    @Override
    public String toString() {
        String st = "";
        for (Pair<K, V> pair : pairSet) {
            st += pair.getKey() + ": " + pair.getValue() + "\n";
        }
        return st;
    }
}
