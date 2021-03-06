package practice.aman.july.sortingproject;

public class SelectionSort implements ISorting{
    private long totalTimeToExecute = 0l;
    @Override
    public void sort(int[] arr) {
        long startTime= System.nanoTime();
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        long endTime= System.nanoTime();
        this.totalTimeToExecute = endTime-startTime;
    }

    @Override
    public void printComplexity() {
        System.out.println("O(n^2)");
    }

    @Override
    public void printTimeTaken() {
        System.out.println(totalTimeToExecute);
    }
}
