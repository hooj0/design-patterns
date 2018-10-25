package io.github.hooj0.bridge.support.implementor;

/**
 * Hisense TV support implementor class
 * 海信电视具体抽象类实现
 * 
 * @author hoojo
 * @createDate 2018年10月25日 下午9:34:09
 * @file HisenseTV.java
 * @package io.github.hooj0.bridge.support.implementor
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class HisenseTV extends AbstractTV {

	@Override
	public void open() {
		System.out.println("打开海信电视");
	}

	@Override
	public void close() {
		System.out.println("关闭海信电视");
	}

	@Override
	public void adjustShow() {
		System.out.println("调整海信电视节目");
	}

	@Override
	public void adjustVolume() {
		System.out.println("调整海信电视音量");
	}
}
