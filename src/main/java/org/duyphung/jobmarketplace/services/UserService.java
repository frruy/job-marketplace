package org.duyphung.jobmarketplace.services;

import org.duyphung.jobmarketplace.entities.UserEntity;
import org.duyphung.jobmarketplace.sercurity.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public UserDetails loadUserByUsername(String userName);
    public void create(UserDTO userDTO);
    public UserEntity findUserByEmail(String email);
    public UserEntity findUserByName(String name);

    UserEntity findUserById(Integer id);
}
