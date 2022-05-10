import java.util.*;
import java.lang.*;
import java.io.*;
class InputUsedBuff{
    
    public static void main (String args[] )throws Exception{
     InputStreamReader inr =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(inr);

        String str =br.readLine();
        int row=Integer.parseInt(str);
        int col=row;
        int [][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            String line=br.readLine();
            String[] element=line.split(" ");
            for(int j=0;j<col;j++){
                arr[i][j]=Integer.parseInt(element[j]);
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}