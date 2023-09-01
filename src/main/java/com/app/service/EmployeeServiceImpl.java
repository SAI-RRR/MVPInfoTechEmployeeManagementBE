package com.app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.dto.EmpDetails;
import com.app.entity.EmpDetailsEntity;
import com.app.repository.EmpDetailsRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmpDetailsRepository empDetailsRepository;

	@Override
	public EmpDetailsEntity createEmployee(EmpDetails empDTO) {
		// input for service method is DTO (EmpDetails)
		// input for repository is Entity object EmpDetailsEntity
		// take(get) the data from DTO and give(set) to  data to Entity
		EmpDetailsEntity empEntity = new EmpDetailsEntity();
		String empName = empDTO.getEmpName();
		empEntity.setEmpName(empName);
		empEntity.setEmail(empDTO.getEmail());
		empEntity.setDesignation(empDTO.getDesignation());
		empEntity.setLocation(empDTO.getLocation());
		empEntity.setAddress(empDTO.getAddress());
		return empDetailsRepository.save(empEntity);
	}

	@Override
	public EmpDetailsEntity getEmpDetails(long id) {
		return empDetailsRepository.findById(id).orElse(null);

	}

	@Override
	public EmpDetailsEntity updateEmp(EmpDetailsEntity empEntity,long id) {
		EmpDetailsEntity empdetails = empDetailsRepository .findById(id).orElse(null);
		empdetails.setEmpName(empEntity.getEmpName());
		empdetails.setEmail(empEntity.getEmail());
		empdetails.setDesignation(empEntity.getDesignation());
		empdetails.setLocation(empEntity.getLocation());
		empdetails.setAddress(empEntity.getAddress());
		EmpDetailsEntity updatetedEmployee = empDetailsRepository.save(empdetails);
		return updatetedEmployee;
	}

	@Override
	public  String deleteEmployee(long id) {
		EmpDetailsEntity empdetails = empDetailsRepository.findById(id).orElse(null);
		empDetailsRepository.delete(empdetails);
		return "Deleted success";
	}

	
	@Override
	public List<EmpDetails> findAll() {
		//data is comming from DB
		List<EmpDetailsEntity> employes = empDetailsRepository.findAll();
		// we have data available in entity
		//get the data from entity
		// set the data to the DTO
		 List<EmpDetails> empdetailsDTOList = new ArrayList<>();
		for(EmpDetailsEntity empDetailsEntity : employes) {
			// get the data from empDetailsEntity and set the data to the DTO
			//create new emp details dto
			EmpDetails empDetailsDTO = new EmpDetails();
			//set the values to the new emp deatils dto
			empDetailsDTO.setEmpName(empDetailsEntity.getEmpName());
			empDetailsDTO.setEmail(empDetailsEntity.getEmail());
			empDetailsDTO.setDesignation(empDetailsEntity.getDesignation());
			empDetailsDTO.setLocation(empDetailsEntity.getLocation());
			//add the new emp details to list
			empdetailsDTOList.add(empDetailsDTO);
		}
		return empdetailsDTOList ;
	}
}