package cnk.air_commercialscalculationengine.settlementrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FOCTickets implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String cabinClass;
   private java.lang.String RBD;
   private int numberOfTickets;
   private double focPercentage;
   private java.lang.String fareComponent;

   public FOCTickets()
   {
   }

   public java.lang.String getCabinClass()
   {
      return this.cabinClass;
   }

   public void setCabinClass(java.lang.String cabinClass)
   {
      this.cabinClass = cabinClass;
   }

   public java.lang.String getRBD()
   {
      return this.RBD;
   }

   public void setRBD(java.lang.String RBD)
   {
      this.RBD = RBD;
   }

   public int getNumberOfTickets()
   {
      return this.numberOfTickets;
   }

   public void setNumberOfTickets(int numberOfTickets)
   {
      this.numberOfTickets = numberOfTickets;
   }

   public double getFocPercentage()
   {
      return this.focPercentage;
   }

   public void setFocPercentage(double focPercentage)
   {
      this.focPercentage = focPercentage;
   }

   public java.lang.String getFareComponent()
   {
      return this.fareComponent;
   }

   public void setFareComponent(java.lang.String fareComponent)
   {
      this.fareComponent = fareComponent;
   }

   public FOCTickets(java.lang.String cabinClass, java.lang.String RBD,
         int numberOfTickets, double focPercentage,
         java.lang.String fareComponent)
   {
      this.cabinClass = cabinClass;
      this.RBD = RBD;
      this.numberOfTickets = numberOfTickets;
      this.focPercentage = focPercentage;
      this.fareComponent = fareComponent;
   }

}