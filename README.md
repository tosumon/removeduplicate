# Remove duplicate digit from integer array
Three implementation of removing duplicate from an integer array

# How to Run:

com.test.DeDup is the main class for this project. We can run this class directly using java run command.

I have also added a test class named DeDupTest in test package. We can run that test class to to test DeDup class functionality.


# DeDup class has following three functions:


## public int[] removeDuplicateInOriginalOrder(int arr[]) {}

This function will take an array as input and return unique elements of the array with keeping the digit in input order.

Sample input: {1, 2, 1, 4, 3, 5, 2, 5, -2, -3}
Expected output: {1, 2, 4, 3, 5 ,-2 ,-3}

## public int[] removeDuplicateAvoidNegative(int arr[]) {}

This function will return an array removing duplicate and negative digit of input array.

Sample input: {1, 2, 1, 4, 3, 5, 2, 5, -2, -3}
Expected output: {1,2,4,3,5}

## public int[] removeDuplicateInSortedOrder(int arr[]) {}

This function will return a sorted array removing duplicate digit of input array.

Sample input: {1, 2, 1, 4, 3, 5, 2, 5, -2, -3}
Expected output: {-3,-2,1,2,3,4,5}