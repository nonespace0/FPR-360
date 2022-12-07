package com.FPR360.service;

import com.FPR360.Model.Status;
import com.FPR360.Repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatusService {

@Autowired
    StatusRepository statusRepository;
    public Status addData(Status status){
        this.statusRepository.save(status);

        return status;
    }
    public List<Status> listData(){
        return  statusRepository.findAll();
    }
}
