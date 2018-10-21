/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class RemittancesApiServiceImpl implements RemittancesApiService {

	public PaymentInitiationWithId executePost(PaymentInitiation request){
		return JsonReader.read("executePost-PaymentInitiationWithId.json",new TypeReference<PaymentInitiationWithId>(){});
	}
	
	public PaymentInitiationWithId executePut(String crReferenceId, PaymentInitiation request){
		return JsonReader.read("executePut-PaymentInitiationWithId.json",new TypeReference<PaymentInitiationWithId>(){});
	}
	
	public PaymentInitiationWithId initiate(PaymentInitiation request){
		return JsonReader.read("initiate-PaymentInitiationWithId.json",new TypeReference<PaymentInitiationWithId>(){});
	}
	
	public RepeatingPaymentsBaseWithIdAndRoot requestPostRepeatingPayments(String crReferenceId, RepeatingPaymentsBase request){
		return JsonReader.read("requestPost-RepeatingPaymentsBaseWithIdAndRoot.json",new TypeReference<RepeatingPaymentsBaseWithIdAndRoot>(){});
	}
	
	public RepeatingPaymentsBaseWithIdAndRoot requestPutRepeatingPayments(String crReferenceId, String bqReferenceId, RepeatingPaymentsBase request){
		return JsonReader.read("requestPut-RepeatingPaymentsBaseWithIdAndRoot.json",new TypeReference<RepeatingPaymentsBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public PaymentRequestWithIdAndRoot retrievePayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PaymentRequestWithIdAndRoot.json",new TypeReference<PaymentRequestWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public ComplianceBaseWithRoot retrieveCompliances(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ComplianceBaseWithRoot.json",new TypeReference<ComplianceBaseWithRoot>(){});
	}
	
	public FundingCheckBaseWithIdAndRoot retrieveFundingChecks(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-FundingCheckBaseWithIdAndRoot.json",new TypeReference<FundingCheckBaseWithIdAndRoot>(){});
	}
	
	public OTCPaymentBaseWithIdAndRoot retrieveOtcPayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-OTCPaymentBaseWithIdAndRoot.json",new TypeReference<OTCPaymentBaseWithIdAndRoot>(){});
	}
	
	public RepeatingPaymentsBaseWithIdAndRoot retrieveRepeatingPayments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RepeatingPaymentsBaseWithIdAndRoot.json",new TypeReference<RepeatingPaymentsBaseWithIdAndRoot>(){});
	}
	
	public RetrieveRemittancesResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveRemittancesResponse.json",new TypeReference<RetrieveRemittancesResponse>(){});
	}
	
	public TransactionReportingResponse retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-TransactionReportingResponse.json",new TypeReference<TransactionReportingResponse>(){});
	}
	
	public TransactionUpdateBaseWithIdAndRoot retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-TransactionUpdateBaseWithIdAndRoot.json",new TypeReference<TransactionUpdateBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public TransactionUpdateBaseWithIdAndRoot update(String crReferenceId, TransactionUpdateBase request){
		return JsonReader.read("update-TransactionUpdateBaseWithIdAndRoot.json",new TypeReference<TransactionUpdateBaseWithIdAndRoot>(){});
	}
	
}
