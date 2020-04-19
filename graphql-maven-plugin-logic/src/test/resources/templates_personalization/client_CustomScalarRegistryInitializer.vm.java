/** This template is custom **/
package ${packageUtilName};

import com.graphql_java_generator.customscalars.CustomScalarRegistry;
import com.graphql_java_generator.customscalars.CustomScalarRegistryImpl;

public class CustomScalarRegistryInitializer {

	/**
	 * Initialization of the {@link CustomScalarRegistry} with all known custom scalars, that is with all custom scalars
	 * defined in the project pom
	 */
	public static CustomScalarRegistry initCustomScalarRegistry() {
		CustomScalarRegistry customScalarRegistry = new CustomScalarRegistryImpl();

#foreach ($customScalar in $customScalars)
#if (${customScalar.customScalarDefinition.graphQLScalarTypeClass})
		customScalarRegistry.registerGraphQLScalarType(new ${customScalar.customScalarDefinition.graphQLScalarTypeClass}());
#elseif (${customScalar.customScalarDefinition.graphQLScalarTypeStaticField})
		customScalarRegistry.registerGraphQLScalarType(${customScalar.customScalarDefinition.graphQLScalarTypeStaticField});
#elseif (${customScalar.customScalarDefinition.graphQLScalarTypeGetter})
		customScalarRegistry.registerGraphQLScalarType(${customScalar.customScalarDefinition.graphQLScalarTypeGetter});
#else
		customScalarRegistry.registerGraphQLScalarType: ${customScalar.javaName} : you must define one of graphQLScalarTypeClass, graphQLScalarTypeStaticField or graphQLScalarTypeGetter (in the POM parameters for CustomScalars)
#end
#end

		CustomScalarRegistryImpl.customScalarRegistry = customScalarRegistry;
		return customScalarRegistry;
	}

}