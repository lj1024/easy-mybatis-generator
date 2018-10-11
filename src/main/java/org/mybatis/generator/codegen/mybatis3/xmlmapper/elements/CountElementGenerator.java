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
public class CountElementGenerator extends AbstractXmlElementGenerator {

	private boolean isSimple;

    public CountElementGenerator(boolean isSimple) {
        super();
        this.isSimple = isSimple;
    }
	
	
	@Override
	public void addElements(XmlElement parentElement) {
		XmlElement answer = new XmlElement("select");
		answer.addAttribute(new Attribute(
            "id", introspectedTable.getCountStatementId()));
		answer.addAttribute(new Attribute("parameterType", //$NON-NLS-1$
            "map"));
		answer.addAttribute(new Attribute("resultType", "long"));
		
		context.getCommentGenerator().addComment(answer);
		
		StringBuilder sb = new StringBuilder();
        sb.append("select count(*) from "); //$NON-NLS-1$
        sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
        answer.addElement(new TextElement(sb.toString()));
        answer.addElement(super.getQueryFilterIncludeElement());
        parentElement.addElement(answer);
	}

}
