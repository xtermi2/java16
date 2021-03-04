package com.github.xtermi2.java16.jep394instanceofpatternmatching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class InstanceOfPatternMatchingTest {

    @Test
    void instaceOfTest() {
        String msg = "test msg";

        String res = new InstanceOfPatternMatching().instaceOfTest(msg);

        assertThat(res)
                .endsWith(String.valueOf(msg.length()));
    }
}