import java.util.*;
public class Small{
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter the size of the elements:");
        int n = sc.nextInt(); // 6
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){  // 1, 5, 0, 3, 4, 5
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){  // i = 1,5,0
            if(i == 0 || arr[i] == 0){ // true
                System.out.println("-1"); // -1
            }
            else{
                int j = i - 1;  // j = 1,
                if(arr[j] < arr[i]){ // 1 < 2 -> true
                    System.out.println(arr[j]); // 1
                }
                else{
                    j = j - 1;
                    if(arr[j] < arr[i]){
                        System.out.println(arr[j]);
                    }
                }


            }
        }
    }
    public static void main(String[] args){
        Small s = new Small();
        s.input();
    }
}