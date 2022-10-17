package com.gl.caseStudy17102022.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.caseStudy17102022.bean.MyUsers;


@Repository
public interface MyUsersRepository extends JpaRepository<MyUsers, String> {
	Optional <MyUsers> findUserByUserName(String username);

}
