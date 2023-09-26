public class Courone {
    public static double surface(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static double surfaceCourone(double r1, double r2){
        return Math.abs(surface(r1) - surface(r2));
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double surface = surfaceCourone(a, b);
        System.out.println("Surface: " + surface);
    }
}
