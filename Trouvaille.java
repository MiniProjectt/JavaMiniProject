import java.util.Scanner;

public class Trouvaille {
	
	public static void main(String[] args) {
		int total_fare1,a;
		Scanner scanner=new Scanner(System.in);
		System.out.println("\t\t\t\t_____________________________");
		System.out.println("\n\t\t\t\t| TROUVAILLE TRAVEL AGENCY |");
		System.out.println("\t\t\t\t_____________________________");
		
		
		System.out.println("\n\t\t\t*********\t\t\t\t*********");
		System.out.println("\t\t\t* USER  *\t\t\t\t* ADMIN *");
		System.out.println("\t\t\t*********\t\t\t\t*********");
		int choice_1=scanner.nextInt();
		switch(choice_1)
		{
		case 1:
				{
		
				
					System.out.println("1 -> BOOK A TRIP\n");
					System.out.println("2 -> OUR SERVICES\n");
					System.out.println("3 -> APPLY FOR VISA\n");
					System.out.println("4 -> ABOUT US\n");
					
					int choice_2=scanner.nextInt();
					switch(choice_2)
					{
								case 1:
								{
									System.out.println("\n1>GOA(3 DAYS 2 NIGHTS)\n9,500/-per head(excluding travel charges)");
									System.out.println("\n2>KERELA(2 DAYS 1 NIGHT)\n10,000/-per head(excluding travel charges)");
									System.out.println("\n3>SHIMLA N MANALI(4 DAYS 5 NIGHTS)\n12,000/-per head(excluding travel charges)");
									System.out.println("\n4>JAMMU N KASHMIR(3 DAYS 2 NIGHTS)\n10,000/-per head(excluding travel charges)");
									System.out.println("\n5>SIKKIM(5 DAYS 4 NIGHTS)\n15,000/-per head(excluding travel charges)");
									int choice_3=scanner.nextInt();
									
									System.out.println("PLEASE ENTER YOUR TRAVEL MODE : ");
									System.out.println("1> FLIGHT \n2> TRAIN");
									int mode=scanner.nextInt();
									
									System.out.println("ENTER THE NUMBER OF PASSENGERS : ");
									int no_of_pass=scanner.nextInt();
									
								switch(choice_3)
									{
								case 1:
								{
									if(mode==1)
										{
											flight f1=new flight();
											f1.info(no_of_pass);
											System.out.println("SELECT THE CATEGORY OF SEAT : ");
											a = f1.category_seat(no_of_pass);
											
											
											total_fare1=a+(9500*no_of_pass);
											System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
											
											
										}
										else if(mode==2)
										{
											train t1= new train();
											t1.info(no_of_pass);
											System.out.println("SELECT THE CATEGORY OF SEAT : ");
											a = t1.category_seat(no_of_pass);
											
											total_fare1=a+(9500*no_of_pass);
											System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
										}
										else
										{
											System.out.print("WRONG CHOICE");
										}
									break;
								}
									
									
								case 2:
								{
									if(mode==1)
									{
										flight f1=new flight();
										f1.info(no_of_pass);
										System.out.println("SELECT THE CATEGORY OF SEAT : ");
										a = f1.category_seat(no_of_pass);
										
										total_fare1=a+(10000*no_of_pass);
										System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
									}
									else if(mode==2)
									{
										train t1= new train();
										t1.info(no_of_pass);
										System.out.println("SELECT THE CATEGORY OF SEAT : ");
										a = t1.category_seat(no_of_pass);
										
										total_fare1=a+(10000*no_of_pass);
										System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
									}
									else
									{
										System.out.print("WRONG CHOICE");
									}
									break;
									
								}
								case 3:
								{
									if(mode==1)
									{
										flight f1=new flight();
										f1.info(no_of_pass);
										System.out.println("SELECT THE CATEGORY OF SEAT : ");
										a = f1.category_seat(no_of_pass);
										
										total_fare1=a+(12000*no_of_pass);
										System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
									}
									else if(mode==2)
									{
										train t1= new train();
										t1.info(no_of_pass);
										System.out.println("SELECT THE CATEGORY OF SEAT : ");
										a = t1.category_seat(no_of_pass);
										
									    total_fare1=a+(12000*no_of_pass);
									    System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
									}
									else
									{
										System.out.print("WRONG CHOICE");
									}
									break;
									
								}
								case 4:
								{
									if(mode==1)
									{
										flight f1=new flight();
										f1.info(no_of_pass);
										System.out.println("SELECT THE CATEGORY OF SEAT : ");
										a = f1.category_seat(no_of_pass);
										
										total_fare1=a+(10000*no_of_pass);
										System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
									}
									else if(mode==2)
									{
										train t1= new train();
										t1.info(no_of_pass);
										System.out.println("SELECT THE CATEGORY OF SEAT : ");
										a = t1.category_seat(no_of_pass);
										
										total_fare1=a+(10000*no_of_pass);
										System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
									}
									else
									{
										System.out.print("WRONG CHOICE");
									}
									break;
								}
								case 5:
								{
									if(mode==1)
									{
										flight f1=new flight();
										f1.info(no_of_pass);
										System.out.println("SELECT THE CATEGORY OF SEAT : ");
										a = f1.category_seat(no_of_pass);
										
									    total_fare1=a+(15000*no_of_pass);
									    System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
									}
									else if(mode==2)
									{
										train t1= new train();
										t1.info(no_of_pass);
										System.out.println("SELECT THE CATEGORY OF SEAT : ");
										a = t1.category_seat(no_of_pass);
										
										total_fare1=a+(15000*no_of_pass);
										System.out.println("TOTAL AMOUNT OF BOOKING : "+total_fare1+"\t\t\t");
									}
									else
									{
										System.out.print("WRONG CHOICE");
									}
								}
								break;
								
								}
								System.out.print("BOOKING SUCCESSFULLY CONFIRMED!!");
								break;
					}
								case 2 :
								{
									System.out.println("\nOUR SERVICES\n ");
									System.out.println("\n1 > Flight Reservations ");
									System.out.println("\n2 > Leisure Travel");
									System.out.println("\n3 > Car Hire");
									System.out.println("\n4 > Delivery service");
									System.out.println("\n5 > Airline Loyalty");
									System.out.println("\n6 > Visas");
									System.out.println("\n7 > Travel insurance");
									System.out.println("\n8 > Emergency Services");
									
									
									
									
									break;
								}
								case 3 :
								{
									System.out.println("APPLY FOR VISA HERE !!");
									System.out.println("ENTER YOUR NAME :");
									String name1=scanner.next();
									System.out.println("ENTER YOUR AGE :");
									int age1=scanner.nextInt();
									System.out.println("ENTER YOUR ADHAAR CARD NUMBER :");
									String adhaar=scanner.next();
									System.out.println("ENTER THE COUNTRY : ");
									String country=scanner.next();
									System.out.println("ENTER YOUR CONTACT NUMBER");
									String contact1 = scanner.next();
									System.out.println("ENTER YOUR CONTACT ADDRESS");
									String address1=scanner.next();
									System.out.println("\n\n\nYOUR DETAILS :");
									System.out.println("NAME\t\tAGE\t\tADHAAR NO\t\tCOUNTRY\t\tCONTACT NO \t\tADDRESS");
									System.out.println(name1+"\t\t"+age1+"\t\t"+adhaar+"\t\t"+country+"\t\t"+contact1+"\t\t"+address1);
									System.out.println("\n\n\n!!! VISA APPLIED SUCCESSFULLY !!!");
									
									break;
								}
								case 4 :
								{
									System.out.println("\t\t\t\t\t\tTROUVAILLE TRAVEL AGENCY\n\n\n");
									System.out.println("“Travel is the main thing you purchase that makes you more extravagant”. ");
									System.out.println("We, at TROUVAILLE TRAVEL AGENCY, swear by this and put stock in satisfying travel dreams that make you perpetually rich constantly.");
									System.out.println("We have been moving excellent encounters for a considerable length of time through our cutting edge planned occasion bundles and other fundamental travel administrations. ");
									System.out.println("We rouse our clients to carry on with a rich life, brimming with extraordinary travel encounters.");
									System.out.println("\n\nThrough our exceptionally curated occasion bundles, we need to take you on an adventure where you personally enjoy with the stunning magnificence of India and far off terrains. ");
									System.out.println("We need you to observe sensational scenes that are a long ways past your creative ability.");
									System.out.println("The powerful inclination of Indian voyagers to travel more nowadays is something that keeps us inspired to satisfy your vacation necessities.");
									System.out.println("Our vision to give you a consistent occasion encounter makes us one of the main visit administrators in the regularly extending travel industry.");
									System.out.println("To guarantee that you have a satisfied occasion and healthy encounters, all our vacation administrations are available to your no matter what.");
									System.out.println("Our online visa administrations are exceptional and make the bulky procedure of booking visa a cake stroll for clients.");
									System.out.println("We likewise give exceptional visa, forex and travel protection and outside settlement administrations for understudies voyaging abroad for study.");
									System.out.println("Regardless of whether it’s reserving flights or inns for your movement, COmpany Name offers everything under one umbrella.");
									System.out.println("We likewise have journey occasions for individuals who are searching for solace and reasonable extravagance.");
									System.out.println("\n\nWe offer best limits on our top rated visit bundles to clients who pick our viable administrations over and over. ");
									System.out.println("\n\n\nHow about we remind you indeed that we don’t expect to be your visit and travel specialists; we endeavor to be your vacation accomplices until the end of time.");
									System.out.println("\n\nTHANK YOU !!");
									break;
								}
				
								
					}
					break;
				}
					case 2:
					{
							System.out.println("ENTER THE PASSWORD :\n");
							int psswd;
							psswd=scanner.nextInt();
							
							if(psswd==00)
								{
									System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~\n");
									System.out.println("\t\t\t\tPASSENGER's DATABASE :\n");
									System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~\n");
									System.out.println("NAME\t\t\tAGE\t\t\tADDRESS");
									System.out.println("KISHU\t\t\t20\t\t\tPUNE");
									System.out.println("PUNYA\t\t\t19\t\t\tPUNE");
									System.out.println("SATYA\t\t\t20\t\t\tPUNE");
									System.out.println("SAMIA\t\t\t19\t\t\tPUNE");
									
									
									
								}
							else
								{
									System.out.println("WRONG PASSWORD !! TRY AGAIN PLEASE");
								}
							break;
						
					}
			
		
		}
		
		
		
		
		
	}
		}
	

interface travel_mode
{
	
	public int category_seat(int no_of_pass);
	public void info(int no_of_pass);

	
}



class flight implements travel_mode
{
	
	
	int fare,total_fare;
	Scanner scanner=new Scanner(System.in);
	
	
	public void info(int no_of_pass)
	{
		String name[]=new String[no_of_pass];
		int age[]=new int[no_of_pass];
		String address[]=new String[no_of_pass];
		for(int i=0;i<no_of_pass;i++)
		{
		System.out.println("Enter the name of passenger : ");
		name[i] = scanner.next();
		System.out.println("Enter the age of passenger : ");
		age[i]=scanner.nextInt();
		System.out.println("Enter the address of passenger : ");
		address[i]=scanner.next();
		
		
	}
		System.out.println("NAME\t\t\tAGE\t\t\tADDRESS");
		for(int i=0;i<no_of_pass;i++)
		{
			System.out.println(name[i]+"\t\t\t"+age[i]+"\t\t\t"+address[i]);
		}
		
	}
	
	
	public int category_seat(int no_of_pass)
	{
		int choice_4;
		System.out.println("1> BUSINESS CLASS(8,000/- per head");
		System.out.println("2> ECONOMY CLASS(5,000/- per head");
	    choice_4=scanner.nextInt();
		switch(choice_4)
		{
		case 1:
		{
			fare=8000;
			break;
		}
		case 2:
		{
			fare=5000;
			break;
		}
		
		}
		total_fare = (fare)*(no_of_pass) ;
		return total_fare;
	}
	
	
	

	
}




class train implements travel_mode
{
	int fare,total_fare;
	Scanner scanner=new Scanner(System.in);
	public void info(int no_of_pass)
	{
		String name[]=new String[no_of_pass];
		int age[]=new int[no_of_pass];
		String address[]=new String[no_of_pass];
		for(int i=0;i<no_of_pass;i++)
		{
		System.out.println("Enter the name of passenger : ");
		name[i] = scanner.next();
		System.out.println("Enter the age of passenger : ");
		age[i]=scanner.nextInt();
		System.out.println("Enter the address of passenger : ");
		address[i]=scanner.next();
	}

		System.out.println("NAME\t\t\tAGE\t\t\tADDRESS");
		for(int i=0;i<no_of_pass;i++)
		{
			System.out.println(name[i]+"\t\t\t"+age[i]+"\t\t\t"+address[i]);
		}
	}
	
	
	public int category_seat(int no_of_pass)
	{
		int choice_4;
		System.out.println("1> SLEEPER (800/- per head");
		System.out.println("2> AC 3 (1200/- per head");
		System.out.println("3> AC 2 (1500/- per head");
	    choice_4=scanner.nextInt();
		switch(choice_4)
		{
		case 1:
		{
			fare=800;
			break;
		}
		case 2:
		{
			fare=1200;
			break;
		}
		case 3:
		{
			fare=1500;
			break;
		}
		
		}
		 total_fare=(fare)*(no_of_pass);
		 return total_fare;
	}
	

		
}
