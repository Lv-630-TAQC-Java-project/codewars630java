package com.ss.ita.kata.implementation.NyxLex;

import com.ss.ita.kata.Seven;

public class SevenImpl implements Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {  
      int counter=0;
          int a,b;
          for(int i=1;i<=p;i++)
          {
           a=i-1;
           b=p-i;
           if(a>=bef && b<=aft){
                counter++;
             }
           }
          return counter;
    }
}
