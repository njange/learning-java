public class typeconversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = b;

        b = (byte) i;
        System.out.println("Byte: " + i);

        float f = 10.5f;
        int j = (int) f;
        System.out.println("Float: " + j);
    }

}
