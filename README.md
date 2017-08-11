# Practice-It-longestnameproblem
Problem: Write a static method named longestName that reads names typed by the user and prints the longest name (the name that contains the most characters) in the format shown below. Your method should accept a console Scanner and an integer n as parameters and should then prompt for n names.
The longest name should be printed with its first letter capitalized and all subsequent letters in lowercase, regardless of the capitalization the user used when typing in the name. If there is a tie for longest between two or more names, use the tied name that was typed earliest. Also print a message saying that there was a tie, as in the right log below. It's possible that some shorter names will tie in length, such as DANE and Erik in the left log below; but don't print a message unless the tie is between the longest names.

#Solution: 
    
    public void longestName(Scanner console, int num){
    String longest = " ";
    boolean tie = false;
    for (int i=1; i<=num; i++){
              
         System.out.print("name #" + i +"? ");
         String name = console.next();
         int x = longest.length();
         int y = name.length();
            if (y > x){
               
             longest = name;
               tie = false;
                
           }
           
              else if (y == x){
                           tie = true;
           }
       }
           String capitalized = longest.substring(0,1).toUpperCase() + longest.substring(1).toLowerCase();
           System.out.println(capitalized +"'s name is longest");
           
               if (tie){
                   System.out.println("(There was a tie!)");
               }
        
           
       }
