/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.pa.patterns.memento.model;

import java.util.*;

public class Caretaker {

    private Memento memento;

    private final List<Memento> mementos;
    private Originator originator;

    public Caretaker(Originator originator){
        this.originator = originator;
        this.mementos = new ArrayList<>();
    }

    public void saveState(){
        //this.memento = originator.createMemento();
        mementos.add(originator.createMemento());
    }

    public void restoreState() throws NoMementoException {
        if (mementos.isEmpty()) {
            throw new NoMementoException("No Memento saved.");
        }
        Memento lastMemento = mementos.remove(mementos.size() - 1);
        originator.setMemento(lastMemento);
    }

}
