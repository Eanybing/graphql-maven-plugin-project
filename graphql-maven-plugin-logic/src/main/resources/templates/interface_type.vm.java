/** Generated by the default template from graphql-java-generator */
package ${configuration.packageName};

#foreach($import in ${object.imports})
import $import;
#end

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
${object.annotation}
public interface ${object.javaName} #if($object.implementz.size()>0)extends #foreach($impl in $object.implementz)$impl#if($foreach.hasNext), #end#end#end {
#foreach ($field in $object.fields)

	${field.annotation}
	public void set${field.pascalCaseName}(${field.javaType} ${field.javaName});

	${field.annotation}
	public ${field.javaType} get${field.pascalCaseName}();
#end
}
