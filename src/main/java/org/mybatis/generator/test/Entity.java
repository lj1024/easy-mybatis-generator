/*
 * 公司:北龙中网（北京）科技有限责任公司	网址:http://www.knet.cn
 * 
 */
package org.mybatis.generator.test;

import java.sql.Date;

/**
 * 类注释
 *
 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
 * @version 2015年10月14日 下午4:26:30
 * @since JDK1.7+
 */
public class Entity {
	private Long id;
	private Long state;
	private Date createDate;
	private Date updateDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getState() {
		return state;
	}
	public void setState(Long state) {
		this.state = state;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
