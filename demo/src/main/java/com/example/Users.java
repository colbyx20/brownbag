package com.example;
import java.util.HashMap;

public class Users {
  int id;
  String username;
  String password;
  int badvariable;
  String otherBadVariable;
  HashMap<Integer,String> userMap = new HashMap<>();

  
  public Users(int id, String username, String password) {
    this.id = id;
    this.username = username;
    this.password = password;
  }

  public void setID(int id) {
    this.id = id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void addUser(int id, String username) {
    userMap.put(id, username);
  }


}
