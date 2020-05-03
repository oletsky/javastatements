package javatraining.oletsky.statements;

import java.util.stream.IntStream;

public class StreamLoop {
    public static void main(String[] args) {
        for (var a: IntStream.range(1,10).toArray()) {
            System.out.println(a+" ");
        }
    }
}
