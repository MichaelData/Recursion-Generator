/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.generator;

import java.util.Random;

/**
 *Date Started:1-20-2018
 *Date:Completed:2-25-2018
 *Date Last Modified:2-25-2018
 *Version 1.0
 * @author Michael Data
 */
public class RecursionGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        * This software is meant to generate random recursions for GM's and Players
        * Currently the software does have a bug where it will random pick the same law more then once. I need to fix this. 
        */
        
        
        
        Random diceRoller = new Random();
            for (int i = 0; i < 1; i++) {
            int level = diceRoller.nextInt(8) + 1;
            System.out.println("level:" +level);
       
        //I used the level number for the nested if statements. 
        if (level == 1){
          
            System.out.println("Law:Standard Physics");
               
            Random rand = new Random();    
            int size_level1 = rand.nextInt(224) + 1;
            System.out.println("Size:"+size_level1+" feet approximately");
            System.out.println("Spark:0%");

            
            
        }
            
            else if (level == 2) {
            
            System.out.println("Law:Standard Physics");
            
            Random rand = new Random();
            int size_level2 = rand.nextInt(4999) + 1;
            
            System.out.println("Size:"+size_level2+" feet approximately");
            System.out.println("Spark:0%");
            }
            
            //From this point I've going to need netsted ifs 
            else if (level == 3) {
            
                Random rand2 = new Random();    
                int number = rand2.nextInt(1)+1;
           
                if (number == 1){
                    final String[] Laws = {"Standard Physics", "Magic", "Mad Science", "Psionics", "Substandard Physics","Exotic"};
                    Random random = new Random();
                    
                    int index = random.nextInt(Laws.length);
                    System.out.println("Law:" + Laws[index]);
                   //I'm going to need to create another nested if for sizes below a mile and above a mile or I can just say at level 3 they can't be below 1 mile or higher than 2 miles. 
                    Random rand = new Random();
                    int size_level3 = rand.nextInt(1)+1;
                    System.out.println("Size:"+size_level3+" miles in diameter");
                    int spark = rand.nextInt(4)+1;
                    System.out.println("Spark:"+spark+"%");
                                }
           
                else if (number == 2) {
                     
                    final String[] Laws = {"Standard Physics", "Magic", "Mad Science", "Psionics", "Substandard Physics","Exotic"};
                    Random random = new Random();
                    int index = random.nextInt(Laws.length);
                    int index2 = random.nextInt(Laws.length);
                    System.out.println("Law:" + Laws[index] + "," +Laws[index2]);
                    Random rand = new Random();
                    int size_level3 = rand.nextInt(1) + 1;
                    System.out.println("Size:"+size_level3+" miles in diameter");
                    int spark = rand.nextInt(4)+1;
                    System.out.println("Spark:"+spark+"%");
           }   
           
           
           }
            
        else if (level <= 5) {
            
                Random rand2 = new Random();    
                int number = rand2.nextInt(2)+1;
           
                if (number == 1){
                    final String[] Laws = {"Standard Physics", "Magic", "Mad Science", "Psionics", "Substandard Physics","Exotic"};
                    Random random = new Random();
                    
                    int index = random.nextInt(Laws.length);
                    System.out.println("Law:" + Laws[index]);
                   //I'm going to need to create another nested if for sizes below a mile and above a mile or I can just say at level 3 they can't be below 1 mile or higher than 2 miles. 
                    Random rand = new Random();
                    int size_level3 = rand.nextInt(99)+1;
                    System.out.println("Size:"+size_level3+" miles in diameter");
                    int spark = rand.nextInt(24)+1;
                    System.out.println("Spark:"+spark+"%");
                                }
           
                else if (number == 2) {
                     
                    final String[] Laws = {"Standard Physics", "Magic", "Mad Science", "Psionics", "Substandard Physics","Exotic"};
                    Random random = new Random();
                    int index = random.nextInt(Laws.length);
                    int index2 = random.nextInt(Laws.length);
                    System.out.println("Law:" + Laws[index] + "," +Laws[index2]);
                    Random rand = new Random();
                    int size_level3 = rand.nextInt(99) + 1;
                    System.out.println("Size:"+size_level3+" miles in diameter");
                    int spark = rand.nextInt(24)+1;
                    System.out.println("Spark:"+spark+"%");
                                      }   
                else if (number == 3) {
                     
                    final String[] Laws = {"Standard Physics", "Magic", "Mad Science", "Psionics", "Substandard Physics","Exotic"};
                    Random random = new Random();
                    int index = random.nextInt(Laws.length);
                    int index2 = random.nextInt(Laws.length);
                    int index3 = random.nextInt(Laws.length);
                    System.out.println("Law:" + Laws[index] + "," +Laws[index2]+ ","+Laws[index3]);
                    Random rand = new Random();
                    int size_level3 = rand.nextInt(99) + 1;
                    System.out.println("Size:"+size_level3+" miles in diameter");
                    int spark = rand.nextInt(24)+1;
                    System.out.println("Spark:"+spark+"%");
                                      }
            }
            
            
         else if (level <=9){
                Random rand2 = new Random();    
                int number = rand2.nextInt(2)+1;
           
                if (number == 1){
                    final String[] Laws = {"Standard Physics", "Magic", "Mad Science", "Psionics", "Substandard Physics","Exotic"};
                    Random random = new Random();
                    
                    int index = random.nextInt(Laws.length);
                    System.out.println("Law:" + Laws[index]);
                   //I'm going to need to create another nested if for sizes below a mile and above a mile or I can just say at level 3 they can't be below 1 mile or higher than 2 miles. 
                    Random rand = new Random();
                    int size_level3 = rand.nextInt(1000)+1;
                    System.out.println("Size:"+size_level3+" miles in diameter");
                    int spark = rand.nextInt(79)+1;
                    System.out.println("Spark:"+spark+"%");
                    
                                }
           
                else if (number == 2) {
                     
                    final String[] Laws = {"Standard Physics", "Magic", "Mad Science", "Psionics", "Substandard Physics","Exotic"};
                    Random random = new Random();
                    int index = random.nextInt(Laws.length);
                    int index2 = random.nextInt(Laws.length);
                    System.out.println("Law:" + Laws[index] + "," +Laws[index2]);
                    Random rand = new Random();
                    
                    int size_level3 = rand.nextInt(1000) + 1;
                    System.out.println("Size:"+size_level3+" miles in diameter");
                    
                    int spark = rand.nextInt(79)+1;
                    System.out.println("Spark:"+spark+"%");
                                      }   
                else if (number == 3) {
                     
                    final String[] Laws = {"Standard Physics", "Magic", "Mad Science", "Psionics", "Substandard Physics","Exotic"};
                    Random random = new Random();
                    int index = random.nextInt(Laws.length);
                    int index2 = random.nextInt(Laws.length);
                    int index3 = random.nextInt(Laws.length);
                    
                    System.out.println("Law:" + Laws[index] + "," +Laws[index2]+ ","+Laws[index3]);
                    Random rand = new Random();
                    
                    int size_level3 = rand.nextInt(1000) + 1;
                    System.out.println("Size:"+size_level3+" miles in diameter");
                    
                    int spark = rand.nextInt(79)+1;
                    System.out.println("Spark:"+spark+"%");
                                      }
            
            
            }
            
            }     
            
      
    }
}
