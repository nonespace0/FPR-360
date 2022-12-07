package com.FPR360.Controller;

import com.FPR360.DTO.CaseDetailDto;
import com.FPR360.Model.CaseDetail;
import com.FPR360.Model.CaseTypes;
import com.FPR360.Model.Category;
import com.FPR360.Model.Status;
import com.FPR360.Repository.CaseDetailRepository;
import com.FPR360.Repository.CaseTypesRepository;
import com.FPR360.service.CaseDetailService;
import com.FPR360.service.CaseTypeService;
import com.FPR360.service.CategoryService;
import com.FPR360.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DashBoardController {

@Autowired
    CategoryService categoryService;
@Autowired
    StatusService statusService;
@Autowired
    CaseTypeService caseTypeService;
@Autowired
    CaseDetailService caseDetailService;
    @Autowired
    CaseDetailRepository caseDetailRepository;
    @Autowired
    CaseTypesRepository caseTypesRepository;



    @GetMapping("/getCat")
    public List<Category> getCategory(){
        return categoryService.listData();
    }

    @PostMapping("/addCategory")
    public Category addCat(@RequestBody Category category){
        return  categoryService.addData(category);
    }
    @GetMapping("/getStatus")
    public List<Status> getStatus(){
        return statusService.listData();
    }

    @PostMapping("/addStatus")
    public Status addStatus(@RequestBody Status status){
        return  statusService.addData(status);
    }

    @PostMapping("addTypes")
    public CaseTypes addTypes(@RequestBody  CaseTypes caseTypes ){
        return  caseTypeService.addTypes(caseTypes);
    }

    @GetMapping("/caseTypes/{id}")
    public Optional<CaseTypes> getCaseBuId(@PathVariable int id){
        return  caseTypeService.getTypesById(id);
    }
    @GetMapping("/casDetail/{id}")
    public Optional<CaseDetail> getById(@PathVariable int id){
        return  caseDetailService.caseDetailById(id);
    }
    @PostMapping("/addCaseDetail")
    public CaseTypes addCaseDetail(@RequestBody CaseDetailDto caseDetailDto){
       return caseTypesRepository.save(caseDetailDto.getCaseTypes());
    }

    @GetMapping("/count/{id}")
    public Long countById(@PathVariable int id){
        return  caseDetailService.countById(id);
    }
    }

