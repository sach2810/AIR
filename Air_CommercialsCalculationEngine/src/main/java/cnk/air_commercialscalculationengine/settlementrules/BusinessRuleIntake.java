package cnk.air_commercialscalculationengine.settlementrules;

import java.util.Arrays;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BusinessRuleIntake implements java.io.Serializable
{
   private AdvancedDefinition advancedDefinition;

   private cnk.air_commercialscalculationengine.settlementrules.IncentiveOnTopUp incentiveOnTopUp;

   private cnk.air_commercialscalculationengine.settlementrules.PenaltyFee penaltyFee;

   private cnk.air_commercialscalculationengine.settlementrules.TerminationFee terminationFee;

   private cnk.air_commercialscalculationengine.settlementrules.MSFFee msfFee;

   private cnk.air_commercialscalculationengine.settlementrules.MaintenanceFee maintenanceFee;

   private cnk.air_commercialscalculationengine.settlementrules.IntegrationFee integrationFee;

   private cnk.air_commercialscalculationengine.settlementrules.LicenceFee licenceFee;

   private cnk.air_commercialscalculationengine.settlementrules.WebServiceFee webServiceFee;

   private cnk.air_commercialscalculationengine.settlementrules.LoyaltyBonus loyaltyBonus;

   private cnk.air_commercialscalculationengine.settlementrules.PreferenceBenefit preferenceBenefit;

   private cnk.air_commercialscalculationengine.settlementrules.RetainerFee retainerFee;

   private cnk.air_commercialscalculationengine.settlementrules.ListingFee listingFee;

   private cnk.air_commercialscalculationengine.settlementrules.SignUpFee signUpFee;

   private cnk.air_commercialscalculationengine.settlementrules.ContentAccessFee contentAccessFee;

   private cnk.air_commercialscalculationengine.settlementrules.TrainingFee trainingFee;

   private cnk.air_commercialscalculationengine.settlementrules.SignUpBonus signUpBonus;

   private cnk.air_commercialscalculationengine.settlementrules.RemittanceFee remittanceFee;

   public void modifyIncentiveOnTopUp(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getIncentiveOnTopUp() != null)
      {

         this.getIncentiveOnTopUp().setCommercialType(commercialType);
         this.getIncentiveOnTopUp().setContractType(contractType);
         this.getIncentiveOnTopUp().setIsApplicable(isApplicable);
      }
   }

   public void modifyPenaltyFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getPenaltyFee() != null)
      {

         this.getPenaltyFee().setCommercialType(commercialType);
         this.getPenaltyFee().setContractType(contractType);
         this.getPenaltyFee().setIsApplicable(isApplicable);
      }
   }

   public void modifyTerminationFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getTerminationFee() != null)
      {

         this.getTerminationFee().setCommercialType(commercialType);
         this.getTerminationFee().setContractType(contractType);
         this.getTerminationFee().setIsApplicable(isApplicable);
      }
   }

   public void modifyMsfFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getMsfFee() != null)
      {

         this.getMsfFee().setCommercialType(commercialType);
         this.getMsfFee().setContractType(contractType);
         this.getMsfFee().setIsApplicable(isApplicable);
      }
   }

   public void modifyMaintenanceFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getMaintenanceFee() != null)
      {

         this.getMaintenanceFee().getOtherFees().setCommercialType(commercialType);
         this.getMaintenanceFee().getOtherFees().setContractType(contractType);
         this.getMaintenanceFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyIntegrationFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getIntegrationFee() != null)
      {

         this.getIntegrationFee().getOtherFees().setCommercialType(commercialType);
         this.getIntegrationFee().getOtherFees().setContractType(contractType);
         this.getIntegrationFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyLicenceFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getLicenceFee() != null)
      {

         this.getLicenceFee().getOtherFees().setCommercialType(commercialType);
         this.getLicenceFee().getOtherFees().setContractType(contractType);
         this.getLicenceFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyWebServiceFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getWebServiceFee() != null)
      {

         this.getWebServiceFee().getOtherFees().setCommercialType(commercialType);
         this.getWebServiceFee().getOtherFees().setContractType(contractType);
         this.getWebServiceFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyLoyaltyBonus(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getLoyaltyBonus() != null)
      {

         this.getLoyaltyBonus().getOtherFees().setCommercialType(commercialType);
         this.getLoyaltyBonus().getOtherFees().setContractType(contractType);
         this.getLoyaltyBonus().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyPreferenceBenefit(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getPreferenceBenefit() != null)
      {

         this.getPreferenceBenefit().getOtherFees().setCommercialType(commercialType);
         this.getPreferenceBenefit().getOtherFees().setContractType(contractType);
         this.getPreferenceBenefit().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyRetainerFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getRetainerFee() != null)
      {

         this.getRetainerFee().getOtherFees().setCommercialType(commercialType);
         this.getRetainerFee().getOtherFees().setContractType(contractType);
         this.getRetainerFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyListingFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getListingFee() != null)
      {

         this.getListingFee().getOtherFees().setCommercialType(commercialType);
         this.getListingFee().getOtherFees().setContractType(contractType);
         this.getListingFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifySignUpFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getSignUpFee() != null)
      {

         this.getSignUpFee().getOtherFees().setCommercialType(commercialType);
         this.getSignUpFee().getOtherFees().setContractType(contractType);
         this.getSignUpFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyContentAccessFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getContentAccessFee() != null)
      {

         this.getContentAccessFee().getOtherFees().setCommercialType(commercialType);
         this.getContentAccessFee().getOtherFees().setContractType(contractType);
         this.getContentAccessFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifyTrainingFee(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getTrainingFee() != null)
      {

         this.getTrainingFee().getOtherFees().setCommercialType(commercialType);
         this.getTrainingFee().getOtherFees().setContractType(contractType);
         this.getTrainingFee().getOtherFees().setIsApplicable(isApplicable);
      }
   }

   public void modifySignUpBonus(String commercialType, String contractType, boolean isApplicable)
   {

      if (this.getSignUpBonus() != null)
      {

         this.getSignUpBonus().setCommercialType(commercialType);
         this.getSignUpBonus().setContractType(contractType);
         this.getSignUpBonus().setIsApplicable(isApplicable);
      }
   }

   public static boolean checkDayOfWeek(String day, Date d)
   {
      DateFormat formatter = new SimpleDateFormat("EEEE");
      return Arrays.asList(day.toUpperCase().split(";")).contains(formatter.format(d).toUpperCase());
   }

   public static boolean checkDayOfWeekInMonth(String day, Date d)
   {

      Calendar tempCal = Calendar.getInstance();
      tempCal.setTime(d);
      return Arrays.asList(day.split(";")).contains(String.valueOf(tempCal.get(Calendar.DAY_OF_WEEK_IN_MONTH)));
   }

   public static boolean checkDayInMonth(String day, Date d)
   {

      DateFormat formatter = new SimpleDateFormat("d");
      return Arrays.asList(day.split(";")).contains(formatter.format(d));
   }

   public static boolean checkMonth(String day, Date d)
   {

      DateFormat formatter = new SimpleDateFormat("M");
      return Arrays.asList(day.split(";")).contains(formatter.format(d));
   }

   public static boolean checkHours(int day, Date d)
   {

      DateFormat formatter = new SimpleDateFormat("HH");
      return day == Integer.parseInt((formatter.format(d)));
   }

   public static boolean checkMinutes(int day, Date d)
   {

      DateFormat formatter = new SimpleDateFormat("mm");
      return day == Integer.parseInt((formatter.format(d)));
   }

   public static boolean checkDate(String configuredInput, Date conditionValue)
   {

      try
      {
         String[] configuredInputList = configuredInput.split(";");
         DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

         if (configuredInputList[0].equals("LESSTHANEQUALTO"))
         {

            Date date = format.parse(configuredInputList[1]);
            return (date.after(conditionValue) || date.equals(conditionValue));

         }
         else if (configuredInputList[0].equals("GREATERTHANEQUALTO"))
         {

            Date date = format.parse(configuredInputList[1]);
            return (date.before(conditionValue) || date.equals(conditionValue));

         }
         else if (configuredInputList[0].equals("BETWEEN"))
         {

            Date lowerLimit = format.parse(configuredInputList[1]);
            Date upperLimit = format.parse(configuredInputList[2]);
            return ((lowerLimit.before(conditionValue) || lowerLimit.equals(conditionValue)) && (upperLimit.after(conditionValue) || upperLimit.equals(conditionValue)));

         }
         else if (configuredInputList[0].equals("EQUALTO"))
         {

            Date date = format.parse(configuredInputList[1]);
            return date.equals(conditionValue);

         }
         else if (configuredInputList[0].equals("IN"))
         {

            String date = format.format(conditionValue);
            return Arrays.asList(configuredInputList[1].split("/")).contains(date);
         }
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }

      return false;
   }

   public void calculateTerminationFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getTerminationFee().getReturnableCommercialHead())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getTerminationFee().setCommercialAmount(this.getTerminationFee().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateMaintenanceFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getMaintenanceFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getMaintenanceFee().getOtherFees().setCommercialAmount(this.getMaintenanceFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateIntegrationFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getIntegrationFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getIntegrationFee().getOtherFees().setCommercialAmount(this.getIntegrationFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateLicenceFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getLicenceFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getLicenceFee().getOtherFees().setCommercialAmount(this.getLicenceFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateWebServiceFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getWebServiceFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getWebServiceFee().getOtherFees().setCommercialAmount(this.getWebServiceFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateLoyaltyBonus(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getLoyaltyBonus().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getLoyaltyBonus().getOtherFees().setCommercialAmount(this.getLoyaltyBonus().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculatePreferenceBenefit(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getPreferenceBenefit().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getPreferenceBenefit().getOtherFees().setCommercialAmount(this.getPreferenceBenefit().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateRetainerFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getRetainerFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getRetainerFee().getOtherFees().setCommercialAmount(this.getRetainerFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateListingFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getListingFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getListingFee().getOtherFees().setCommercialAmount(this.getListingFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateSignUpFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getSignUpFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getSignUpFee().getOtherFees().setCommercialAmount(this.getSignUpFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateContentAccessFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getContentAccessFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getContentAccessFee().getOtherFees().setCommercialAmount(this.getContentAccessFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   public void calculateTrainingFee(List<String> commercialNamesList, List<String> commercialPercentagesList)
   {

      for (int i = 0; i < commercialNamesList.size(); i++)
      {

         for (FeeDetails feeDetails : this.getTrainingFee().getOtherFees().getFeeDetails())
         {

            if (commercialNamesList.get(i).equals(feeDetails.getCommercialName()))
            {

               this.getTrainingFee().getOtherFees().setCommercialAmount(this.getTrainingFee().getOtherFees().getCommercialAmount() + (feeDetails.getCommercialAmount() * Double.valueOf(commercialPercentagesList.get(i)) / 100));
               break;
            }
         }
      }
   }

   static final long serialVersionUID = 1L;

   private java.lang.String ruleFlowName;
   @org.kie.api.definition.type.Label("Supplier_Market combination selected for the current business rule intake")
   private java.lang.String selectedRow;

   private CommonElements commonElements;

   private java.util.List<cnk.air_commercialscalculationengine.settlementrules.SlabDetails> slabDetails;

   public BusinessRuleIntake()
   {
   }

   public java.lang.String getRuleFlowName()
   {
      return this.ruleFlowName;
   }

   public void setRuleFlowName(java.lang.String ruleFlowName)
   {
      this.ruleFlowName = ruleFlowName;
   }

   public java.lang.String getSelectedRow()
   {
      return this.selectedRow;
   }

   public void setSelectedRow(java.lang.String selectedRow)
   {
      this.selectedRow = selectedRow;
   }

   public java.util.List<cnk.air_commercialscalculationengine.settlementrules.SlabDetails> getSlabDetails()
   {
      return this.slabDetails;
   }

   public void setSlabDetails(
         java.util.List<cnk.air_commercialscalculationengine.settlementrules.SlabDetails> slabDetails)
   {
      this.slabDetails = slabDetails;
   }

   public cnk.air_commercialscalculationengine.settlementrules.AdvancedDefinition getAdvancedDefinition()
   {
      return this.advancedDefinition;
   }

   public void setAdvancedDefinition(
         cnk.air_commercialscalculationengine.settlementrules.AdvancedDefinition advancedDefinition)
   {
      this.advancedDefinition = advancedDefinition;
   }

   public cnk.air_commercialscalculationengine.settlementrules.CommonElements getCommonElements()
   {
      return this.commonElements;
   }

   public void setCommonElements(
         cnk.air_commercialscalculationengine.settlementrules.CommonElements commonElements)
   {
      this.commonElements = commonElements;
   }

   public cnk.air_commercialscalculationengine.settlementrules.IncentiveOnTopUp getIncentiveOnTopUp()
   {
      return this.incentiveOnTopUp;
   }

   public void setIncentiveOnTopUp(
         cnk.air_commercialscalculationengine.settlementrules.IncentiveOnTopUp incentiveOnTopUp)
   {
      this.incentiveOnTopUp = incentiveOnTopUp;
   }

   public cnk.air_commercialscalculationengine.settlementrules.PenaltyFee getPenaltyFee()
   {
      return this.penaltyFee;
   }

   public void setPenaltyFee(
         cnk.air_commercialscalculationengine.settlementrules.PenaltyFee penaltyFee)
   {
      this.penaltyFee = penaltyFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.TerminationFee getTerminationFee()
   {
      return this.terminationFee;
   }

   public void setTerminationFee(
         cnk.air_commercialscalculationengine.settlementrules.TerminationFee terminationFee)
   {
      this.terminationFee = terminationFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.MSFFee getMsfFee()
   {
      return this.msfFee;
   }

   public void setMsfFee(
         cnk.air_commercialscalculationengine.settlementrules.MSFFee msfFee)
   {
      this.msfFee = msfFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.MaintenanceFee getMaintenanceFee()
   {
      return this.maintenanceFee;
   }

   public void setMaintenanceFee(
         cnk.air_commercialscalculationengine.settlementrules.MaintenanceFee maintenanceFee)
   {
      this.maintenanceFee = maintenanceFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.IntegrationFee getIntegrationFee()
   {
      return this.integrationFee;
   }

   public void setIntegrationFee(
         cnk.air_commercialscalculationengine.settlementrules.IntegrationFee integrationFee)
   {
      this.integrationFee = integrationFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.LicenceFee getLicenceFee()
   {
      return this.licenceFee;
   }

   public void setLicenceFee(
         cnk.air_commercialscalculationengine.settlementrules.LicenceFee licenceFee)
   {
      this.licenceFee = licenceFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.WebServiceFee getWebServiceFee()
   {
      return this.webServiceFee;
   }

   public void setWebServiceFee(
         cnk.air_commercialscalculationengine.settlementrules.WebServiceFee webServiceFee)
   {
      this.webServiceFee = webServiceFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.LoyaltyBonus getLoyaltyBonus()
   {
      return this.loyaltyBonus;
   }

   public void setLoyaltyBonus(
         cnk.air_commercialscalculationengine.settlementrules.LoyaltyBonus loyaltyBonus)
   {
      this.loyaltyBonus = loyaltyBonus;
   }

   public cnk.air_commercialscalculationengine.settlementrules.PreferenceBenefit getPreferenceBenefit()
   {
      return this.preferenceBenefit;
   }

   public void setPreferenceBenefit(
         cnk.air_commercialscalculationengine.settlementrules.PreferenceBenefit preferenceBenefit)
   {
      this.preferenceBenefit = preferenceBenefit;
   }

   public cnk.air_commercialscalculationengine.settlementrules.RetainerFee getRetainerFee()
   {
      return this.retainerFee;
   }

   public void setRetainerFee(
         cnk.air_commercialscalculationengine.settlementrules.RetainerFee retainerFee)
   {
      this.retainerFee = retainerFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.ListingFee getListingFee()
   {
      return this.listingFee;
   }

   public void setListingFee(
         cnk.air_commercialscalculationengine.settlementrules.ListingFee listingFee)
   {
      this.listingFee = listingFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.SignUpFee getSignUpFee()
   {
      return this.signUpFee;
   }

   public void setSignUpFee(
         cnk.air_commercialscalculationengine.settlementrules.SignUpFee signUpFee)
   {
      this.signUpFee = signUpFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.ContentAccessFee getContentAccessFee()
   {
      return this.contentAccessFee;
   }

   public void setContentAccessFee(
         cnk.air_commercialscalculationengine.settlementrules.ContentAccessFee contentAccessFee)
   {
      this.contentAccessFee = contentAccessFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.TrainingFee getTrainingFee()
   {
      return this.trainingFee;
   }

   public void setTrainingFee(
         cnk.air_commercialscalculationengine.settlementrules.TrainingFee trainingFee)
   {
      this.trainingFee = trainingFee;
   }

   public cnk.air_commercialscalculationengine.settlementrules.SignUpBonus getSignUpBonus()
   {
      return this.signUpBonus;
   }

   public void setSignUpBonus(
         cnk.air_commercialscalculationengine.settlementrules.SignUpBonus signUpBonus)
   {
      this.signUpBonus = signUpBonus;
   }

   public cnk.air_commercialscalculationengine.settlementrules.RemittanceFee getRemittanceFee()
   {
      return this.remittanceFee;
   }

   public void setRemittanceFee(
         cnk.air_commercialscalculationengine.settlementrules.RemittanceFee remittanceFee)
   {
      this.remittanceFee = remittanceFee;
   }

   public BusinessRuleIntake(
         cnk.air_commercialscalculationengine.settlementrules.AdvancedDefinition advancedDefinition,
         cnk.air_commercialscalculationengine.settlementrules.IncentiveOnTopUp incentiveOnTopUp,
         cnk.air_commercialscalculationengine.settlementrules.PenaltyFee penaltyFee,
         cnk.air_commercialscalculationengine.settlementrules.TerminationFee terminationFee,
         cnk.air_commercialscalculationengine.settlementrules.MSFFee msfFee,
         cnk.air_commercialscalculationengine.settlementrules.MaintenanceFee maintenanceFee,
         cnk.air_commercialscalculationengine.settlementrules.IntegrationFee integrationFee,
         cnk.air_commercialscalculationengine.settlementrules.LicenceFee licenceFee,
         cnk.air_commercialscalculationengine.settlementrules.WebServiceFee webServiceFee,
         cnk.air_commercialscalculationengine.settlementrules.LoyaltyBonus loyaltyBonus,
         cnk.air_commercialscalculationengine.settlementrules.PreferenceBenefit preferenceBenefit,
         cnk.air_commercialscalculationengine.settlementrules.RetainerFee retainerFee,
         cnk.air_commercialscalculationengine.settlementrules.ListingFee listingFee,
         cnk.air_commercialscalculationengine.settlementrules.SignUpFee signUpFee,
         cnk.air_commercialscalculationengine.settlementrules.ContentAccessFee contentAccessFee,
         cnk.air_commercialscalculationengine.settlementrules.TrainingFee trainingFee,
         cnk.air_commercialscalculationengine.settlementrules.SignUpBonus signUpBonus,
         cnk.air_commercialscalculationengine.settlementrules.RemittanceFee remittanceFee,
         java.lang.String ruleFlowName,
         java.lang.String selectedRow,
         cnk.air_commercialscalculationengine.settlementrules.CommonElements commonElements,
         java.util.List<cnk.air_commercialscalculationengine.settlementrules.SlabDetails> slabDetails)
   {
      this.advancedDefinition = advancedDefinition;
      this.incentiveOnTopUp = incentiveOnTopUp;
      this.penaltyFee = penaltyFee;
      this.terminationFee = terminationFee;
      this.msfFee = msfFee;
      this.maintenanceFee = maintenanceFee;
      this.integrationFee = integrationFee;
      this.licenceFee = licenceFee;
      this.webServiceFee = webServiceFee;
      this.loyaltyBonus = loyaltyBonus;
      this.preferenceBenefit = preferenceBenefit;
      this.retainerFee = retainerFee;
      this.listingFee = listingFee;
      this.signUpFee = signUpFee;
      this.contentAccessFee = contentAccessFee;
      this.trainingFee = trainingFee;
      this.signUpBonus = signUpBonus;
      this.remittanceFee = remittanceFee;
      this.ruleFlowName = ruleFlowName;
      this.selectedRow = selectedRow;
      this.commonElements = commonElements;
      this.slabDetails = slabDetails;
   }

}