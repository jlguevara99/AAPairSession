package ProductionCode;

class Calculator {
    public static void main(String[] args) {
        System.out.println(sub(2,1));
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        return a / b;
    }
}