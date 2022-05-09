package pers.jssd.sqlitedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.jssd.sqlitedemo.pojo.User;

/**
 * user repository
 */
public interface UserRepository extends JpaRepository<User, String> {

}