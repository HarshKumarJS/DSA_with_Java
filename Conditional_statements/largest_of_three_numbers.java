public class largest_of_two_numbers {
    public static void main(String[] args) {

        int m = 1;
        int n = 3;
        int o = 6;

        if((m>n) && (m>o)){
            System.out.println("m is the largest number");
        }
        else if(n>o){
            System.out.println("n is the largest number");
        }
        else{
            System.out.println("o is the largest number");
        }
    }
}