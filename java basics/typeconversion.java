public class typeconversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = b;

        b = (byte) i;
        System.out.println("Byte: " + b);

        float f = 10.5f;
        int j = (int) f;
        System.out.println("Float: " + j);

        byte b1 = 10;
        byte b2 = 30;

        int b3 = b1 * b2;
        System.out.println(b3);
    }

}
