package practice.aman.july.sortingproject;

public class Quicksort implements ISorting {

    private long totalTimeToExecute = 0l;

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    @Override
    public void sort(int arr[]) {
        long startTime = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long endTime = System.nanoTime();
        this.totalTimeToExecute = endTime - startTime;
    }

    @Override
    public void printComplexity() {
        System.out.println("O(n x log(n))");
    }

    @Override
    public void printTimeTaken() {
        System.out.println(totalTimeToExecute);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
