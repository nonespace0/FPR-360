package com.FPR360.DTO;

import com.FPR360.Model.CaseTypes;
import jakarta.persistence.NamedStoredProcedureQueries;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaseDetailDto {
    private  CaseTypes caseTypes;
}
