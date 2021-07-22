package practice.aman.july.sortingproject;

public class BubbleSort implements ISorting{
    private long totalTimeToExecute = 0l;
    @Override
    public void sort(int[] arr) {
        long startTime= System.nanoTime();
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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
