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
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int per;
        int size = n.intValue();
        int[] arr = new int[size+1];
        arr[0] = 1;
        arr[1] = 1;
        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
                arr[i] += arr[i-2]+arr[i-1];
                sum+=arr[i];

        }
        per = 4*(sum+2);
        return BigInteger.valueOf(per);
    }

    @Override
    public double solveSum(double m) {
        double res = (2*m+1-Math.sqrt(4*m+1))/(2*m);
        if (res > 1 || res < 0 ) throw new IllegalArgumentException() ;
        return  res;
    }

    @Override
    public long[] smallest(long n) {
        List<Integer> indexMinList = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        long min = 10;
        String str = Long.toString(n);
        String[] digits = Integer.toString((int) n).split("");
        long[] arr = new long[str.length()];
        for (int i = 0; i < arr.length; i++) {
           arr[i]= Long.parseLong(digits[i]);
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<=min) {
                min=arr[i];
                indexMinList.add(i);
            }
        }
        long c = arr[0];
        arr[0]=arr[indexMinList.get(indexMinList.size()-1)];
        arr[indexMinList.get(indexMinList.size()-1)]=c;

        list.removeAll(indexMinList);

        for (long l : arr) {
            list.add((int) l);

        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)!=0)
                break;
            while (list.get(i)==0){
                list.remove(i);
            }
        }
        long[] res = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }
}
