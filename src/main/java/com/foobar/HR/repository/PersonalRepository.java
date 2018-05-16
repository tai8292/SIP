package com.foobar.HR.repository;


import com.foobar.HR.entities.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonalRepository extends JpaRepository<Personal, Integer> {

    @Query("select new Personal(p.id,p.firstName,p.phoneNumber,p.shareholder,p.birthday)" +
            " from Personal p join p.employment where Month(p.birthday) like :date ")
    List<Personal> getEmoloyeeBirthday(@Param("date") int d);

    @Query("select new Personal(p.id,p.firstName,p.phoneNumber,p.shareholder,em.hireDate) " +
            " from Personal  p join p.employment em where month(em.hireDate) = :mm and day(em.hireDate) = :dd")
    List<Personal> getHiringAniversary(@Param("mm") int mm, @Param("dd") int dd);

    @Query("select p from  Personal p join p.benefitPlans where p.benefitPlansID not like p.benefitPlans")
    List<Personal> ChangeBenefit();

    List<Personal> getPersonalsByShareholderAndEnthnicityAndMatitalStatusAndGender(String shareHolder,String enthnic,String status,boolean gender);
}
