package com.lmash.mysqltest.util;



import java.lang.reflect.Field;
import java.util.Random;

/**
 * <p>
 * String工具类
 * </p>
 * 
 * @author:Crow
 * @Date: 2019年8月13日 下午2:09:17
 */
public class MyStringUtil {
	public final static String[] WORD = { "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "p", "q", "r",
			"s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P",
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", };

	public final static String[] WORD2 = { "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "M", "N", "P", "Q", "R",
			"S", "T", "U", "V", "W", "X", "Y", "Z", };

	public final static String[] NUMBER = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

	/**
	 * 生成6位数的随机码
	 * 
	 * @return
	 */

	public static String createRandomCode() {
		StringBuffer stringBuffer = new StringBuffer();
		Random random = new Random();
		boolean flag = false;
		// 设置默认密码的长度为1+6位
		int length = 6;
		for (int i = 0; i < length; i++) {
			if (flag) {
				stringBuffer.append(NUMBER[random.nextInt(NUMBER.length)]);
			} else {
				stringBuffer.append(WORD2[random.nextInt(WORD2.length)]);
			}
			flag = !flag;
		}
		return stringBuffer.toString();
	}

	/**
	 * 生成指定位数的随机盐
	 * 
	 * @return
	 */
	public static String randomSalt(int length) {
		StringBuffer stringBuffer = new StringBuffer();
		Random random = new Random();
		boolean flag = false;
		for (int i = 0; i < length; i++) {
			if (flag) {
				stringBuffer.append(NUMBER[random.nextInt(NUMBER.length)]);
			} else {
				stringBuffer.append(WORD[random.nextInt(WORD.length)]);
			}
			flag = !flag;
		}
		return stringBuffer.toString();
	}

	/**
	 * <p>
	 * 判断字符串是否是空值或者为""
	 * </p>
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNullOrEmpty(String str) {
		boolean mark = true;
		if (str != null && str.length() > 0) {
			mark = false;
		}
		return mark;
	}

	/**
	 * 截取文件后缀名
	 * 
	 * @param fileName
	 * @return
	 */
	public static String subSuffix(String fileName) {
		if (isNullOrEmpty(fileName)) {
			return null;
		} else {
			return fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
		}
	}

	/**
	 * 判断两个字符串是否相等，区分大小写
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean equals(String str1, String str2) {
		return str1 == null ? str2 == null : str1.equals(str2);
	}

	/**
	 * 如果字符串为null则返回一个空字符串
	 * 
	 * @param str
	 * @return
	 */
	public static String isNullToString(String str) {
		if (str == null) {
			return "";
		}
		return str;
	}

	/**
	 * 判断对象属性值是否为空
	 * 
	 * @param object
	 */
	public static String checkObjFieldIsNullOrEmpty(Object object) {
		for (Field f : object.getClass().getDeclaredFields()) {
			f.setAccessible(true);
			try {
				if (f.getName().equals("userId") && object.getClass().getSimpleName().equals("User")) {
					continue;
				}
				if (f.get(object) == null) {
					return f.getName() + "不能为空";
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return null;
	}

	public static void main(String[] args) {
//		// X3y3c3
//		for (int i = 0; i < 10; i++) {
//			System.err.println(createRandomCode());
//		}
//		ClassPathResource cr = new ClassPathResource("/static/404.html");
//		System.out.println(isNullOrEmpty("33"));
//		System.err.println(randomSalt(16));
//		System.err.println(createRandomCode());

		int a = 1;
		int b = 2;
		if ( 1 > 2||1 != 2) {
			System.out.println(222);
		}

		System.out.println(333);
	}
}
