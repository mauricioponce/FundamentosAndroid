package com.eme.android.java.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(String.valueOf(i));
            //result.add(i + "");
        }

        return result;
    }
}
