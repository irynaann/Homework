package ua.ithillel.homework.lesson15;

public class DayAdvise implements Advise {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Plan ahead: Create a to-do list");
                break;
            case TUESDAY:
                System.out.println("Stay physically active");
                break;
            case WEDNESDAY:
                System.out.println("Avoid multitasking");
                break;
            case THURSDAY:
                System.out.println("Use the Pomodoro technique");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Discover new places");
                break;
            case SUNDAY:
                System.out.println("Engage in activities");
                break;
        }
    }

    public static void main(String[] args) {
        Advise tip = new DayAdvise();
        tip.advise(Day.TUESDAY);
    }
}