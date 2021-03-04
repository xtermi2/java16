package com.github.xtermi2.java16.jep395records;

/**
 * like a data class in kotlin:
 * - immutable
 * - not extendable
 * - has build in toString, equals and hashCode
 */
public record Point(int x, int y) {}

record Point3D(int x, int y, int z) {
    Point3D(int x, int y) {
        this(x, y, 0);
    }
}

record Range(int lo, int hi) {
    Range {
        if (lo > hi)  // referring here to the implicit constructor parameters
            throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
    }
}