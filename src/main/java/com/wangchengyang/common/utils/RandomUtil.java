package com.wangchengyang.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	//返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数
public static Integer RandomUtil(Integer min,Integer max) {
	Random r=new Random();
	return r.nextInt(max-min+1)+min;
	
}
//：在最小值min与最大值max之间截取subs个不重复的随机数
public static Set<Integer> RandomUtil(Integer min,Integer max,int num) {
	Set<Integer> set=new HashSet<Integer>();
	while (set.size()!=num) {
		Random r=new Random();
		set.add(r.nextInt(max-min+1)+min);
	}
	return set;
 	
}
//返回1个1-9,a-Z之间的随机字符
public static String randomCharacter (){
     String str="123456789qwertyuioplkjhgfdsazxcvbnm";
     Integer index=RandomUtil(0, str.length()-1);
	return str.charAt(index)+"";
     
	
 
	}
//返回参数length个字符串，方法内部要调用randomCharacter()方法
public static String randomCharacter(int i){
    String str="123456789qwertyuioplkjhgfdsazxcvbnm";
    String dest="";
    for (int j = 0; j < i; j++) {
    	 Integer index=RandomUtil(0, str.length()-1);
          dest+=str.charAt(index);
     
	}
	return dest;
    
	}
}
