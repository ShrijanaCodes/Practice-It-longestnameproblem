/*  Just the method and the code  */
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