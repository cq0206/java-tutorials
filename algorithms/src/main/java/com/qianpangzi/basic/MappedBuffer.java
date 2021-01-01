package com.qianpangzi.basic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 
 * @author chengqian 
 * 内存映射是一种读和写文件数据的方法，现在很多中间件都是利用这种方式去和磁盘交互
 * 
 * 
 */
public class MappedBuffer {
	
	private static final int start =0;
	private static final int size=1024;

	public static void main(String[] args) {
		try {
			
			
			RandomAccessFile rafAccessFile= new RandomAccessFile("/data/test/dd.txt","rw");
			FileChannel fileChannel = rafAccessFile.getChannel();
			
			try {
				MappedByteBuffer mappedByteBuffer= fileChannel.map(FileChannel.MapMode.READ_WRITE, start, size);
				
				mappedByteBuffer.put(0,(byte)97);
				mappedByteBuffer.put(1023,(byte)122);
				
				rafAccessFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
