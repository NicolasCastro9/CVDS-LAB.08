package edu.eci.cvds.servlet.Spring;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
public class UserBean implements Serializable{
   private String userName;
   public UserBean() {
      this.userName = "";
  }
  
   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }
   
}
