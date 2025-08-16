public class logical_AND_operator {
    public static void main(String[] args) {

        int a = 9;
        int b = 8;
        int c = 3;
        int d = 2;

        System.out.println((a>b) && (c>d)); // It will return true
        System.out.println((a<b) && (c>d)); // It will return false
        System.out.println((a>b) && (c<d)); // It will return false
        System.out.println((a<b) && (c<d)); // It will return false
    }
}