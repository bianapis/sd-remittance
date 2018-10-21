package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * FundingCheckBaseWithIdAndRoot
 */
public class FundingCheckBaseWithIdAndRoot   {
  private String fundingCheckReference = null;

  private String paymentRequestReference = null;

  private String customerReference = null;

  private String amount = null;

  private String productInstanceReference = null;

  private String servicingActionResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return fundingCheckReference
  **/

  public String getFundingCheckReference() {
    return fundingCheckReference;
  }

  public void setFundingCheckReference(String fundingCheckReference) {
    this.fundingCheckReference = fundingCheckReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return paymentRequestReference
  **/

  public String getPaymentRequestReference() {
    return paymentRequestReference;
  }

  public void setPaymentRequestReference(String paymentRequestReference) {
    this.paymentRequestReference = paymentRequestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount      
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Text      
   * @return servicingActionResult
  **/

  public String getServicingActionResult() {
    return servicingActionResult;
  }

  public void setServicingActionResult(String servicingActionResult) {
    this.servicingActionResult = servicingActionResult;
  }


}

