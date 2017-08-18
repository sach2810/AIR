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

   public BusinessRuleIntake(
         cnk.air_commercialscalculationengine.settlementrules.AdvancedDefinition advancedDefinition,
         cnk.air_commercialscalculationengine.settlementrules.IncentiveOnTopUp incentiveOnTopUp,
         cnk.air_commercialscalculationengine.settlementrules.PenaltyFee penaltyFee,
         cnk.air_commercialscalculationengine.settlementrules.TerminationFee terminationFee,
         cnk.air_commercialscalculationengine.settlementrules.MSFFee msfFee,
         cnk.air_commercialscalculationengine.settlementrules.MaintenanceFee maintenanceFee,
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
      this.ruleFlowName = ruleFlowName;
      this.selectedRow = selectedRow;
      this.commonElements = commonElements;
      this.slabDetails = slabDetails;
   }

}