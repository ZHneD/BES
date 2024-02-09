import java.lang.System;

public class Main {
    public static void main(String[] args) {

        System.out.println(solution(2648));

    }

    public static int reverse(int value) {

        String convertly = new String();
        while (value != 0) {
            convertly += value%10;
            value /=10;
        }
        return Integer.parseInt(convertly);
    }

        public static char toUpperCase(char c) {

            return (char) (c + ('A' - 'a'));
        }

    public static float benefit(float sum, float percent) {
        int months = 12; // количество месяцев в году

        // Преобразуем процент в десятичную дробь и вычисляем процент за весь год
        float yearlyRate = 1 + percent;

        // Применяем формулу сложных процентов для ежемесячного начисления
        float finalSum = (float) (sum * Math.pow(yearlyRate, months));

        return finalSum;
    }




    public static void nemain() {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }



    public static double solutionTask09() {

        float a = 1.0f;
        float b = 3.0f;
        double x = (a / b - 1.0f / 3.0f) * 1.0e9;

        return x;
    }

    public static boolean solutionTask08() {

        double x = Double.POSITIVE_INFINITY;
        return x == x + 1;
    }
    public static int solution(int n, int m, int k) {


        return ((n/k)*(m/k));
    }
    public static int solution(int x, int y) {

        double c = x + y;
        String s = String.valueOf((int) c);

        return s.length();
    }
    
    public static String solution(int x) {

        for (int i=0; i < (String.valueOf(x).length());i++ ){
            if((x%10)%2==0){
                x/=10;
            }
            else {
                return "False";
            }
        }

        return "TRUE";
    }
    public static float calculate(int a, int b, String operation) {
        float c;
        switch (operation){
            case "/":
                c = a/b;
                return c;
            case "+":
                c = a+b;
                return c;
            case "-":
                c = a-b;
                return c;
            case "*":
                c = a*b;
                return c;
        }

        return 0;
    }
    public static int getMetreFromCentimetre(int centimetre) {

        return centimetre/100;
    }
    public static String solution(String input) {
        long number = Long.parseLong(input);
        if (-128<number && number<127){
            return "byte";
        }
        else if (-32768<number && number<32767){
            return "short";
        }
        else if (-2147483648<number && number<2147483647){
            return "int";
        }
        else
            return "long";
        }

    }
