public class Main {

    public static void main(String[] args) {
	// write your code here
        //5 2 -5
        //4 9 2
        //-3 2 6
        double x1 = 5;
        double y1 = 2;
        double z1= -5;
        double x2 = 4;
        double y2 = 9;
        double z2 = 2;
        double x3 = -3;
        double y3 = 2;
        double z3= 6;

        double ab = Math.sqrt(Math.pow((x1-x2),2) + Math.pow(y1-y2,2) + Math.pow(z1-z2,2));
        double ac = Math.sqrt(Math.pow((x1-x3),2) + Math.pow(y1-y3,2) + Math.pow(z1-z3,2));
        double bc = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3,2) + Math.pow(z2-z3,2));

        double max = Math.max(Math.max(ab,ac),Math.max(bc,ac));
        double min = Math.min(Math.min(ab,ac),Math.min(bc,ac));

        System.out.println("Distance from A to B: " + ab);
        System.out.println("Distance from A to C: " + ac);
        System.out.println("Distance from B to C: " + bc);
        System.out.println("The longest distance is " + max);
        System.out.println("The shortest distance is " + min);


    }
}
