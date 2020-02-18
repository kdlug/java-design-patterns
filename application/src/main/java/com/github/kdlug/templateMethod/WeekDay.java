package com.github.kdlug.templateMethod;

public abstract class WeekDay {
    public final void start(TypeOfTransport transport) {
        int time = 0;
        wakeUp();
        eatBreakfast();
        time += goToWork(transport);
        work();
        time += goHome(transport);
        totalTime(time);
    }

    private void totalTime(int time) {
        System.out.println(time);
    }

    protected abstract int goHome(TypeOfTransport transport);

    protected abstract int goToWork(TypeOfTransport transport);

    private void wakeUp() {
        System.out.println("Wake up");
    }

    private void work() {
        System.out.println("Working");
    }

    private void eatBreakfast() {
        System.out.println("Eating breakfast");
    }
}
