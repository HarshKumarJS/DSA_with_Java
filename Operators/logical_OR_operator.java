public class logical_OR_operator {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 13;
        int d = 8;

        System.out.println((a>b) || (c>d)); // It will return true
        System.out.println((a<b) || (c>d)); // It will return true
        System.out.println((a>b) || (c<d)); // It will return true
        System.out.println((a<b) || (c<d)); // It will return false
    }
}