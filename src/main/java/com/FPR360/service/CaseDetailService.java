package com.FPR360.service;

import com.FPR360.DTO.CaseDetailDto;
import com.FPR360.Model.CaseDetail;
import com.FPR360.Model.CaseTypes;
import com.FPR360.Repository.CaseDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CaseDetailService {

    @Autowired
    CaseDetailRepository caseDetailRepository;


    public Optional<CaseDetail> caseDetailById(int id){
        return caseDetailRepository.findById(id);
    }
    public  Long countById(int id){
        return caseDetailRepository.countById(id);
    }
}
