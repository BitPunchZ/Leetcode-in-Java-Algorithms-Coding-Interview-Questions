public class SlidingWindow{


  static int maxSum(int arr[], int windowSize)  {
    int arraySize = arr.length;
    // n must be greater than k
    if (arraySize <= windowSize) {
      System.out.println("Invalid operation");
      return -1;
    }
    int window_sum = 0;
    // Compute sum of first window of size k
    for (int i = 0; i < windowSize; ++i) {
      window_sum += arr[i];
    }
    int max_sum = window_sum;
    
    //  Compute sums of remaining windows by
    //  removing first element of previous
    //  window and adding last element of
    //  current window.
    for (int i = 0; i < arraySize - windowSize; ++i) {
      window_sum = window_sum - arr[i] + arr[i + windowSize];
      max_sum = Math.max(window_sum, max_sum);
    }
    return max_sum;
  };

  public static void main(String args[]){

  int arr[] = { 80, -50, 90, 100 }; 
  // maximum sum should be 104 => 100 + -1 + 5
  int answer = maxSum(arr, 2);
  System.out.println(answer);

  }
}

