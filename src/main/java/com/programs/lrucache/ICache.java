package com.programs.lrucache;

public interface ICache <K,V>{
     boolean put(K k,V v);
     V get(K k);
     boolean clear();
     int size();

}
