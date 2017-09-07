import java.util.Scanner;
public class dietel7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean seats[] =new boolean[10];

		int y;
		int x = 0;
		int b = 0;
		int a = 5;
		while(x>=0 && x<=9){
			System.out.println("WELCOME TO THE AIRLIE BOOKING SYSTEM:\nInput 1, for the First class Section, or 2 for the Economy Section:\n ");
			y = input.nextInt();
			if(y==1 || y==2 ){
				if(y==1){
					
					if(b<=4){
						if(seats[b]!=true){
							seats[b] = true;
							System.out.printf("Dear customer, Seat %d in the first class section has been allocated to you\n",b);
							b++;
						}
					
					}else{
						System.out.println("The first class section is filled, if you can manage the Economy section, enter 2 to check if there is still an available space in the Economy section OR check back for the next flight in 3hrs");
						
					}
				}
				if(y==2){
					
					if(a>=5 && a<=9){
						if(seats[a]!=true){
							seats[a] = true;
							System.out.printf("Dear customer, Seat %d in the Economy section has been allocated to you\n",a);
							a++;	
						}
					}else{
						System.out.println("The Economy section is filled");
					}
				
				}
			}else{
				System.out.println("Your input should be either 1 or 2");
			}
			x++;
		}
	}
}
