package pt.pa.patterns.memento.model;

public interface Originator {

    public Memento createMemento();

    public void setMemento(Memento savedState);
}
