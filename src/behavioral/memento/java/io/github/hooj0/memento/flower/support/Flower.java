package io.github.hooj0.memento.flower.support;

/**
 * memento state store & restore implements
 * 备忘录模式存储状态和状态恢复实现
 * 
 * @author hoojo
 * @createDate 2018年12月2日 下午9:10:08
 * @file Flower.java
 * @package io.github.hooj0.memento.flower.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class Flower {

	private int size;
	private int duration;
	private FlowerState state;
	
	public Flower(FlowerState state, int size, int duration) {
		this.state = state;
		this.size = size;
		this.duration = duration;
	}
	
	// 花开花落
	public void blossom() {
		size *= 3;
		duration *= 2;

		switch (state) {
			case BUD:
				state = FlowerState.OPEN;
				duration += 1;
				break;
			case OPEN:
				state = FlowerState.FULL_BLOOM;
				duration += 1;
				break;
			case FULL_BLOOM:
				state = FlowerState.WITHERED;
				duration += 1;
				break;
			case WITHERED:
				state = FlowerState.DROP;
				duration += 1;
				break;
			case DROP:
				size = 0;
				duration += 1;
				break;
			default:
				break;
		}
	}
	
	public FlowerMemento getMemento() {
		FlowerMementoInternal memento = new FlowerMementoInternal();
		memento.setDuration(duration);
		memento.setSize(size);
		memento.setState(state);

		return memento;
	}
	
	public void setMemento(FlowerMemento memento) {
		this.size = memento.getSize();
		this.duration = memento.getDuration();
		this.state = memento.getState();
	}
	
	@Override
	public String toString() {
		return String.format("状态：%s\t花期：%d小时\t大小：%d厘米", state, duration, size);
	}

	// FlowerMemento implements
	private static class FlowerMementoInternal implements FlowerMemento {

		private int size;
		private int duration;
		private FlowerState state;
		
		public void setSize(int size) {
			this.size = size;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}

		public void setState(FlowerState state) {
			this.state = state;
		}

		@Override
		public int getSize() {
			return size;
		}

		@Override
		public int getDuration() {
			return duration;
		}

		@Override
		public FlowerState getState() {
			return state;
		}
	}
}
