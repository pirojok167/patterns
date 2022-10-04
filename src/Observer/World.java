package Observer;

import java.util.ArrayList;

public class World implements Subject {
    private final ArrayList<Observer> observers;
    private Season currentSeason;

    public World() {
        observers = new ArrayList<>();
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

    public void seasonChanged() {
        this.notifyObservers();
    }

    public void setCurrentSeason(Season season) {
        currentSeason = season;
        this.seasonChanged();
    }
}
