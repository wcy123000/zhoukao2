package com.wangchengyang.common.utils;

import org.junit.Test;

public class ChinameTest {
	@Test
	//年龄必须在1-120岁之间
	public void testRandomUtil() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.RandomUtil(1, 120));
		}
	}

}
