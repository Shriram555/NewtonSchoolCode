import java.util.Scanner;
class BinarySearch{
    // static void bubbleSort(int arr[],int n){
    //    for (int i=0;i<n;i++){
           
    //        for(int j=0;j<n-1;j++){
    //        if(arr[j]>arr[j+1]){
    //            int temp=arr[j];
    //            arr[j+1]=arr[j];
    //            arr[j+1]=temp;
    //        }
    //     }
    //    }
    // }

     static void bubbleSort(int arr[], int n){
        for(int i=0;i<n;i++){
          //boolean isSwapped = false;
          // second for loop
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                      //isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            // end of second for loop
            //if(isSwapped==false) break;
        }
    }

    
    public static void main(String args[]){
        
    int arr[]={5,24,36,14,52,41,82,1,32,63,71};
       int n=arr.length;
       bubbleSort(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
} 