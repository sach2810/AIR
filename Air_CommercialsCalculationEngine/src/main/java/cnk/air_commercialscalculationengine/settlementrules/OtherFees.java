package cnk.air_commercialscalculationengine.settlementrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OtherFees implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String contractType;
   private double commercialAmount;
   private java.lang.String commercialCurrency;
   private java.lang.String commercialType;
   private boolean isApplicable;
   private java.util.List<cnk.air_commercialscalculationengine.settlementrules.FeeDetails> feeDetails;

   public OtherFees()
   {
   }

   public java.lang.String getContractType()
   {
      return this.contractType;
   }

   public void setContractType(java.lang.String contractType)
   {
      this.contractType = contractType;
   }

   public double getCommercialAmount()
   {
      return this.commercialAmount;
   }

   public void setCommercialAmount(double commercialAmount)
   {
      this.commercialAmount = commercialAmount;
   }

   public java.lang.String getCommercialCurrency()
   {
      return this.commercialCurrency;
   }

   public void setCommercialCurrency(java.lang.String commercialCurrency)
   {
      this.commercialCurrency = commercialCurrency;
   }

   public java.lang.String getCommercialType()
   {
      return this.commercialType;
   }

   public void setCommercialType(java.lang.String commercialType)
   {
      this.commercialType = commercialType;
   }

   public boolean isIsApplicable()
   {
      return this.isApplicable;
   }

   public void setIsApplicable(boolean isApplicable)
   {
      this.isApplicable = isApplicable;
   }

   public java.util.List<cnk.air_commercialscalculationengine.settlementrules.FeeDetails> getFeeDetails()
   {
      return this.feeDetails;
   }

   public void setFeeDetails(
         java.util.List<cnk.air_commercialscalculationengine.settlementrules.FeeDetails> feeDetails)
   {
      this.feeDetails = feeDetails;
   }

   public OtherFees(
         java.lang.String contractType,
         double commercialAmount,
         java.lang.String commercialCurrency,
         java.lang.String commercialType,
         boolean isApplicable,
         java.util.List<cnk.air_commercialscalculationengine.settlementrules.FeeDetails> feeDetails)
   {
      this.contractType = contractType;
      this.commercialAmount = commercialAmount;
      this.commercialCurrency = commercialCurrency;
      this.commercialType = commercialType;
      this.isApplicable = isApplicable;
      this.feeDetails = feeDetails;
   }

}