package replitAbdurrrahimHoca;

public class C08 {


    public static void main(String[] args) {

    /*    Write a java program that calculates the average value of array elements
​
        input[]= {1,2,3,4,5,6,7}
​
        Output : 4
*/

        int [] sayilar= {1,2,3,4,5,6,7};
        int toplam=0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam+=sayilar[i];

        }double ortalama=toplam/ sayilar.length;
        System.out.println(ortalama);




    }







}
