package sk.akademiasovy.tipos;

import java.util.Random;

public class Tipos {

    private int[] arr;

    public int[] getArr(){
        return arr;
    }

    public Tipos (){
        arr = new int[5];
    }

    public void generate(){
        Random random = new Random();
        arr[0] = random.nextInt(35)+1;
        int i = 0;
        boolean unq = true;

        while(i < 5){
            for (int j = 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    arr[j] = random.nextInt(35)+1;
            }
            i++;
        }
    }

    public void print(){
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
