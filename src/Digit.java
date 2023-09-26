public class Digit {

    static int digitIterative(int n, int i){

        int digit = n;
        int restew;
        while (digit > 0) {
            i=i+1;
            digit = digit / 10;
            int reste = digit % 10;
        }
        return reste;
    }

    public static void main(String[] args) {
        int digit = digitIterative(245, 1);
        System.out.println("le " + 1 + "ème chiffre est: " + digit );
    }
}
