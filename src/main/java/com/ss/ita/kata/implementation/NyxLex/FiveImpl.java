package com.ss.ita.kata.implementation.NyxLex;

import com.ss.ita.kata.Five;

import java.math.BigInteger;

public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
   public long[] gap(int g, long m, long n) {
        long[] rs = new long[2];
        List<Integer> list = new LinkedList<>() ;
        for(int i = (int) m; i<=n; i++)
            if(isPrime(i)){
                list.add(i);
            }
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i+1)-list.get(i)==g){
                rs[0]= Long.parseLong(list.get(i).toString());
                rs[1]= Long.parseLong(list.get(i+1).toString());
                return new long[] { rs[0], rs[1] };
            }
        }
        System.out.println(Arrays.toString(rs));
        return null;
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
