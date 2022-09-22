package understandingJavaOperators;

public class TheForStatement {
    /*for ifadəsi 3 hissədən ibarətdir:
    * 1. initialization;
    * 2. booleanExpression;
    * 3. updateStatement. */

    public static void main(String[] args) {

        // 1. Creating an Infinite Loop
      /**  for( ; ; ){
            System.out.println("This is infinite loop");
        }
        System.out.println("This line is unreachable because of infinite loop");*/

        // 2. Adding Multiple Terms to the for Statement
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println("x="+x);

        // 3. Redeclaring a Variable in the Initalization Block

      /**  int x = 0;
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // does not compile
            System.out.println(x + " ");
        }*/


        // 4. Using Incompatible Data Types in the Initialization Block

       /** for(long y=0, int x=4; x<5 && y<10; x++, y++) { // does not compile
            System.out.println(x + " ");
        }*/
       // Initalization blokda elan olunan dəyişənlər hamısı eyni tipdə olmalıdır.

       // 5. Using Loop Variables Outside the Loop

        /**
         * for(long y=0, x=4; x<5 && y<10; x++, y++) {
         *  System.out.println(y + " ");
         * }
         * System.out.println(x); // does not compile
         */


        /*for dövrünün 3-cü hissəsində (update part) hər ifadəni yazmağa icazə verilmir. Ancaq
aşağıdakı ifadələri istifadə etmək mümkündür:*/

        /**
         *  Assignment;
         *  PreIncrementExpression;
         *  PreDecrementExpression;
         *  PostIncrementExpression;
         *  PostDecrementExpression;
         *  MethodInvocation;
         *  ClassInstanceCreationExpression.
         */

        // Nümunələrə baxaq:

        /**
         * for( ; Math.random() < .07; ){ }
         * for( ; ; Math.random() < .07){ } // does NOT compile
         * for( ; ; Math.random()){ }
         * for( ; Math.random() < .05 ? true : false; ){ }
         * for ( ; ; ) {
         *  Math.random() < .05 ? break : continue; // does NOT compile
         * }
         */


    }
}
