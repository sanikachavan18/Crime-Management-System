import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;

class operations { // crime class
	DecimalFormat df = new DecimalFormat("0.00");
	Scanner sc = new Scanner(System.in);
	node root;
	int count = 0,noFiles;

	operations() {
		root = null;
	}

	void create(operations records) { // creating BST for file database
		node d = null;
		// OLD FILE DATABASE
		node file1 = new node(352, "Ramesh Goyal", "Suresh Chettri", "Rahul Sharma", "9739273661",
				"91,Subhash Nagar,Bhopal", 40, "Male", 2022, "Pune", "Murder", 12);
		node file2 = new node(572, "Vaishnavi Godhal", "Aditi Sharama", "Rakesh Bajaj", "9739093166",
				"101,Lane 2,Karvenagar,Pune", 28, "Female", 2018, "Pune", "Robbery", 1);
		node file3 = new node(106, "Suman Wagh", "Gopal Jha", "Rakesh Kumar", "973909366", "12,Lane 5,Manewada,Nagpur",
				25, "Male", 2015, "Nagpur", "Rape", 30);
		node file4 = new node(115, "Subhash Kumar", "Swamini Surjuse", "Rahul Dhoni", "9564721970",
				"991,Swaroopa Nagar,Indore", 44, "Female", 2020, "Nashik", "drugs", 20);
		node file5 = new node(132, "Umesh Parikh", "Suresh Mittal", "Diksha Kumar", "8515451000", "2,Sakharwada,Latur",
				32, "Male", 2019, "Kolhapur", "fraud", 5.5f);
		node file6 = new node(206, "Ritesh Jain", "Saviya Seth", "Hitesh Patel", "8515459920",
				"602,Jogeshwar Nagar,Surat", 22, "Female", 2020, "Satara", "Assault", 0.5f);
		node file7 = new node(122, "Lalit Goyal", "Ashish Bhai", "Sugadh Patel", "8505452220",
				"81,Bapu Chowk,Gandhinagar", 34, "Male", 2021, "Pune", "Kidnap", 7);
		node file8 = new node(203, "Lila Kalara", "Aditi Modi", "Jatin Mehta", "973909966",
				"11,Lane 9,Lakshmi Nagar ,Kolkata", 38, "Female", 2018, "Pune", "Murder", 1.5f);
		node file9 = new node(420, "Asif Ali", "Digambar Wani", "Sukhir Shah", "9721212106", "13,Akbar Nagar ,Delhi",
				31, "Male", 2018, "Nashik", "Rape", 30);
		node file10 = new node(111, "Amar Khusro", "Ashish Shubh", "Sadhu Singh", "8505212450",
				"35,Manindar Chowk,Chandigarh", 41, "Male", 2021, "Pune", "Murder", 10);
		node file11 = new node(221, "Soor Kalara", "Vallabh Modi", "Jatin Tirtha", "973901166",
				"01,Lane 9,Lakshmi Nagar ,Mumbai", 48, "Male", 2018, "Mumbai", "Assault", 0.5f);
		node file12 = new node(432, "Aditya Kadam", "Suresh Varma", "Pratik Sharma", "8515451000",
				"5,Ravivaarpeth,Latur", 35, "Male", 2019, "Kolhapur", "Fraud", 5.5f);
		node file13 = new node(112, "Lucky Singh", "Subhash Waliya", "Fatima Sinha ", "8515133570",
				"16,Nilam Shah,Gondia", 22, "Male", 2020, "Mumbai", "Rape", 10);
		node file14 = new node(323, "Akbar Khan", "Wahid Sheikh", "Abdul Khan ", "9725550106",
				"51,Chandni Chowk ,Delhi", 37, "Male", 2020, "Nashik", "Kidnap", 7.5f);
		node file15 = new node(109, "Niyati Mallya", "Mayuri Jain", "Mehul Choksi", "9738484566",
				"41,Lane 5,Subhash Nagar ,Kolkata", 28, "Female", 2020, "Mumbai", "Murder", 15);
		node file16 = new node(561, "Urvi Ghosh", "Preeti Shukla", "Surabhi Rathod", "9739290564",
				"61,Subhash Nagar,Delhi", 29, "Female", 2020, "Nagpur", "Kidnap", 5);

		for (int i = 0; i < 16; i++) {
			switch (i) {
			case 0:
				d = file1;
				break;
			case 1:
				d = file2;
				break;
			case 2:
				d = file3;
				break;
			case 3:
				d = file4;
				break;
			case 4:
				d = file5;
				break;
			case 5:
				d = file6;
				break;
			case 6:
				d = file7;
				break;
			case 7:
				d = file8;
				break;
			case 8:
				d = file9;
				break;
			case 9:
				d = file10;
				break;
			case 10:
				d = file11;
				break;
			case 11:
				d = file12;
				break;
			case 12:
				d = file13;
				break;
			case 13:
				d = file14;
				break;
			case 14:
				d = file15;
				break;
			case 15:
				d = file16;
				break;
			}
			records.insert(d); // inserting file nodes in record BST
			records.noFiles++;
		}
	}

	void insert(node d) { // inserting node function
		node newNode = d;
		if (root == null)
			root = newNode;
		else {
			node ptr = root;
			while (ptr != null) {
				if (newNode.id_no < ptr.id_no) { // compare file ID of new file to be added and prev files
					if (ptr.left == null) { // traverse left
						ptr.left = newNode;
						break;
					} else
						ptr = ptr.left;
				} else { // traverse right
					if (ptr.right == null) {
						ptr.right = newNode;
						break;
					} else
						ptr = ptr.right;
				}
			}
		}
	}

	void display(node ptr) { // display using recursive inorder traversal
		if (ptr != null) {
			display(ptr.left);
			System.out.format("|%-7s| %-20s| %-34s| %-15s| %-18s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|\n",
					ptr.id_no, ptr.name_victim, ptr.address_victim, ptr.phone_victim, ptr.name_convict, ptr.age,
					ptr.gender, ptr.name_witness, ptr.crime_category, ptr.crime_location, ptr.crime_year,
					ptr.jail_term);
			System.out.println(
					"|__________________________________________________________________________________________________________________________________________________________________________________________");

			display(ptr.right);
		}
	}

	void search_id() { // search by file ID function
		System.out.print("\n\t\t\t\t\t\t> Enter ID to be searched: ");
		int key = sc.nextInt();
		node ptr = root;
		int flag = 0;
		while (ptr != null) {
			if (key == ptr.id_no) {
				flag = 1; // key found
				break;
			} else if (key < ptr.id_no) {
				ptr = ptr.left;
			} else {
				ptr = ptr.right;
			}
		}
		if (flag == 1) {
			System.out.print("\n\t\t\t\t\t\t>> File found!"); // print file details

			System.out.println();
			System.out.print("\n\t\t\t\t\t\t>> File details specific to id " + key);
			formatting();
			System.out.format("|%-7s| %-20s| %-34s| %-15s| %-18s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|\n",
					ptr.id_no, ptr.name_victim, ptr.address_victim, ptr.phone_victim, ptr.name_convict, ptr.age,
					ptr.gender, ptr.name_witness, ptr.crime_category, ptr.crime_location, ptr.crime_year,
					ptr.jail_term);
			System.out.println(
					"|__________________________________________________________________________________________________________________________________________________________________________________________");
		} else {

			System.out.print("\n\t\t\t\t\t\t~> File not found!");
		}
	}

	operations search_location(String key) { // search by crime location
		operations t = new operations(); // tree to store files with required location
		node ptr1 = root;
		Stack<node> stk1 = new Stack<>(); // stack for non recursive inorder traversal
		while (ptr1 != null || !stk1.isEmpty()) { // non-recursive inorder traversal
			while (ptr1 != null) {
				stk1.push(ptr1);
				ptr1 = ptr1.left;
			}
			if (!stk1.isEmpty()) {
				ptr1 = stk1.pop();
				if (ptr1.crime_location.equalsIgnoreCase(key)) {
					t.count++;
					// copy data of ptr into a temp node
					node temp = new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict, ptr1.name_witness,
							ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, ptr1.crime_year,
							ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);
					// insert the temp node into newly created location tree
					t.insert(temp);
				}
				ptr1 = ptr1.right;
			}
		}
		// display tree with particular location
		if (t.root != null) {
			return t;
		} else
			return null;
	}

	operations search_year(int key) { // search by crime year
		operations t = new operations(); // temp tree to store files with required year
		node ptr1 = root;
		Stack<node> stk1 = new Stack<>();
		while (ptr1 != null || !stk1.isEmpty()) {
			while (ptr1 != null) {
				stk1.push(ptr1);
				ptr1 = ptr1.left;
			}
			if (!stk1.isEmpty()) {
				ptr1 = stk1.pop();
				if (ptr1.crime_year == key) {
					t.count++;
					// copy data of ptr into a temp node
					node temp = new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict, ptr1.name_witness,
							ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, ptr1.crime_year,
							ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);
					// insert the temp node into newly created year tree
					t.insert(temp);
				}
				ptr1 = ptr1.right;
			}
		}
		if (t.root != null) {
			return t;
		} else
			return null;
	}

	operations search_category(String key) { // search by crime category
		operations t = new operations();
		node ptr1 = root;
		Stack<node> stk1 = new Stack<>();
		while (ptr1 != null || !stk1.isEmpty()) {
			while (ptr1 != null) {
				stk1.push(ptr1);
				ptr1 = ptr1.left;
			}
			if (!stk1.isEmpty()) {
				ptr1 = stk1.pop();
				if (key.equalsIgnoreCase(ptr1.crime_category)) {
					t.count++;
					// copy data of ptr into a temp node
					node temp = new node(ptr1.id_no, ptr1.name_victim, ptr1.name_convict, ptr1.name_witness,
							ptr1.phone_victim, ptr1.address_victim, ptr1.age, ptr1.gender, ptr1.crime_year,
							ptr1.crime_location, ptr1.crime_category, ptr1.jail_term);
					// insert the temp node into newly created category tree
					t.insert(temp);
				}
				ptr1 = ptr1.right;
			}
		}
		if (t.root != null) {
			return t;
		} else {
			return null;
		}
	}

	void update() { // updating imprisonment statement
		int flag = 0;
		System.out.print("\n\t\t\t\t\t\t> Enter the file ID whose data has to be updated: ");
		int key = sc.nextInt();
		if (root == null) // CHECK IF TREE IS EMPTY
		{
			System.out.print("\n\t\t\t\t\t\t~> Record is empty!");
		} else {
			node ptr = root;
			while (ptr != null) // TRAVERSE THE TREE
			{
				if (ptr.id_no == key) {
					flag = 1;
					break;
				} else if (ptr.id_no > key) {
					ptr = ptr.left; // MOVE POINTER TO LEFT
				} else {
					ptr = ptr.right; // MOVE POINTER TO RIGHT
				}
			}
			if (flag == 1) {
				System.out.print("\n\t\t\t\t\t\t> Enter the updated value of imprisonment left: ");
				int newterm = sc.nextInt();
				ptr.jail_term = newterm;
				if(newterm==0)
				{
					System.out.print("\n\t\t\t\t\t\t>>Bail granted!");
				}
				System.out.println();
				System.out.print("\n\t\t\t\t\t\t>> File details specific to id " + key);
				formatting();
				System.out.format("|%-7s| %-20s| %-34s| %-15s| %-18s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|\n",
						ptr.id_no, ptr.name_victim, ptr.address_victim, ptr.phone_victim, ptr.name_convict, ptr.age,
						ptr.gender, ptr.name_witness, ptr.crime_category, ptr.crime_location, ptr.crime_year,
						ptr.jail_term);
				System.out.println(
						"|__________________________________________________________________________________________________________________________________________________________________________________________");
			} else {
				System.out.println("\n\t\t\t\t\t\t~> File not found!");
			}
		}
	}

	void formatting() {
		System.out.println(
				"\n===========================================================================================================================================================================================");
		System.out.format("|%-7s| %-20s| %-33s | %-15s| %-18s| %-4s| %-10s| %-20s| %-11s| %-11s| %-4s| %-9s|", "FILE.NO",
				" NAME OF VICTIM", "ADDRESS OF VICTIM", "PH.NO VICITIM", "  NAME OF CONVICT ", "AGE ", "GENDER",
				"NAME OF WITNESS", "CATEGORY", "LOCATION", "YEAR", "JAIL TERM|\n");
		System.out.println(
				"===========================================================================================================================================================================================");

	}

	void adv_search(operations records) { // Advancing Search
		operations tree_loc = new operations();
		operations tree_yr = new operations();
		operations tree_cat = new operations();
		String keyLoc, keyCat;
		int keyYr;
		System.out.println("\t\t\t\t\t\t\t         _______________________________________");
		System.out.println("\t\t\t\t\t\t\t        |	 *****ADVANCED SEARCH*****      |");
		System.out.println("\t\t\t\t\t\t\t        |_______________________________________|");
		System.out.format("\t\t\t\t\t\t\t        |%2d|" + "%-36s|\n", 1, " Search by location and year.");
		System.out.format("\t\t\t\t\t\t\t        |%2d|" + "%-36s|\n", 2, " Search by location and category.");
		System.out.format("\t\t\t\t\t\t\t        |%2d|" + "%-36s|\n", 3, " Search by category and year.");
		System.out.format("\t\t\t\t\t\t\t        |%2d|" + "%-36s|\n", 4, " Search by location,year & category.");
		System.out.println("\t\t\t\t\t\t\t        |__|____________________________________|");
		System.out.print("\t\t\t\t\t\t\t\t\tEnter your choice: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			tree_loc = new operations();
			tree_yr = new operations(); // tree to store files with required category
			System.out.print("\n\t\t\t\t\t\t> Enter location to be searched: ");
			keyLoc = sc.next(); // location to be searched
			System.out.print("\n\t\t\t\t\t\t> Enter year to be searched: ");
			keyYr = sc.nextInt();
			tree_loc = records.search_location(keyLoc);
			if (tree_loc == null)
				System.out.print("\n\t\t\t\t\t\t~> File of location " + keyLoc + " and year " + keyYr + " not found!");
			else {
				tree_yr = tree_loc.search_year(keyYr);
				if (tree_yr != null) {
					System.out.print("\n\t\t\t\t\t\t>> Total files found= " + tree_yr.count);
					System.out.print("\n\t\t\t\t\t\t>> File details specific to location " + keyLoc + " and year " + keyYr);
					formatting();
					tree_yr.display(tree_yr.root);
				} else
					System.out.print("\n\t\t\t\t\t\t~> File of location " + keyLoc + " and year " + keyYr + " not found!");
			}
			break;
		case 2:
			tree_loc = new operations();
			tree_cat = new operations();
			System.out.print("\n\t\t\t\t\t\t> Enter location to be searched: ");
			keyLoc = sc.next();
			System.out.print("\n\t\t\t\t\t\t> Enter crime category to be searched: ");
			keyCat = sc.next();
			tree_loc = records.search_location(keyLoc);
			if (tree_loc == null)
				System.out.print("\n\t\t\t\t\t\t~> File of location " + keyLoc + " and category " + keyCat + " not found!");
			else {
				tree_cat = tree_loc.search_category(keyCat);
				if (tree_cat != null) {
					System.out.print("\n\t\t\t\t\t\t>> Total files found= " + tree_cat.count);
					System.out.print("\n\t\t\t\t\t\t>> File details specific to location " + keyLoc + " and category " + keyCat);
					formatting();
					tree_cat.display(tree_cat.root);
				} else
					System.out.print("\n\t\t\t\t\t\t~> File of location " + keyLoc + " and category " + keyCat + " not found!");
			}
			break;
		case 3:
			tree_cat = new operations();
			tree_yr = new operations();
			System.out.print("\n\t\t\t\t\t\t> Enter crime category to be searched: ");
			keyCat = sc.next();
			System.out.print("\n\t\t\t\t\t\t> Enter year to be searched: ");
			keyYr = sc.nextInt();
			tree_cat = records.search_category(keyCat);
			if (tree_cat == null)
				System.out.print("\n\t\t\t\t\t\t~> File of Category " + keyCat + " and year " + keyYr + " not found!");
			else {
				tree_yr = tree_cat.search_year(keyYr);
				if (tree_yr != null) {
					System.out.print("\n\t\t\t\t\t\t>> Total files found= " + tree_yr.count);
					System.out.print("\n\t\t\t\t\t\t>> File details specific to category " + keyCat + " and year " + keyYr);
					formatting();
					tree_yr.display(tree_yr.root);
				} else
					System.out.print("\n\t\t\t\t\t\t~> File of Category " + keyCat + " and year " + keyYr + " not found!");
			}
			break;
		case 4:
			tree_loc = new operations();
			tree_cat = new operations();
			tree_yr = new operations();
			System.out.print("\n\t\t\t\t\t\t> Enter location to be searched: ");
			keyLoc = sc.next();
			System.out.print("\n\t\t\t\t\t\t> Enter crime category to be searched: ");
			keyCat = sc.next();
			System.out.print("\n\t\t\t\t\t\t> Enter year to be searched: ");
			keyYr = sc.nextInt();
			tree_loc = records.search_location(keyLoc);
			if (tree_loc == null)
				System.out.print("\n\t\t\t\t\t\t~> File of location " + keyLoc + ", category " + keyCat + " and year " + keyYr + " not found!");
			else {
				tree_cat = tree_loc.search_category(keyCat);
				if (tree_cat == null)
					System.out.print("\n\t\t\t\t\t\t~> File of location " + keyLoc + ", category " + keyCat + " and year " + keyYr
							+ " not found!");
				else {
					tree_yr = tree_cat.search_year(keyYr);
					if (tree_yr != null) {
						System.out.print("\n\t\t\t\t\t\t>> Total files found= " + tree_yr.count);
						System.out.print("\n\t\t\t\t\t\t>> File details specific to location " + keyLoc + ", category " + keyCat
								+ " and year " + keyYr);
						formatting();
						tree_yr.display(tree_yr.root);
					} else
						System.out.print("\n\t\t\t\t\t\t~> File of location " + keyLoc + ", category " + keyCat + " and year " + keyYr
								+ " not found!");
				}
			}
			break;
		 default:
			 System.out.println("\n\t\t\t\t\t\t Invalid Choice!");
			 break;
		}
		System.out.print("\n\t\t\t\t\t\t> Do you want to continue advance searching?(Press 0 to discontinue): ");
		int ans = sc.nextInt();
		if (ans == 1)
			adv_search(records);
	}
	
	void barChart(int x[]) {
		String a[][]=new String[8][x.length];	//array of rows and column of the graph
		for(int c=0;c<x.length;c++) {
			int t=x[c];							//temp variable intialized to the count value
			for(int r=0;r<8;r++) {				
				if((8-r)==t) {					
					a[r][c]="|  |";
					t--;
				}
				else if((8-r)==(t+1)) 
					a[r][c]=" __ ";
				else 					
					a[r][c]="    ";				
			}
		}
		for(int i=0;i<8;i++) {
			System.out.print("\t\t\t\t\t\t|\t");
			for(int j=0;j<x.length;j++) {
				System.out.format("%-10s",a[i][j]);					
			}
			System.out.print("\t\t|");
			System.out.println();

		}
		
	}
	

	
	void analysis(operations records) {
		int i;
		int locper[]= new int[6];
		String locations[]= {"PUNE","NAGPUR","NASHIK","KOLHAPUR","SATARA","MUMBAI"};
		int catper[]= new int[7];
		String category[]= {"MURDER","ROBBERY","RAPE","DRUGS","ASSAULT","KIDNAP","FRAUD"};
		int[] yrper= new int[5];
		int yr[]= {2018,2019,2020,2021,2022};
		System.out.println("\t\t\t\t\t\t\t         _______________________________________");
		System.out.println("\t\t\t\t\t\t\t        |	  *****RATE ANALYSIS*****       |");
		System.out.println("\t\t\t\t\t\t\t        |_______________________________________|");
		System.out.format("\t\t\t\t\t\t\t        |%2d|" + "%-36s|\n", 1, " By location");
		System.out.format("\t\t\t\t\t\t\t        |%2d|" + "%-36s|\n", 2, " By category.");
		System.out.format("\t\t\t\t\t\t\t        |%2d|" + "%-36s|\n", 3, " By year.");
		System.out.println("\t\t\t\t\t\t\t        |__|____________________________________|");
		System.out.print("\t\t\t\t\t\t\t\t\t> Enter your choice: ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			operations treeLoc=new operations();
			for(i=0;i<locper.length;i++) {
				treeLoc=records.search_location(locations[i]);
				if(treeLoc==null) {
					locper[i]=0;
					continue;
				}
				locper[i]=treeLoc.count;
			}
			System.out.println("\n\n\t\t\t\t\t\tLOCATION WISE CRIME RATE ANALYSIS:\n");
			System.out.println(
					"\t\t\t\t\t\t==============================================================================");
			System.out.format("\t\t\t\t\t\t|%-9s|", "LOCATIONS ");
			for(i=0;i<locations.length;i++) {
				System.out.format("%-10s|", locations[i]);
			}
			System.out.println(
					"\n\t\t\t\t\t\t|==========|==========|==========|==========|==========|==========|==========|");
			System.out.format("\t\t\t\t\t\t|%-9s|", "CRIME RATE");
			for(i=0;i<locper.length;i++) {
				System.out.format("%-10s|", df.format((locper[i]*100)/records.noFiles)+" %");
			}
			System.out.println(
					"\n\t\t\t\t\t\t|__________|__________|__________|__________|__________|__________|__________|");
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t BAR CHART");
			System.out.println("\t\t\t\t\t\t _______________________________________________________________________________");
			barChart(locper);
			System.out.format("\t\t\t\t\t\t|\t %-71s|\n","");
			System.out.format("\t\t\t\t\t\t|\t");
			for(i=0;i<locations.length;i++) {
				System.out.format("%-10s", locations[i]);
			}
			System.out.print("\t\t|");
			System.out.println("\n\t\t\t\t\t\t|_______________________________________________________________________________|");
			int max = locper[0];
			for (i = 1; i < locper.length; i++)
	            if (locper[i] > max)
	                max = locper[i];
			int min = locper[0];
			for (i = 1; i < locper.length; i++)
	            if (locper[i] < min)
	                min = locper[i];
			for (i = 0; i < locations.length; i++)
		            if (locper[i] == max)
		            	System.out.println("\n\t\t\t\t\t\t\t\t==>"+locations[i]+" has the maximum crime rate.");
			for (i = 0; i < locations.length; i++)
	            	if (locper[i] == min)
	            		System.out.println("\n\t\t\t\t\t\t\t\t==>"+locations[i]+" has the minimum crime rate.");
			break;
		case 2:
			operations treeCat=new operations();
			for(i=0;i<catper.length;i++) {
				treeCat=records.search_category(category[i]);
				if(treeCat==null) {
					catper[i]=0;
					continue;
				}
				catper[i]=treeCat.count;
			}
			System.out.println("\n\n\t\t\t\t\t\tCRIME CATEGORY WISE CRIME RATE ANALYSIS:\n");
			System.out.println(
					"\t\t\t\t\t\t=========================================================================================");
			System.out.format("\t\t\t\t\t\t|%-9s|", "CATEGORY  ");
			for(i=0;i<category.length;i++) {
				System.out.format("%-10s|", category[i]);
			}
			System.out.println(
					"\n\t\t\t\t\t\t|==========|==========|==========|==========|==========|==========|==========|==========|");
			System.out.format("\t\t\t\t\t\t|%-9s|", "CRIME RATE");
			for(i=0;i<catper.length;i++) {
				System.out.format("%-10s|", df.format((catper[i]*100)/records.noFiles)+" %");
			}
			System.out.println(
					"\n\t\t\t\t\t\t|__________|__________|__________|__________|__________|__________|__________|__________|");
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t BAR CHART");
			System.out.println("\t\t\t\t\t\t ________________________________________________________________________________________");
			barChart(catper);
			System.out.format("\t\t\t\t\t\t|\t %-79s|\n","");
			System.out.format("\t\t\t\t\t\t|\t");
			for(i=0;i<category.length;i++) {
				System.out.format("%-10s", category[i]);
			}
			System.out.print("\t\t|");
			System.out.println("\n\t\t\t\t\t\t|_______________________________________________________________________________________|");
			max = catper[0];
			for (i = 1; i < catper.length; i++)
	            if (catper[i] > max)
	                max = catper[i];
			min = catper[0];
			for (i = 1; i < catper.length; i++)
	            if (catper[i] < min)
	                min = catper[i];
			for (i = 0; i < category.length; i++)
		        if (catper[i] == max)
		            	System.out.println("\n\t\t\t\t\t\t\t\t==>"+category[i]+" has the maximum crime rate.");
			for (i = 0; i < category.length; i++)
				if (catper[i] == min)
	            	System.out.println("\n\t\t\t\t\t\t\t\t==>"+category[i]+" has the minimum crime rate.");
			break;
		case 3:
			operations treeyr=new operations();
			for(i=0;i<yrper.length;i++) {
				treeyr=records.search_year(yr[i]);
				if(treeyr==null) {
					yrper[i]=0;
					continue;
				}
				yrper[i]=treeyr.count;
			}
			System.out.println("\n\n\t\t\t\t\t\tYEAR WISE CRIME RATE ANALYSIS:\n");
			System.out.println(
					"\t\t\t\t\t\t===================================================================");
			System.out.format("\t\t\t\t\t\t|%-9s|", "  YEAR    ");
			for(i=0;i<yr.length;i++) {
				System.out.format("%-10s|", yr[i]);
			}
			System.out.println(
					"\n\t\t\t\t\t\t|==========|==========|==========|==========|==========|==========|");
			System.out.format("\t\t\t\t\t\t|%-9s|", "CRIME RATE");
			for(i=0;i<yrper.length;i++) {
				System.out.format("%-10s|", df.format((yrper[i]*100)/records.noFiles)+" %");
			}
			System.out.println(
					"\n\t\t\t\t\t\t|__________|__________|__________|__________|__________|__________|");
			System.out.println("\n\t\t\t\t\t\t\t\t\t\t BAR CHART");
			System.out.println("\t\t\t\t\t\t ________________________________________________________________________");
			barChart(yrper);
			System.out.format("\t\t\t\t\t\t|\t %-63s|\n","");
			System.out.format("\t\t\t\t\t\t|\t");
			for(i=0;i<yr.length;i++) {
				System.out.format("%-10s", yr[i]);
			}
			System.out.print("\t\t|");
			System.out.println("\n\t\t\t\t\t\t|_______________________________________________________________________|");
			max = yrper[0];
			for (i = 1; i < yrper.length; i++)
	            if (yrper[i] > max)
	                max = yrper[i];
			for (i = 0; i < yr.length; i++)
	            if (yrper[i] == max)
	            	System.out.println("\n\t\t\t\t\t\t\t\t==>"+yr[i]+" has the maximum crime rate.");
			min = yrper[0];
			for (i = 1; i < yrper.length; i++)
	            if (yrper[i] < min)
	                min = yrper[i];
			for (i = 0; i < yr.length; i++)
	            if (yrper[i] == min)
	            	System.out.println("\n\t\t\t\t\t\t\t\t==>"+yr[i]+" has the minimum crime rate.");
			break;
		default:
			 System.out.println("\n\t\t\t\t\t\t Invalid Choice!");
			 break;
		}
		System.out.print("\n\t\t\t\t\t\t> Do you want to continue advance searching?(Press 0 to discontinue): ");
		int ans = sc.nextInt();
		if (ans == 1)
			analysis(records);
	}
}
