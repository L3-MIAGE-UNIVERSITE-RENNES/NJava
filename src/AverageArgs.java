public class AverageArgs {
    public static double average(int a, int b, int c){
        return (double) (a+b+c)/3;
    }

    public static void main(String[] args){
        int a = Integer. parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println("Average: " + average(a, b, c));
    }
}
