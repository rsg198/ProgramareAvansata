package com;

import java.util.Scanner;

public class Problem{

    Problem(int n)
    {
        int[][] matrix = new int[n][n];
        for(int i = 1; i< =n; i++)
        {
            for(int j = 1; j <=n; j++)
            {
                Scanner Object = new Scanner(System.in);  //Cream un obiect de tip scanner
                String input = Object.nextLine();          //Input de la tastatura
                matrix[i][j] = Integer.parseInt(input);    //Parsam
            }
        }

        //Afisare matrice
        for(int i =1; i <=n; i++)
        {
            for(int j = 1; j <=n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}