public class Main {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            boolean prime = true;
            for (int divider = 2; divider <= Math.sqrt(number); divider++) {
                if (number%divider==0){
                    prime = false;
                    break;
                }
            } if (prime){
                System.out.println(number);
            }
        }
    }
}