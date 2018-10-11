/*
 * 公司:北龙中网（北京）科技有限责任公司	网址:http://www.knet.cn
 * 
 */
package org.mybatis.generator.test;

import java.util.List;


/**
 * 公共Mapper
 *
 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
 * @version 2015年10月8日 下午2:28:14
 * @since JDK1.7+
 */
public interface CommonMaper<T> {
	
	public void add(T t);
	
	public void update(Criteria criteria);
	
	public void delete(Criteria criteria);
	
	public T read(Criteria criteria);
	
	public long count(Criteria criteria);
	
	public List<T> query(Criteria criteria);
	
	public List<T> page(Criteria criteria);
	
	
	
	
	
}
