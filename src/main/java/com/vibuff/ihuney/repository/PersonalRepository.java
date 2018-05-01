package com.vibuff.ihuney.repository;


import com.vibuff.ihuney.entities.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;
import java.util.List;

public interface PersonalRepository extends JpaRepository<Personal, Long> {

    @Query("select new Personal(p.id,p.firstName,p.phoneNumber,p.shareholder,p.birthday)" +
            " from Personal p join p.employment where Month(p.birthday) like :date ")
    List<Personal> getEmoloyeeBirthday(@Param("date")int d);

    @Query("select new Personal(p.id,p.firstName,p.phoneNumber,p.shareholder,em.hireDate) " +
            " from Personal  p join p.employment em where month(em.hireDate) like :mm and day(em.hireDate) like :dd")
    List<Personal> getHiringAniversary(@Param("mm")int mm,@Param("dd")int dd);
}
