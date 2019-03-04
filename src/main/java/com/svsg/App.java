package com.svsg;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    static Integer getMinAvailableServer(List<Integer> allocatedServers) {
        if (allocatedServers == null) {
            throw new IllegalArgumentException();
        }

        final Set<Integer> set = new HashSet<>(allocatedServers);

        //O(n) complexity
        for (int i = 1; ; i++) {
            //retrieve from HashSet(HashMap inside) O(1) complexity
            final boolean contains = set.contains(i);

            if (!contains) {
                return i;
            }
        }
    }
}
