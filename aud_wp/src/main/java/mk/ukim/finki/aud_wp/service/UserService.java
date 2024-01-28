package mk.ukim.finki.aud_wp.service;

import mk.ukim.finki.aud_wp.model.Role;
import mk.ukim.finki.aud_wp.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {

    User register(String username, String password, String repeatPassword,
                  String name, String surname, Role role);


}
