package com.graphql_java_generator.client.domain.allGraphQLCases;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

import java.util.Date;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */

public class MyQueryTypeResponse  {

	@JsonProperty("withoutParameters")
	@JsonDeserialize(contentAs = Character.class)
	@GraphQLNonScalar(fieldName = "withoutParameters", graphQLTypeName = "Character", javaClass = Character.class)
	List<Character> withoutParameters;


	@GraphQLInputParameters(names = {"character"}, types = {"CharacterInput"})
	@JsonProperty("withOneOptionalParam")
	@GraphQLNonScalar(fieldName = "withOneOptionalParam", graphQLTypeName = "Character", javaClass = Character.class)
	Character withOneOptionalParam;


	@GraphQLInputParameters(names = {"character"}, types = {"CharacterInput"})
	@JsonProperty("withOneMandatoryParam")
	@GraphQLNonScalar(fieldName = "withOneMandatoryParam", graphQLTypeName = "Character", javaClass = Character.class)
	Character withOneMandatoryParam;


	@GraphQLInputParameters(names = {"episode"}, types = {"Episode"})
	@JsonProperty("withEnum")
	@GraphQLNonScalar(fieldName = "withEnum", graphQLTypeName = "Character", javaClass = Character.class)
	Character withEnum;


	@GraphQLInputParameters(names = {"firstName", "characters"}, types = {"String", "CharacterInput"})
	@JsonProperty("withList")
	@JsonDeserialize(contentAs = Character.class)
	@GraphQLNonScalar(fieldName = "withList", graphQLTypeName = "Character", javaClass = Character.class)
	List<Character> withList;


	@GraphQLInputParameters(names = {"input"}, types = {"AllFieldCasesInput"})
	@JsonProperty("allFieldCases")
	@GraphQLNonScalar(fieldName = "allFieldCases", graphQLTypeName = "AllFieldCases", javaClass = AllFieldCases.class)
	AllFieldCases allFieldCases;


	@GraphQLInputParameters(names = {"errorLabel"}, types = {"String"})
	@JsonProperty("error")
	@GraphQLNonScalar(fieldName = "error", graphQLTypeName = "Character", javaClass = Character.class)
	Character error;


	@JsonProperty("aBreak")
	@GraphQLNonScalar(fieldName = "aBreak", graphQLTypeName = "break", javaClass = _break.class)
	_break aBreak;


	@GraphQLInputParameters(names = {"uppercase"}, types = {"Boolean"})
	@JsonProperty("directiveOnQuery")
	@JsonDeserialize(contentAs = String.class)
	@GraphQLScalar(fieldName = "directiveOnQuery", graphQLTypeName = "String", javaClass = String.class)
	List<String> directiveOnQuery;


	@JsonProperty("directiveOnField")
	@GraphQLNonScalar(fieldName = "directiveOnField", graphQLTypeName = "Character", javaClass = Character.class)
	Character directiveOnField;


	@JsonProperty("__schema")
	@GraphQLNonScalar(fieldName = "__schema", graphQLTypeName = "__Schema", javaClass = __Schema.class)
	__Schema __schema;


	@GraphQLInputParameters(names = {"name"}, types = {"String"})
	@JsonProperty("__type")
	@GraphQLNonScalar(fieldName = "__type", graphQLTypeName = "__Type", javaClass = __Type.class)
	__Type __type;



	public void setWithoutParameters(List<Character> withoutParameters) {
		this.withoutParameters = withoutParameters;
	}

	public List<Character> getWithoutParameters() {
		return withoutParameters;
	}

	public void setWithOneOptionalParam(Character withOneOptionalParam) {
		this.withOneOptionalParam = withOneOptionalParam;
	}

	public Character getWithOneOptionalParam() {
		return withOneOptionalParam;
	}

	public void setWithOneMandatoryParam(Character withOneMandatoryParam) {
		this.withOneMandatoryParam = withOneMandatoryParam;
	}

	public Character getWithOneMandatoryParam() {
		return withOneMandatoryParam;
	}

	public void setWithEnum(Character withEnum) {
		this.withEnum = withEnum;
	}

	public Character getWithEnum() {
		return withEnum;
	}

	public void setWithList(List<Character> withList) {
		this.withList = withList;
	}

	public List<Character> getWithList() {
		return withList;
	}

	public void setAllFieldCases(AllFieldCases allFieldCases) {
		this.allFieldCases = allFieldCases;
	}

	public AllFieldCases getAllFieldCases() {
		return allFieldCases;
	}

	public void setError(Character error) {
		this.error = error;
	}

	public Character getError() {
		return error;
	}

	public void setABreak(_break aBreak) {
		this.aBreak = aBreak;
	}

	public _break getABreak() {
		return aBreak;
	}

	public void setDirectiveOnQuery(List<String> directiveOnQuery) {
		this.directiveOnQuery = directiveOnQuery;
	}

	public List<String> getDirectiveOnQuery() {
		return directiveOnQuery;
	}

	public void setDirectiveOnField(Character directiveOnField) {
		this.directiveOnField = directiveOnField;
	}

	public Character getDirectiveOnField() {
		return directiveOnField;
	}

	public void set__schema(__Schema __schema) {
		this.__schema = __schema;
	}

	public __Schema get__schema() {
		return __schema;
	}

	public void set__type(__Type __type) {
		this.__type = __type;
	}

	public __Type get__type() {
		return __type;
	}

    public String toString() {
        return "MyQueryType {"
				+ "withoutParameters: " + withoutParameters
				+ ", "
				+ "withOneOptionalParam: " + withOneOptionalParam
				+ ", "
				+ "withOneMandatoryParam: " + withOneMandatoryParam
				+ ", "
				+ "withEnum: " + withEnum
				+ ", "
				+ "withList: " + withList
				+ ", "
				+ "allFieldCases: " + allFieldCases
				+ ", "
				+ "error: " + error
				+ ", "
				+ "aBreak: " + aBreak
				+ ", "
				+ "directiveOnQuery: " + directiveOnQuery
				+ ", "
				+ "directiveOnField: " + directiveOnField
				+ ", "
				+ "__schema: " + __schema
				+ ", "
				+ "__type: " + __type
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		WithoutParameters("withoutParameters"),
		WithOneOptionalParam("withOneOptionalParam"),
		WithOneMandatoryParam("withOneMandatoryParam"),
		WithEnum("withEnum"),
		WithList("withList"),
		AllFieldCases("allFieldCases"),
		Error("error"),
		ABreak("aBreak"),
		DirectiveOnQuery("directiveOnQuery"),
		DirectiveOnField("directiveOnField"),
		__schema("__schema"),
		__type("__type");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

		public Class<?> getGraphQLType() {
			return this.getClass().getDeclaringClass();
		}

	}

	public static Builder builder() {
			return new Builder();
		}



	/**
	 * Builder
	 */
	public static class Builder {
		private List<Character> withoutParameters;
		private Character withOneOptionalParam;
		private Character withOneMandatoryParam;
		private Character withEnum;
		private List<Character> withList;
		private AllFieldCases allFieldCases;
		private Character error;
		private _break aBreak;
		private List<String> directiveOnQuery;
		private Character directiveOnField;
		private __Schema __schema;
		private __Type __type;


		public Builder withWithoutParameters(List<Character> withoutParameters) {
			this.withoutParameters = withoutParameters;
			return this;
		}
		public Builder withWithOneOptionalParam(Character withOneOptionalParam) {
			this.withOneOptionalParam = withOneOptionalParam;
			return this;
		}
		public Builder withWithOneMandatoryParam(Character withOneMandatoryParam) {
			this.withOneMandatoryParam = withOneMandatoryParam;
			return this;
		}
		public Builder withWithEnum(Character withEnum) {
			this.withEnum = withEnum;
			return this;
		}
		public Builder withWithList(List<Character> withList) {
			this.withList = withList;
			return this;
		}
		public Builder withAllFieldCases(AllFieldCases allFieldCases) {
			this.allFieldCases = allFieldCases;
			return this;
		}
		public Builder withError(Character error) {
			this.error = error;
			return this;
		}
		public Builder withABreak(_break aBreak) {
			this.aBreak = aBreak;
			return this;
		}
		public Builder withDirectiveOnQuery(List<String> directiveOnQuery) {
			this.directiveOnQuery = directiveOnQuery;
			return this;
		}
		public Builder withDirectiveOnField(Character directiveOnField) {
			this.directiveOnField = directiveOnField;
			return this;
		}
		public Builder with__schema(__Schema __schema) {
			this.__schema = __schema;
			return this;
		}
		public Builder with__type(__Type __type) {
			this.__type = __type;
			return this;
		}

		public MyQueryTypeResponse build() {
			MyQueryTypeResponse object = new MyQueryTypeResponse();
			object.setWithoutParameters(withoutParameters);
			object.setWithOneOptionalParam(withOneOptionalParam);
			object.setWithOneMandatoryParam(withOneMandatoryParam);
			object.setWithEnum(withEnum);
			object.setWithList(withList);
			object.setAllFieldCases(allFieldCases);
			object.setError(error);
			object.setABreak(aBreak);
			object.setDirectiveOnQuery(directiveOnQuery);
			object.setDirectiveOnField(directiveOnField);
			object.set__schema(__schema);
			object.set__type(__type);
			return object;
		}
	}
}
