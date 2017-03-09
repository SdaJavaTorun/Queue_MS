package com.sdajava.queue;

/**
 * Created by RENT on 2017-03-09.
 */
public class QueueElements {
    private QueueImpl first;
    private QueueImpl last;

    public QueueElements(){
        first = last = null;
    }

    public QueueImpl getFirst() {return first;}
    public void setFirst(QueueImpl first) {this.first = first;}
    public QueueImpl getLast() {return last;}
    public void setLast(QueueImpl last) {this.last = last;}

    public void addElement(String value){
        QueueImpl queue = new QueueImpl(value);
        if (first == null){
            first = last = queue;
        } else{
            last.setNext(queue);
            last = queue;
        }
    }
    public void showElements(){
        if (first != null){
            QueueImpl element = first;
            while (element != null){
                System.out.println(element.getValue());
                element = element.getNext();
            }
        }
    }
}
