package mirea2419.ru.lb6;

import java.util.Arrays;
import java.math.BigInteger;

public class Main {
    public static void InsertSort(Student[] array)
    {
        for (int left = 0; left < array.length; left++) {
            int value = array[left].id;
            int i = left-1;
            for (; i >= 0; i--) {
                if (value < array[i].id) {
                    array[i + 1].id = array[i].id;
                } else {
                    break;
                }
            }
            array[i+1].id = value;
        }
        System.out.println("Стало");
        for(int i=0;i<10;i++)
        {
            System.out.print(array[i].id);
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Student[] x = new Student[10];
        for(int i=0;i<5;i++)
        {
            x[i]=new Student(i,"fdfs",i*10);
        }
        for(int i=0;i<5;i++)
        {
            x[i+5]=new Student(i,"fds",i*3);
        }
        System.out.println("Было");
        for(int i=0;i<10;i++)
        {
            System.out.print(x[i].id);
            System.out.print(" ");
        }
        System.out.print("\n");
        InsertSort(x);
        SortingStudentsByGPA a= new SortingStudentsByGPA();
        System.out.print("\n");
        for(int i=0;i<10;i++)
        {
            System.out.print(x[i].id);
            System.out.print("  ");
            System.out.print(x[i].name);
            System.out.print("  ");
            System.out.print(x[i].gpa);
            System.out.print("\n");
        }
        System.out.print("\n");
        a.QuickSort(x,0,9);
    }
}
