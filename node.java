

import java.util.*;
import java.text.DecimalFormat;

class node { // node class
	node left, right;
	int id_no;
	String name_victim, name_convict, name_witness; // file details
	String phone_victim;
	String address_victim;
	String crime_location;
	String crime_category;
	int age, crime_year;
	String gender;
	float jail_term;

	// parameterized constructor
	node(int id, String name1, String name2, String name3, String ph1, String add1, int age, String gen, int yr,
			String loc, String cat, float term) {
		left = null;
		right = null;
		id_no = id;
		name_victim = name1;
		name_convict = name2;
		name_witness = name3;
		phone_victim = ph1;
		address_victim = add1;
		crime_year = yr;
		crime_location = loc;
		crime_category = cat;
		gender = gen;
		this.age = age;
		jail_term = term;
	}
}
