package understandingJavaOperators;

public class TernaryOperator {
// booleanExpression ? expression1 : expression2
/*Birinci tərəf mütləq boolean ifadə olmalıdır, ikinci və üçüncü tərəflər isə mənimsədilən
dəyərin tipinə uyğun olmalıdır. Short-circuit operatorlar kimi ternary operatorda da icra vaxtı
“?”-dan sonra ancaq iki şərtdən biri icra edilir:*/

    public static void main(String[] args) {

        int y = 1;
        int z = 1;
        final int x = y < 10 ? y++ : z++;
        System.out.println(y + "," + z); // output: 2,1

        /*Aşağıda birinci sətirdə istənilən halda ancaq true şərtinin yerinə yetirilməsinə baxmayaraq
hər iki dəyər x dəyişəninin tipinə uyğun olmalıdır. Əgər mənimsətmə yoxdursa, ?
simvolundan sağdakı dəyərlərin bir-biri ilə eyni tipdə olması isə tələb deyil:*/

     //   int s = 6 > 5 ? 6 : "5"; // does not compile
        System.out.println(6 > 5 ? 6 : "5"); // output is 6

        // void tipində metodların ternary operator ilə istifadəsinə icazə verilmir:

                System.out.println(6>5 ? return1() : return2()); // output: I am String
          //     System.out.println(6>5 ? void1() : void2()); // does NOT compile



        }

    static String return1(){ return "I am String"; }
    static int return2(){ return 7; }

    static void void1(){ System.out.println("I am void 1"); }
    static void void2(){ System.out.println("I am void 2"); }

    }


