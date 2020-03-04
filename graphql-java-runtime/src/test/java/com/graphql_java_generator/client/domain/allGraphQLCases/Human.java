package com.graphql_java_generator.client.domain.allGraphQLCases;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href=
 *      "https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */

public class Human implements Character, Commented {

	@JsonProperty("id")
	@GraphQLScalar(graphQLTypeName = "ID", javaClass = String.class)
	String id;

	@JsonProperty("name")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String name;

	@JsonProperty("bestFriend")
	@GraphQLNonScalar(graphQLTypeName = "Character", javaClass = Character.class)
	Character bestFriend;

	@JsonProperty("friends")
	@GraphQLNonScalar(graphQLTypeName = "Character", javaClass = Character.class)
	List<Character> friends;

	@JsonProperty("nbComments")
	@GraphQLScalar(graphQLTypeName = "Int", javaClass = Integer.class)
	Integer nbComments;

	@JsonProperty("comments")
	@JsonDeserialize(contentAs = String.class)
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	List<String> comments;

	@JsonProperty("appearsIn")
	@JsonDeserialize(contentAs = Episode.class)
	@GraphQLScalar(graphQLTypeName = "Episode", javaClass = Episode.class)
	List<Episode> appearsIn;

	@JsonProperty("homePlanet")
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String homePlanet;

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setBestFriend(Character bestFriend) {
		this.bestFriend = bestFriend;
	}

	public Character getBestFriend() {
		return bestFriend;
	}

	@Override
	public void setFriends(List<Character> friends) {
		this.friends = friends;
	}

	@Override
	public List<Character> getFriends() {
		return friends;
	}

	@Override
	public void setNbComments(Integer nbComments) {
		this.nbComments = nbComments;
	}

	@Override
	public Integer getNbComments() {
		return nbComments;
	}

	@Override
	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	@Override
	public List<String> getComments() {
		return comments;
	}

	@Override
	public void setAppearsIn(List<Episode> appearsIn) {
		this.appearsIn = appearsIn;
	}

	@Override
	public List<Episode> getAppearsIn() {
		return appearsIn;
	}

	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}

	public String getHomePlanet() {
		return homePlanet;
	}

	@Override
	public String toString() {
		return "Human {" + "id: " + id + ", " + "name: " + name + ", " + "bestFriend: " + bestFriend + ", "
				+ "friends: " + friends + ", " + "nbComments: " + nbComments + ", " + "comments: " + comments + ", "
				+ "appearsIn: " + appearsIn + ", " + "homePlanet: " + homePlanet + "}";
	}
}