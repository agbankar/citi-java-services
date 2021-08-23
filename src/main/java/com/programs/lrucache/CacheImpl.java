package com.programs.lrucache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CacheImpl<K, V> implements ICache<K, V> {
    private Deque<V> deque;
    private Map<K, V> map;
    private final int CACHE_SIZE;
    public CacheImpl(int capacity) {
        this.deque = new LinkedList();
        this.map = new HashMap();
        CACHE_SIZE = capacity;
    }

    @Override
    public boolean put(K k, V v) {
        if (map.containsKey(k)) {
            V r = deque.removeLast();
            deque.addFirst(r);
            return true;
        } else {
            if (deque.size() == CACHE_SIZE) {
                V r = deque.removeLast();
                map.remove(r);
            }
            map.put(k, v);
            deque.addFirst(v);

        }
        return false;
    }

    @Override
    public V get(K k) {
        if (map.containsKey(k)) {
            V v = map.get(k);
            deque.remove(v);
            deque.addFirst(v);
            return v;
        }
        return null;
    }

    @Override
    public boolean clear() {
        this.deque.clear();
        this.map.clear();
        return false;
    }

    @Override
    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        CacheImpl<Integer,Integer> cache= new CacheImpl<>(4);
        System.out.println("cache.size() = " + cache.size());
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        cache.put(4,4);
        System.out.println("cache = " + cache);
        cache.put(5,5);
        cache.put(2,2);


    }
}
