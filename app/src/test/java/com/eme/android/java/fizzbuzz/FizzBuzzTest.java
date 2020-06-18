package com.eme.android.java.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void fizzbuzz_happyCase() {
        // Given
        int n = 10;

        // When
        List<String> result = fb.fizzBuzz(n);

        // Then
        assertThat(result).isNotNull();
        assertThat(result).hasSize(n);
    }
}