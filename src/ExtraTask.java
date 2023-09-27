public class ExtraTask {
    public boolean in1020(int n, int k) {
        if (n >= 10 && n <= 20 || k >= 10 && k <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public boolean icyHot(int g, int m) {
        if (g < 0 && m > 100 || m < 0 && g > 100) {
            return true;
        } else {
            return false;

        }
    }

    public int caughtSpeeding(int speed, boolean yourBirthday) {
        if (yourBirthday) speed -= 5;
        if (speed < 61) {
            return 0;
        }
        if ((speed >= 61) && (speed <= 80)) {
            return 1;
        }
        if (speed > 80) {
            return 2;
        }
        return 1;
    }

    public String fizzString(String string) {
        if (string.startsWith("f") && string.endsWith("b")) {
            return "FizzBuzz";
        }
        if (string.startsWith("f")) {
            return "Fizz";
        }
        if (string.endsWith("b")) {
            return "Buzz";
        }

        return string;
    }

    public boolean closeFar(int a, int b, int c) {
        int close1 = Math.abs(a - b);
        int close2 = Math.abs(b - c);
        int close3 = Math.abs(a - c);

        if (close1 <= 1 && close2 >= 2 && close3 >= 2) {
            return true;
        } else if (close2 <= 1 && close1 >= 2 && close3 >= 2) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        ExtraTask task = new ExtraTask();
        System.out.println(task.in1020(8, 99));

        System.out.println(task.icyHot(1, 120));

        System.out.println(task.caughtSpeeding(60, false));

        System.out.println(task.fizzString("fig"));

        System.out.println(task.closeFar(4, 1, 3));
    }
}
