/**
 * 
 */
package graphql.mavenplugin_notscannedbyspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.graphql_java_generator.plugin.CustomScalarDefinition;
import com.graphql_java_generator.plugin.PluginMode;

/**
 * The Spring configuration used for JUnit tests
 * 
 * @author EtienneSF
 */
@Configuration
@ComponentScan(basePackages = "com.graphql_java_generator.plugin")
public class AllGraphQLCases_Server_SpringConfiguration extends AbstractSpringConfiguration {

	static List<CustomScalarDefinition> customScalars;
	static {
		customScalars = new ArrayList<>();
		customScalars.add(
				new CustomScalarDefinition("Date", "java.util.Date", "com.myimplementation.CustomScalarConverterDate"));
		customScalars.add(
				new CustomScalarDefinition("Long", "java.lang.Long", "com.myimplementation.CustomScalarConverterLong"));
	}

	public AllGraphQLCases_Server_SpringConfiguration() {
		super("allGraphQLCases.graphqls", PluginMode.server, customScalars);
	}
}
