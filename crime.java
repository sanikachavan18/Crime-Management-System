//import java.util.Scanner;
//import java.util.Stack;
//
//class crime { // crime class
//	Scanner sc = new Scanner(System.in);
//	node root;
//
//	crime() {
//		root = null;
//	}
//
//	void create() {
//		node d = null;
//		node file1 = new node(352, "Ramesh Goyal", "Suresh Chettri", "Rahul Sharma", "9739273661", "91,Subhash Nagar,Bhopal", 40, "Male", 2022,"Pune", "Murder", 12);
//		node file2 = new node(572, "Vaishnavi Godhal", "Aditi Sharama", "Rakesh Bajaj", "9739093166", "101,Lane 2,Karvenagar,Pune", 28, "Female",  2018,"pune", "Robbery", 1);
//		node file3 = new node(106, "Suman Wagh", "Gopal Jha", "Rakesh Kumar", "973909366", "12,Lane 5,Manewada,Nagpur", 25, "Female",  2015,"Nagpur", "Rape", 30);
//		node file4 = new node(115, "Subhash Kumar", "Swamini Surjuse", "Rahul Dhoni", "9564721970", "991,Swaroopa Nagar,Indore", 44, "Male", 2020,"Delhi", "drug use", 20);
//		node file5 = new node(132, "Umesh Parikh", "Suresh Mittal", "Diksha Kumar", "8515451000", "2,Sakharwada,Latur", 32, "Male", 2019,"Kolhapur", "fraud", 5.5f);
//		node file6 = new node(206, "Ritesh Jain", "Saviya Seth", "Hitesh Patel", "8515459920", "602,Jogeshwar Nagar,Surat", 22, "Male", 2020,"Surat", "Assault", 0.5f);
//		node file7 = new node(122, "Lalit Goyal", "Ashish Bhai", "Sugadh Patel", "8505452220", "81,Bapu Chowk,Gandhinagar", 34, "Male", 2021,"Surat", "Kidnapping ", 7);
//		node file8 = new node(203, "Lila Kalara", "Aditi Modi", "Jatin Mehta", "973909966", "11,Lane 9,Lakshmi Nagar ,Kolkata", 38, "Female",  2018,"pune", "Child abuse", 1.5f);
//		node file9 = new node(420, "Asif Ali", "Digambar Wani", "Sukhir Shah", "9721212106", "13,Akbar Nagar ,Delhi", 31, "Male",  2018,"Delhi", "Hijacking", 30);
//		node file10 = new node(111, "Amar Khusro", "Ashish Shubh", "Sadhu Singh", "8505212450", "35,Manindar Chowk,Chandigarh", 41, "Male", 2019,"Chandigarh", "Murder", 10);
//		node file11 = new node(221, "Soor Kalara", "Vallabh Modi", "Jatin Tirtha", "973901166", "01,Lane 9,Lakshmi Nagar ,Mumbai", 48, "Female",  2018,"Mumbai", "Assault", 0.5f);
//				node file12 = new node(432, "Aditya Kadam", "Suresh Varma", "Pratik Sharma", "8515451000", "5,Ravivaarpeth,Latur", 35, "Male", 2019,"Kolhapur", "fraud", 5.5f);
//		node file13 = new node(112, "Lucky Singh", "Subhash Waliya", "Fatima Sinha ", "8515133570", "16,Nilam Shah,Gondia", 22, "Male", 2020,"Amravati", "Rape", 10);
//		node file14 = new node(323, "Akbar Khan", "Wahid Sheikh", "Abdul Khan ", "9725550106", "51,Chandni Chowk ,Delhi", 37, "Male",  2020,"Delhi", "Kidnapping", 7.5f);
//		node file15 = new node(109, "Niyati Mallya", "Mayuri Jain", "Mehul Choksi", "9738484566", "41,Lane 5,Subhash Nagar ,Kolkata", 28, "Female",  2020,"Kolkata", "Murder", 15);
//
//
//		for (int i = 0; i < 15; i++) {
//			switch (i) {
//			case 0:
//				d = file1;
//				break;
//			case 1:
//				d = file2;
//				break;
//			case 2:
//				d = file3;
//				break;
//			case 3:
//				d = file4;
//				break;
//			case 4:
//				d = file5;
//				break;
//			case 5:
//				d = file6;
//				break;
//			case 6:
//				d = file7;
//				break;
//			case 7:
//				d = file8;
//				break;
//			case 8:
//				d = file9;
//				break;
//			case 9:
//				d = file10;
//				break;
//			case 10:
//				d = file11;
//				break;
//			case 11:
//				d = file12;
//				break;
//			case 12:
//				d = file13;
//				break;
//			case 13:
//				d = file14;
//				break;
//			case 14:
//				d = file15;
//				break;
//			}
//			insert(d);
//		}
//	}
//
//	void insert(node d) {
//
//		node newNode = d;
//		if (root == null)
//			root = newNode;
//		else {
//			node ptr = root;
//			while (ptr != null) {
//				if (newNode.id_no < ptr.id_no) {
//					if (ptr.left == null) {
//						ptr.left = newNode;
//						break;
//					} else
//						ptr = ptr.left;
//				} else {
//					if (ptr.right == null) {
//						ptr.right = newNode;
//						break;
//					} else
//						ptr = ptr.right;
//				}
//			}
//		}
//}
//	
//	void display(node ptr) {
//		if (ptr != null) {
//			display(ptr.left);
//			System.out.format("|%-7s| %-20s| %-34s| %-15s| %-18s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|\n",ptr.id_no,ptr.name_victim,ptr.address_victim,ptr.phone_victim,ptr.name_convict,ptr.age,ptr.gender,ptr.name_witness,ptr.crime_category,ptr.crime_location,ptr.crime_year,ptr.jail_term);
//			System.out.println("|__________________________________________________________________________________________________________________________________________________________________________________________");
//
//			display(ptr.right);
//		}
//	}
//	
//	void search_id() {
//		System.out.print("Enter ID to be searched: ");
//		int key = sc.nextInt();
//		node ptr = root;
//		int flag = 0;
//		while (ptr != null) {
//			if (key == ptr.id_no) {
//				flag = 1; // key found
//				break;
//			} else if (key < ptr.id_no) {
//				ptr = ptr.left;
//			} else {
//				ptr = ptr.right;
//			}
//		}
//		if (flag == 1) {
//			System.out.println("~File found!");
//			System.out.println();
//			System.out.println("File Id no: " + ptr.id_no);
//			System.out.println("Name of the victim: " + ptr.name_victim);
//			System.out.println("Address of the victim: " + ptr.address_victim);
//			System.out.println("Phone number of the victim: " + ptr.phone_victim);
//			System.out.println("Name of the convict: " + ptr.name_convict);
//			System.out.println("Age of the convict: " + ptr.age);
//			System.out.println("Gender of the convict: " + ptr.gender);
//			System.out.println("Name of the witness: " + ptr.name_witness);
//			System.out.println("Category of crime: "+ ptr.crime_category);
//			System.out.println("Location of the crime: " + ptr.crime_location);
//			System.out.println("Year of crime: " + ptr.crime_year);
//			System.out.println("Years of imprisonment left: " + ptr.jail_term);
//			System.out.println();
//		} else
//			System.out.println("~File not found!");
//
//	}
//	
//	void search_location() {
//		crime tree_loc = new crime();
//		System.out.print("Enter location to be searched: ");
//		String key = sc.next();
//		node ptr1 = root;	
//		Stack<node> stk1 = new Stack<>();
//		while (ptr1 != null || !stk1.isEmpty()) {
//			while (ptr1 != null) {
//				stk1.push(ptr1);
//				ptr1 = ptr1.left;
//			}
//			if (!stk1.isEmpty()) {
//				ptr1 = stk1.pop();
//				if (ptr1.crime_location.equalsIgnoreCase(key)) {
//					//copy data of ptr into a temp node
//					node temp=new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict ,ptr1.name_witness , ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender,
//							ptr1.crime_year,ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);		
//					//insert the temp node into newly created location tree
//					tree_loc.insert(temp);
//				}
//				ptr1 = ptr1.right;
//			}
//
//		}
//		if(tree_loc.root!=null) {
//			System.out.println("File details specific to location "+ key);
//			tree_loc.display(tree_loc.root);
//		}
//		else
//			System.out.println("File of location '"+key+"' not found!");
//	}
//	
//	void search_year() {
//		crime tree_yr = new crime();
//		System.out.print("Enter year to be searched: ");
//		int key = sc.nextInt();
//		node ptr1 = root;		
//		Stack<node> stk1 = new Stack<>();
//		while (ptr1 != null || !stk1.isEmpty()) {
//			while (ptr1 != null) {
//				stk1.push(ptr1);
//				ptr1 = ptr1.left;
//			}
//			if (!stk1.isEmpty()) {
//				ptr1 = stk1.pop();
//				if (ptr1.crime_year==key) {
//					//copy data of ptr into a temp node
//					node temp=new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict ,ptr1.name_witness , ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, 
//							ptr1.crime_year,ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);	
//					//insert the temp node into newly created location tree
//					tree_yr.insert(temp);
//				}
//				ptr1 = ptr1.right;
//			}
//
//		}
//		if(tree_yr.root!=null) {
//			System.out.println("File details specific to year "+ key);
//			tree_yr.display(tree_yr.root);
//		}
//		else
//			System.out.println("~File not found from year "+key);
//	}
//	
//	void search_category() {
//		crime tree_cat = new crime();
//		System.out.print("Enter crime category to be searched: ");
//		String key = sc.next();
//		node ptr1 = root;		
//		Stack<node> stk1 = new Stack<>();
//		while (ptr1 != null || !stk1.isEmpty()) {
//			while (ptr1 != null) {
//				stk1.push(ptr1);
//				ptr1 = ptr1.left;
//			}
//			if (!stk1.isEmpty()) {
//				ptr1 = stk1.pop();
//				if (key.equalsIgnoreCase(ptr1.crime_category)) {
//					//copy data of ptr into a temp node
//					node temp=new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict ,ptr1.name_witness , ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, 
//							ptr1.crime_year,ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);	
//					//insert the temp node into newly created location tree
//					tree_cat.insert(temp);
//				}
//				ptr1 = ptr1.right;
//			}
//
//		}
//		if(tree_cat.root!=null) {
//			System.out.println("File details specific to crime category "+ key);
//			tree_cat.display(tree_cat.root);
//		}
//		else
//			System.out.println("~File not found of crime category "+key);	
//	}
//	
//	void update() {
//		int flag = 0;
//		System.out.println("Enter the file ID whose data has to be updated: ");
//		int key = sc.nextInt();
//		if (root == null) // CHECK IF TREE IS EMPTY
//		{
//			System.out.println("Record is empty.");
//		} else {
//			node ptr = root;
//			while (ptr != null) // TRAVERSE THE TREE
//			{
//				if (ptr.id_no == key) {
//					flag = 1;
//					break;
//				} else if (ptr.id_no > key) {
//					ptr = ptr.left; // MOVE POINTER TO LEFT
//				} else {
//					ptr = ptr.right; // MOVE POINTER TO RIGHT
//				}
//			}
//			if (flag == 1) {
//				System.out.println("Enter the updated value of imprisonment left: ");
//				int newterm = sc.nextInt();
//				ptr.jail_term = newterm;
//				System.out.println("\t\t\tFILE DETAILS\t\t\t ");
//				System.out.println();
//				System.out.println("_______________________________________________________________________________");
//
//				System.out.format("%7s %-20s %-40s %-12s %-20s %-4s %-6s %-20s %-11s %-11s %-4s %-9s","|FILE.NO"," NAME OF VICTIM","ADDRESS OF VICTIM","PH.NO VICITIM","NAME OF CONVICT ","AGE ","GENDER","NAME OF WITNESS","CATEGORY","LOCATION","YEAR","JAIL TERM|\n");
//				System.out.println("|===============================================================================");
//				System.out.format("|%-7s %-20s %-40s %-12s %-20s %-4s %-6s %-20s %-11s %-11s %-4s %-9s\n",ptr.id_no,ptr.name_victim,ptr.address_victim,ptr.phone_victim,ptr.name_convict,ptr.age,ptr.gender,ptr.name_witness,ptr.crime_category,ptr.crime_location,ptr.crime_year,ptr.jail_term);
//				System.out.println("|________________________________________________________________________________");
//
//				System.out.println();
//			} else {
//				System.out.println("~File not found!");
//			}
//		}
//	}
//	
//	void search_loc_yr(){
//		crime tree_locYr=new crime();
//		System.out.println("Enter crime location and year to be searched respectively: ");
//		String key_loc = sc.next();
//		int key_yr=sc.nextInt();
//		node ptr1 = root;
//		int count=0;
//		Stack<node> stk1 = new Stack<>();
//		while (ptr1 != null || !stk1.isEmpty()) {
//			while (ptr1 != null) {
//				stk1.push(ptr1);
//				ptr1 = ptr1.left;
//			}
//			if (!stk1.isEmpty()) {
//				ptr1 = stk1.pop();
//				if (key_loc.equalsIgnoreCase(ptr1.crime_location) && key_yr==ptr1.crime_year) {
//					count++;
//					//copy data of ptr into a temp node
//					node temp=new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict ,ptr1.name_witness , ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, 
//							ptr1.crime_year,ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);	
//					//insert the temp node into newly created location tree
//					tree_locYr.insert(temp);
//				}
//				ptr1 = ptr1.right;
//			}
//		}
//		if(tree_locYr.root!=null) {
//			System.out.println("~File details specific to crime location "+ key_loc+" and crime year "+key_yr);
//			System.out.println("Total files found= "+count);
//			System.out.println();
//			System.out.println(
//					"===========================================================================================================================================================================================");
//
//			System.out.format(
//					"|%-7s| %-20s| %-34s| %-12s| %-20s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|",
//					"FILE.NO", " NAME OF VICTIM", "ADDRESS OF VICTIM", "PH.NO VICITIM",
//					"  NAME OF CONVICT ", "AGE ", "GENDER", "NAME OF WITNESS", "CATEGORY", "LOCATION",
//					"YEAR", "JAIL TERM|\n");
//			System.out.println(
//					"===========================================================================================================================================================================================");
//			tree_locYr.display(tree_locYr.root);
//		}
//		else
//			System.out.println("~File not found of crime location "+ key_loc+" and crime year "+key_yr);	
//	
//		
//	}
//	
//	void search_loc_cat() {
//
//		crime tree_locCat=new crime();
//		System.out.println("Enter crime location and category to be searched respectively: ");
//		String key_loc = sc.next();
//		String key_cat=sc.next();
//		node ptr1 = root;
//		int count=0;
//		Stack<node> stk1 = new Stack<>();
//		while (ptr1 != null || !stk1.isEmpty()) {
//			while (ptr1 != null) {
//				stk1.push(ptr1);
//				ptr1 = ptr1.left;
//			}
//			if (!stk1.isEmpty()) {
//				ptr1 = stk1.pop();
//				if (key_loc.equalsIgnoreCase(ptr1.crime_location) && key_cat.equalsIgnoreCase(ptr1.crime_category)) {
//					count++;
//					//copy data of ptr into a temp node
//					node temp=new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict ,ptr1.name_witness , ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, 
//							ptr1.crime_year,ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);	
//					//insert the temp node into newly created location tree
//					tree_locCat.insert(temp);
//				}
//				ptr1 = ptr1.right;
//			}
//		}
//		if(tree_locCat.root!=null) {
//			System.out.println("~File details specific to crime location "+ key_loc+" and crime category "+key_cat);
//			System.out.println("Total files found= "+count);
//			System.out.println();
//			System.out.println(
//					"===========================================================================================================================================================================================");
//
//			System.out.format(
//					"|%-7s| %-20s| %-34s| %-12s| %-20s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|",
//					"FILE.NO", " NAME OF VICTIM", "ADDRESS OF VICTIM", "PH.NO VICITIM",
//					"  NAME OF CONVICT ", "AGE ", "GENDER", "NAME OF WITNESS", "CATEGORY", "LOCATION",
//					"YEAR", "JAIL TERM|\n");
//			System.out.println(
//					"===========================================================================================================================================================================================");
//			tree_locCat.display(tree_locCat.root);
//		}
//		else
//			System.out.println("~File not found of crime location "+ key_loc+" and crime category "+key_cat);	
//	
//		
//	
//	}
//	
//	void search_cat_yr() {
//
//		crime tree_catYr=new crime();
//		System.out.println("Enter crime category and year to be searched respectively: ");
//		String key_cat = sc.next();
//		int key_yr=sc.nextInt();
//		node ptr1 = root;
//		int count=0;
//		Stack<node> stk1 = new Stack<>();
//		while (ptr1 != null || !stk1.isEmpty()) {
//			while (ptr1 != null) {
//				stk1.push(ptr1);
//				ptr1 = ptr1.left;
//			}
//			if (!stk1.isEmpty()) {
//				ptr1 = stk1.pop();
//				if (key_cat.equalsIgnoreCase(ptr1.crime_category) && key_yr==ptr1.crime_year) {
//					count++;
//					//copy data of ptr into a temp node
//					node temp=new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict ,ptr1.name_witness , ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, 
//							ptr1.crime_year,ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);	
//					//insert the temp node into newly created location tree
//					tree_catYr.insert(temp);
//				}
//				ptr1 = ptr1.right;
//			}
//		}
//		if(tree_catYr.root!=null) {
//			System.out.println("~File details specific to crime category "+ key_cat+" and crime year "+key_yr);
//			System.out.println("Total files found= "+count);
//			System.out.println();
//			System.out.println(
//					"===========================================================================================================================================================================================");
//
//			System.out.format(
//					"|%-7s| %-20s| %-34s| %-12s| %-20s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|",
//					"FILE.NO", " NAME OF VICTIM", "ADDRESS OF VICTIM", "PH.NO VICITIM",
//					"  NAME OF CONVICT ", "AGE ", "GENDER", "NAME OF WITNESS", "CATEGORY", "LOCATION",
//					"YEAR", "JAIL TERM|\n");
//			System.out.println(
//					"===========================================================================================================================================================================================");
//			tree_catYr.display(tree_catYr.root);
//		}
//		else
//			System.out.println("~File not found of crime category "+ key_cat+" and crime year "+key_yr);		
//	}
//	
//	void search_loc_cat_yr() {
//
//		crime tree_locCatYr=new crime();
//		System.out.println("Enter crime location,category and year to be searched respectively: ");
//		String key_loc = sc.next();
//		String key_cat = sc.next();
//		int key_yr=sc.nextInt();
//		node ptr1 = root;
//		int count=0;
//		Stack<node> stk1 = new Stack<>();
//		while (ptr1 != null || !stk1.isEmpty()) {
//			while (ptr1 != null) {
//				stk1.push(ptr1);
//				ptr1 = ptr1.left;
//			}
//			if (!stk1.isEmpty()) {
//				ptr1 = stk1.pop();
//				if (key_loc.equalsIgnoreCase(ptr1.crime_location) && key_yr==ptr1.crime_year && key_cat.equalsIgnoreCase(ptr1.crime_category)) {
//					count++;
//					//copy data of ptr into a temp node
//					node temp=new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict ,ptr1.name_witness , ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, 
//							ptr1.crime_year,ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);	
//					//insert the temp node into newly created location tree
//					tree_locCatYr.insert(temp);
//				}
//				ptr1 = ptr1.right;
//			}
//		}
//		if(tree_locCatYr.root!=null) {
//			System.out.println("~File details specific to crime location "+ key_loc+", category "+key_cat+" and crime year "+key_yr);
//			System.out.println("Total files found= "+count);
//			System.out.println();
//			System.out.println(
//					"===========================================================================================================================================================================================");
//
//			System.out.format(
//					"|%-7s| %-20s| %-34s| %-12s| %-20s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|",
//					"FILE.NO", " NAME OF VICTIM", "ADDRESS OF VICTIM", "PH.NO VICITIM",
//					"  NAME OF CONVICT ", "AGE ", "GENDER", "NAME OF WITNESS", "CATEGORY", "LOCATION",
//					"YEAR", "JAIL TERM|\n");
//			System.out.println(
//					"===========================================================================================================================================================================================");
//			tree_locCatYr.display(tree_locCatYr.root);
//		}
//		else
//			System.out.println("~File not found of crime location "+ key_loc+", category "+key_cat+" and crime year "+key_yr);	
//	}
//	
//	void adv_search() {
//		System.out.println("\t\t\t\t\t\t\t\t    _______________________________________");
//		System.out.println("\t\t\t\t\t\t\t\t   |	   *****ADVANCED SEARCH*****       |");
//		System.out.println("\t\t\t\t\t\t\t\t   |_______________________________________|");
//		System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-36s|\n", 1, " Search by location and year.");
//		System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-36s|\n", 2, " Search by location and category.");
//		System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-36s|\n", 3, " Search by category and year.");
//		System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-36s|\n", 4, " Search by location,year & category.");
//		System.out.println("\t\t\t\t\t\t\t\t   |_______________________________________|");
//		System.out.print("\t\t\t\t\t\t\t\t\tEnter your choice: ");
//		int choice = sc.nextInt();
//		switch(choice) {
//		case 1:
//			search_loc_yr();
//			break;
//		case 2:
//			search_loc_cat();
//			break;
//		case 3:
//			search_cat_yr();
//			break;
//		case 4:
//			search_loc_cat_yr();
//			break;
//		}
//		System.out.println("Do you want to continue advance searching?(Press 1 to continue)");
//		int ans=sc.nextInt();
//		if(ans==1)
//			adv_search();
//	}
//	
//	
//	
//	void percentage() {
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
//
