package cnk.air_commercialscalculationengine;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FareBreakUp implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private double baseFare;

   private java.util.List<cnk.air_commercialscalculationengine.TaxDetails> taxDetails;

   public FareBreakUp()
   {
   }

   public double getBaseFare()
   {
      return this.baseFare;
   }

   public void setBaseFare(double baseFare)
   {
      this.baseFare = baseFare;
   }

   public java.util.List<cnk.air_commercialscalculationengine.TaxDetails> getTaxDetails()
   {
      return this.taxDetails;
   }

   public void setTaxDetails(
         java.util.List<cnk.air_commercialscalculationengine.TaxDetails> taxDetails)
   {
      this.taxDetails = taxDetails;
   }

   public FareBreakUp(
         double baseFare,
         java.util.List<cnk.air_commercialscalculationengine.TaxDetails> taxDetails)
   {
      this.baseFare = baseFare;
      this.taxDetails = taxDetails;
   }

}