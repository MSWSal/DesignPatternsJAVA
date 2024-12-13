import java.util.List;

public class observerP {
    public interface Observer {
        void update();      
    }

    public interface Subject {
        void addObserver(Observer observer);
        void removeObserver(Observer observer);
        void notifyObserver();  
    }

    public class WeatherStation implements Subject {
        private List<Observer> observers;
        private String weather;

        @Override
        public void addObserver(observerP.Observer observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(observerP.Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObserver() {
            for(Observer obs : observers){
                obs.update(weather);
            }
        }

        void setWeather(String weather){
            this.weather=weather;
            notifyObserver();
        }   
    }

    public class InnerobserverP {
    
        
    }
    
}
