package emergon.subject;

import emergon.observer.Observer;
import emergon.observer.Student;
import java.util.ArrayList;
import java.util.List;

public class TeamChannel {

    private List<Observer> observers;
    private String title;//this is the state that will change

    public TeamChannel(String title) {
        this.title = title;
        observers = new ArrayList();
    }
    
    public String getTitle() {
        return title;
    }

    public void changeTitle(String title) {
        String message = this.title + " channel changed to " + title;
        this.title = title;
        notifyAllObservers(message);
    }
    
    public void attach(Observer observer){
        observers.add(observer);
        String message = observer.getName() + ", you are now subscribed to my channel "+ this.title;
        notifyObserver(observer, message);
    }
    
    public void printObservers(){
        System.out.println(title + " channel has the following observers:");
        for(Observer o: observers){
            System.out.println(o);
        }
    }
    
    private void notifyAllObservers(String message){
        for(Observer o: observers){
            o.inform(o.getName() +" "+message);
        }
    }
    
    private void notifyObserver(Observer observer, String message){
        observer.inform(message);
    }
    
    
}
