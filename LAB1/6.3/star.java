import java.util.Scanner;

public class star{

public static void main(String args[]){

Scanner keyboard = new Scanner(System.in);
System.out.println("Nhap n: ");
int n = keyboard.nextInt();
for (int i = 0; i < n ; ++i){
  String line = "";	
  for (int j = n - i; j > 0 ; j--){
    line = line + ' ';
  }	  
  for (int k = 1; k <= 2*i + 1; ++k){
	line = line + '*';  
  }
  System.out.println(line + "\n");
}
  System.exit(0);
}

}