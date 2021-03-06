package cnk.air_commercialscalculationengine.settlementrules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FOCUtilisation implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String productCategory;
   private java.lang.String productCategorySubType;
   private java.lang.String productName;

   public FOCUtilisation()
   {
   }

   public java.lang.String getProductCategory()
   {
      return this.productCategory;
   }

   public void setProductCategory(java.lang.String productCategory)
   {
      this.productCategory = productCategory;
   }

   public java.lang.String getProductCategorySubType()
   {
      return this.productCategorySubType;
   }

   public void setProductCategorySubType(
         java.lang.String productCategorySubType)
   {
      this.productCategorySubType = productCategorySubType;
   }

   public java.lang.String getProductName()
   {
      return this.productName;
   }

   public void setProductName(java.lang.String productName)
   {
      this.productName = productName;
   }

   public FOCUtilisation(java.lang.String productCategory,
         java.lang.String productCategorySubType,
         java.lang.String productName)
   {
      this.productCategory = productCategory;
      this.productCategorySubType = productCategorySubType;
      this.productName = productName;
   }

}