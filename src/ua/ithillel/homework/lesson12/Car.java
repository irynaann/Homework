package ua.ithillel.homework.lesson12;

public class Car {
    public Car() {
    }

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("The car is ready to go");
    }

    public void stop() {
        stopElectricity();
        stopCommand();
        stopFuelSystem();
        System.out.println("The car is stopped");
    }

    private void startElectricity() {
    }

    private void startCommand() {
    }

    private void startFuelSystem() {
    }

    private void stopElectricity() {
    }

    private void stopCommand() {
    }

    private void stopFuelSystem() {
    }
}