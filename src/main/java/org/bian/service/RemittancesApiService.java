/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface RemittancesApiService {

	PaymentInitiationWithId executePost(PaymentInitiation request);
	
	PaymentInitiationWithId executePut(String crReferenceId, PaymentInitiation request);
	
	PaymentInitiationWithId initiate(PaymentInitiation request);
	
	RepeatingPaymentsBaseWithIdAndRoot requestPostRepeatingPayments(String crReferenceId, RepeatingPaymentsBase request);
	
	RepeatingPaymentsBaseWithIdAndRoot requestPutRepeatingPayments(String crReferenceId, String bqReferenceId, RepeatingPaymentsBase request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	PaymentRequestWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQs();
	
	ComplianceBaseWithRoot retrieveCompliances(String crReferenceId, String bqReferenceId);
	
	FundingCheckBaseWithIdAndRoot retrieveFundingChecks(String crReferenceId, String bqReferenceId);
	
	OTCPaymentBaseWithIdAndRoot retrieveOtcPayments(String crReferenceId, String bqReferenceId);
	
	RepeatingPaymentsBaseWithIdAndRoot retrieveRepeatingPayments(String crReferenceId, String bqReferenceId);
	
	RetrieveRemittancesResponse retrieve(String crReferenceId);
	
	TransactionReportingResponse retrieveReportings(String crReferenceId, String bqReferenceId);
	
	TransactionUpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	TransactionUpdateBaseWithIdAndRoot update(String crReferenceId, TransactionUpdateBase request);
	
}
