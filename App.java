public class App {
    public static void main(String[] args) throws Exception {
        int num = 7,binary=0,i=0,temp;
        while (num > 0) {
            temp = num % 2;
            binary += temp * Math.pow(10, i);
            i++;
            num /= 2;
        }
        System.out.println("Binary is : " + binary);
    }
}
