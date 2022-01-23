public class Main {
    public static void main(String[] args) {

        int eaters = 3; // сколько людей будут есть

        int water = 2007; // миллилитров воды
        int potatoes = 4; // картофелин
        int chicken = 3; // куриных бёдер
        int spices = 5; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((water / eaters) + " миллилитров воды");
        System.out.println((potatoes / eaters) + " картофелин(а)");
        System.out.println((chicken / eaters) + " куриных(ое) бёдер(ро)");
        System.out.println((spices / eaters) + " ложек(ка) специй");

    }
}