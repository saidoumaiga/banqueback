package bf.lonab.banqueback.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import bf.lonab.banqueback.entites.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
