package com.example.mappers;

import com.example.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonMapper {

    public List<Person> GetAllPerson(@Param("currentNumber") int currentNumber, @Param("pageNumber")int pageNumber);
    public Person GetPersonById(Integer person_id);
    public List<Person> GetPersonByArmyId(@Param("army_id") Integer army_id,@Param("currentNumber") int currentNumber, @Param("pageNumber")int pageNumber);
    public void AddPerson(Person person);
}
