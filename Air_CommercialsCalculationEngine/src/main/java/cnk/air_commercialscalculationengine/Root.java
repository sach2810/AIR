package cnk.air_commercialscalculationengine;
import java.util.ArrayList;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Root implements java.io.Serializable
{
    
   static final long serialVersionUID = 1L;

   private cnk.air_commercialscalculationengine.Header header;
   private java.util.List<cnk.air_commercialscalculationengine.BusinessRuleIntake> businessRuleIntake;

   public Root()
   {
   }

   public cnk.air_commercialscalculationengine.Header getHeader()
   {
      return this.header;
   }

   public void setHeader(cnk.air_commercialscalculationengine.Header header)
   {
      this.header = header;
   }

   public java.util.List<cnk.air_commercialscalculationengine.BusinessRuleIntake> getBusinessRuleIntake()
   {
      return this.businessRuleIntake;
   }

   public void setBusinessRuleIntake(
         java.util.List<cnk.air_commercialscalculationengine.BusinessRuleIntake> businessRuleIntake)
   {
      this.businessRuleIntake = businessRuleIntake;
   }

   public Root(
         cnk.air_commercialscalculationengine.Header header,
         java.util.List<cnk.air_commercialscalculationengine.BusinessRuleIntake> businessRuleIntake)
   {
      this.header = header;
      this.businessRuleIntake = businessRuleIntake;
   }

}