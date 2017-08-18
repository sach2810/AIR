package cnk.air_commercialscalculationengine;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CommercialDetails implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String commercialName;
   private double commercialInitialAmount;
   private double commercialCalculationPercentage;
   private double commercialCalculationAmount;
   private double commercialAmount;
   private double commercialTotalAmount;
   private java.lang.String commercialCurrency;
   private java.lang.String commercialFareComponent;
   private FareBreakUp fareBreakUp;

   public CommercialDetails()
   {
   }

   public java.lang.String getCommercialName()
   {
      return this.commercialName;
   }

   public void setCommercialName(java.lang.String commercialName)
   {
      this.commercialName = commercialName;
   }

   public double getCommercialInitialAmount()
   {
      return this.commercialInitialAmount;
   }

   public void setCommercialInitialAmount(double commercialInitialAmount)
   {
      this.commercialInitialAmount = commercialInitialAmount;
   }

   public double getCommercialCalculationPercentage()
   {
      return this.commercialCalculationPercentage;
   }

   public void setCommercialCalculationPercentage(
         double commercialCalculationPercentage)
   {
      this.commercialCalculationPercentage = commercialCalculationPercentage;
   }

   public double getCommercialCalculationAmount()
   {
      return this.commercialCalculationAmount;
   }

   public void setCommercialCalculationAmount(
         double commercialCalculationAmount)
   {
      this.commercialCalculationAmount = commercialCalculationAmount;
   }

   public double getCommercialAmount()
   {
      return this.commercialAmount;
   }

   public void setCommercialAmount(double commercialAmount)
   {
      this.commercialAmount = commercialAmount;
   }

   public double getCommercialTotalAmount()
   {
      return this.commercialTotalAmount;
   }

   public void setCommercialTotalAmount(double commercialTotalAmount)
   {
      this.commercialTotalAmount = commercialTotalAmount;
   }

   public java.lang.String getCommercialCurrency()
   {
      return this.commercialCurrency;
   }

   public void setCommercialCurrency(java.lang.String commercialCurrency)
   {
      this.commercialCurrency = commercialCurrency;
   }

   public java.lang.String getCommercialFareComponent()
   {
      return this.commercialFareComponent;
   }

   public void setCommercialFareComponent(
         java.lang.String commercialFareComponent)
   {
      this.commercialFareComponent = commercialFareComponent;
   }

   public cnk.air_commercialscalculationengine.FareBreakUp getFareBreakUp()
   {
      return this.fareBreakUp;
   }

   public void setFareBreakUp(
         cnk.air_commercialscalculationengine.FareBreakUp fareBreakUp)
   {
      this.fareBreakUp = fareBreakUp;
   }

   public CommercialDetails(java.lang.String commercialName,
         double commercialInitialAmount, double commercialCalculationPercentage,
         double commercialCalculationAmount, double commercialAmount,
         double commercialTotalAmount, java.lang.String commercialCurrency,
         java.lang.String commercialFareComponent,
         cnk.air_commercialscalculationengine.FareBreakUp fareBreakUp)
   {
      this.commercialName = commercialName;
      this.commercialInitialAmount = commercialInitialAmount;
      this.commercialCalculationPercentage = commercialCalculationPercentage;
      this.commercialCalculationAmount = commercialCalculationAmount;
      this.commercialAmount = commercialAmount;
      this.commercialTotalAmount = commercialTotalAmount;
      this.commercialCurrency = commercialCurrency;
      this.commercialFareComponent = commercialFareComponent;
      this.fareBreakUp = fareBreakUp;
   }

}