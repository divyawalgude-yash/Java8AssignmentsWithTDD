package com.java8.assignment2;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SingleTonClassTest {

	SingleTonClass instance1;
	SingleTonClass instance2;

	@Test
	public void shouldCheckSingleTonClassObject() throws FileNotFoundException, IOException, ClassNotFoundException {
		SingleTonClass obj1 = SingleTonClass.getInstance();
		SingleTonClass obj2 = SingleTonClass.getInstance();
		assertEquals(obj1.hashCode(), obj2.hashCode());

	}

	@Test
	public void shouldCheckSerializationSingleTonClassObject()
			throws FileNotFoundException, IOException, ClassNotFoundException {
		SingleTonClass obj1 = SingleTonClass.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(obj1);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
		SingleTonClass obj2 = (SingleTonClass) in.readObject();
		in.close();

		assertEquals(obj1.hashCode(), obj2.hashCode());

	}

	@Test
	public void shouldCheckThreadSafeSingleTonClassObject() throws InterruptedException {

		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				instance1 = SingleTonClass.getInstance();
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				instance2 = SingleTonClass.getInstance();

			}
		});
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println("instance1 " + instance1.hashCode());
		System.out.println("instance2 " + instance2.hashCode());
		assertEquals(instance1.hashCode(), instance2.hashCode());

	}

}
