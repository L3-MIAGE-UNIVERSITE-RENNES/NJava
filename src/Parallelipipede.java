public class Parallelipipede {
    public static int volume(int L, int l, int H){
        return L*l*H;
    }

    public static int surface(int L, int l, int H){
        return 2*(L*l + L*H + l*H);
    }

    public static void main(String[] args){
        int v1 = volume(12, 3, 5);
        int s1 = surface(12, 3, 5);
        System.out.println("Volume 1 : " + v1 + " , Surface 1: " + s1  );

        int v2 = volume(4, 34, 10);
        int s2 = surface(4, 34, 10);
        System.out.println("Volume 2 : " + v2 + " , Surface 2: " + s2  );
    }
}
