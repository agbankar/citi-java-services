package com.programs.lrucache;

public interface ICacheSet<E>{
     boolean put(E e);
     E get(E e);
     boolean clear();
     int size();

}
