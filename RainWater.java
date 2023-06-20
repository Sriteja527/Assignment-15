import java.util.*;
public class RainWater{
    Scanner sc = new Scanner(System.in);
    void input(){
        int count = 0;
        int greater = 0;
        int lesser = 0;
   System.out.println("Enter the size of the array:");
   int n = sc.nextInt(); // 6
   System.out.println("Enter the heights of the bar:");
   int arr[] = new int[n];
   for(int i=0;i<n;i++){
    arr[i] = sc.nextInt(); //4,2,0,3,2,5
   }
   int j = 0;
   for(int i=0;i<n;i++) // i = 0,1,2,3,4 
   {
    if(i < n - 1 ){ // 0 < 5->true, 1 < 5->true, 2 < 5 -> true, 3 < 5->true, 4 < 5
       j = i + 1;} // j = 1,2,3,4,5
      if(arr[i] > arr[j]){ // 4 > 2->true, 2 > 0->true , 0 > 3-> false, 3 > 2-> true
        greater = arr[i] - arr[j]; // g = 4 - 2 = 2, 2 - 0 = 2,3 - 2 = 1
        count = count + greater; // 0 + 2 = 2, 2 + 2 = 4, 4 + 1 = 5.
      }

    }
    System.out.println("The units of rain water is:" +count);
   }
   public static void main(String[] args){
    RainWater r = new RainWater();
    r.input();
   }



    }