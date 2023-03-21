import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String password = "rass";
		operations records = new operations();
		int count = 0;
		System.out.println("\t\t\t\t\t\t\t\t\t CRIMINAL RECORD MANAGEMENT");
		System.out.println("\t\t\t\t\t\t\t\t------------------------------------------");

		for (int i = 0; i < 2; i++) {
			boolean flag = true;
			System.out.print("\n\t\t\t\t\t\t\t\t\tEnter the login password:");
			String pw = sc.next();
			if (pw.equals(password)) 
				records.create(records);
		     
			while (flag == true) {
				if (pw.equals(password)) {
					//records.create(records);
					System.out.println("\t\t\t\t\t\t\t\t    _________________________________");
					System.out.println("\t\t\t\t\t\t\t\t   |	    *****MENU***** 	     |");
					System.out.println("\t\t\t\t\t\t\t\t   |_________________________________|");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 1, " Add new record. ");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 2, " Display all records.");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 3, " Search by file ID.");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 4, " Search by crime location.");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 5, " Search by year.");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 6, " Search by crime category.");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 7, " Advance Search.");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 8, " Update status.");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 9, " Crime rate Analysis.");
					System.out.format("\t\t\t\t\t\t\t\t   |%2d|" + "%-30s|\n", 0, " LOG OUT.");
					System.out.println("\t\t\t\t\t\t\t\t   |__|______________________________|");
					System.out.print("\t\t\t\t\t\t\t\t\t Enter your choice: ");
					int choice = sc.nextInt();
					switch (choice) {
					case 0:
						System.out.println("\n\t\t\t\t\t\t\t\t\t Logged out successfully!");
						System.exit(0);
						break;
					case 1:
						int flag1 = 0;
						int id;
						do {
							System.out.print("\n\t\t\t\t\t\t Enter File Id no: ");
							id = sc.nextInt();
							node ptr = records.root;
							int flag2 = 0;
							while (ptr != null) {
								if (id == ptr.id_no) {
									flag2 = 1; // key found
									break;
								} else if (id < ptr.id_no) {
									ptr = ptr.left;
								} else {
									ptr = ptr.right;
								}
							}
							if (flag2 == 1) {
								System.out.print("\n\t\t\t\t\t\t~ File ID no. already exist !!!!"); 

							} else
								flag1 = 1;

						} 
						while (flag1 == 0);
						System.out.print("\n\t\t\t\t\t\t Enter Name of the victim: ");
						sc.nextLine();
						String nameVictim = sc.nextLine();
						System.out.print("\n\t\t\t\t\t\t Enter Address of the victim: ");
						//sc.nextLine();
						String addVictim = sc.nextLine();
						System.out.print("\n\t\t\t\t\t\t Enter Phone number of the victim: ");
						String phnVictim = sc.next();
						while (phnVictim.length() != 10) {
							System.out.print("\n\t\t\t\t\t\t ~ Invalid Phone number !!!\n\t\t\t\t\t\t Please enter again: ");
							phnVictim = sc.next();
						}
						System.out.print("\n\t\t\t\t\t\t Enter Name of the convict: ");
						sc.nextLine();
						String nameConvict = sc.nextLine();
						System.out.print("\n\t\t\t\t\t\t Enter Age of the convict: ");
						int ageConvict = sc.nextInt();
						System.out.print("\n\t\t\t\t\t\t Enter Gender of the convict: ");
						String genderConvict = sc.next();
						System.out.print("\n\t\t\t\t\t\t Enter Name of the witness: ");
						sc.nextLine();
						String nameWitness = sc.nextLine();
						System.out.print("\n\t\t\t\t\t\t Enter Category of crime: ");
						String crimeCat = sc.next();
						System.out.print("\n\t\t\t\t\t\t Enter Location of the crime: ");
						String crimeLoc = sc.next();
						System.out.print("\n\t\t\t\t\t\t Enter Year of crime: ");
						int crimeYr = sc.nextInt();
						System.out.print("\n\t\t\t\t\t\t Enter Years of imprisonment: ");
						int jailTerm = sc.nextInt();
						node addnode = new node(id, nameVictim, nameConvict, nameWitness, phnVictim, addVictim,
								ageConvict, genderConvict, crimeYr, crimeLoc, crimeCat, jailTerm);
						records.insert(addnode);
						records.noFiles++;                              //Increment total number of files in the record
						System.out.print("\n\t\t\t\t\t\t~File added succesfully!\n");
						break;
					case 2:
						System.out.println();
						records.formatting();
						records.display(records.root);
						break;
					case 3:
						records.search_id();
						break;
					case 4:
						operations tree_loc = new operations();
						System.out.print("\n\t\t\t\t\t\tEnter location to be searched: ");
						String keyLoc = sc.next(); // location to be searched
						tree_loc = records.search_location(keyLoc);
						if (tree_loc != null) {
							System.out.print("\n\t\t\t\t\t\t Total files found= " + tree_loc.count);
							System.out.print("\n\t\t\t\t\t\t File details specific to location " + keyLoc+" :");
							records.formatting();
							tree_loc.display(tree_loc.root);
						} else
							System.out.print("\n\t\t\t\t\t\t~ File of location " + keyLoc + " not found!");

						break;
					case 5:
						operations tree_yr = new operations(); // tree to store files with required category
						System.out.print("\n\t\t\t\t\t\t Enter year to be searched: ");
						int keyYr = sc.nextInt();
						tree_yr = records.search_year(keyYr);
						if (tree_yr != null) {
							System.out.print("\n\t\t\t\t\t\t Total files found= " + tree_yr.count);
							System.out.print("\n\t\t\t\t\t\t File details specific to year " + keyYr);
							records.formatting();
							tree_yr.display(tree_yr.root);
						} else
							System.out.print("\n\t\t\t\t\t\t~ File of location " + keyYr + " not found!");
						break;
					case 6:
						operations tree_cat = new operations(); // tree to store files with required category
						System.out.print("\n\t\t\t\t\t\t Enter crime category to be searched: ");
						String keyCat = sc.next();
						tree_cat = records.search_category(keyCat);
						if (tree_cat != null) {
							System.out.print("\n\t\t\t\t\t\t Total files found= " + tree_cat.count);
							System.out.print("\n\t\t\t\t\t\t File details specific to crime category " + keyCat+" :");
							records.formatting();
							tree_cat.display(tree_cat.root);
						} else
							System.out.print("\n\t\t\t\t\t\t~ File of location " + keyCat + " not found!");

						break;
					case 7:
						records.adv_search(records);
						break;
					case 8:
						records.update();
						break;
					case 9:
						records.analysis(records);
						break;
					default:
						System.out.print("\n\t\t\t\t\t\t~ Invalid choice!\n");
						break;

					}
				} else if (count < 2) {
					System.out.print("\n\t\t\t\t\t\t\t\t\t~ Incorrect Password !\n");
					count++;
					flag = false;
				}
			}
			if (flag == false && count == 2) {
				System.out.print("\n\t\t\t\t\t\t\t\t\t**** Access Denied ! ****");
				System.exit(0);
			}
		}
	}
}




