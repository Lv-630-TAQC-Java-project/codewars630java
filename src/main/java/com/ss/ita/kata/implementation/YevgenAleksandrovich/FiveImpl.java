package com.ss.ita.kata.implementation.YevgenAleksandrovich;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {

    private BigInteger n;

    /**Little Petya often visits his grandmother in the countryside. The grandmother has a large vertical garden, which can be represented as a set of n rectangles of varying height. Due to the newest irrigation system we can create artificial rain above them.

     Creating artificial rain is an expensive operation. That's why we limit ourselves to creating the artificial rain only above one section. The water will then flow to the neighbouring sections but only if each of their heights does not exceed the height of the previous watered section.

     Example:
     Let's say there's a garden consisting of 5 rectangular sections of heights 4, 2, 3, 3, 2.

     Creating the artificial rain over the left-most section is inefficient as the water WILL FLOW DOWN to the section with the height of 2, but it WILL NOT FLOW UP to the section with the height of 3 from there. Only 2 sections will be covered: 4, 2.

     The most optimal choice will be either of the sections with the height of 3 because the water will flow to its neighbours covering 4 sections altogether: 2, 3, 3, 2. You can see this process in the following illustration:*/
    @Override
    public int artificialRain(int[] v) {
    //
        int rain = 1;
        int count = 1;
        int start = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) {
                start = i;
            } else if (v[i] > v[i - 1]) {
                rain = Math.max(rain, count);
                count = i - start;
            }
            count++;
        }
        return Math.max(rain, count);


    }
  /**The prime numbers are not regularly spaced. For example from 2 to 3 the gap is 1. From 3 to 5 the gap is 2. From 7 to 11 it is 4. Between 2 and 50 we have the following pairs of 2-gaps primes: 3-5, 5-7, 11-13, 17-19, 29-31, 41-43

   A prime gap of length n is a run of n-1 consecutive composite numbers between two successive primes (see: http://mathworld.wolfram.com/PrimeGaps.html).

   We will write a function gap with parameters:

   g (integer >= 2) which indicates the gap we are looking for

   m (integer > 2) which gives the start of the search (m inclusive)

   n (integer >= m) which gives the end of the search (n inclusive)

   n won't go beyond 1100000.

   In the example above gap(2, 3, 50) will return [3, 5] or (3, 5) or {3, 5} which is the first pair between 3 and 50 with a 2-gap.

   So this function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n if these numbers exist otherwise `nil or null or None or Nothing (or ... depending on the language).

   In C++, Lua: return in such a case {0, 0}. In F#: return [||]. In Kotlin, Dart and Prolog: return []. In Pascal: return Type TGap (0, 0).

   Examples:
   gap(2, 5, 7) --> [5, 7] or (5, 7) or {5, 7}

   gap(2, 5, 5) --> nil. In C++ {0, 0}. In F# [||]. In Kotlin, Dart and Prolog return []`

   gap(4, 130, 200) --> [163, 167] or (163, 167) or {163, 167}

   ([193, 197] is also such a 4-gap primes between 130 and 200 but it's not the first pair)

   gap(6,100,110) --> nil or {0, 0} or ... : between 100 and 110 we have 101, 103, 107, 109 but 101-107is not a 6-gap because there is 103in between and 103-109is not a 6-gap because there is 107in between.

   You can see more examples of return in Sample Tests.

   */
    @Override
    public long[] gap(int g, long m, long n) {
        class PrimeGap {
            public void main(String[] args) {
                int n = Integer.parseInt(args[0]);

                boolean[] isprime = new boolean[n+1];

                for (int i = 2; i <= n; i++)
                    isprime[i] = true;

                // determine primes < n using Sieve of Eratosthenes
                for (int factor = 2; factor*factor <= n; factor++) {
                    if (isprime[factor]) {
                        for (int j = factor; factor*j <= n; j++)
                            isprime[factor*j] = false;
                    }
                }

                // find longest consecutive sequence of integers with no primes
                int gap = 0;
                int bestgap = 0;
                int right = 0;
                for (int i = 2; i <= n; i++) {
                    if (isprime[i]) gap = 0;
                    else gap++;
                    if (gap > bestgap) {
                        bestgap = gap;
                        right = i;
                    }
                }

                int left = right - bestgap + 1;
                System.out.println("There are no primes between " + left + " and " + right);
                System.out.println("That is " + bestgap + " consecutive integers");
            }
        }

        return new long[0];
    }
/**Write a program that will calculate the number of trailing zeros in a factorial of a given number.

 N! = 1 * 2 * 3 * ... * N

 Be careful 1000! has 2568 digits...

 For more info, see: http://mathworld.wolfram.com/Factorial.html

 Examples
 zeros(6) = 1
 # 6! = 1 * 2 * 3 * 4 * 5 * 6 = 720 --> 1 trailing zero

 zeros(12) = 2
 # 12! = 479001600 --> 2 trailing zeros*/
    @Override
    public int zeros(int n) {
        class NumberOfTrailingZerosOfN {
            public int zeros(int n) {
                int res = 0;
                for (int i = 5; i <= n; i *= 5) {
                    res += n / i;
                }
                return res;
            }
        }
        return 0;
    }
/**The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

 Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in the same manner as in the drawing:*/

    @Override
    public BigInteger perimeter(BigInteger n) {
        this.n = n;
        int k= n.intValue()+1;
        int[] f = new int[k];
        f[0] = 1;
        f[1] = 1;
        int sum = 2;
        for (int i = 2; i <k; i++) {
            f[i] = f[i - 1] + f[i - 2];
            sum+=f[i];
        }
        //
        return BigInteger.valueOf(sum*4);
    }
/**Consider the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n where x is a real number and n a positive integer.

 When n goes to infinity and x has a correct value (ie x is in its domain of convergence D), U(n, x) goes to a finite limit m depending on x.

 Usually given x we try to find m. Here we will try to find x (x real, 0 < x < 1) when m is given (m real, m > 0).

 Let us call solve the function solve(m) which returns x such as U(n, x) goes to m when n goes to infinity.*/
    @Override
    public double solveSum(double m) {
        double s = Math.sqrt(4 * m + 1);
        return (2 * m + 1 - s) / (2 * m);
    }
/**You have a positive number n consisting of digits. You can do at most one operation: Choosing the index of a digit in the number, remove this digit at that index and insert it back to another or at the same place in the number in order to find the smallest number you can get.

 Task:
 Return an array or a tuple or a string depending on the language (see "Sample Tests") with

 the smallest number you got
 the index i of the digit d you took, i as small as possible
 the index j (as small as possible) where you insert this digit d to have the smallest number.*/
    @Override
    public long[] smallest(long n) {
        class ToSmallest {

            public long[] smallest(long n) {
                final String s = ""+n;
                long[] result = new long[]{Long.MAX_VALUE,0,0};
                for (int i=s.length()-1; i>=0; i--) {
                    final String s1=s.substring(0,i)+s.substring(i+1);
                    for (int j=s.length()-1; j>=0; j--) {
                        final long tmp = Long.valueOf(s1.substring(0,j)+s.charAt(i)+s1.substring(j));
                        if (tmp <= result[0]) result = new long[]{tmp,i,j};
                    }
                }
                return result;
            }
        }
        return new long[0];
    }
}
