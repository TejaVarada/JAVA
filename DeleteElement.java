import java.util.Arrays;
import java.util.Scanner;
 
public class DeleteElement{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
 
        System.out.print("Enter Array Elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
 
        Arrays.sort(arr);
 
        int previousIdx = 0;
        int counter = 1;
 
        for(int i=1; i<n; i++) {
            if(arr[previousIdx] == arr[i]) {
                counter++;
            } else {
                System.out.println(arr[previousIdx] + " - " + counter);
                counter = 1;
            }
            previousIdx = i;
        }
 
        // Print the last element and its count
        System.out.println(arr[previousIdx] + " - " + counter);
        
    }