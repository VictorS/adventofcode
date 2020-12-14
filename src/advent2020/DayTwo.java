public class DayTwo {
    public static void mainOne(String args[]) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int v = 0;
        while (scan.hasNext()) {
            String[] tm = scan.next().split("-");
            String[] chs = scan.next().split(":");
            char ch = chs[0].charAt(0);
            String ps = scan.next();
            int k = 0;
            for (int i = 0; i < ps.length(); i++) {
                if (ps.charAt(i) == ch) k++;
            }
            //System.out.println("Line : " + tm[0] + " " + tm[1] + " " + ch + " [" + ps + "] " + k);
            if (k >= Integer.valueOf(tm[0]) && k <= Integer.valueOf(tm[1])) {
                v++;
            }
        }
        
        System.out.println("found " + v);
    }

    public static void main(String args[]) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int v = 0;
        while (scan.hasNext()) {
            String[] tm = scan.next().split("-");
            String[] chs = scan.next().split(":");
            char ch = chs[0].charAt(0);
            String ps = scan.next();
            int k = 0;
            int i = Integer.valueOf(tm[0]) - 1;
            int j = Integer.valueOf(tm[1]) - 1;
            //System.out.println("Line : " + tm[0] + " " + tm[1] + " " + ch + " [" + ps + "] " + k);
            if (ps.charAt(i) == ch) k++;
            if (ps.charAt(j) == ch) k++;
            if (k == 1) {
                v++;
            }
        }
        
        System.out.println("found " + v);
    }
}
