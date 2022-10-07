package test7568;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int[][] arr = new int[num][2];

        for(int i = 0; i < num; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }


        for(int i = 0; i < num; i++) {
            int rank = 1;

            for(int j = 0; j < num; j++) {
                if(i == j) continue;
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }

            System.out.print(rank + " ");
        }

    }
}


//5
//55 185 2
//58 183 2
//88 186 1
//60 175 2
//46 155 2