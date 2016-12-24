package com.test.dao;

import com.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by xy on 2016/12/23.
 */
@Transactional
public interface UserDao extends CrudRepository<User,Integer> {
}
