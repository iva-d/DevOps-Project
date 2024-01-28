package mk.ukim.finki.aud_wp.service;

import mk.ukim.finki.aud_wp.model.User;

public interface AuthService {

    User login(String username, String password);
    //User register(String username, String password, String repeatPassword, String name, String surname);

}
