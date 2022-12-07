package com.FPR360.service;

import com.FPR360.Model.CaseTypes;
import com.FPR360.Repository.CaseTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CaseTypeService {

    @Autowired
    CaseTypesRepository caseTypesRepository;

    public CaseTypes addTypes(CaseTypes caseTypes){
        caseTypesRepository.save(caseTypes);
        return caseTypes;
    }
    public Optional<CaseTypes> getTypesById(int id){
      return   caseTypesRepository.findById(id);
    }
}
