/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Roit.WebApp.DAO.impl;

import com.Roit.WebApp.DAO.UserDAO;
import com.Roit.WebApp.Entity.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class UserDAOimpl implements UserDAO{

    @Override
    public List<User> getAll() throws ClassNotFoundException, SQLException {
       List<User> users=new ArrayList<>();
       users.add(new User(1, "meilna", "meilna.gmail.com", "meilna", true));
       users.add(new User(1, "sumit", "sumit.gmail.com", "sumit", true));
       users.add(new User(1, "Anjil", "Anjil.gmail.com", "Anjil", true));
       users.add(new User(1, "Roit", "Roit.gmail.com", "Roit", true));
       return users;
    
    }
    
    
}
