public class typeconversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = b;

        b = (byte) i;
        System.out.println("Byte: " + i);
    }

}
