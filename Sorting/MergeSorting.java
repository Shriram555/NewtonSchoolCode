class Main{
    static int[] mergeTwoArrays(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int newLength = n+m;
        int result [] = new int[newLength];

        int i = 0, j = 0, k = 0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k] = arr1[i];
                i = i+1;
                // result[k++]=arr[i++];
            }
            else {
                result[k] = arr2[j];
                j = j+1;
                // result[k++] = arr2[j++];
            }
            k = k+1;
        }
        while(i<n) result[k++]= arr1[i++];
        while(j<m) result[k++] = arr2[j++];
        return result;
    }

      
    
public static void main (String args[]){
    
    int arr1[]={2,4,6,8,10,12,14,16};
    int arr2[]={1,3,5,7,9,11,13,15};
    int n=arr1.length;
    int m=arr2.length;
   int arr3[]= mergeTwoArrays(arr1, arr2);
   for(int i=0;i<m+n;i++) System.out.println(arr3[i]);
   
}
}
