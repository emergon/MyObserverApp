package emergon.observer;

import emergon.subject.TeamChannel;


public class Student extends Observer {

    public Student(String name) {
        super(name);
    }

    public void subscribe(TeamChannel channel) {
        this.channel = channel;
        channel.attach(this);
    }
    
    @Override
    public void inform(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + getName() + '}';
    }
    
    
}
