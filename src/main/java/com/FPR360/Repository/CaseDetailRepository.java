package com.FPR360.Repository;

import com.FPR360.Model.CaseDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CaseDetailRepository extends JpaRepository<CaseDetail,Integer> {
    @Query(value = "SELECT count(*) FROM case_detail WHERE type_id=1", nativeQuery = true)
    Long countById(int id);
}
