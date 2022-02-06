package com.sakshem.dao;

import com.sakshem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it ... no need to write any code.

    // add a method to sort by last name
    // Spring Data JPA will parse the method name
    // looks for a specific format and pattern
    // creates the appropriate query .. behind the scenes
    // just like here
    // query created will be "from Employee order by lastname asc"
    // because of find all by clause and then OrderByLastNameAscending
    public List<Employee> findAllByOrderByLastNameAsc();

    @Query("Select e FROM Employee e WHERE e.firstName LIKE %?1%" + " OR e.lastName LIKE %?1%")
    public List<Employee> search(String keyword);
}
