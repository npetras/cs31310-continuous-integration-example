package uk.ac.aber.cs31310;

import java.util.ArrayList;

public class FibGenerator {

    public ArrayList<Integer> fib(int number) {
        ArrayList<Integer> values = new ArrayList<>();

        if(number == 0 || number == 1) {
            values.add(number);
        }
        else {
            int t1 = 0;
            int t2 = 1;
            for(int i = 0; i < number; i++) {
                values.add(t1);
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }

        return values;
    }

}
