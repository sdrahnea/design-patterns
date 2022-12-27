package edu.sdr.designpatterns.behavioral.iterator;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
