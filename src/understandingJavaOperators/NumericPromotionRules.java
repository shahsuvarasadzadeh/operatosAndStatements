package understandingJavaOperators;

public class NumericPromotionRules {
    public static void main(String[] args) {
        /*Əgər verilmiş iki dəyər fərqli tiplərdədirsə, java bu iki tipdən birini bunlardan ən
yüksək olan digərinin tipinə çevirəcək/yüksəldəcək (promote);
 (ex, short & int  int & int)*/

        int x = 1;
        long y = 33;

        System.out.println((x*y)); // x*y  result is long


        /*Əgər dəyərlərdən biri tam (integral), digəri onluq (floating-point) ədəddirsə, java
avtomatik olaraq tam ədədi onluq ədəd tipinə çevirəcək;
 (ex, double & int  double & double)*/

        double a = 39.21;
        int b = 2;
        System.out.println(a+b);
        // a+b  result is double

        /*byte, short və char tiplərində olan dəyişənlər java binary aritmetik operatorlarla
istifadə edilərkən əvvəlcə (əməliyyatdan öncə) int tipinə çevrilirlər, hətta həmin
verilənlərdən heç biri int tipində olmasa belə;
(ex, short + short  int)*/

        short c = 10;
        short d = 3;
        System.out.println(c*d);
//        x/y  result is int

        /*Əgər verilənlər hamısı eyni tipdədirsə, nəticə də eyni tipdə olacaq (istisnalardan
        başqa);
        (ex, int + int  int)*/

        short s = 14;
        float e = 13;
        double z = 30;
//        s*e/z  result is double

        /*Aritmetik binary operator istifadə edildiyindən x
avtomatik olaraq int tipinə çevrilir. Sonra y dəyişəninə vurulduğu üçün x avtomatik olaraq
float tipinə çevrilir. Sonra x*y ifadəsi z dəyişəninə bölünə bilməsi üçün double tipinə çevirilir
və bölündükdən sonra son nəticə double olur.*/


        /*Bu mövzu ilə bağlı aşağıdakı linkdən maraqlı kod nümunələrinə baxa bilərsiniz:
*/
       /** http://www.coderanch.com/t/655528/ocajp/certification/Numeric-promotion-rules */

}
}
