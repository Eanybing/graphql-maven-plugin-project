/** Generated by the default template from graphql-java-generator */
package com.graphql_java_generator.server.domain.allGraphQLCases;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLInterfaceType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.UUID;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInterfaceType("WithID")
public interface WithID  {

	@GraphQLScalar(fieldName = "id", graphQLTypeName = "ID", list = false, javaClass = UUID.class)
	public void setId(UUID id);

	@GraphQLScalar(fieldName = "id", graphQLTypeName = "ID", list = false, javaClass = UUID.class)
	public UUID getId();
}