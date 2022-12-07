package com.FPR360.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CaseDetail {
            @Id
            private int caseId;
            private String institutionATT;
            private String businessUnit;
            private String dbaName;
            private String  merchantID;
            private String  chargebackDate;
            private String chargebackAmount;
            private String chargebackType;
            private String  chargebackDeadline;
            private String CBTFileDate;
            private String ChargebackReason;


}
