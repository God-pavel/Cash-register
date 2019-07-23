package model.dao;

import model.entity.User;

import java.util.Optional;

public interface UserDao extends GenericDao<User> {
    public Optional<User> findByUsername(String username);
}
