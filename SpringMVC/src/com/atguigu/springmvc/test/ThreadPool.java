package com.atguigu.springmvc.test;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
//		new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		MyRunnable myrun = new MyRunnable();
		threadPool.submit(myrun);
		threadPool.submit(myrun);
		threadPool.shutdown();
	}
}
