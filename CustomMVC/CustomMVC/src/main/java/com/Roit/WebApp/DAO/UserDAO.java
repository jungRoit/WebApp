/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Roit.WebApp.DAO;

import com.Roit.WebApp.Entity.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public interface UserDAO {
    List<User> getAll()throws ClassNotFoundException,SQLException;
    
}
