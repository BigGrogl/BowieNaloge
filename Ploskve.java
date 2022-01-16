import java.util.Scanner;
class Ploskve{
	public static void main (String[] args){
		Scanner bralnik = new Scanner(System.in);
		System.out.println("Vnesite stevko");
		int stevka = bralnik.nextInt();
        int temp = 0;
        int ploskve = 0;

        int length = (int) (Math.log10(stevka) + 1);

        for(int i = 0; i < length; i++){
            temp=stevka%10;
            stevka=stevka/10;
            switch(temp){
                case 1,2,3,5,7:
                    break;
                case 0,4,6,9:
                    ploskve=ploskve+1;
                    break;
                case 8:
                    ploskve=ploskve+2;
                default :
                    break;
            }
            System.out.printf("%d%n", temp);
        }
        bralnik.close();
        System.out.printf("Stevilo omejuje %d ploskev", ploskve);
	}
}