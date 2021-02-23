package emergon;

import emergon.observer.Student;
import emergon.subject.TeamChannel;

/** @author user */
public class MainClass {

    public static void main(String[] args) {
        TeamChannel channel = new TeamChannel("Java");
        
        Student s1 = new Student("Jack");
        Student s2 = new Student("Andy");
        Student s3 = new Student("Maria");
        s1.subscribe(channel);
        s2.subscribe(channel);
        s3.subscribe(channel);
        
        channel.printObservers();
        
        channel.changeTitle("Java Advanced");
        
    }
}
