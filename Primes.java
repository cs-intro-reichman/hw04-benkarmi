public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int count = 0;
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2 ; i <= n ; i++){
            int j = 2;
            for (j = 2 ; j < i ; j++){
                if (i%j == 0){
                    break;
                }
            }
            if (j == i){
                count++;
                System.out.println(i);
            }
        }
        int percent = 100 * count / n;
        System.out.println("There are " + count + " primes between 2 and " + n +  " (" + percent + "% are primes)");
    }
}