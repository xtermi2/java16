package com.github.xtermi2.java16.jep397sealedclasses;

import java.util.Objects;

abstract sealed class Option<T> {

    public abstract T get();

    public boolean isEmpty() {
        return this instanceof None;
    }

    public boolean isPresent() {
        return !isEmpty();
    }

    private static final class None<T> extends Option<T> {
        private static final None<Object> NONE = new None<>();

        @Override
        public T get() {
            throw new NullPointerException();
        }
    }

    private static final class Some<T> extends Option<T> {
        private final T some;

        private Some(T some) {
            this.some = Objects.requireNonNull(some);
        }

        @Override
        public T get() {
            return some;
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <T> Option<T> of(T nullable) {
        if (null == nullable) {
            return (Option<T>) None.NONE;
        } else {
            return new Some(nullable);
        }
    }
}
