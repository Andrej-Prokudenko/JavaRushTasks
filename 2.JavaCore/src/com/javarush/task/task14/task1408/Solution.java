package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country == Country.UKRAINE){
                hen = new UkrainianHen();
            } else if (country == Country.RUSSIA){
                hen = new RussianHen();
            }else if (country == Country.MOLDOVA){
                hen = new MoldovanHen();
            }else if (country == Country.BELARUS){
                hen = new BelarusianHen();//напишите тут ваш код
            }
            /*вариант
            witch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
            }
            */
            return hen;
        }
    }


}
