public class DayOne {
    public static void mainOne(String args[]) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        while (true) {
            int x = scan.nextInt();
            int y = 2020 - x;
            if (set.contains(y)) {
                System.out.println("Sum of x*y = " + y * x);
                break;
            } else {
                set.add(x);
            }
        }
        
        System.out.println("not found");
    }

    public static void main(String args[]) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        outer:
        while (true) {
            int x = scan.nextInt();
            for (int z : list) {
                int y = 2020 - z - x;
                if (set.contains(y)) {
                    System.out.println("Numbers x y z = " + y + " " + x + " " + z);
                    System.out.println("Sum of x*y*z = " + y * x * z);
                    break outer;
                }
            }
            set.add(x);
            list.add(x);
        }
        
        System.out.println("not found");
    }
}
