package ua.goit.module9;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class EnumDemo {

    public static void main(String[] args) {
        workDayOrNot(DayOfWeek.MONDAY);
        DayOfWeek[] values = DayOfWeek.values();
        System.out.println(Arrays.toString(values));
        DayOfWeek friday = DayOfWeek.valueOf("FRIDAY");
        System.out.println(friday);
        String name = friday.name();
        String dayOfWeek = friday.getDayOfWeek();
        Integer dayIdentifier = friday.getDayIdentifier();
        System.out.println("Name: " + name + "\n" + "Day of week: " + dayOfWeek+ "\n"
                + "Day identifier: " + dayIdentifier);

        String workDayOrNot = DayOfWeek.MONDAY.workDayOrNot();
        System.out.println(workDayOrNot);

        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.allOf(DayOfWeek.class);
        System.out.println(dayOfWeeks);

        EnumMap<DayOfWeek, List<String>> dayPlans = new EnumMap<>(DayOfWeek.class);
        dayPlans.put(DayOfWeek.MONDAY, Arrays.asList("Сходить к врачу", "Убрать в комнате."));
        System.out.println(dayPlans);
    }

    public static void workDayOrNot(DayOfWeek day) {
        switch (day){
            case SUNDAY:
            case SATURDAY:
                System.out.println("Not work day");
                break;
            case MONDAY :
            case TUESDAY :
            case WEDNESDAY :
            case THURSDAY :
            case FRIDAY :
                System.out.println("Work day");
                break;
            default:
                System.out.println("Wrong day, please specify correct one!");
        }

    }
}
