package org.example.Observer;

public class ConcreteObserver implements IObserver {
    private String userName;
    private ISubject subject;

    //1. Allow to hold the observer's name (e.g. when user Adam wants to observe the subject)
    //2. Creating the Observer
    public ConcreteObserver(String userName) {
        this.userName = userName;
    }
    public ConcreteObserver(String userName, ISubject subject){
        this.userName = userName;
        this.subject = subject;
        subject.registerObserver(this);
    }

    //3. Registering the Observer with the Subject
    public void register(ISubject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    //4. Removing the Observer from the Subject
    public void remove(){
        if (subject != null){
            subject.removeObserver(this);
            this.subject = null;
        }
    }
    public String getUserName() {
        return userName;
    }

    //5. Observer will get a notification from the Subject using the following Method
    @Override
    public void update(String availability) {
        System.out.println("Hello, " + userName + "! The product is now " + availability + ".");
    }
}