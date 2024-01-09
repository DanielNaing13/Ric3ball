/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class assignmentcafe {

    static String type;
    static double total = 0;
    static String Tem;
    static String Size;
    static String flavor;
    static String fv;
    static String f;
    static String f2;
    static String another;
    static String cream;
    static String whippedcream;
    static String all;
    static String deli;
    static String name;
    static String cphone;
    static String caddress;
    static String pickup;
    static int pickuptime;
    static String pay;
    static String[] coffee = {"espresso", "americano", "latte", "cappuccino", "mocha"};

    public static void main(String[] args) {
        System.out.println("Welcome to Sunset Cafe");

        System.out.println("Avaliables Coffees");
        coffee();
    }
    //type of coffee

    public static void coffee() {

        Scanner s = new Scanner(System.in);

        System.out.println("1.Espresso");
        System.out.println("2.Americano");
        System.out.println("3.Latte");
        System.out.println("4.Cappuccino");
        System.out.println("5.Mocha");
        System.out.println("Choose your coffee");
        type = s.nextLine();
        if (type.equalsIgnoreCase(coffee[0])) {

            System.out.println("You choose " + type);
            temperature();
        } else if (type.equalsIgnoreCase(coffee[1])) {

            System.out.println("You choose " + type);
            temperature();
        } else if (type.equalsIgnoreCase(coffee[2])) {

            System.out.println("You choose " + type);
            temperature();
        } else if (type.equalsIgnoreCase(coffee[3])) {

            System.out.println("You choose " + type);
            temperature();
        } else if (type.equalsIgnoreCase(coffee[4])) {

            System.out.println("You choose " + type);
            temperature();
        } else {
            System.out.println("Choose the correct coffee");
            coffee();
        }

    }
    //choose the temperature

    public static void temperature() {
        Scanner s = new Scanner(System.in);
        System.out.println("Avaliables Temperatures");
        System.out.println("1.Hot");
        System.out.println("2.Cold");
        System.out.println("Choose your temperatures");
        Tem = s.nextLine();
        if (type.equals("Espresso") || !Tem.equalsIgnoreCase("Hot")) {
            System.out.println("You choose Hot Espresso");
            total += 3000;
            size();
        } else if (type.equals("Espresso") || !Tem.equalsIgnoreCase("Cold")) {
            System.out.println("You choose Cold Espresso");
            total += 3600;
            size();
        } else if (type.equals("Americano") || !Tem.equalsIgnoreCase("Hot")) {
            System.out.println("You choose Hot Americano");
            total += 3000;
            size();
        } else if (type.equals("Americano") || !Tem.equalsIgnoreCase("Cold")) {
            System.out.println("You choose Cold Americano");
            total += 3500;
            size();
        } else if (type.equals("Cappuccino") || !Tem.equalsIgnoreCase("Hot")) {
            System.out.println("You choose Hot Cappucinno");
            total += 3400;
            size();
        } else if (type.equals("Cappuccino") || !Tem.equalsIgnoreCase("Cold")) {
            System.out.println("You choose Cold Cappuccino");
            total += 3800;
            size();
        } else if (type.equals("Latte") || !Tem.equalsIgnoreCase("Hot")) {
            System.out.println("You choose Hot Latte");
            total += 3200;
            size();
        } else if (type.equals("Latte") || !Tem.equalsIgnoreCase("Cold")) {
            System.out.println("You choose Cold Latte");
            total += 4000;
            size();
        } else if (type.equals("Mocha") || !Tem.equalsIgnoreCase("Hot")) {
            System.out.println("You choose Hot Mocha");
            total += 3500;
            size();
        } else if (type.equals("Mocha") || !Tem.equalsIgnoreCase("Cold")) {
            System.out.println("You choose Cold Mocha");
            total += 4000;
            size();
        } else {

            System.out.println("Choose the correct temperature");
            temperature();
        }

    }       //choose the size

    public static void size() {
        Scanner s = new Scanner(System.in);
        System.out.println("Avaliable Sizes");
        if (type.equalsIgnoreCase("Espresso") || type.equalsIgnoreCase("Americano")) {
            System.out.println("Only Medium is avaliable.");
            flavor();
        } else {
            System.out.println("1.S");
            System.out.println("2.M");
            System.out.println("3.L");
            System.out.println("Choose your sizes");
            Size = s.nextLine();
            if (Size.equalsIgnoreCase("S")) {
                System.out.println("You choose small");
                total += 0;
                flavor();
            } else if (Size.equalsIgnoreCase("M")) {
                System.out.println("You choose medium");
                total += 500;
                flavor();
            } else if (Size.equalsIgnoreCase("L")) {
                System.out.println("You choose large");
                total += 1000;
                flavor();
            } else {
                System.out.println("Please choose the correct size");
                size();
            }

        }

    }
    //choose the flavor 1

    public static void flavor() {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to add flavor");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.println("Choose here");
        flavor = s.nextLine();
        if (flavor.equalsIgnoreCase("Yes")) {

            System.out.println("Avaliable flavor shots");

            System.out.println("1: Vanilla");
            System.out.println("2: Raspberry");
            System.out.println("3: Cherry");
            System.out.println("4: Peach");
            System.out.println("Choose flavor shot");
            f = s.nextLine();
            if (f.equalsIgnoreCase("Vanilla")) {
                System.out.println("You choose vanilla");
                total += 1500;
                flavor2();
            } else if (f.equalsIgnoreCase("Raspberry")) {
                System.out.println("You choose Rasberry");
                total += 2000;
                flavor2();
            } else if (f.equalsIgnoreCase("Cherry")) {
                System.out.println("You choose Cherry");
                total += 2000;
                flavor2();
            } else if (f.equalsIgnoreCase("Peach")) {
                System.out.println("You choose Peach");
                total += 2300;
                flavor2();
            } else {
                System.out.println("Choose the correct flavor");
                flavor();
            }

        } else if (flavor.equalsIgnoreCase("no")) {
            cream();
        } else {
            System.out.println("Please choose the correct one");
            flavor();
        }
    }

    public static void flavor2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to add another?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        another = s.nextLine();
        if (another.equalsIgnoreCase("Yes")) {
            System.out.println("Avaliable flavor shots");

            System.out.println("1: Vanilla");
            System.out.println("2: Raspberry");
            System.out.println("3: Cherry");
            System.out.println("4: Peach");
            System.out.println("Choose flavor shot");
            f2 = s.nextLine();
            if (f2.equalsIgnoreCase("Vanilla")) {
                System.out.println("You choose vanilla");
                total += 1500;
                cream();
            } else if (f2.equalsIgnoreCase("Raspberry")) {
                System.out.println("You choose Rasberry");
                total += 2000;
                cream();
            } else if (f2.equalsIgnoreCase("Cherry")) {
                System.out.println("You choose Cherry");
                total += 2000;
                cream();
            } else if (f2.equalsIgnoreCase("Peach")) {
                System.out.println("You choose Peach");
                total += 2300;
                cream();
            } else {
                System.out.println("Choose the correct flavor");
                flavor2();
            }

        } else if (another.equalsIgnoreCase("No")) {
            cream();
        } else {
            System.out.println("Enter Yes or No correctly");
            flavor2();
        }
    }

    //choose the cream
    public static void cream() {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to add whipped cream?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        whippedcream = s.nextLine();
        if (whippedcream.equalsIgnoreCase("Yes")) {
            System.out.println("Avaliable whipped creams");
            System.out.println("1.Original");
            System.out.println("2.Salted Caramel");
            System.out.println("3.Chocolate");
            System.out.println("4.Matcha");
            System.out.println("Choose the whipped cream");
            cream = s.nextLine();
            if (cream.equalsIgnoreCase("Original")) {
                System.out.println("You choose Original");
                total += 2000;
                willthatbeall();
            } else if (cream.equalsIgnoreCase("Salted Caramel")) {
                System.out.println("You choose Salted Caramel");
                total += 1000;
                willthatbeall();
            } else if (cream.equalsIgnoreCase("Chocolate")) {
                System.out.println("You choose Chocolate");
                total += 2300;
                willthatbeall();
            } else if (cream.equalsIgnoreCase("Matcha")) {
                System.out.println("You choose Matcha");
                total += 1800;
                willthatbeall();
            } else {
                System.out.println("Choose the correct cream");
                cream();

            }
        } else {
            willthatbeall();
        }

    }

    //correct order
    public static void willthatbeall() {
        Scanner s = new Scanner(System.in);
        System.out.println("Is your order correct?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.println("Choose here");
        all = s.nextLine();
        if (all.equalsIgnoreCase("Yes")) {
            System.out.println("Enjoy your drink");
            deli();
        } else if (all.equalsIgnoreCase("no")) {
            coffee();
        } else {
            System.out.println("please choose the correct one");
            willthatbeall();
        }

    }       //delivery

    public static void deli() {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want delivery?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        deli = s.nextLine();
        if (deli.equalsIgnoreCase("Yes")) {
            System.out.println("Enter customer name");
            name = s.nextLine();
            System.out.println("Enter customer phone number");
            cphone = s.nextLine();
            System.out.println("Enter customer address");
            caddress = s.nextLine();
            pay();
        } else if (deli.equalsIgnoreCase("No")) {
            pickup();
        } else {
            deli();
        }

    }       //pickup

    public static void pickup() {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want pick-up?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        pickup = s.nextLine();
        if (pickup.equalsIgnoreCase("Yes")) {
            System.out.println("Enter customer name");
            name = s.nextLine();
            System.out.println("Cafe phone number is 120xxxxx56");
            System.out.println("Cafe address is No 5/2. 1st street, XY township");
            System.out.println("Enter the time to pick up between from 12pm to 18pm");
            System.out.println("Please chooose the approximate time in hour");
            pickuptime = s.nextInt();
            if (pickuptime == 12 || pickuptime == 13 || pickuptime == 14 || pickuptime == 15 || pickuptime == 16 || pickuptime == 17 || pickuptime == 18) {
                pay();
            } else {
                System.out.println("Please choose the correct time");
                pickup();
            }

        } else {
            deli();
        }
    }

    public static void pay() {
        Scanner s = new Scanner(System.in);
        System.out.println("How would you like to pay for the coffee");
        System.out.println("1.Cash");
        System.out.println("2.Mobile banking");
        pay = s.nextLine();

        if (pay.equalsIgnoreCase("Cash")) {
            System.out.println("Here's your reciept");
            reciept();
        } else if (pay.equalsIgnoreCase("Mobile banking")) {
            System.out.println("Here's the phone number to transaction");
            System.out.println("09-102XXXXXX56");
            reciept();
        } else {
            pay();
        }
    }//reciept

    public static void reciept() {
        System.out.println("Here's your reciept");
        if (deli.equalsIgnoreCase("Yes")) {
            System.out.printf("Your total will be %,.2f\n ", total);
            System.out.println("Your order is " + type);
            System.out.println("Your coffee temperature is " + Tem);
            if (flavor.equalsIgnoreCase("yes")) {
                System.out.println("You added " + f);
                if (another.equalsIgnoreCase("yes")) {
                    System.out.println("You added " + f2);
                } else {
                    System.out.println("You didn't add another flavor shot.");
                }
            } else {
                System.out.println("No flavor shots added.");
            }
            if (whippedcream.equalsIgnoreCase("Yes")) {
                System.out.println("You added " + cream);
            } else {
                System.out.println("No whipped cream is added");
            }

            System.out.println("The customer name is " + name);
            System.out.println("The customer phone number is " + cphone);
            System.out.println("The customer address is " + caddress);
            System.out.println("Enjoy your coffee!");
        } else if (deli.equalsIgnoreCase("No") && pickup.equalsIgnoreCase("yes")) {
            System.out.printf("Your total will be %.2f\n ", total);
            System.out.println("Your order is " + type);
            System.out.println("Your coffee temperature is " + Tem);
            if (flavor.equalsIgnoreCase("yes")) {
                System.out.println("You added " + f);
                if (another.equalsIgnoreCase("yes")) {
                    System.out.println("You added " + f2);
                } else {
                    System.out.println("You didn't add another flavor shot.");
                }
            } else {
                System.out.println("No flavor shots added.");
            }
            if (whippedcream.equalsIgnoreCase("No")) {
                System.out.println("No whipped cream is added");
            } else {
                System.out.println("You added " + cream);
            }
            System.out.println("The customer name is " + name);
            if (pickup.equalsIgnoreCase("Yes")) {
                System.out.println("The pick up time is " + pickuptime + " pm");
            }
            System.out.println("Enjoy your coffee");
        }

    }

}

                        
                        


                        
                            
                        

                                                      
                        
                
            
        
   
                
            

        
    


                    
                    
        
        
        
       
                    
        
  

    

