package emergon.observer;

import emergon.subject.TeamChannel;

public abstract class Observer {
    
    private String name;
    protected TeamChannel channel;
    
    public Observer(String name){
        this.name = name;
    }
    
    public abstract void inform(String message);
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
