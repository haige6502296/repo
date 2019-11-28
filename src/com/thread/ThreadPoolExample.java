/*
Use:Threed pool
Author:Amaru
Time:2019-11-27 18:34:58
Detail:
*/

package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolExample {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(6);//creating a pool of 5 threads
    for (int i = 0; i < 10; i++) {
      Runnable worker = new WorkerThread("" + i);
      executorService.execute(worker);//calling execute method of ExecutorService
    }
    executorService.shutdown();
    while (!executorService.isTerminated()) {  }//Returns true if all tasks have completed following shut down. Note that isTerminated is never true unless either shutdown or shutdownNow was called first.

    System.out.println("Finished all threads");
  }
}