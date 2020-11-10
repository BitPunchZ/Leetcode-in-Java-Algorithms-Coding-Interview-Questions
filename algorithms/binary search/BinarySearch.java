
public class BinarySearch{


  static int binarySearch(int arr[], int target)  {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      // Check if x is present at mid
      if (arr[mid] == target) return mid;
      // If x is greater, ignore left half
      else if (arr[mid] < target) left = mid + 1;
      // If x is smaller, ignore right half
      else right = mid - 1;
    }
    // If we reach here, then the element was not present
    return -1;
  };

  public static void main(String args[]){

    int arr[] = { 1, 2, 3, 4, 5, 6 }; 
    int target = 6;
    // maximum sum should be 104 => 100 + -1 + 5
    int answer = binarySearch(arr, target);

    if (answer != -1) {
      System.out.println("Element is present at index: " + answer);
    } else {
      System.out.println("Element is not present in the array");
    }

  }
}

