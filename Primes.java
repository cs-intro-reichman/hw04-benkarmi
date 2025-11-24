public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n);
        for (int i = 2 ; i <= n ; i++){
            int j = 2;
            for (j = 2 ; j < i ; j++){
                if (i%j == 0){
                    break;
                }
            }
            if (j == i){
                System.out.println(i);
            }
        }
    }
}