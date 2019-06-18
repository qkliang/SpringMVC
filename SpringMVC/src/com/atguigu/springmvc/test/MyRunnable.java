package com.atguigu.springmvc.test;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("我要一个教练");
		
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("教练来了： " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + "教练教我游泳，教完后，教会回到了游泳池");
	}
	
	

}
