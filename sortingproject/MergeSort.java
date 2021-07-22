package practice.aman.july.sortingproject;

public class MergeSort implements ISorting {
    private long totalTimeToExecute =0l;

    void merge(int arr[], int left, int middle, int right)
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int Left[] = new int[n1];
        int Right[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            Left[i] = arr[left + i];

        for (int j = 0; j < n2; ++j)
            Right[j] = arr[middle + 1 + j];

        int i = 0, j = 0;

        int k = left;

        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
    public void sort(int arr[]) {
        long startTime = System.nanoTime();
        mergesort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        this.totalTimeToExecute = endTime - startTime;
    }



    private void mergesort(int arr[], int l, int r)
    {
        if (l < r) {

            int m =l+ (r-l)/2;

            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);


            merge(arr, l, m, r);
        }
    }
    @Override
    public void printComplexity() {
        System.out.println("O(n*(logn))");
    }

    @Override
    public void printTimeTaken() {
        System.out.println(totalTimeToExecute);
    }

}
