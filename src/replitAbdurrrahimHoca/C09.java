package replitAbdurrrahimHoca;

public class C09 {


    /* Write a method that accepts an array as parameter and returns sum off all elements
    in the array Then print the result in the main method.
​
​
​
     Eg :
​
     input : {1,2,3,4,5,6,7,8};
      output: 36
 */
    public static void main(String[] args) {

        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8};

        int  sonuc=sayilariTopla(sayilar);

        System.out.println("Output : "+sonuc);


    }

    public static int sayilariTopla(int[] sayilar) {
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam += sayilar[i];
        }

        return toplam;
    }










}
