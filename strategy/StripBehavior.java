package strategy;

/**
 * StripBehavior implements DefenseBehavior
 * Outputs the result of the ball being stripped if that action is selected
 */
public class StripBehavior implements DefenseBehavior {
   public String play() 
   {
       return "Strip a ball from runners hands";
   } 
}