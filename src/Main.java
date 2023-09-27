public class Main {
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public int sumDouble(int a, int b) {
        return a + b;
    }

    public int intMax(int a, int b, int c) {
        return intMax(a, b, c);
    }


    public boolean nearHundred(int n) {
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
            return true;
        } else {
            return false;
        }
    }public String notString(String str) {

        if (str.contains("not")){
            return str;
        } else {
            return (String.format("not" + str)) ;
        }
    }

    public boolean inputNumebrs(int y) {
        if (y % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }public static void main (String[]args){

        Main main = new Main();
        String str = "kitten";
        str = main.missingChar(str, 4);
        System.out.println(str);

        double a = 2;
        double b = 2;
        double sum = a + b;
        if (a == b) {
            System.out.println(2 * (a + b));
        } else {
            System.out.println(sum);
        }

        int num1 = 3;
        int num2 = 2;
        int num3 = 1;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        boolean nearHundred = main.nearHundred(90);
        String n = String.valueOf(nearHundred);
        System.out.println(n);


        System.out.println(main.notString(" " + "candy"));
        System.out.println(main.notString(" " + "x"));
        System.out.println(main.notString(" " + "not bad"));


        System.out.println(main.inputNumebrs(13));


    }
}