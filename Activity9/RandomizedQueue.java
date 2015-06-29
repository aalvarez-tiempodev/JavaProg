/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity9;
import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
        
        private Item[] queue;
        private int size;
        
        private class RandomizedQueueIterator implements Iterator<Item> {

                private Item[] queueCopy;
                private int iteratorIndex = 0;
                
                public RandomizedQueueIterator() {
                        queueCopy = (Item[]) new Object[size];
                        
                        for (int i = 0; i < size; i++)
                                queueCopy[i] = queue[i];

                        for (int x = 1; x < size; x++) {
                                int swapIndex = StdRandom.uniform(x);
                                
                                Item temp = queueCopy[x];
                                queueCopy[x] = queueCopy[swapIndex];
                                queueCopy[swapIndex] = temp;
                        }
                }
                
                public boolean hasNext() {
                        return iteratorIndex < size;
                }

                public Item next() {
                        if (iteratorIndex == size)
                                throw new java.util.NoSuchElementException();
                        
                        return queueCopy[iteratorIndex++];
                }

                public void remove() {
                        throw new java.lang.UnsupportedOperationException();
                }
        }
        
        public RandomizedQueue() {           // construct an empty randomized queue
                size = 0;
                queue =  (Item[]) new Object[10];
        }
        
        public boolean isEmpty() {           // is the queue empty?
                return size == 0;
        }
        
        public int size() {                  // return the number of items on the queue
                return size;
        }
        
        public void enqueue(Item item) {    // add the item
                if (item == null)
                        throw new java.lang.NullPointerException();
                
                if (size == queue.length)
                        resize(2 * queue.length);

                
                queue[size] = item;
                size++;
        }
        
        private void resize(int newLength) {
                Item[] newQueue = (Item[]) new Object[newLength];
                
                for (int i = 0; i < size; i++)
                        newQueue[i] = queue[i];
                
                queue = newQueue;
        }
        
        public Item dequeue() {             // delete and return a random item
                if (size == 0)
                        throw new java.util.NoSuchElementException();
                
                if (size <= queue.length/4 && queue.length > 10)
                        resize(queue.length/2);
                
                int removeIndex = StdRandom.uniform(size);
                
                Item returnItem = queue[removeIndex];
                queue[removeIndex] = queue[--size];
                queue[size] = null;
                
                return returnItem;
        }
        
        public Item sample() {               // return (but do not delete) a random item
                if (size == 0)
                        throw new java.util.NoSuchElementException();
                
                return queue[StdRandom.uniform(size)];
        }
        
        public Iterator<Item> iterator() {   // return an independent iterator over items in random order
                return new RandomizedQueueIterator();
        }

        public static void main(String[] args) {
                RandomizedQueue<Integer> randomQueue = new RandomizedQueue<Integer>();
                
                randomQueue.enqueue(Integer.valueOf(1));
                randomQueue.enqueue(Integer.valueOf(2));
                randomQueue.enqueue(Integer.valueOf(3));
                randomQueue.enqueue(Integer.valueOf(4));
                randomQueue.enqueue(Integer.valueOf(5));
                randomQueue.enqueue(Integer.valueOf(6));
                randomQueue.enqueue(Integer.valueOf(7));
                randomQueue.enqueue(Integer.valueOf(8));
                randomQueue.enqueue(Integer.valueOf(9));
                randomQueue.enqueue(Integer.valueOf(10));
                randomQueue.enqueue(Integer.valueOf(11));

                
                for (Integer x: randomQueue) {
                        StdOut.println(x);
                }
                
        }
}