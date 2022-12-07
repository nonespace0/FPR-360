package com.FPR360.Repository;

import com.FPR360.Model.CaseTypes;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseTypesRepository extends JpaRepository<CaseTypes, Integer> {
}
