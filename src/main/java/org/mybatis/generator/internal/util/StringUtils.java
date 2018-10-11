/*
 * 公司:北龙中网（北京）科技有限责任公司	网址:http://www.knet.cn
 * 
 */
package org.mybatis.generator.internal.util;

/**
 * 类注释
 * 
 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
 * @version 2015年10月13日 下午2:32:34
 * @since JDK1.7+
 */
public class StringUtils {

	public static String upperFirstLetter(String str) {
		if (str == null || str.trim().equals("")) {
			return null;
		}
		String temp = str.trim();
		temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
		return temp;
	}

}
