package com.atguigu.springmvc.test;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("��Ҫһ������");
		
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�������ˣ� " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + "����������Ӿ������󣬽̻�ص�����Ӿ��");
	}
	
	

}
