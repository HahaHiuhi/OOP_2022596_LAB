import java.util.Arrays;

public class Array{

public static void main(String args[]){

  int[] ARRAY  = { 1 , 10 , 9 , 12 , 8 ,5 , 22 };
  int sum = 0;
  
  System.out.println("Mang goc: ");
  for (int i : ARRAY){
	sum += i;
    System.out.println(i + " ");	
  }
  
  Arrays.sort(ARRAY);
  
  System.out.println("Mang da sap xep: ");
  for (int i : ARRAY){
    System.out.println(i + " ");	
  }
  
  System.out.println("Tong cac phan tu trong mang la: " + sum);
  System.out.println("Trung binh cong cac phan tu trong mang la: " + (double)sum/ARRAY.length);
   
}  
}