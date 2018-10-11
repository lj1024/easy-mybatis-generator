/*
 *  Copyright 2009 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mybatis.generator.codegen.mybatis3.xmlmapper.elements;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.util.StringUtils;

/**
 * 
 * @author Jeff Butler
 * 
 */
public class QueryFilterSQLGenerator extends AbstractXmlElementGenerator {

	private boolean isSimple;

	public QueryFilterSQLGenerator(boolean isSimple) {
		super();
		this.isSimple = isSimple;
	}

	@Override
	public void addElements(XmlElement parentElement) {
		XmlElement answer = new XmlElement("sql"); //$NON-NLS-1$
		answer.addAttribute(new Attribute("id", introspectedTable.getMybatis3QueryFilterId())); //$NON-NLS-1$
		//context.getCommentGenerator().addComment(answer);
		XmlElement whereElement = new XmlElement("where");
        StringBuffer sb = new StringBuffer();

		for (IntrospectedColumn introspectedColumn : introspectedTable
                .getAllColumns()) {
            sb.setLength(0);
            XmlElement ifNotNullElement = new XmlElement("if"); //$NON-NLS-1$
            sb.append("query"+StringUtils.upperFirstLetter(introspectedColumn.getJavaProperty()));
            sb.append(" != null"); //$NON-NLS-1$
            ifNotNullElement.addAttribute(new Attribute(
                    "test", sb.toString())); //$NON-NLS-1$

            sb.setLength(0);
            sb.append("and ");
            sb.append(introspectedColumn.getActualColumnName());
            sb.append("=#{");
            sb.append("query"+StringUtils.upperFirstLetter(introspectedColumn.getJavaProperty()));
            sb.append("}");
            ifNotNullElement.addElement(new TextElement(sb.toString()));
            whereElement.addElement(ifNotNullElement);
        }
		answer.addElement(whereElement);
        parentElement.addElement(answer);

	}
}
