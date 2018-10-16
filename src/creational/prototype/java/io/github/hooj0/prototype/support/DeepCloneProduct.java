package io.github.hooj0.prototype.support;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * deep clone prototype product support class
 * 深度复制原型模式实现
 * @author hoojo
 * @createDate 2018年10月16日 下午10:56:48
 * @file DeepCloneProduct.java
 * @package io.github.hooj0.prototype.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class DeepCloneProduct implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 1875047960400866064L;

	private long id;
	private String name;
	private SerializableObject obj;
	
	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeepCloneProduct(String name) {
		this.name = name;
	}
	
	@Override
	public DeepCloneProduct clone() throws CloneNotSupportedException {
		
		DeepCloneProduct clone = (DeepCloneProduct) super.clone();
		clone.setId(System.currentTimeMillis());
		
		return clone;
	}
	
	  /* 深复制 */  
    public Object deepClone() throws IOException, ClassNotFoundException {  
  
        /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
    }  
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	public static class SerializableObject implements Serializable {

		private static final long serialVersionUID = 4466880424471081172L;
		
		private String text;

		public SerializableObject(String text) {
			this.text = text;
		}
		
		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
		@Override
		public String toString() {
			return ToStringBuilder.reflectionToString(this);
		}
	}
}
