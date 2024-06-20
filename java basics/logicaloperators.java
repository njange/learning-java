public class logicaloperators {
    public static void main(String[] args) {
        int x = 6;
        int y = 10;

        boolean result = x > 5 && y < 11;
        System.out.println("Result: " + result);

        boolean result2 = x > 5 || y < 11;
        System.out.println("Result2: " + result2);

        boolean result3 = x != y;
        System.out.println("Result3: " + result3);

        boolean result4 = x == y;
        System.out.println("Result4: " + result4);
    }
    
}
