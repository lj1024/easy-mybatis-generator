/*
 * 公司:北龙中网（北京）科技有限责任公司	网址:http://www.knet.cn
 * 
 */
package org.mybatis.generator.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * mybatis专用map
 * 
 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
 * @version 2015年10月8日 下午2:35:14
 * @since JDK1.7+
 */
/**
 * @author Administrator
 *
 */
public class Criteria extends HashMap<String, Object> {

	private static final long serialVersionUID = 3285160696673338235L;

	private Map<String, OrderEnum> orderMap = null;

	public Criteria() {
		super();
	}

	public Criteria(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
	}

	public Criteria(int initialCapacity) {
		super(initialCapacity);
	}

	public Object getWhere(String key) {
		key = this.whereString(key);
		return super.get(key);
	}

	public Object getWhereNot(String key) {
		key = this.whereNotString(key);
		return super.get(key);
	}

	public Object getWhereIsNull(String key) {
		key = this.whereIsNullString(key);
		return super.get(key);
	}

	public Object getWhereIsNotNull(String key) {
		key = this.whereIsNotNullString(key);
		return super.get(key);
	}

	public Object getUpdate(String key) {
		key = this.updateString(key);
		return super.get(key);
	}

	public Object getUpdateNull(String key) {
		key = this.updateNullString(key);
		return super.get(key);
	}

	public Object getOrder(String key) {
		key = this.orderString(key);
		Object value = null;
		if (orderMap != null) {
			value = orderMap.get(key);
		}
		return value;
	}
	
	public Object getPageFrom() {
		return super.get("pageFrom");
	}
	
	public Object getPageTo() {
		return super.get("pageTo");
	}

	public boolean containsWhereKey(String key) {
		key = this.whereString(key);
		return super.containsKey(key);
	}

	public boolean containsWhereNot(String key) {
		key = this.whereNotString(key);
		return super.containsKey(key);
	}

	public boolean containsWhereIsNull(String key) {
		key = this.whereIsNullString(key);
		return super.containsKey(key);
	}

	public boolean containsWhereIsNotNull(String key) {
		key = this.whereIsNotNullString(key);
		return super.containsKey(key);
	}

	public boolean containsUpdateKey(String key) {
		key = this.updateString(key);
		return super.containsKey(key);
	}

	public boolean containsUpdateNullKey(String key) {
		key = this.updateNullString(key);
		return super.containsKey(key);
	}

	public boolean containsOrderKey(String key) {
		key = this.orderString(key);
		boolean contains = false;
		if (orderMap != null) {
			contains = orderMap.containsKey(key);
		}
		return contains;
	}
	
	public boolean containsPageFromKey() {
		return super.containsKey("pageFrom");
	}
	
	public boolean containsPageToKey() {
		return super.containsKey("pageTo");
	}

	public Object putWhere(String key, Object value) {
		key = this.whereString(key);
		return super.put(key, value);
	}

	public Object putWhereNot(String key, Object value) {
		key = this.whereNotString(key);
		return super.put(key, value);
	}

	public Object putWhereIsNull(String key) {
		key = this.whereIsNullString(key);
		Object value = NullOrNotNuLLEnum.Null;
		return super.put(key, value);
	}

	public Object putWhereIsNotNull(String key) {
		key = this.whereIsNotNullString(key);
		Object value = NullOrNotNuLLEnum.NotNull;
		return super.put(key, value);
	}
	
	public Object putPageFrom(int from) {
		if(from < 0){
			from = 0;
		}
		return super.put("pageFrom", from);
	}
	
	public Object putPageTo(int to) {
		if(to < 0){
			to = 0;
		}
		return super.put("pageTo", to);
	}

	public Object putUpdate(String key, Object value) {
		key = this.updateString(key);
		return super.put(key, value);
	}

	public Object putUpdateNull(String key) {
		key = this.updateNullString(key);
		Object value = NullOrNotNuLLEnum.Null;
		return super.put(key, value);
	}

	public Object putOrder(String key, OrderEnum value) {
		if (value == null) {
			value = OrderEnum.ASC;
		}

		if (orderMap == null) {
			orderMap = new LinkedHashMap<String, OrderEnum>();
			orderMap.put(this.orderString(key), value);
			super.put("orderMap", orderMap);
		} else {
			orderMap.put(this.orderString(key), value);
		}
		return null;
	}

	public Object removeWhere(String key) {
		key = this.whereString(key);
		return super.remove(key);
	}

	public Object removeWhereNot(String key) {
		key = this.whereNotString(key);
		return super.remove(key);
	}

	public Object removeWhereIsNull(String key) {
		key = this.whereIsNullString(key);
		return super.remove(key);
	}

	public Object removeWhereIsNotNull(String key) {
		key = this.whereIsNotNullString(key);
		return super.remove(key);
	}

	public Object removeUpdate(String key) {
		key = this.updateString(key);
		return super.remove(key);
	}

	public Object removeUpdateNull(String key) {
		key = this.updateNullString(key);
		return super.remove(key);
	}

	public Object removeOrder(String key) {
		if (orderMap != null) {
			orderMap.remove(this.orderString(key));
		}
		return null;
	}
	
	public Object  removePageFrom() {
		return super.remove("pageFrom");
	}
	
	public Object removePageTo() {
		return super.remove("pageTo");
	}
	
	public Object removeAllWhere() {
		orderMap = null;
		for (Map.Entry<String, Object> e : this.entrySet()) {
			if(e.getKey().startsWith("query")){
				super.remove(e.getKey());
			}
		}
		return null;
	}
	
	public Object removeAllUpdate() {
		orderMap = null;
		for (Map.Entry<String, Object> e : this.entrySet()) {
			if(e.getKey().startsWith("update")){
				super.remove(e.getKey());
			}
		}
		return null;
	}
	
	public Object removeAllOrder() {
		orderMap = null;
		return null;
	}

	public void putAllWhere(Map<String, Object> map) {
		if(map != null){
			for (Map.Entry<String, Object> e : map.entrySet()) {
				this.putWhere(e.getKey(), e.getValue());
			}
		}
	}

	public void putAllWhereNot(Map<String, Object> map) {
		if(map != null){
			for (Map.Entry<String, Object> e : map.entrySet()) {
				this.putWhereNot(e.getKey(), e.getValue());
			}
		}
	}

	public void putAllWhereIsNull(List<String> keys) {
		if (keys != null) {
			for (String key : keys) {
				this.putWhereIsNull(key);

			}
		}
	}
	
	public void putAllWhereIsNotNull(List<String> keys) {
		if (keys != null) {
			for (String key : keys) {
				this.putWhereIsNotNull(key);
			}
		}
	}

	public void putAllUpdate(Map<String, Object> map) {
		if(map != null){
			for (Map.Entry<String, Object> e : map.entrySet()) {
				this.putUpdate(e.getKey(), e.getValue());
			}
		}
	}
	
	public void putAllUpdateNull(List<String> keys) {
		if (keys != null) {
			for (String key : keys) {
				this.putUpdateNull(key);
			}
		}
	}

	public Object put(String key, Object value) {
		return super.put(key, value);
	}

	public void putAll(Map<? extends String, ? extends Object> m) {
		super.putAll(m);
	}

	public Object get(Object key) {
		return super.get(key);
	}

	/**
	 * 
	 * 查找数据库表记录时,条件所用字符串标识
	 * 
	 * @param key
	 * @return
	 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
	 */
	private String whereString(String key) {
		return "query" + key.substring(0, 1).toUpperCase() + key.substring(1);
	}

	/**
	 * 
	 * 查找数据库表记录时,条件非时,所用字符串标识。例如: id != 2
	 * 
	 * @param key
	 * @return
	 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
	 */
	private String whereNotString(String key) {
		return "queryNot" + key.substring(0, 1).toUpperCase() + key.substring(1);
	}

	/**
	 * 
	 * 查找数据库表记录时,条件字段为null时,所用字符串标识
	 * 
	 * @param key
	 * @return
	 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
	 */
	private String whereIsNullString(String key) {
		return "queryIsNull" + key.substring(0, 1).toUpperCase() + key.substring(1);
	}

	/**
	 * 
	 * 查找数据库表记录时,条件字段不为null时,所用字符串标识
	 * 
	 * @param key
	 * @return
	 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
	 */
	private String whereIsNotNullString(String key) {
		return "queryIsNotNull" + key.substring(0, 1).toUpperCase() + key.substring(1);
	}

	/**
	 * 
	 * 更新数据库表记录时,条件所用字符串标识
	 * 
	 * @param key
	 * @return
	 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
	 */
	private String updateString(String key) {
		return "update" + key.substring(0, 1).toUpperCase() + key.substring(1);
	}

	/**
	 * 
	 * 更新数据库表记录时,条件值为null时,所用的字符串标识
	 * 
	 * @param key
	 * @return
	 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
	 */
	private String updateNullString(String key) {
		return "updateNull" + key.substring(0, 1).toUpperCase() + key.substring(1);
	}

	/**
	 * 
	 * 查询数据库表记录,排序时,将实体属性转化为数据库表字段
	 * 
	 * @param key
	 * @return
	 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
	 */
	private String orderString(String key) {
		for(int i=0;i<key.length();i++){
			//查找大写字母
			if((byte)key.charAt(i)>=65&&(byte)key.charAt(i)<=90){
				key=key.replace(key.substring(i,i+1), "_"+key.substring(i,i+1));
				i=i+1;
			}
		}
		return key;
	}
	
    /**
     * 清空配置
     */
	public void clear() {
		super.clear();
		this.orderMap = null;
	}

	public static void main(String[] args) {
		String str="goodGameMan";
		for(int i=0;i<str.length();i++){
			System.out.println((byte)str.charAt(i));
			//查找大写字母
			if((byte)str.charAt(i)>=65&&(byte)str.charAt(i)<=90){
				str=str.replace(str.substring(i,i+1), "_"+str.substring(i,i+1));
				i=i+1;
			}
		}
		System.out.println(str);
	}

}
