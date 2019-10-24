public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   /*public double average(int first, int last)
   {
       double sum = 0.0;
       for(int i = first ; i <= last; i++)
       {
        sum += scores[i];
       }
       
        sum /= (last - first) + 1;
        return sum; 
           
    }
    */
       //here so the class compiles
       
       private double average(int first, int last)
   {
       double sum = 0.0;
       for(int i = first ; i <= last; i++)
       {
        sum += scores[i];
       }
       
        sum /= (last - first) + 1;
        return sum; 
           
    }
   
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   public boolean hasImproved()
   {
       boolean increase = true; 
       for(int i = scores.length - 1; i >= 1; i --)
       
        if (scores[i-1] >= scores[i])
        return increase = false;
       
        return increase; //here so the class compiles
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
      if(hasImproved())
      return average(scores.length/2, scores.length - 1);
      else
      return average(0, scores.length -1);
      //here so the class compiles
   } 
}