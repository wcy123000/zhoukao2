package com.wangchengyang.common.utils;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	//返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数
	public void testRandomUtil() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.RandomUtil(1, 3));
		}
	}
	//：在最小值min与最大值max之间截取subs个不重复的随机数
	@Test
	public void testRandomUtil2() {
		for (int i = 0; i < 10; i++) {
			Set set=RandomUtil.RandomUtil(1, 10, 3);
			System.out.println(set);
		}
	}
	//返回1个1-9,a-Z之间的随机字符
	@Test
	public void testRandomStr() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.randomCharacter());
		}
	}
	//返回参数length个字符串，方法内部要调用randomCharacter()方法
	@Test
	public void testRandomStr2() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.randomCharacter(4));
		}
	}
}
