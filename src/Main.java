public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
        byte a = 6;
        short b = 300;
        int c = 47000;
        long d = 100000L;
        float k = 45.78f;
        double m = 6.88889675;
        System.out.println("Значение переменной byte равно " + a);
        System.out.println("Значение переменной short равно " + b);
        System.out.println("Значение переменной int равно " + c);
        System.out.println("Значение переменной long равно " + d);
        System.out.println("Значение переменной float равно " + k);
        System.out.println("Значение переменной double равно " + m);

        System.out.println("ЗАДАЧА 2");
        double catBlu = 27.2;
        long catBlack = 987678965549L;
        float catRed = 2.786f;
        int catPink = 569 ;
        short catWait = -159;
        int catGreen = 27897;
        byte catYellow = 67;

        System.out.println("ЗАДАЧА 3");
        byte ludPet = 23;
        byte anSer = 27;
        byte eckAnd = 30;
        int vcegoUchenikov = ludPet + anSer + eckAnd;
        int vcegoListov = 480;
        int naKazhdogo = vcegoListov/vcegoUchenikov;
        System.out.println("На каждого ученика расчитано  " + naKazhdogo + " листов бумаги.");

        System.out.println("ЗАДАЧА 4");
        int proizv2 = 16;
        int proizv1 = proizv2/2;
        int proizv20 = 20*proizv1;
        int proizvSutki = (24*60)*proizv1;
        int proizv3Sutki = proizvSutki*3;
        int proizvMesyz = proizvSutki*30;
        System.out.println("За 20 минут машина произвела " + proizv20 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + proizvSutki + " штук бутылок.");
        System.out.println("За 3 суток машина произвела " + proizv3Sutki + " штук бутылок.");
        System.out.println("За месяц машина произвела " + proizvMesyz + " штук бутылок.");

        System.out.println("ЗАДАЧА 5");
        byte whiteCol = 2;
        byte brownCol = 4;
        int banokNaclass = whiteCol + brownCol;
        int vsegoBanok = 120;
        int vsegoClassov = vsegoBanok/banokNaclass;
        int whiteClass  = whiteCol*vsegoClassov;
        int brownClass = brownCol*vsegoClassov;
        System.out.println("В школе, где " + vsegoClassov + " классов, нужно " + whiteClass + " банок белой " +
                "краски и " + brownClass + " банок коричневой краски.");

        System.out.println("ЗАДАЧА 6");
        int bananVec = 80;
        int milkVec = 105;
        int iceVec = 100;
        int eggVec = 70;
        int banan = 5;
        int milk = 2;
        int ice = 2;
        int egg = 4;
        int allBanan = bananVec*banan;
        int allMilk = milkVec*milk;
        int allIce = iceVec*ice;
        int allEgg = eggVec*egg;
        int sportBrekfgr = allBanan + allMilk + allIce + allEgg;
        float sportBrekfkg = sportBrekfgr/1000f;
        System.out.println("Вес спортзавтрака " + sportBrekfgr + "гр. или " + sportBrekfkg + " кг.");

        System.out.println("ЗАДАЧА 7");
        int vsegoSbros = 7;
        vsegoSbros = vsegoSbros*1000;
        int vDay1 = 250;
        int vDay2 = 500;
        int vsegoDay1 = vsegoSbros/vDay1;
        int vsegoDay2 = vsegoSbros/vDay2;
        int sredneDay  = (vsegoDay1 + vsegoDay2)/2;
        System.out.println("Спортсмену потребуется " + vsegoDay1 + " дней на похудение, если он " +
                "будет худеть на " + vDay1 + " гр. в день.");
        System.out.println("Спортсмену потребуется " + vsegoDay2 + " дней на похудение, если он " +
                "будет худеть на " + vDay2 + " гр. в день.");
        System.out.println("Потребуется в среднем " + sredneDay + " дней на похудение.");

        System.out.println("ЗАДАЧА 8");
        double mashaMes = 67760;
        double denisMes = 83690;
        double kristMes = 76230;
        double uvMasha = mashaMes + (mashaMes * 0.1);
        double uvDenis = denisMes + (denisMes * 0.1);
        double uvKrist = kristMes + (kristMes * 0.1);
        double uvMasha_god = (uvMasha*12) - (mashaMes*12) ;
        double uvDenis_god = (uvDenis*12) - (denisMes*12);
        double uvKrist_god = (uvKrist*12) - (kristMes*12);
        System.out.println("Маша теперь получает " + uvMasha + " рублей. Годовой доход вырос на "
        + uvMasha_god + " рублей.");
        System.out.println("Денис теперь получает " + uvDenis + " рублей. Годовой доход вырос на "
                + uvDenis_god + " рублей.");
        System.out.println("Кристина теперь получает " + uvKrist + " рублей. Годовой доход вырос на "
                + uvKrist_god + " рублей.");


         {

        }




























    }
}