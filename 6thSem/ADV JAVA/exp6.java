// 6: consumer producer problem with using multi threading runnable interface.

import java.util.LinkedList;

class Buffer {
  private LinkedList<Integer> buffer = new LinkedList<>();
  private int capacity;

  public Buffer(int capacity) {
    this.capacity = capacity;
  }

  public synchronized void produce(int item) throws InterruptedException {
    while (buffer.size() == capacity) {
      wait();
    }

    buffer.add(item);
    System.out.println("Produced: " + item);
    notifyAll();
  }

  public synchronized int consume() throws InterruptedException {
    while (buffer.isEmpty()) {
      wait();
    }

    int item = buffer.removeFirst();
    System.out.println("Consumed: " + item);
    notifyAll();

    return item;
  }
}

class Producer implements Runnable {
  private Buffer buffer;

  public Producer(Buffer buffer) {
    this.buffer = buffer;
  }

  @Override
  public void run() {
    try {
      for (int i = 1; i <= 10; i++) {
        buffer.produce(i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class Consumer implements Runnable {
  private Buffer buffer;

  public Consumer(Buffer buffer) {
    this.buffer = buffer;
  }

  @Override
  public void run() {
    try {
      for (int i = 1; i <= 10; i++) {
        buffer.consume();
        Thread.sleep(2000);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

public class exp6 {
  public static void main(String[] args) {
    Buffer buffer = new Buffer(5);

    Thread producerThread = new Thread(new Producer(buffer));
    Thread consumerThread = new Thread(new Consumer(buffer));

    producerThread.start();
    consumerThread.start();
  }
}