package com.github.xtermi2.java16.jep389foreignlinker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ForeignLinkerAPITest {
    @Test
    void test_size_via_C_strlen() {
        assertThat(ForeignLinkerAPI.size("Hello"))
                .isEqualTo(5L);
    }
}