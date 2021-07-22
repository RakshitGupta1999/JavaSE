package practice.aman.july.sortingproject;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ISorting sorting = null;
        System.out.println("1.QuickSort");
        System.out.println("2.MergeSort");
        System.out.println("3.BubbleSort");
        System.out.println("4.SelectionSort");
        System.out.println("5.InsertionSort");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        switch (a){
            case 1:
                sorting = new Quicksort();
                break;
            case 2:
                sorting = new MergeSort();
                break;
            case 3:
                sorting = new BubbleSort();
                break;
            case 4:
                sorting = new SelectionSort();
                break;
            case 5:
                sorting = new InsertionSort();
                break;
            default:
                System.out.println("Invalid input");
        }

        int arr[]={4,8,2,5,3,9,45,35,534,535};
        sorting.sort(arr);
        SortingUtil.printArray(arr);
        sorting.printComplexity();
        sorting.printTimeTaken();
    }
}
