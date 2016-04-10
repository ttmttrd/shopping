package shopping.entity;

import java.security.Timestamp;

import valueObject.User;

public interface ShoppingEntity {
	
	public String login(String id);
	
	public int addUser(User user);
	
	public int exitUser(String id);
	
	public int logUser(User user);
	
	public int modify(User user);
	
	public String getCentificationKey(String id);
	
	public void addCentificationKey(String id, String key, Timestamp time);
	
	public void completeCentification(String id);
	
}
