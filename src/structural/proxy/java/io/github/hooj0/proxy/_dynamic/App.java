package io.github.hooj0.proxy._dynamic;

import io.github.hooj0.proxy._dynamic.support.LoaderProxyFactory;
import io.github.hooj0.proxy._static.support.ImageLoader;
import io.github.hooj0.proxy._static.support.PhotoImageLoader;

/**
 * 
 * @author hoojo
 * @createDate 2018年11月15日 下午9:16:13
 * @file App.java
 * @package io.github.hooj0.proxy._dynamic
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {
		
		ImageLoader imageLoader = new PhotoImageLoader();
		System.out.println(imageLoader.getClass());
		
		Object proxy = new LoaderProxyFactory(imageLoader).getProxyInstance();
		System.out.println(proxy.getClass());
		
		imageLoader = (ImageLoader) proxy;
		System.out.println(imageLoader.getClass());
		
		imageLoader.loader();
	}
}
