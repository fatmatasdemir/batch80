package replit_mehmetakinsorulari;

public class C02_replitfaktör {


    /* FOR WHILE 2. SORU
       Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
       Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen)
       ve LCM'yi (En Küçük Ortak Katlı) bulmasını isteyin.


        Input :
        30 and 40  30 60 90 120     40 80 120
        Expected OutPut:
        GCD for 30 and 40 = 10
        LCM for 30 and 40 = 120 */

    public static void main(String[] args) {


    int a = 30;
    int b = 40;
    int ebob = 1;
        if (a == 0 || b == 0) {
        System.out.println("Sifir'in EBOB/EKOK'u yoktur");
    } else if (a < 0 || b < 0) {
        System.out.println("Lutfen 0'dan buyuk iki sayi giriniz");
    } else {
        for (int i = 1; i <= 30 && i <= 40; i++) {
            if (a % i == 0 && b % i == 0) {   // 10
                ebob = i;
            }
        }
        System.out.println("GCD for 30 and 40 = " + ebob);   //  EBOB 10
        int ekok = (a * b) / ebob;    // FORMUL = a * b = EBOB(a,b) * EKOK(a,b)  30*40 = 10*120
        System.out.println("LCM for 30 and 40 = " + ekok);  // EKOK 120
    }
}
}
        /*
         max = sayi1 * sayi2;
        2 sayı eger aralarında asal ise ekoku
        çarpımlarıdır. Yanı 2 sayının ekoku maximum çarpımlarıdır.
        for(int i = max; i > 0; i--)
            if(i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
            }
        }
        System.out.println("Ekok = " + ekok);
 */




















