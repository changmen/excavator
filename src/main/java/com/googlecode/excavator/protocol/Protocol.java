package com.googlecode.excavator.protocol;

/**
 * 网络通讯协议
 * 
 * @author vlinux
 * 
 */
public final class Protocol {

	/**
	 * 协议魔数
	 */
	public static final short MAGIC = 0x0c9f;

	/**
	 * 协议类型:rmi通讯
	 */
	public static byte TYPE_RMI = 0x01;

	/**
	 * 协议类型:心跳
	 */
	public static byte TYPE_HEARTBEAT = 0x02;

	private byte type;		//类型
	private int length;		//数据段长度
	private byte[] datas;	//数据段

	public byte getType() {
		return type;
	}

	public void setType(byte type) {
		this.type = type;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public byte[] getDatas() {
		return datas;
	}

	public void setDatas(byte[] datas) {
		this.datas = datas;
	}

}
