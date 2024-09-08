package com.aurionpro.creational.builder.model;

public class User {

	
//	PROBLEMS WITH THE FACTORY METHOD : 
	// We have the to pass many arguments to create the object
	// Some parameters might be optional
	// factory class takes all responsibility for creating object is heavy then all
	// complexity is the part of of factory class.
	// It is also helpful to create the immutable objects

	private String userId;
	private String userName;
	private String emailId;

	private User(UserBuilder builder) {
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.emailId = builder.emailId;
	}

	// We create getter because we want to set value at once and get it multiple
	// times. So, no setter only getter
	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	// inner class
	public static class UserBuilder {
		private String userId;
		private String userName;
		private String emailId;

		public UserBuilder() {

		}

		// Assume above constructor is private
		public static UserBuilder builder() {
			return new UserBuilder();
		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		// method with return type as outer class
		public User build() {
			// So, we pass this to the constructor of above class so, we get the access of
			// all properties of inner class
			User user = new User(this);
			return user;
		}
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + "]";
	}

}
