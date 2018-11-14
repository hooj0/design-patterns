package io.github.hooj0.proxy._static;

import io.github.hooj0.proxy._static.support.ImageLoader;
import io.github.hooj0.proxy._static.support.ImageLoaderProxy;
import io.github.hooj0.proxy._static.support.PhotoImageLoader;

/**
 * image static proxy application client 
 * 
 * @author hoojo
 * @createDate 2018年11月14日 下午10:44:54
 * @file App.java
 * @package io.github.hooj0.proxy._static
 * @project design-patterns
 * @blog http://hoojo.cnblogs.com
 * @email hoojo_@126.com
 * @version 1.0
 */
public class App {

	public static void main(String[] args) {

		ImageLoader proxy = new ImageLoaderProxy(new PhotoImageLoader());
		proxy.loader();
	}
}
