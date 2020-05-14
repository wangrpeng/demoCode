package com.example.multiThread;

import java.util.LinkedList;

/**
 * @author SimonWang
 * @Description 使用Concurrent集合
 *
 * @create 2020-05-14 14:45
 */
public class ConcurrentDemo {

    /*
    interface	        non-thread-safe	            thread-safe
       List	                ArrayList	        CopyOnWriteArrayList
       Map	                HashMap	            ConcurrentHashMap
       Set	            HashSet / TreeSet	    CopyOnWriteArraySet
       Queue	    ArrayDeque / LinkedList	    ArrayBlockingQueue / LinkedBlockingQueue
       Deque	    ArrayDeque / LinkedList	    LinkedBlockingDeque
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
    }

}
