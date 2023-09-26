public class Average {
    public static double average(int a, int b, int c){
        return (double) (a + b + c)/3;
    }

    public static void main(String[] args){
        double average1 = average(3, 1, 1);
        double average2 = average(-12, 2, 12);

        System.out.println("Average 1 : " + average1 + " , Average 2: " + average2);
    }


}
