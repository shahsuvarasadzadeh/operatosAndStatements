package understandingJavaOperators;

public class TheForEachStatement {

    /*for dövründən fərqli olaraq forEach dövründə instance dəyişəni dövrdən əvvəl təyin etmək
olmur, ancaq içəridə elan olunmalıdır.*/
    public static void main(String[] args) {

        final String[] names = new String[3];
        names[0] = "Murad";
        names[1] = "İlkin";
        names[2] = "Elmar";

        for (String name : names) {
            System.out.print(name + ", "); // Murad, İlkin, Elmar,
        }

        /**
         * String name2;
         * for (name2 : names) { // does not compile, identifier expected
         *  System.out.println(name2);
         * }
         * names = new String[5]; // does not compile, because of final
         */

        // Digər nümunələr:


        Integer[] i = new Integer[3];

        /** for (int i: i) { // does not compile, eyni dəyişən adına görə
         *  System.out.println(i);
         * }
         */
        for (int a : i) { // does compile, but throw NullPointerException
            System.out.println(a);
        }


        for (Integer a : i) { // does compile and output: null null null
            System.out.print(a + " ");
        }


    }

}
