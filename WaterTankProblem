package com.condition;

public class WaterTankProblem {

    public static int getMin(int[] numbers) {

        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++)
            if(numbers[i] != 0) min = Math.min(numbers[i],min);

        return min;
    }

    public static void subMin(int[] numbers,int min) {
        for(int i=0; i<numbers.length; i++)
            if(numbers[i] != 0) numbers[i] -= min;
    }

    public static void main(String[] args) {
        boolean chance = true;
        String str = "01021013";

        int []numbers = new int[str.length()];
        for(int i=0; i<str.length(); i++)
            numbers[i] = str.charAt(i) - 48 + 1;

        int count = 0;
        boolean yes = true;

        while(yes) {
            int prev = count;
            int min = getMin(numbers);
            subMin(numbers, min);

            int i = 0;
            while (i != numbers.length) {
                if (numbers[i++] != 0) {
                    int temp = 0;
                    while (i < numbers.length && numbers[i++] == 0)
                        temp++;

                    if (i <= numbers.length)
                        count += temp;
                }
            }
            if (prev == count)
                yes = false;
        }

        System.out.println(count);
    }
}
