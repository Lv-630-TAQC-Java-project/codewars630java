package com.ss.ita.kata.implementation.YevgenAleksandrovich;
import com.ss.ita.kata.Seven;

public abstract class SevenImpl<function> implements Seven {

    /**
     * The accounts of the "Fat to Fit Club (FFC)" association are supervised by John as a volunteered accountant. The association is funded through financial donations from generous benefactors. John has a list of the first n donations: [14, 30, 5, 7, 9, 11, 15] He wants to know how much the next benefactor should give to the association so that the average of the first n + 1 donations should reach an average of 30. After doing the math he found 149. He thinks that he made a mistake. Could you help him?
     * <p>
     * if dons = [14, 30, 5, 7, 9, 11, 15] then new_avg(dons, 30) --> 149
     * <p>
     * The function new_avg(arr, navg) should return the expected donation (rounded up to the next integer) that will permit to reach the average navg.
     * <p>
     * Should the last donation be a non positive number (<= 0) John wants us to throw (or raise) an error or
     * <p>
     * return Nothing in Haskell
     * return None in F#, Ocaml, Scala
     * return -1 in C, Fortran, Nim, PowerShell, Go, Pascal, Prolog, Lua, Perl
     * echo ERROR in Shell
     * raise-argument-error in Racket
     * so that he clearly sees that his expectations are not great enough.
     * <p>
     * Notes:
     * <p>
     * all donations and navg are numbers (integers or floats), arr can be empty.
     * See examples below and "Test Samples" to see which return is to be done.
     * new_avg([14, 30, 5, 7, 9, 11, 15], 92) should return 645
     * new_avg([14, 30, 5, 7, 9, 11, 15], 2)
     * should raise an error (ValueError or invalid_argument or argument-error or DomainError)
     * or return `-1` or ERROR or Nothing or None depending on the language.
     */
    @Override
    public long newAvg(double[] arr, double navg) {
        //navg
        //arr.length
        //find sum
        double sum = 0;
        for (double number : arr) {
            sum += number;
        }
        long res = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (res <= 0)
            throw new IllegalArgumentException();
        else
            return res;
    }
/**Your task is to write a function which returns the sum of following series upto nth term(parameter).

 Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
 Rules:
 You need to round the answer to 2 decimal places and return it as String.

 If the given value is 0 then it should return 0.00

 You will only be given Natural Numbers as arguments.

 Examples:
 SeriesSum(1) => 1 = "1.00"
 SeriesSum(2) => 1 + 1/4 = "1.25"
 SeriesSum(5) => 1 + 1/4 + 1/7 + 1/10 + 1/13 = "1.57"
 * @return*/

    @Override
    public int seriesSum(int n) {
        function SeriesSum;
        Object let;
        double result;
         {
                let  = 0;
        int reverage = 4;
        for (int i = 0; i < n; i += 1) {
            if (i == 0) {
                result = 1;
            } else {
                reverage += 3;

            }
        }
        return 0;
}
    }
}

    /**Vasya stands in line with number of people p (including Vasya), but he doesn't know exactly which position he occupies. He can say that there are no less than b people standing in front of him and no more than a people standing behind him. Find the number of different positions Vasya can occupy.

     Input
     As an input you have 3 numbers:

     1. Total amount of people in the line;

     2. Number of people standing in front of him

     3. Number of people standing behind him

     Examples:
     WhereIsVasya.whereIsHe(3, 1, 1)   // => 2  The possible positions are: 2 and 3

     WhereIsVasya.whereIsHe(5, 2, 3)  // => 3  The possible positions are: 3, 4 and 5

    @Override
    public void whereIsHe(int p, int bef, int aft) {
        return 0;

            ArrayList<Integer> positions = new ArrayList<>();
            int a = 0;
            int b = 0;
            for (int i = 1; i <= p; i++) {
                a=i-1;
                b=p-i;
                if (a >=bef && b <=aft){
                    positions.add(i);
                }
            }
            return ;
        }

