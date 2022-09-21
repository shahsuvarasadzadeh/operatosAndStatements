package understandingJavaOperators;

public class CastingPrimitiveValues {
    public static void main(String[] args) {
        /*Daha böyük tipdən (numerical) daha kiçik tipə və yaxud onluq saydan tam ədədə keçmək
üçün casting istifadə olunur.*/

        int x = (int) 1.0;
        short y = (short) 1921222; // Stored as 20678
        int z = (int) 9f;
        long t = 192301398193810323L;

        // Overflow:
        int i = 2147483647 + 1; // -2147483648
      //  int i2 = 2147483648; // DOES NOT COMPILE
        byte b = (byte) (128 + 128); // 0
       // System.out.println(i + b); // -2147483648
//        Bir sıra digər maraqlı nümunələrə baxaq

        short d =10;
        short s = 3;
       // short z1 = d * s; // does NOT compile
       // short z2 = (short) d * s; // does NOT compile
        short z3 = (short) (d * s); // does compile
        byte b1 = (byte) 1000 + (byte) 1000; // output: -48
      //  byte b2 = (byte) 100 + (byte) 100; // DOES NOT COMPILE
        byte b3 = (byte) 100 + (byte) 27; // output: 127
    }
}
