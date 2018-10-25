package io.github.hooj0.bridge.support.implementor;

/**
 * xiaomi TV support implementor class
 * 小米电视抽象具体实现
 * 
 * @author hoojo
 * @createDate 2018年10月25日 下午9:31:56
 * @file XiaoMiTV.java
 * @package io.github.hooj0.bridge.support.implementor
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class XiaoMiTV extends AbstractTV {

	@Override
	public void open() {
		System.out.println("打开小米电视");
	}

	@Override
	public void close() {
		System.out.println("关闭小米电视");
	}

	@Override
	public void adjustShow() {
		System.out.println("调整小米电视节目");
	}

	@Override
	public void adjustVolume() {
		System.out.println("调整小米电视音量");
	}
}
