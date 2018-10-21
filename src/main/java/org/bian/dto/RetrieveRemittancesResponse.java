package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveRemittancesResponse
 */
public class RetrieveRemittancesResponse   {
  private String paymentRequestReference = null;

  private String paymentRequest = null;

  private String payerProductInstanceReference = null;

  private String customerReference = null;

  private String payerReference = null;

  private String payerBankReference = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private String amount = null;

  private String currency = null;

  private String valueDate = null;

  private String paymentFeesCharges = null;

  private String paymentMechanism = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator       
   * @return paymentRequest
  **/

  public String getPaymentRequest() {
    return paymentRequest;
  }

  public void setPaymentRequest(String paymentRequest) {
    this.paymentRequest = paymentRequest;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return payerProductInstanceReference
  **/

  public String getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(String payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return payerReference
  **/

  public String getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(String payerReference) {
    this.payerReference = payerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return payerBankReference
  **/

  public String getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(String payerBankReference) {
    this.payerBankReference = payerBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier      
   * @return payeeBankReference
  **/

  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text      
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date      
   * @return valueDate
  **/

  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount       
   * @return paymentFeesCharges
  **/

  public String getPaymentFeesCharges() {
    return paymentFeesCharges;
  }

  public void setPaymentFeesCharges(String paymentFeesCharges) {
    this.paymentFeesCharges = paymentFeesCharges;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Name      
   * @return paymentMechanism
  **/

  public String getPaymentMechanism() {
    return paymentMechanism;
  }

  public void setPaymentMechanism(String paymentMechanism) {
    this.paymentMechanism = paymentMechanism;
  }


}

