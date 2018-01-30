package sk.akademiasovy.tipos;

import java.util.Arrays;
import java.util.Random;

public class Tipos {

    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public Tipos() {
        arr = new int[5];
    }

    public void generate() {
        Random random = new Random();
        arr[0] = random.nextInt(35) + 1;
        int j,i = 1;
        boolean unique = true;

        while (i < 5) {
            arr[i] = random.nextInt(35) + 1;
            unique = true;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    unique = false;

            }

            if (unique == true)
                i++;
        }
        Arrays.sort(arr);
    }

    /*public void generate(){
        Random rand = new Random();
        arr[0] = rand.nextInt(35)+1;
        int i = 1;
        boolean unq;

        while (i < 5) {
            arr[i] = rand.nextInt(35)+1;
            unq = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    unq = false;
            }
            if(unq == true)
                i++;
        }
        Arrays.sort(arr);
    }*/


    public void print (){
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}