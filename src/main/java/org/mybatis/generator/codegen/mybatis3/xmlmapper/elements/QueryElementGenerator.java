/*
 * 公司:北龙中网（北京）科技有限责任公司	网址:http://www.knet.cn
 * 
 */
package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * 删除element
 *
 * @author <a href="mailto:luwenjie@knet.cn">芦文杰</a>
 * @version 2015年10月13日 下午1:33:05
 * @since JDK1.7+
 */
public class QueryElementGenerator extends AbstractXmlElementGenerator {

	private boolean isSimple;

    public QueryElementGenerator(boolean isSimple) {
        super();
        this.isSimple = isSimple;
    }
	
	
	@Override
	public void addElements(XmlElement parentElement) {
		XmlElement answer = new XmlElement("select");
		answer.addAttribute(new Attribute(
            "id", introspectedTable.getQueryStatementId()));
		answer.addAttribute(new Attribute("parameterType", //$NON-NLS-1$
            "map"));
		if (introspectedTable.getRules().generateResultMapWithBLOBs()) {
            answer.addAttribute(new Attribute("resultMap", //$NON-NLS-1$
                    introspectedTable.getResultMapWithBLOBsId()));
        } else {
            answer.addAttribute(new Attribute("resultMap", //$NON-NLS-1$
                    introspectedTable.getBaseResultMapId()));
        }
		context.getCommentGenerator().addComment(answer);
		
		StringBuilder sb = new StringBuilder();
        sb.append("select * from "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
        answer.addElement(new TextElement(sb.toString()));
        answer.addElement(super.getQueryFilterIncludeElement());
        answer.addElement(super.getOrderFilterIncludeElement());
        parentElement.addElement(answer);
	}

}
