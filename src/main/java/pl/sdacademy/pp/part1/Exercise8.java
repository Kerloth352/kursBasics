package pl.sdacademy.pp.part1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Exercise8 {

    static double[] doubleMoney = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
//    tablica banknotow oraz monet

    public void amountOfCoinsAndBankNotes(BigDecimal inputPrice) {

        if (inputPrice.doubleValue() < 0){
            System.out.println("Kwota nie moze byc nizsza od 0");
        }

        BigDecimal[] moneyTab = new BigDecimal[14]; // tablica przechowujaca banknoty oraz monety w BigDecimal
        for (int i = 0; i < doubleMoney.length; i++) {
            BigDecimal moneyDefault = new BigDecimal(doubleMoney[i]); // zamiana double na BigDecimal
            BigDecimal moneyDecimal = moneyDefault.round(new MathContext(3,RoundingMode.HALF_UP)); // zaokraglenie w BigDecimal
            moneyTab[i] = moneyDecimal; // przypisanie do tablicy
        }


        int[] amount = new int[14]; //tablica przechowujaca ilosc uzytych banknotow i monet
        BigDecimal price = inputPrice.round(new MathContext(11,RoundingMode.HALF_UP)); // zaokraglenie kwoty do rozbicia
       while(price.doubleValue() > 0){
           for (int i = 0; i < moneyTab.length; i++) {
               if(price.divide(moneyTab[i]).compareTo(new BigDecimal(1)) != -1){
                   // porownanie do 1 (zwraca 1 gdy jest kwota podzielona przez banknot/monete jest wieksza od 1 lub 0 gdy jest taka sama , -1 gdy jest mniejsza)
                   price = price.subtract(moneyTab[i]); // odejmowanie uzytego banknotu od kwoty
                   amount[i]++; // zwiekszenie licznika uzytych banknotow
                   break;
               }
           }
       }
        System.out.println(inputPrice.doubleValue() + " zł");
        for (int i = 0; i < moneyTab.length; i++) {
            System.out.println(moneyTab[i].setScale(2) + " zł" + " - " + amount[i]); // wypisywanie tablic z dokladnoscia do dwoch miejsc po przecinku
        }
    }
}
