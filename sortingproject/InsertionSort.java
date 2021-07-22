package practice.aman.july.sortingproject;

public class InsertionSort implements  ISorting{
    private long totalTimeToExecute = 0l;
    @Override
    public void sort(int[] arr) {
        long startTime= System.nanoTime();
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
