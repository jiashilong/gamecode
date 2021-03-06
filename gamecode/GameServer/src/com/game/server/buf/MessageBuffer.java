package com.game.server.buf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBufferFactory;
import org.jboss.netty.buffer.ChannelBufferIndexFinder;

public class MessageBuffer {

	private ChannelBuffer buf;
	
	public MessageBuffer(ChannelBuffer buf) {
		this.buf = buf;
	}
	
	public ChannelBuffer getBuf() {
		return buf;
	}
	
	public ChannelBufferFactory factory() {
		return buf.factory();
	}

	public int capacity() {
		return buf.capacity();
	}

	public ByteOrder order() {
		return buf.order();
	}

	public boolean isDirect() {
		return buf.isDirect();
	}

	public int readerIndex() {
		return buf.readerIndex();
	}

	public void readerIndex(int readerIndex) {
		buf.readerIndex(readerIndex);
	}

	public int writerIndex() {
		return buf.writerIndex();
	}

	public void writerIndex(int writerIndex) {
		buf.writerIndex(writerIndex);
	}

	public void setIndex(int readerIndex, int writerIndex) {
		buf.setIndex(readerIndex, writerIndex);	
	}

	public int readableBytes() {
		return buf.readableBytes();
	}

	public int writableBytes() {
		return buf.writableBytes();
	}

	public boolean readable() {
		return buf.readable();
	}

	public boolean writable() {
		return buf.writable();
	}

	public void clear() {
		buf.clear();
	}

	public void markReaderIndex() {
		buf.markReaderIndex();
	}

	public void resetReaderIndex() {
		buf.resetReaderIndex();
	}

	public void markWriterIndex() {
		buf.markWriterIndex();
	}

	public void resetWriterIndex() {
		buf.resetWriterIndex();
	}

	public void discardReadBytes() {
		buf.discardReadBytes();
	}

	public void ensureWritableBytes(int writableBytes) {
		buf.ensureWritableBytes(writableBytes);
	}

	public byte getByte(int index) {
		return buf.getByte(index);
	}

	public short getUnsignedByte(int index) {
		return buf.getUnsignedByte(index);
	}

	public short getShort(int index) {
		return buf.getShort(index);
	}

	public int getUnsignedShort(int index) {
		return buf.getUnsignedShort(index);
	}

	public int getMedium(int index) {
		return buf.getMedium(index);
	}

	public int getUnsignedMedium(int index) {
		return buf.getUnsignedMedium(index);
	}

	public int getInt(int index) {
		return buf.getInt(index);
	}

	public long getUnsignedInt(int index) {
		return buf.getUnsignedInt(index);
	}

	public long getLong(int index) {
		return buf.getLong(index);
	}

	public char getChar(int index) {
		return buf.getChar(index);
	}

	public float getFloat(int index) {
		return buf.getFloat(index);
	}

	public double getDouble(int index) {
		return buf.getDouble(index);
	}

	public void getBytes(int index, ChannelBuffer dst) {
		buf.getBytes(index, dst);
	}

	public void getBytes(int index, ChannelBuffer dst, int length) {
		buf.getBytes(index, dst, length);
	}

	public void getBytes(int index, ChannelBuffer dst, int dstIndex, int length) {
		buf.getBytes(index, dst, dstIndex, length);
	}

	public void getBytes(int index, byte[] dst) {
		buf.getBytes(index, dst);
	}

	public void getBytes(int index, byte[] dst, int dstIndex, int length) {
		buf.getBytes(index, dst, dstIndex, length);
	}

	public void getBytes(int index, ByteBuffer dst) {
		buf.getBytes(index, dst);
	}

	public void getBytes(int index, OutputStream out, int length)
			throws IOException {
		buf.getBytes(index, out, length);
	}

	public int getBytes(int index, GatheringByteChannel out, int length)
			throws IOException {
		return buf.getBytes(index, out, length);
	}

	public void setByte(int index, int value) {
		buf.setByte(index, value);
	}

	public void setShort(int index, int value) {
		buf.setShort(index, value);
	}

	public void setMedium(int index, int value) {
		buf.setMedium(index, value);
	}

	public void setInt(int index, int value) {
		buf.setInt(index, value);
	}

	public void setLong(int index, long value) {
		buf.setLong(index, value);
	}

	public void setChar(int index, int value) {
		buf.setChar(index, value);
	}

	public void setFloat(int index, float value) {
		buf.setFloat(index, value);
	}

	public void setDouble(int index, double value) {
		buf.setDouble(index, value);
	}

	public void setBytes(int index, ChannelBuffer src) {
		buf.setBytes(index, src);
	}

	public void setBytes(int index, ChannelBuffer src, int length) {
		buf.setBytes(index, src, length);
	}

	public void setBytes(int index, ChannelBuffer src, int srcIndex, int length) {
		buf.setBytes(index, src, srcIndex, length);
	}

	public void setBytes(int index, byte[] src) {
		buf.setBytes(index, src);
	}

	public void setBytes(int index, byte[] src, int srcIndex, int length) {
		buf.setBytes(index, src, srcIndex, length);
	}

	public void setBytes(int index, ByteBuffer src) {
		buf.setBytes(index, src);
	}

	public int setBytes(int index, InputStream in, int length)
			throws IOException {
		return buf.setBytes(index, in, length);
	}

	public int setBytes(int index, ScatteringByteChannel in, int length)
			throws IOException {
		return buf.setBytes(index, in, length);
	}

	public void setZero(int index, int length) {
		buf.setZero(index, length);
	}

	public byte readByte() {
		return buf.readByte();
	}

	public short readUnsignedByte() {
		return buf.readUnsignedByte();
	}

	public short readShort() {
		return buf.readShort();
	}

	public int readUnsignedShort() {
		return buf.readUnsignedShort();
	}

	public int readMedium() {
		return buf.readMedium();
	}

	public int readUnsignedMedium() {
		return buf.readUnsignedMedium();
	}

	public int readInt() {
		return buf.readInt();
	}

	public long readUnsignedInt() {
		return buf.readUnsignedInt();
	}

	public long readLong() {
		return buf.readLong();
	}

	public char readChar() {
		return buf.readChar();
	}

	public float readFloat() {
		return buf.readFloat();
	}

	public double readDouble() {
		return buf.readDouble();
	}

	public ChannelBuffer readBytes(int length) {
		return buf.readBytes(length);
	}

	@SuppressWarnings("deprecation")
	public ChannelBuffer readBytes(ChannelBufferIndexFinder indexFinder) {
		return buf.readBytes(indexFinder);
	}

	public ChannelBuffer readSlice(int length) {
		return buf.readSlice(length);
	}

	@SuppressWarnings("deprecation")
	public ChannelBuffer readSlice(ChannelBufferIndexFinder indexFinder) {
		return buf.readSlice(indexFinder);
	}

	public void readBytes(ChannelBuffer dst) {
		buf.readBytes(dst);
	}

	public void readBytes(ChannelBuffer dst, int length) {
		buf.readBytes(dst, length);
	}

	public void readBytes(ChannelBuffer dst, int dstIndex, int length) {
		buf.readBytes(dst, dstIndex, length);
	}

	public void readBytes(byte[] dst) {
		buf.readBytes(dst);
	}

	public void readBytes(byte[] dst, int dstIndex, int length) {
		buf.readBytes(dst, dstIndex, length);
	}

	public void readBytes(ByteBuffer dst) {
		buf.readBytes(dst);
	}

	public void readBytes(OutputStream out, int length) throws IOException {
		buf.readBytes(out, length);
	}

	public int readBytes(GatheringByteChannel out, int length)
			throws IOException {
		return buf.readBytes(out, length);
	}

	public void skipBytes(int length) {
		buf.skipBytes(length);
	}

	@SuppressWarnings("deprecation")
	public int skipBytes(ChannelBufferIndexFinder indexFinder) {
		return buf.skipBytes(indexFinder);
	}

	public void writeByte(int value) {
		buf.writeByte(value);
	}

	public void writeShort(int value) {
		buf.writeShort(value);
	}

	public void writeMedium(int value) {
		buf.writeMedium(value);
	}

	public void writeInt(int value) {
		buf.writeInt(value);
	}

	public void writeLong(long value) {
		buf.writeLong(value);
	}

	public void writeChar(int value) {
		buf.writeChar(value);
	}

	public void writeFloat(float value) {
		buf.writeFloat(value);
	}

	public void writeDouble(double value) {
		buf.writeDouble(value);
	}

	public void writeBytes(ChannelBuffer src) {
		buf.writeBytes(src);
	}

	public void writeBytes(ChannelBuffer src, int length) {
		buf.writeBytes(src, length);
	}

	public void writeBytes(ChannelBuffer src, int srcIndex, int length) {
		buf.writeBytes(src, srcIndex, length);
	}

	public void writeBytes(byte[] src) {
		buf.writeBytes(src);
	}

	public void writeBytes(byte[] src, int srcIndex, int length) {
		buf.writeBytes(src, srcIndex, length);
	}

	public void writeBytes(ByteBuffer src) {
		buf.writeBytes(src);
	}

	public int writeBytes(InputStream in, int length) throws IOException {
		return buf.writeBytes(in, length);
	}

	public int writeBytes(ScatteringByteChannel in, int length)
			throws IOException {
		return buf.writeBytes(in, length);
	}

	public void writeZero(int length) {
		buf.writeZero(length);
	}

	public int indexOf(int fromIndex, int toIndex, byte value) {
		return buf.indexOf(fromIndex, toIndex, value);
	}

	public int indexOf(int fromIndex, int toIndex,
			ChannelBufferIndexFinder indexFinder) {
		return buf.indexOf(fromIndex, toIndex, indexFinder);
	}

	public int bytesBefore(byte value) {
		return buf.bytesBefore(value);
	}

	public int bytesBefore(ChannelBufferIndexFinder indexFinder) {
		return buf.bytesBefore(indexFinder);
	}

	public int bytesBefore(int length, byte value) {
		return buf.bytesBefore(length, value);
	}

	public int bytesBefore(int length, ChannelBufferIndexFinder indexFinder) {
		return buf.bytesBefore(length, indexFinder);
	}

	public int bytesBefore(int index, int length, byte value) {
		return buf.bytesBefore(index, length, value);
	}

	public int bytesBefore(int index, int length,
			ChannelBufferIndexFinder indexFinder) {
		return buf.bytesBefore(index, length, indexFinder);
	}

	public ChannelBuffer copy() {
		return buf.copy();
	}

	public ChannelBuffer copy(int index, int length) {
		return buf.copy(index, length);
	}

	public ChannelBuffer slice() {
		return buf.slice();
	}

	public ChannelBuffer slice(int index, int length) {
		return buf.slice(index, length);
	}

	public ChannelBuffer duplicate() {
		return buf.duplicate();
	}

	public ByteBuffer toByteBuffer() {
		return buf.toByteBuffer();
	}

	public ByteBuffer toByteBuffer(int index, int length) {
		return buf.toByteBuffer(index, length);
	}

	public ByteBuffer[] toByteBuffers() {
		return buf.toByteBuffers();
	}

	public ByteBuffer[] toByteBuffers(int index, int length) {
		return buf.toByteBuffers(index, length);
	}

	public boolean hasArray() {
		return buf.hasArray();
	}

	public byte[] array() {
		return buf.array();
	}

	public int arrayOffset() {
		return buf.arrayOffset();
	}

	public String toString(Charset charset) {
		return buf.toString(charset);
	}

	public String toString(int index, int length, Charset charset) {
		return buf.toString(index, length, charset);
	}

	@SuppressWarnings("deprecation")
	public String toString(String charsetName) {
		return buf.toString(charsetName);
	}

	@SuppressWarnings("deprecation")
	public String toString(String charsetName,
			ChannelBufferIndexFinder terminatorFinder) {
		return buf.toString(charsetName, terminatorFinder);
	}

	@SuppressWarnings("deprecation")
	public String toString(int index, int length, String charsetName) {
		return buf.toString(index, length, charsetName);
	}

	public String toString(int index, int length, String charsetName,
			ChannelBufferIndexFinder terminatorFinder) {
		return toString(index, length, charsetName, terminatorFinder);
	}

	public int compareTo(ChannelBuffer buffer) {
		return buf.compareTo(buffer);
	}
	
	/*
	 * read a string with length
	 * */
	public String readShortString() {
		short len = buf.readShort();
		byte[] bytes = new byte[len];
		buf.readBytes(bytes);
		return new String(bytes);
	}
	
	public String readString() {
		int len = buf.readInt();
		byte[] bytes = new byte[len];
		buf.readBytes(bytes);
		return new String(bytes);
	}
	
	public void writeShortString(String str) {
		buf.writeShort(str.getBytes().length);
		buf.writeBytes(str.getBytes());
	}
	
	public void writeString(String str) {
		buf.writeInt(str.getBytes().length);
		buf.writeBytes(str.getBytes());
	}

}
