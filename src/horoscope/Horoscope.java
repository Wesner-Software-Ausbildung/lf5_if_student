package horoscope;

public class Horoscope {
    public String getHoroscope(int day, int month) {

        String tagZehnerstelle_0 = "In der Familie ";
        String tagZehnerstelle_1 = "In der Partnerschaft ";
        String tagZehnerstelle_2 = "Im Berufsleben ";
        String tagZehnerstelle_3 = "In der Liebe ";

        String tagEinerstelle_0 = "fehlt Ihnen die Ausdauer. ";
        String tagEinerstelle_1 = "kündigen sich Veränderungen an. ";
        String tagEinerstelle_2 = "lassen Erfolge auf sich warten. ";
        String tagEinerstelle_3 = "neigen Sie zur Bequemlichkeit. ";
        String tagEinerstelle_4 = "müssen Sie mit unangenehmen Überraschungen rechnen. ";
        String tagEinerstelle_5 = "sind Sie besonders kreativ. ";
        String tagEinerstelle_6 = "befinden Sie sich in einer produktiven Phase. ";
        String tagEinerstelle_7 = "eilen Sie von Erfolg zu Erfolg. ";
        String tagEinerstelle_8 = "kann es zu einer Auseinandersetzung kommen. ";
        String tagEinerstelle_9 = "sind Sie besonders aktiv. ";

        switch (day) {
                case 0 -> {
                    return tagZehnerstelle_0;
                }
                case 1 -> {
                    return tagZehnerstelle_1;
                }
                case 2 -> {
                    return tagZehnerstelle_2;
                }
                case 3 -> {
                    return tagZehnerstelle_3;
                }

        }
            return "Eingabe nicht gültig";


     /*   switch (day) {
            case 0 -> {
                return tagEinerstelle_0;
            }
            case 1 -> {
                return tagEinerstelle_1;
            }
            case 2 -> {
                return tagEinerstelle_2;
            }
            case 3 -> {
                return tagEinerstelle_3;
            }
            case 4 -> {
                return tagEinerstelle_4;
            }
            case 5 -> {
                return tagEinerstelle_5;
            }
            case 6 -> {
                return tagEinerstelle_6;
            }
            case 7 -> {
                return tagEinerstelle_7;
            }
            case 8 -> {
                return tagEinerstelle_8;
            }
            case 9 -> {
                return tagEinerstelle_9;
            }

        }
        return "Eingabe nicht gültig";
*/

       /* String tagZehnerstelle_0 = "In der Familie ";
        String tagZehnerstelle_1 = "In der Partnerschaft ";
        String tagZehnerstelle_2 = "Im Berufsleben ";
        String tagZehnerstelle_3 = "In der Liebe ";

        String tagEinerstelle_0 = "fehlt Ihnen die Ausdauer. ";
        String tagEinerstelle_1 = "kündigen sich Veränderungen an. ";
        String tagEinerstelle_2 = "lassen Erfolge auf sich warten. ";
        String tagEinerstelle_3 = "neigen Sie zur Bequemlichkeit. ";
        String tagEinerstelle_4 = "müssen Sie mit unangenehmen Überraschungen rechnen. ";
        String tagEinerstelle_5 = "sind Sie besonders kreativ. ";
        String tagEinerstelle_6 = "befinden Sie sich in einer produktiven Phase. ";
        String tagEinerstelle_7 = "eilen Sie von Erfolg zu Erfolg. ";
        String tagEinerstelle_8 = "kann es zu einer Auseinandersetzung kommen. ";
        String tagEinerstelle_9 = "sind Sie besonders aktiv. ";


        String monat_1 = "Machen Sie weiter so!";
        String monat_2 = "Lassen Sie sich nicht beeinflussen!";
        String monat_3 = "Hören Sie auf den Rat eines Freundes!";
        String monat_4 = "Werden Sie nicht übermütig!";
        String monat_5 = "Seien Sie weniger kritisch!";
        String monat_6 = "Ab und zu eine Pause einlegen!";
        String monat_7 = "Suchen Sie eine Aussprache!";
        String monat_8 = "Denken Sie nicht nur an sich!";
        String monat_9 = "Nicht immer nur an andere denken!";
        String monat_10 = "Achten Sie auf Ihre Gesundheit!";
        String monat_11 = "Geldausgaben verschieben!";
        String monat_12 = "Idealer Zeitpunkt für einen Neuanfang!";

            switch (day) {
                case 1:
                    if (month == 1)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_1;
                    if (month == 2)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_2;
                    if (month == 3)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_3;
                    if (month == 4)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_4;
                    if (month == 5)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_5;
                    if (month == 6)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_6;
                    if (month == 7)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_7;
                    if (month == 8)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_8;
                    if (month == 9)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_9;
                    if (month == 10)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_10;
                    if (month == 11)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_11;
                    if (month == 12)
                        return tagZehnerstelle_0 + tagEinerstelle_1 + monat_12;

                    break;

                case 2:
                    if (month == 1)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_1;
                    if (month == 2)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_2;
                    if (month == 3)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_3;
                    if (month == 4)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_4;
                    if (month == 5)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_5;
                    if (month == 6)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_6;
                    if (month == 7)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_7;
                    if (month == 8)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_8;
                    if (month == 9)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_9;
                    if (month == 10)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_10;
                    if (month == 11)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_11;
                    if (month == 12)
                        return tagZehnerstelle_0 + tagEinerstelle_2 + monat_12;

                    break;

                case 3:
                    if (month == 1)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_1;
                    if (month == 2)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_2;
                    if (month == 3)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_3;
                    if (month == 4)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_4;
                    if (month == 5)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_5;
                    if (month == 6)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_6;
                    if (month == 7)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_7;
                    if (month == 8)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_8;
                    if (month == 9)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_9;
                    if (month == 10)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_10;
                    if (month == 11)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_11;
                    if (month == 12)
                        return tagZehnerstelle_0 + tagEinerstelle_3 + monat_12;

                    break;

                default:
                    return "Eingabe nicht gültig";
            }
        return "Eingabe nicht gültig";
    } */

    }

}