package cnk.air_commercialscalculationengine;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CommercialHead implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String commercialHeadName;

   private java.lang.String nettOffCommercialHeadName;

   @org.kie.api.definition.type.Label(value = "Receivable or Payable")
   private java.lang.String commercialType;

   private boolean settlementTransactionWise;

   @org.kie.api.definition.type.Label(value = "Final or Provisional")
   private java.lang.String contractType;

   @org.kie.api.definition.type.Label(value = "Used for Standard Commercials")
   private boolean commissionable;

   @org.kie.api.definition.type.Label(value = "Used for Standard Commercials")
   private boolean markDownApplicable;

   @org.kie.api.definition.type.Label(value = "Used for Standard Commercials")
   private java.lang.String markDownClientType;

   @org.kie.api.definition.type.Label(value = "Used for Standard Commercials")
   private double minimumMarkUpPercentage;

   @org.kie.api.definition.type.Label(value = "Used for Standard Commercials")
   private double maximumMarkUpPercentage;

   @org.kie.api.definition.type.Label(value = "Used for Standard Commercials")
   private java.lang.String markUpClientType;

   private java.lang.String status;

   public CommercialHead()
   {
   }

   public java.lang.String getCommercialHeadName()
   {
      return this.commercialHeadName;
   }

   public void setCommercialHeadName(java.lang.String commercialHeadName)
   {
      this.commercialHeadName = commercialHeadName;
   }

   public java.lang.String getNettOffCommercialHeadName()
   {
      return this.nettOffCommercialHeadName;
   }

   public void setNettOffCommercialHeadName(
         java.lang.String nettOffCommercialHeadName)
   {
      this.nettOffCommercialHeadName = nettOffCommercialHeadName;
   }

   public java.lang.String getCommercialType()
   {
      return this.commercialType;
   }

   public void setCommercialType(java.lang.String commercialType)
   {
      this.commercialType = commercialType;
   }

   public boolean isSettlementTransactionWise()
   {
      return this.settlementTransactionWise;
   }

   public void setSettlementTransactionWise(boolean settlementTransactionWise)
   {
      this.settlementTransactionWise = settlementTransactionWise;
   }

   public java.lang.String getContractType()
   {
      return this.contractType;
   }

   public void setContractType(java.lang.String contractType)
   {
      this.contractType = contractType;
   }

   public boolean isCommissionable()
   {
      return this.commissionable;
   }

   public void setCommissionable(boolean commissionable)
   {
      this.commissionable = commissionable;
   }

   public boolean isMarkDownApplicable()
   {
      return this.markDownApplicable;
   }

   public void setMarkDownApplicable(boolean markDownApplicable)
   {
      this.markDownApplicable = markDownApplicable;
   }

   public java.lang.String getMarkDownClientType()
   {
      return this.markDownClientType;
   }

   public void setMarkDownClientType(java.lang.String markDownClientType)
   {
      this.markDownClientType = markDownClientType;
   }

   public double getMinimumMarkUpPercentage()
   {
      return this.minimumMarkUpPercentage;
   }

   public void setMinimumMarkUpPercentage(double minimumMarkUpPercentage)
   {
      this.minimumMarkUpPercentage = minimumMarkUpPercentage;
   }

   public double getMaximumMarkUpPercentage()
   {
      return this.maximumMarkUpPercentage;
   }

   public void setMaximumMarkUpPercentage(double maximumMarkUpPercentage)
   {
      this.maximumMarkUpPercentage = maximumMarkUpPercentage;
   }

   public java.lang.String getMarkUpClientType()
   {
      return this.markUpClientType;
   }

   public void setMarkUpClientType(java.lang.String markUpClientType)
   {
      this.markUpClientType = markUpClientType;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public CommercialHead(java.lang.String commercialHeadName,
         java.lang.String nettOffCommercialHeadName,
         java.lang.String commercialType, boolean settlementTransactionWise,
         java.lang.String contractType, boolean commissionable,
         boolean markDownApplicable, java.lang.String markDownClientType,
         double minimumMarkUpPercentage, double maximumMarkUpPercentage,
         java.lang.String markUpClientType, java.lang.String status)
   {
      this.commercialHeadName = commercialHeadName;
      this.nettOffCommercialHeadName = nettOffCommercialHeadName;
      this.commercialType = commercialType;
      this.settlementTransactionWise = settlementTransactionWise;
      this.contractType = contractType;
      this.commissionable = commissionable;
      this.markDownApplicable = markDownApplicable;
      this.markDownClientType = markDownClientType;
      this.minimumMarkUpPercentage = minimumMarkUpPercentage;
      this.maximumMarkUpPercentage = maximumMarkUpPercentage;
      this.markUpClientType = markUpClientType;
      this.status = status;
   }

}