public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
            sum += i;
        }
        System.out.print("suma:" + sum);
    }

}
