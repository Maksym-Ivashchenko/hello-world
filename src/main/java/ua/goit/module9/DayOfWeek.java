package ua.goit.module9;

public enum DayOfWeek {
    SUNDAY("Sunday", 1){
        @Override
        public String workDayOrNot() {
            return "Выходной";
        }
    },
    MONDAY("Monday", 2) {
        @Override
        public String workDayOrNot() {
            return "Рабочий день";
        }
    },
    TUESDAY("Tuesday",3) {
        @Override
        public String workDayOrNot() {
            return "Рабочий день";
        }
    },
    WEDNESDAY("Wednesday", 4) {
        @Override
        public String workDayOrNot() {
            return "Рабочий день";
        }
    },
    THURSDAY("Thursday", 5) {
        @Override
        public String workDayOrNot() {
            return "Рабочий день";
        }
    },
    FRIDAY("Friday", 6) {
        @Override
        public String workDayOrNot() {
            return "Рабочий день";
        }
    },
    SATURDAY("Saturday", 7) {
        @Override
        public String workDayOrNot() {
            return "Выходной";
        }
    };

    private String dayOfWeek;
    private Integer dayIdentifier;

    DayOfWeek(String dayOfWeek, Integer dayIdentifier) {
        this.dayOfWeek = dayOfWeek;
        this.dayIdentifier = dayIdentifier;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public Integer getDayIdentifier() {
        return dayIdentifier;
    }
    public abstract String workDayOrNot();
}
