package com.eme.android.java.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void convert_number() {
        // Given
        int number = 1;
        String expected = "1";

        // When
        String result = fb.convert(number);

        // Then
        assertThat(result).isNotNull();
        assertThat(result).isNotEmpty();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void convert_fizz() {
        // Given
        int number = 3;
        String expected = "fizz";

        // When
        String result = fb.convert(number);

        // Then
        assertThat(result).isNotNull();
        assertThat(result).isNotEmpty();
        assertThat(result).isEqualTo(expected);
    }
}