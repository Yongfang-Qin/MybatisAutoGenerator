package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.exception.ShellException;
import org.mybatis.generator.internal.DefaultShellCallback;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;

public class MapperPlugin extends PluginAdapter {

    private String daoTargetPackage;

    public boolean validate(List<String> warnings) {

        boolean valid1 = stringHasValue(properties.getProperty("targetProject"));

        daoTargetPackage = properties.getProperty("targetPackage");
        boolean valid2 = stringHasValue(daoTargetPackage);

        return valid1 && valid2;
    }

    @Override
    public List<GeneratedJavaFile> contextGenerateAdditionalJavaFiles(IntrospectedTable introspectedTable) {
        //获取所有生成的文件
        List<GeneratedJavaFile> generatedJavaFiles = introspectedTable.getGeneratedJavaFiles();
        for (GeneratedJavaFile javaFile : generatedJavaFiles) {
            //获取编辑项(存放了生成文件时所需要的信息)
            CompilationUnit unit = javaFile.getCompilationUnit();
            FullyQualifiedJavaType baseModelJavaType = unit.getType();
            String shortName = baseModelJavaType.getShortName();
            //判断生成的文件是否是Mapper接口
            if (shortName.endsWith("Mapper")) {
                if (stringHasValue(daoTargetPackage)) {
                    if (unit instanceof Interface) {
                        /*为文件添加扩展的方法*/
                        //添加import项
                        unit.addImportedType(new FullyQualifiedJavaType("java.util.List"));
                        //新建一个方法
                        Method method = new Method();
                        //设置访问权限
                        method.setVisibility(JavaVisibility.PUBLIC);
                        //设置方法名称
                        method.setName("selectAll");
                        //设置返回类型

                        FullyQualifiedJavaType returnFullyQualifiedJavaType = new FullyQualifiedJavaType(String.format("List<%s>", introspectedTable.getBaseRecordType()));
                        method.setReturnType(returnFullyQualifiedJavaType);
                        //设置注解
                        AnnotatedSelectAllMethodGengrator annotatedSelectAllMethodGengrator = new AnnotatedSelectAllMethodGengrator(introspectedTable, false, false);
                        annotatedSelectAllMethodGengrator.addMapperAnnotations(((Interface) unit), method);
                        //把方法添加到编辑项
                        ((Interface) unit).addMethod(method);
                    }
                }
            }
        }
        return generatedJavaFiles;
    }
}