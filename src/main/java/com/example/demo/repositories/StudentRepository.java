package com.example.demo.repositories;

import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Student;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {

//	@Procedure("GET_STUDENT")
//	int getAllFromSP(Integer s_id, Integer id, String name);
//	@Procedure("GET_STUDENT")
//	List<Student> getAllFromSP(Integer s_id);

//	@Procedure("GET_STUDENT")
//	Object getAllFromSP(Integer s_id);

//	@Procedure("Student.getAll")
//	Integer getAllFromSP(@Param("s_id") Integer arg);
//
//	@Modifying
//	@Query(value = "CALL GET_STUDENT(:s_id, :id, :name);", nativeQuery = true)
//	List<Student> getAllFromSP2(@Param("s_id") Integer s_id, @Param("id") Integer id, @Param("name") int varchar);

	@Procedure(name = "student.getAll")
	Map<String, Object> getAllFromSP(Integer s_id);

	@Procedure(name = "student.getAll")
	Student getAllFromSP2(Integer s_id);

}
