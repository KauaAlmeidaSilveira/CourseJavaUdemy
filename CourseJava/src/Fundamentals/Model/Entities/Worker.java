package Fundamentals.Model.Entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Fundamentals.Model.Enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private final List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		double sum = baseSalary;
		
		SimpleDateFormat formatLocalDate = new SimpleDateFormat("yyyy-MM-dd");
		
		for(HourContract contract : contracts) {
			LocalDate localDate = LocalDate.parse(formatLocalDate.format(contract.getDate()));
			if(localDate.getMonthValue() == month && localDate.getYear() == year) {
				sum += contract.totalVlr();
			}
		}
		
		return sum;
	}
	
	
}
