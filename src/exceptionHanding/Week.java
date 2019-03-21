package exceptionHanding;

enum  Week {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    String weekName;

    Week(String weekName) {
        this.weekName = weekName;
    }

    public String getWeekName() {
        return weekName;
    }
    //定义一个静态方法，根据一个简称得到完整的星期名称
    public static Week getResult(String week){
        switch (week){
            case "mon":
                return Week.MONDAY;
            case "tue":
                return Week.TUESDAY;
            case "wed":
                return Week.WEDNESDAY;
            case "thu":
                return Week.THURSDAY;
            case "fri":
                return Week.FRIDAY;
            case "sat":
                return Week.SATURDAY;
            case "sun":
                return Week.SUNDAY;
            default:
                return Week.MONDAY;
        }
    }
}
