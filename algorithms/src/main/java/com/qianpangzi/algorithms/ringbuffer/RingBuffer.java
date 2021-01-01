package com.qianpangzi.algorithms.ringbuffer;

/**
 * 
 * @author qianpangzi  03/10/2020
 * 
 * @param <T>
 */
public interface RingBuffer<T> {

	/**
	 * 对ring buffer 加入原色
	 * @param element
	 * @return
	 */
	public boolean offer(T element);
	public T poll();
	public int capacity();
	public int size();
	
}
