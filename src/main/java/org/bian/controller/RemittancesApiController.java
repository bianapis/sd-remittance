/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Transact;

@BianRestController
public class RemittancesApiController {

	@Autowired
	RemittancesApiService service;
	
	@Transact.ExecutePost
	public BianResponse<PaymentInitiationWithId> executePost(@RequestBody BianRequest<PaymentInitiation> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Transact.ExecutePut
	public BianResponse<PaymentInitiationWithId> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<PaymentInitiation> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Initiate
	public BianResponse<PaymentInitiationWithId> initiate(@RequestBody BianRequest<PaymentInitiation> bianRequest) {
		return BianResponse.forSuccess(service.initiate(bianRequest.getData()));
	}
	
	@BQ("repeating-payments")
	@Transact.RequestPost
	public BianResponse<RepeatingPaymentsBaseWithIdAndRoot> requestPostRepeatingPayments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RepeatingPaymentsBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostRepeatingPayments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("repeating-payments")
	@Transact.RequestPut
	public BianResponse<RepeatingPaymentsBaseWithIdAndRoot> requestPutRepeatingPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<RepeatingPaymentsBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutRepeatingPayments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("payments")
	@Transact.Retrieve
	public BianResponse<PaymentRequestWithIdAndRoot> retrievePayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePayments(crReferenceId, bqReferenceId));
	}
	
	@Transact.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("compliances")
	@Transact.Retrieve
	public BianResponse<ComplianceBaseWithRoot> retrieveCompliances(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCompliances(crReferenceId, bqReferenceId));
	}
	
	@BQ("funding-checks")
	@Transact.Retrieve
	public BianResponse<FundingCheckBaseWithIdAndRoot> retrieveFundingChecks(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFundingChecks(crReferenceId, bqReferenceId));
	}
	
	@BQ("otc-payments")
	@Transact.Retrieve
	public BianResponse<OTCPaymentBaseWithIdAndRoot> retrieveOtcPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOtcPayments(crReferenceId, bqReferenceId));
	}
	
	@BQ("repeating-payments")
	@Transact.Retrieve
	public BianResponse<RepeatingPaymentsBaseWithIdAndRoot> retrieveRepeatingPayments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRepeatingPayments(crReferenceId, bqReferenceId));
	}
	
	@Transact.Retrieve
	public BianResponse<RetrieveRemittancesResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("reportings")
	@Transact.Retrieve
	public BianResponse<TransactionReportingResponse> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Transact.Retrieve
	public BianResponse<TransactionUpdateBaseWithIdAndRoot> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@Transact.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Transact.Update
	public BianResponse<TransactionUpdateBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<TransactionUpdateBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
