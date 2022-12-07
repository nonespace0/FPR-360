package com.FPR360.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CaseTypes {
    @Id
    @GeneratedValue
    private int id;
    private String types;
    @OneToMany(targetEntity = CaseDetail.class, cascade =  CascadeType.ALL)
    @JoinColumn(name="type_id", referencedColumnName = "id")
    private List<CaseDetail> caseDetail;

}
