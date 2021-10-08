package com.ss.ita.kata.implementation.NyxLex;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FiveImpl implements Five {
    static boolean goLeft(int[] numbers, int i) {
        if (i == 0)
            return false;
        return numbers[i - 1] <= numbers[i];
    }

    static boolean goRight(int[] numbers, int i) {
        if (numbers.length - 1 == i)
            return false;
        return numbers[i + 1] <= numbers[i];
    }

    static int[] countLeft(int[] numbers) {
        int[] count = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (goLeft(numbers, i)) {
                count[i] = count[i - 1] + 1;
            } else {
                count[i] = 0;
            }
        }
        return count;
    }

    static int[] countRight(int[] numbers) {
        int[] count = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (goRight(numbers, i)) {
                count[i] = count[i + 1] + 1;
            } else {
                count[i] = 0;
            }
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    @Override
    public int artificialRain(int[] v) {
        for (int j : v) {
            if (j < 0) return -1;
        }
        int[] arrRight = countRight(v);
        int[] arrLeft = countLeft(v);
        int count = 0;

        for (int i = 0; i < arrLeft.length; i++) {
            count = Math.max(arrLeft[i] + arrRight[i] + 1, count);
        }
        return count;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] rs = new long[2];
        List<Integer> list = new LinkedList<>();
        for (int i = (int) m; i <= n; i++)
            if (isPrime(i)) {
                list.add(i);
            }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) == g) {
                rs[0] = Long.parseLong(list.get(i).toString());
                rs[1] = Long.parseLong(list.get(i + 1).toString());
                return new long[]{rs[0], rs[1]};
            }
        }
        System.out.println(Arrays.toString(rs));
        return null;
    }

    @Override
    public int zeros(int n) {
        if (n < 0) return -1;
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int per;
        int size = n.intValue();
        int[] arr = new int[size + 1];
        arr[0] = 1;
        arr[1] = 1;
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
            arr[i] += arr[i - 2] + arr[i - 1];
            sum += arr[i];

        }
        per = 4 * (sum + 2);
        return BigInteger.valueOf(per);
    }

    @Override
    public double solveSum(double m) {
        double res = (2 * m + 1 - Math.sqrt(4 * m + 1)) / (2 * m);
        if (res > 1 || res < 0) throw new IllegalArgumentException();
        return res;
    }

    @Override
    public long[] smallest(long n) {
        int first = 0;
        int second = 0;

        String number = String.valueOf(n);
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                if (i != j) {
                    StringBuilder str = new StringBuilder(number);
                    char ch = number.charAt(i);
                    str.deleteCharAt(i);
                    str.insert(j, ch);
                    String result = str.toString();
                    if (Long.parseLong(result) < n) {
                        n = Long.parseLong(result);
                        first = i;
                        second = j;
                    }
                }
            }
        }
        return new long[]{n, first, second};
    }
}
