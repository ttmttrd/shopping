package shopping.controller;

import java.security.Timestamp;

import valueObject.User;

public interface ShoppingController {
	public boolean login(String id, String pwd);

	public boolean addUser(User user);

	public boolean exitUser(User user);

	public boolean modifyUser(User user);

	public boolean checkCentification(String id, String key, Timestamp time);
}
