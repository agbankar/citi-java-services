package com.programs.lrucache;

import java.util.*;

public class CacheSetImpl<E> implements ICacheSet<E> {
    private Deque<E> deque;
    private Set<E> set;
    private final int CACHE_SIZE;

    public CacheSetImpl(int capacity) {
        this.deque = new LinkedList();
        this.set = new HashSet<>();
        CACHE_SIZE = capacity;
    }

    @Override
    public boolean put(E e) {
        if (set.contains(e)) {
            deque.removeLast();
            deque.addFirst(e);
            return true;
        } else {
            if (deque.size() == CACHE_SIZE) {
                E r = deque.removeLast();
                set.remove(r);
            }
            set.add(e);
            deque.addFirst(e);

        }
        return false;
    }

    @Override
    public E get(E e) {
        if (set.contains(e)) {
            deque.remove(e);
            deque.addFirst(e);
            return e;
        }
        return null;
    }

    @Override
    public boolean clear() {
        this.deque.clear();
        this.set.clear();
        return false;
    }

    @Override
    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        CacheSetImpl<Integer> cache = new CacheSetImpl<>(4);
        System.out.println("cache.size() = " + cache.size());
        cache.put(1);
        cache.put(2);
        cache.put(3);
        cache.put(4);
        System.out.println("cache.size() = " + cache.size());
        cache.put(1);


    }
}
