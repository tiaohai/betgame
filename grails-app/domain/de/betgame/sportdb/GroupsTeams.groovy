package de.betgame.sportdb

class GroupsTeams {

	Integer groupId
	Integer teamId
	String createdAt
	String updatedAt

	static mapping = {
		id generator: "assigned"
		version false
	}

	static constraints = {
		createdAt maxSize: 2000000000
		updatedAt maxSize: 2000000000
	}
}
