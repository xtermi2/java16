package com.github.xtermi2.java16.jep389foreignlinker;

import jdk.incubator.foreign.*;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class ForeignLinkerAPI {
    public static long size(final String s) {
        MethodHandle strlen = CLinker.getInstance().downcallHandle(
                LibraryLookup.ofDefault().lookup("strlen").orElseThrow(),
                MethodType.methodType(long.class, MemoryAddress.class),
                FunctionDescriptor.of(CLinker.C_LONG, CLinker.C_POINTER)
        );
        try (MemorySegment str = CLinker.toCString(s)) {
            return (long) strlen.invokeExact(str.address());
        } catch (Throwable throwable) {
            throw new IllegalStateException(throwable);
        }
    }
}
