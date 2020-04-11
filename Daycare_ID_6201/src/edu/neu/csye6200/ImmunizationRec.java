package edu.neu.csye6200;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;


public class ImmunizationRec {
	private int age;
	private boolean needVaccin;
	private Set<String> vaccine;
	public Set<String> getVaccine() {
		return vaccine;
	}

	public void setVaccine(Set<String> vaccine) {
		this.vaccine = vaccine;
	}

	private static Hashtable<String,Integer> ImmuRecPre;
	private static Hashtable<String,Integer> ImmuRecKin;
	private static Hashtable<String,Integer> ImmuRecGra;
	private static Hashtable<String,Integer> ImmuRecCol;
	
	public ImmunizationRec(int age) {
		this.age = age;
		initializetable();
	}
	
	public void initializetable() {
		//ImmuRec Preschool
		ImmuRecPre = new Hashtable<String, Integer>();
		ImmuRecPre.put("Hib", 4);
		ImmuRecPre.put("DTap", 4);
		ImmuRecPre.put("Polio", 3);
		ImmuRecPre.put("Hepatitis B", 3);
		ImmuRecPre.put("MMR", 1);
		ImmuRecPre.put("Varicella", 1);
		ImmuRecPre.put("Tdap", 0);
		ImmuRecPre.put("Meningococcal", 0);
		//ImmuRec Kindergarden
		ImmuRecKin = new Hashtable<String, Integer>();
		ImmuRecKin.put("Hib", 4);
		ImmuRecKin.put("DTap", 5);
		ImmuRecKin.put("Polio", 4);
		ImmuRecKin.put("Hepatitis B", 3);
		ImmuRecKin.put("MMR", 2);
		ImmuRecKin.put("Varicella", 2);
		ImmuRecKin.put("Tdap", 0);
		ImmuRecKin.put("Meningococcal", 0);
		//ImmuRec Grades
		ImmuRecGra = new Hashtable<String, Integer>();
		ImmuRecGra.put("Hib", 4);
		ImmuRecGra.put("DTap", 5);
		ImmuRecGra.put("Tdap", 1);
		ImmuRecGra.put("Polio", 4);
		ImmuRecGra.put("Hepatitis B", 3);
		ImmuRecGra.put("MMR", 2);
		ImmuRecGra.put("Varicella", 2);
		ImmuRecGra.put("Meningococcal", 1);
		//ImmuRec College
		ImmuRecCol = new Hashtable<String, Integer>();
		ImmuRecCol.put("Tdap", 1);
		ImmuRecCol.put("Hepatitis B", 3);
		ImmuRecCol.put("MMR", 2);
		ImmuRecCol.put("Varicella", 2);
		ImmuRecCol.put("Hib", 4);
		ImmuRecCol.put("Meningococcal", 1);
		ImmuRecCol.put("Polio", 4);
		ImmuRecCol.put("DTap", 5);
	}
	
	public boolean NeedVaccin(int age, Hashtable<String,Integer> student) {
		boolean res = false;
		vaccine = new HashSet<>();
		if(age <5) {
			Set<String> set = ImmuRecPre.keySet();
			for(String i : set) {
				if(student.get(i) != ImmuRecPre.get(i)) {
					vaccine.add(i);
					res = true;
				}
			}
		}else if(age==5 && age==6) {
			Set<String> set = ImmuRecKin.keySet();
			for(String i : set) {
				if(student.get(i) != ImmuRecKin.get(i)) {
					vaccine.add(i);
					res = true;
				}
			}
		}else if(age>=7 && age <=12) {
			Set<String> set = ImmuRecGra.keySet();
			for(String i : set) {
				if(student.get(i) != ImmuRecGra.get(i)) {
					vaccine.add(i);
					res = true;
				}
			}
		}else {
			Set<String> set = ImmuRecCol.keySet();
			for(String i : set) {
				if(student.get(i) != ImmuRecCol.get(i)) {
					vaccine.add(i);
					res = true;
				}
			}
		}
		return res;
	}
}
