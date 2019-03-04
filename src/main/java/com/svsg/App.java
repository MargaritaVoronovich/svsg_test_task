package com.svsg;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    static Integer getMinAvailableServer(List<Integer> allocatedServers) {
        if (allocatedServers == null) {
            throw new IllegalArgumentException();
        }

        final Map<Integer, Integer> map = allocatedServers.stream()
                .collect(Collectors.toMap(Function.identity(), x -> 0));

        for (int i = 1; ; i++) {
            final boolean index = map.containsKey(i);

            if (!index) {
                return i;
            }
        }
    }
}
