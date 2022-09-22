package understandingJavaOperators;

public class CompileTimeConstantValues {


        // compile-time constant olması üçün dəyişən aşağıdakı şərtləri ödəməlidir:

/*• final olmalıdır;
• primitiv və ya String tipində olmalıdır;
• elan olunduğu sətirdə dəyər mənimsədilmiş olmalıdır;
• dəyişənə “compile-time constant” dəyərlər mənimsədilməlidir (be assigned to a
  compile time constant expression).*/

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "MBM";
        final String suffix = "MM";
        int id = 0;
        switch(firstName) {
            case "Test": // String literal
                return 52;
            case suffix: // final constant variable
                id = 7;
                break;
         //   case middleName: // does not compile, beacuse it is not final
              //  id = 5;
             //   break;
         //   case lastName: // does not compile, final but not constant
              //  id = 8;
             //   break;
        //    case 5: // does not compile, not String
             //   id = 5;
               // break;
           // case 'J': // does not compile, not String
            //    id = 10;
              //  break;
          //  case java.time.DayOfWeek.SUNDAY.toString(): // does not compile, enum
             //   id = 15;
              //  break;
          //  case "string".toUpperCase(): // does not compile
               // break;
           // case "string".toString(): // does not compile
              //  break;
            // case "string".trim(): // does not compile
              //  break;
        }
        return id;
    }

    // Case dəyərlər təkrarlana bilməz, əks halda təkrarlanan sətir xəta verəcək:

    public static void main(String[] args) {
        switch (new Integer(2)) {
            case 1: System.out.println("1");
            case 2: System.out.println("2");
            case 3: System.out.println("3");
          //  case 2: System.out.println("duplicate 2"); // does not compile
           // case 1: System.out.println("duplicate 1"); // does not compile

                int dayOfWeek = 5;
                switch(dayOfWeek) {
                    case 0:
                        System.out.print(" Sunday");
                    default:
                        System.out.print(" Weekday");
                    case 6:
                        System.out.println(" Saturday");
                }
        }

        // Bir switch blokunda default ifadəsi ancaq bir dəfə istifadə oluna bilər, əks halda kod xəta
        //verəcək.

    }
    public void test1(String dayOfWeekArg) {

        /*Umumiyyetle switch ifadeleri byte, short, int, char ve onlarin wrapper classlari,
        java 5'den sonra enum, java 7'den sonra ise String tipini destekleyir, float, double,
        long ve boolean tiplerini ise desteklemir. null tip olmadigindan onu desteklemeyecek,
        amma burada null String deyishenine menimsedildiyinden compile vaxti java bunu String
        deyisheni kimi gorub xeta vermeyecek yeqi ki. Case ifadeleri de switch ifadesi ile
        eyni tipde olmaq mecburiyyetindedir ve her iki case String oldugundan hech bir problem yoxdu.
        Burada problem yeqin ki, run vaxti bash verecek. Sehv etmiremse switch'deki
        String ifadesinin hansi case ifadesine beraber oldugunu teyin etmek uchun
        java equals metodunu istifade edir. Bu numunede str deyisheninin deyeri null'dur
         ve null referans uzerinden equals metodu chagirildiqda NullPointerException verir.*/

        String str = null;
        switch (str) {
            case "null":
                System.out.println("1");
                break;
            case "":
                System.out.println("2");
                break;
            default:
                System.out.println("3");
        }
    }

    public void displayTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
        String typeOfDay;
        switch (dayOfWeekArg) {
            case "Monday":
                typeOfDay = "Start of work week";
                break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                typeOfDay = "Midweek";
                break;
            case "Friday":
                typeOfDay = "End of work week";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
         //   throw new IllegalArgumentException("Invalid day of the week");
        }
       // System.out.println(typeOfDay); // line A


        /*Əgər bu metodda istənilən case ifadəsinin birinde typeOfDay dəyişəninə dəyər
mənimsədilməsini və ya default`da throw ifadəsini kommentə atsaq line A kompayl
olunmayacaq. Çünki kompilyator yüz faiz əmin olmalıdır ki, istənilən hər bir situasiyada
typeOfDay dəyişəninə dəyər mənimsədiləcək, əks halda lokal dəyişən olduğu üçün onu çap
edə bilməz.*/



    }

}
