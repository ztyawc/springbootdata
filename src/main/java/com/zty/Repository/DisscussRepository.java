package com.zty.Repository;

import com.zty.domain.Disscuss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.awt.print.Pageable;
import java.util.List;

public interface DisscussRepository extends JpaRepository<Disscuss,Integer> {
    public List<Disscuss> findByAuthorNotNull();

    @Query("SELECT c FROM t_comment c WHERE c.aId = ?1")
    public List<Disscuss> getDiscussPaged(Integer aid, Pageable pageable);

    @Query(value = "SELECT * FROM springbootdata.t_comment  WHERE  a_Id = ?1",nativeQuery = true)
    public List<Disscuss> getDiscussPaged2(Integer aid,Pageable pageable);


    @Transactional
    @Modifying
    @Query("UPDATE t_comment c SET c.author = ?1 WHERE c.id = ?2")
    public int updateDiscuss(String author,Integer id);


    @Transactional
    @Modifying
    @Query("DELETE from t_comment c WHERE c.id = ?1")
    public int deleteDiscuss(Integer id);




}
