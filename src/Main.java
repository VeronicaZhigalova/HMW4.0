public class Main {
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a = b;
        }
    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }


    public boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public String notString(String str) {

        if (str.contains("not")) {
            return str;
        } else {
            return (String.format("not" + str));
        }
    }

    public boolean inputNumebrs(int y) {
        if (y % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Main main = new Main();
        String str = "kitten";
        str = main.missingChar(str, 4);
        System.out.println(str);

        System.out.println(main.sumDouble(2, 2));

        System.out.println(main.intMax(1, 2, 3));

        System.out.println(main.nearHundred(198));


        System.out.println(main.notString(" " + "candy"));
        System.out.println(main.notString(" " + "x"));
        System.out.println(main.notString(" " + "not bad"));


        System.out.println(main.inputNumebrs(13));
    }
}


