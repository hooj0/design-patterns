package io.github.hooj0.proxy._static.support;

/**
 * image loader proxy class, support ImageLoader interface method, used PhotoImageLoader class.
 * `Proxy`: 代理主题角色**，继承或实现抽象主题角色，接收真实主题的引用，并完成真实业务的代理操作
 * @author hoojo
 * @createDate 2018年11月14日 下午11:04:49
 * @file ImageLoaderProxy.java
 * @package io.github.hooj0.proxy._static.support
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class ImageLoaderProxy implements ImageLoader {

	private ImageLoader imageLoader;
	
	public ImageLoaderProxy(ImageLoader imageLoader) {
		this.imageLoader = imageLoader;
	}
	
	@Override
	public void loader() {
		System.out.println("image loading...");
		
		this.imageLoader.loader();

		System.out.println("image load complet.");
	}
}
