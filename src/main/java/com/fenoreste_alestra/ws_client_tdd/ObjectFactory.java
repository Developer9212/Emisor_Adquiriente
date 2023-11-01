
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.syc.ws.endpoint.siscoop package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCardholderInformation_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "getCardholderInformation");
    private final static QName _DoWithdrawalAccount_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "doWithdrawalAccount");
    private final static QName _LoadBalanceResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "loadBalanceResponse");
    private final static QName _GetBalanceQueryResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "getBalanceQueryResponse");
    private final static QName _AsignaNIP_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "asignaNIP");
    private final static QName _GetBalanceQuery_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "getBalanceQuery");
    private final static QName _UpdateIndividualLimitsResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "updateIndividualLimitsResponse");
    private final static QName _CardLockResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "cardLockResponse");
    private final static QName _UpdateDemographicDataResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "updateDemographicDataResponse");
    private final static QName _TemporaryLockResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "temporaryLockResponse");
    private final static QName _DeleteIndividualLimitsResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "deleteIndividualLimitsResponse");
    private final static QName _StockCardReplacementResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "stockCardReplacementResponse");
    private final static QName _UpdateIndividualLimits_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "updateIndividualLimits");
    private final static QName _GetLastestTransactionsResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "getLastestTransactionsResponse");
    private final static QName _AssignmentAccountResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "assignmentAccountResponse");
    private final static QName _GetLastestTransactions_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "getLastestTransactions");
    private final static QName _AsignaNIPResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "asignaNIPResponse");
    private final static QName _UpdateDemographicData_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "updateDemographicData");
    private final static QName _StockCardReplacement_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "stockCardReplacement");
    private final static QName _ActivateCardResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "activateCardResponse");
    private final static QName _BasicResponseDto_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "BasicResponseDto");
    private final static QName _GetCardholderInformationResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "getCardholderInformationResponse");
    private final static QName _SaveInformationClientBitMatch_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "saveInformationClientBitMatch");
    private final static QName _SaveInformationClientBitMatchResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "saveInformationClientBitMatchResponse");
    private final static QName _BalanceQueryResponseDto_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "BalanceQueryResponseDto");
    private final static QName _AssignmentAccount_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "assignmentAccount");
    private final static QName _LoadBalance_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "loadBalance");
    private final static QName _Exception_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "Exception");
    private final static QName _ActivateCard_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "activateCard");
    private final static QName _DoWithdrawalAccountResponse_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "doWithdrawalAccountResponse");
    private final static QName _CardLock_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "cardLock");
    private final static QName _DeleteIndividualLimits_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "deleteIndividualLimits");
    private final static QName _IndividualLimitsDto_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "IndividualLimitsDto");
    private final static QName _TemporaryLock_QNAME = new QName("http://siscoop.endpoint.ws.syc.com/", "temporaryLock");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.syc.ws.endpoint.siscoop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateDemographicData }
     * 
     */
    public UpdateDemographicData createUpdateDemographicData() {
        return new UpdateDemographicData();
    }

    /**
     * Create an instance of {@link AssignmentAccountResponse }
     * 
     */
    public AssignmentAccountResponse createAssignmentAccountResponse() {
        return new AssignmentAccountResponse();
    }

    /**
     * Create an instance of {@link GetLastestTransactionsResponse }
     * 
     */
    public GetLastestTransactionsResponse createGetLastestTransactionsResponse() {
        return new GetLastestTransactionsResponse();
    }

    /**
     * Create an instance of {@link ActivateCardResponse }
     * 
     */
    public ActivateCardResponse createActivateCardResponse() {
        return new ActivateCardResponse();
    }

    /**
     * Create an instance of {@link AssignmentAccount }
     * 
     */
    public AssignmentAccount createAssignmentAccount() {
        return new AssignmentAccount();
    }

    /**
     * Create an instance of {@link SaveInformationClientBitMatch }
     * 
     */
    public SaveInformationClientBitMatch createSaveInformationClientBitMatch() {
        return new SaveInformationClientBitMatch();
    }

    /**
     * Create an instance of {@link SaveInformationClientBitMatchResponse }
     * 
     */
    public SaveInformationClientBitMatchResponse createSaveInformationClientBitMatchResponse() {
        return new SaveInformationClientBitMatchResponse();
    }

    /**
     * Create an instance of {@link GetCardholderInformationResponse }
     * 
     */
    public GetCardholderInformationResponse createGetCardholderInformationResponse() {
        return new GetCardholderInformationResponse();
    }

    /**
     * Create an instance of {@link DoWithdrawalAccountResponse }
     * 
     */
    public DoWithdrawalAccountResponse createDoWithdrawalAccountResponse() {
        return new DoWithdrawalAccountResponse();
    }

    /**
     * Create an instance of {@link LoadBalanceResponse }
     * 
     */
    public LoadBalanceResponse createLoadBalanceResponse() {
        return new LoadBalanceResponse();
    }

    /**
     * Create an instance of {@link UpdateIndividualLimitsResponse }
     * 
     */
    public UpdateIndividualLimitsResponse createUpdateIndividualLimitsResponse() {
        return new UpdateIndividualLimitsResponse();
    }

    /**
     * Create an instance of {@link DeleteIndividualLimitsResponse }
     * 
     */
    public DeleteIndividualLimitsResponse createDeleteIndividualLimitsResponse() {
        return new DeleteIndividualLimitsResponse();
    }

    /**
     * Create an instance of {@link StockCardReplacementResponse }
     * 
     */
    public StockCardReplacementResponse createStockCardReplacementResponse() {
        return new StockCardReplacementResponse();
    }

    /**
     * Create an instance of {@link TemporaryLockResponse }
     * 
     */
    public TemporaryLockResponse createTemporaryLockResponse() {
        return new TemporaryLockResponse();
    }

    /**
     * Create an instance of {@link CardLockResponse }
     * 
     */
    public CardLockResponse createCardLockResponse() {
        return new CardLockResponse();
    }

    /**
     * Create an instance of {@link TransactionsListResponseDto }
     * 
     */
    public TransactionsListResponseDto createTransactionsListResponseDto() {
        return new TransactionsListResponseDto();
    }

    /**
     * Create an instance of {@link TransactionDto }
     * 
     */
    public TransactionDto createTransactionDto() {
        return new TransactionDto();
    }

    /**
     * Create an instance of {@link UpdateDemographicDataResponse }
     * 
     */
    public UpdateDemographicDataResponse createUpdateDemographicDataResponse() {
        return new UpdateDemographicDataResponse();
    }

    /**
     * Create an instance of {@link UpdateIndividualLimits }
     * 
     */
    public UpdateIndividualLimits createUpdateIndividualLimits() {
        return new UpdateIndividualLimits();
    }

    /**
     * Create an instance of {@link AsignaNIP }
     * 
     */
    public AsignaNIP createAsignaNIP() {
        return new AsignaNIP();
    }

    /**
     * Create an instance of {@link GetBalanceQuery }
     * 
     */
    public GetBalanceQuery createGetBalanceQuery() {
        return new GetBalanceQuery();
    }

    /**
     * Create an instance of {@link GetCardholderInformation }
     * 
     */
    public GetCardholderInformation createGetCardholderInformation() {
        return new GetCardholderInformation();
    }

    /**
     * Create an instance of {@link GetBalanceQueryResponse }
     * 
     */
    public GetBalanceQueryResponse createGetBalanceQueryResponse() {
        return new GetBalanceQueryResponse();
    }

    /**
     * Create an instance of {@link DoWithdrawalAccount }
     * 
     */
    public DoWithdrawalAccount createDoWithdrawalAccount() {
        return new DoWithdrawalAccount();
    }

    /**
     * Create an instance of {@link ActivateCard }
     * 
     */
    public ActivateCard createActivateCard() {
        return new ActivateCard();
    }

    /**
     * Create an instance of {@link DeleteIndividualLimits }
     * 
     */
    public DeleteIndividualLimits createDeleteIndividualLimits() {
        return new DeleteIndividualLimits();
    }

    /**
     * Create an instance of {@link CardLock }
     * 
     */
    public CardLock createCardLock() {
        return new CardLock();
    }

    /**
     * Create an instance of {@link IndividualLimitsDto }
     * 
     */
    public IndividualLimitsDto createIndividualLimitsDto() {
        return new IndividualLimitsDto();
    }

    /**
     * Create an instance of {@link TemporaryLock }
     * 
     */
    public TemporaryLock createTemporaryLock() {
        return new TemporaryLock();
    }

    /**
     * Create an instance of {@link BasicAuthRespDto }
     * 
     */
    public BasicAuthRespDto createBasicAuthRespDto() {
        return new BasicAuthRespDto();
    }

    /**
     * Create an instance of {@link BasicResponse }
     * 
     */
    public BasicResponse createBasicResponse() {
        return new BasicResponse();
    }

    /**
     * Create an instance of {@link AddressDto }
     * 
     */
    public AddressDto createAddressDto() {
        return new AddressDto();
    }

    /**
     * Create an instance of {@link BalanceQueryResponseDto }
     * 
     */
    public BalanceQueryResponseDto createBalanceQueryResponseDto() {
        return new BalanceQueryResponseDto();
    }

    /**
     * Create an instance of {@link LoadBalance }
     * 
     */
    public LoadBalance createLoadBalance() {
        return new LoadBalance();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link StockCardReplacement }
     * 
     */
    public StockCardReplacement createStockCardReplacement() {
        return new StockCardReplacement();
    }

    /**
     * Create an instance of {@link LoadBalanceDto }
     * 
     */
    public LoadBalanceDto createLoadBalanceDto() {
        return new LoadBalanceDto();
    }

    /**
     * Create an instance of {@link InfoClientRequest }
     * 
     */
    public InfoClientRequest createInfoClientRequest() {
        return new InfoClientRequest();
    }

    /**
     * Create an instance of {@link GetLastestTransactions }
     * 
     */
    public GetLastestTransactions createGetLastestTransactions() {
        return new GetLastestTransactions();
    }

    /**
     * Create an instance of {@link AsignaNIPResponse }
     * 
     */
    public AsignaNIPResponse createAsignaNIPResponse() {
        return new AsignaNIPResponse();
    }

    /**
     * Create an instance of {@link CardAssignmentResponseDto }
     * 
     */
    public CardAssignmentResponseDto createCardAssignmentResponseDto() {
        return new CardAssignmentResponseDto();
    }

    /**
     * Create an instance of {@link NipRequest }
     * 
     */
    public NipRequest createNipRequest() {
        return new NipRequest();
    }

    /**
     * Create an instance of {@link BasicDataResponse }
     * 
     */
    public BasicDataResponse createBasicDataResponse() {
        return new BasicDataResponse();
    }

    /**
     * Create an instance of {@link UpdateDemographicData.Cardinfo }
     * 
     */
    public UpdateDemographicData.Cardinfo createUpdateDemographicDataCardinfo() {
        return new UpdateDemographicData.Cardinfo();
    }

    /**
     * Create an instance of {@link AssignmentAccountResponse.Return }
     * 
     */
    public AssignmentAccountResponse createAssignmentAccountResponseReturn() {
        return new AssignmentAccountResponse();
    }

    /**
     * Create an instance of {@link GetLastestTransactionsResponse.Return }
     * 
     */
    public GetLastestTransactionsResponse createGetLastestTransactionsResponseReturn() {
        return new GetLastestTransactionsResponse();
    }

    /**
     * Create an instance of {@link ActivateCardResponse.Return }
     * 
     */
    public ActivateCardResponse createActivateCardResponseReturn() {
        return new ActivateCardResponse();
    }

    /**
     * Create an instance of {@link AssignmentAccount.ClientInfo }
     * 
     */
    public AssignmentAccount.ClientInfo createAssignmentAccountClientInfo() {
        return new AssignmentAccount.ClientInfo();
    }

    /**
     * Create an instance of {@link SaveInformationClientBitMatch.Arg0 }
     * 
     */
    public SaveInformationClientBitMatch.Arg0 createSaveInformationClientBitMatchArg0() {
        return new SaveInformationClientBitMatch.Arg0();
    }

    /**
     * Create an instance of {@link SaveInformationClientBitMatchResponse.Return }
     * 
     */
    public SaveInformationClientBitMatchResponse createSaveInformationClientBitMatchResponseReturn() {
        return new SaveInformationClientBitMatchResponse();
    }

    /**
     * Create an instance of {@link GetCardholderInformationResponse.Return }
     * 
     */
    public GetCardholderInformationResponse.Return createGetCardholderInformationResponseReturn() {
        return new GetCardholderInformationResponse.Return();
    }

    /**
     * Create an instance of {@link DoWithdrawalAccountResponse.Return }
     * 
     */
    public DoWithdrawalAccountResponse createDoWithdrawalAccountResponseReturn() {
        return new DoWithdrawalAccountResponse();
    }

    /**
     * Create an instance of {@link LoadBalanceResponse.Return }
     * 
     */
    public LoadBalanceResponse createLoadBalanceResponseReturn() {
        return new LoadBalanceResponse();
    }

    /**
     * Create an instance of {@link UpdateIndividualLimitsResponse.Return }
     * 
     */
    public UpdateIndividualLimitsResponse createUpdateIndividualLimitsResponseReturn() {
        return new UpdateIndividualLimitsResponse();
    }

    /**
     * Create an instance of {@link DeleteIndividualLimitsResponse.Return }
     * 
     */
    public DeleteIndividualLimitsResponse createDeleteIndividualLimitsResponseReturn() {
        return new DeleteIndividualLimitsResponse();
    }

    /**
     * Create an instance of {@link StockCardReplacementResponse.Return }
     * 
     */
    public StockCardReplacementResponse createStockCardReplacementResponseReturn() {
        return new StockCardReplacementResponse();
    }

    /**
     * Create an instance of {@link TemporaryLockResponse.Return }
     * 
     */
    public TemporaryLockResponse createTemporaryLockResponseReturn() {
        return new TemporaryLockResponse();
    }

    /**
     * Create an instance of {@link CardLockResponse.Return }
     * 
     */
    public CardLockResponse createCardLockResponseReturn() {
        return new CardLockResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardholderInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "getCardholderInformation")
    public JAXBElement<GetCardholderInformation> createGetCardholderInformation(GetCardholderInformation value) {
        return new JAXBElement<GetCardholderInformation>(_GetCardholderInformation_QNAME, GetCardholderInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoWithdrawalAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "doWithdrawalAccount")
    public JAXBElement<DoWithdrawalAccount> createDoWithdrawalAccount(DoWithdrawalAccount value) {
        return new JAXBElement<DoWithdrawalAccount>(_DoWithdrawalAccount_QNAME, DoWithdrawalAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "loadBalanceResponse")
    public JAXBElement<LoadBalanceResponse> createLoadBalanceResponse(LoadBalanceResponse value) {
        return new JAXBElement<LoadBalanceResponse>(_LoadBalanceResponse_QNAME, LoadBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "getBalanceQueryResponse")
    public JAXBElement<GetBalanceQueryResponse> createGetBalanceQueryResponse(GetBalanceQueryResponse value) {
        return new JAXBElement<GetBalanceQueryResponse>(_GetBalanceQueryResponse_QNAME, GetBalanceQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignaNIP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "asignaNIP")
    public JAXBElement<AsignaNIP> createAsignaNIP(AsignaNIP value) {
        return new JAXBElement<AsignaNIP>(_AsignaNIP_QNAME, AsignaNIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBalanceQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "getBalanceQuery")
    public JAXBElement<GetBalanceQuery> createGetBalanceQuery(GetBalanceQuery value) {
        return new JAXBElement<GetBalanceQuery>(_GetBalanceQuery_QNAME, GetBalanceQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIndividualLimitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "updateIndividualLimitsResponse")
    public JAXBElement<UpdateIndividualLimitsResponse> createUpdateIndividualLimitsResponse(UpdateIndividualLimitsResponse value) {
        return new JAXBElement<UpdateIndividualLimitsResponse>(_UpdateIndividualLimitsResponse_QNAME, UpdateIndividualLimitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardLockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "cardLockResponse")
    public JAXBElement<CardLockResponse> createCardLockResponse(CardLockResponse value) {
        return new JAXBElement<CardLockResponse>(_CardLockResponse_QNAME, CardLockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDemographicDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "updateDemographicDataResponse")
    public JAXBElement<UpdateDemographicDataResponse> createUpdateDemographicDataResponse(UpdateDemographicDataResponse value) {
        return new JAXBElement<UpdateDemographicDataResponse>(_UpdateDemographicDataResponse_QNAME, UpdateDemographicDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporaryLockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "temporaryLockResponse")
    public JAXBElement<TemporaryLockResponse> createTemporaryLockResponse(TemporaryLockResponse value) {
        return new JAXBElement<TemporaryLockResponse>(_TemporaryLockResponse_QNAME, TemporaryLockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIndividualLimitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "deleteIndividualLimitsResponse")
    public JAXBElement<DeleteIndividualLimitsResponse> createDeleteIndividualLimitsResponse(DeleteIndividualLimitsResponse value) {
        return new JAXBElement<DeleteIndividualLimitsResponse>(_DeleteIndividualLimitsResponse_QNAME, DeleteIndividualLimitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockCardReplacementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "stockCardReplacementResponse")
    public JAXBElement<StockCardReplacementResponse> createStockCardReplacementResponse(StockCardReplacementResponse value) {
        return new JAXBElement<StockCardReplacementResponse>(_StockCardReplacementResponse_QNAME, StockCardReplacementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateIndividualLimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "updateIndividualLimits")
    public JAXBElement<UpdateIndividualLimits> createUpdateIndividualLimits(UpdateIndividualLimits value) {
        return new JAXBElement<UpdateIndividualLimits>(_UpdateIndividualLimits_QNAME, UpdateIndividualLimits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastestTransactionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "getLastestTransactionsResponse")
    public JAXBElement<GetLastestTransactionsResponse> createGetLastestTransactionsResponse(GetLastestTransactionsResponse value) {
        return new JAXBElement<GetLastestTransactionsResponse>(_GetLastestTransactionsResponse_QNAME, GetLastestTransactionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "assignmentAccountResponse")
    public JAXBElement<AssignmentAccountResponse> createAssignmentAccountResponse(AssignmentAccountResponse value) {
        return new JAXBElement<AssignmentAccountResponse>(_AssignmentAccountResponse_QNAME, AssignmentAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLastestTransactions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "getLastestTransactions")
    public JAXBElement<GetLastestTransactions> createGetLastestTransactions(GetLastestTransactions value) {
        return new JAXBElement<GetLastestTransactions>(_GetLastestTransactions_QNAME, GetLastestTransactions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AsignaNIPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "asignaNIPResponse")
    public JAXBElement<AsignaNIPResponse> createAsignaNIPResponse(AsignaNIPResponse value) {
        return new JAXBElement<AsignaNIPResponse>(_AsignaNIPResponse_QNAME, AsignaNIPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDemographicData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "updateDemographicData")
    public JAXBElement<UpdateDemographicData> createUpdateDemographicData(UpdateDemographicData value) {
        return new JAXBElement<UpdateDemographicData>(_UpdateDemographicData_QNAME, UpdateDemographicData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StockCardReplacement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "stockCardReplacement")
    public JAXBElement<StockCardReplacement> createStockCardReplacement(StockCardReplacement value) {
        return new JAXBElement<StockCardReplacement>(_StockCardReplacement_QNAME, StockCardReplacement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "activateCardResponse")
    public JAXBElement<ActivateCardResponse> createActivateCardResponse(ActivateCardResponse value) {
        return new JAXBElement<ActivateCardResponse>(_ActivateCardResponse_QNAME, ActivateCardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "BasicResponseDto")
    public JAXBElement<BasicResponse> createBasicResponseDto(BasicResponse value) {
        return new JAXBElement<BasicResponse>(_BasicResponseDto_QNAME, BasicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCardholderInformationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "getCardholderInformationResponse")
    public JAXBElement<GetCardholderInformationResponse> createGetCardholderInformationResponse(GetCardholderInformationResponse value) {
        return new JAXBElement<GetCardholderInformationResponse>(_GetCardholderInformationResponse_QNAME, GetCardholderInformationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveInformationClientBitMatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "saveInformationClientBitMatch")
    public JAXBElement<SaveInformationClientBitMatch> createSaveInformationClientBitMatch(SaveInformationClientBitMatch value) {
        return new JAXBElement<SaveInformationClientBitMatch>(_SaveInformationClientBitMatch_QNAME, SaveInformationClientBitMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveInformationClientBitMatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "saveInformationClientBitMatchResponse")
    public JAXBElement<SaveInformationClientBitMatchResponse> createSaveInformationClientBitMatchResponse(SaveInformationClientBitMatchResponse value) {
        return new JAXBElement<SaveInformationClientBitMatchResponse>(_SaveInformationClientBitMatchResponse_QNAME, SaveInformationClientBitMatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceQueryResponseDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "BalanceQueryResponseDto")
    public JAXBElement<BalanceQueryResponseDto> createBalanceQueryResponseDto(BalanceQueryResponseDto value) {
        return new JAXBElement<BalanceQueryResponseDto>(_BalanceQueryResponseDto_QNAME, BalanceQueryResponseDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "assignmentAccount")
    public JAXBElement<AssignmentAccount> createAssignmentAccount(AssignmentAccount value) {
        return new JAXBElement<AssignmentAccount>(_AssignmentAccount_QNAME, AssignmentAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "loadBalance")
    public JAXBElement<LoadBalance> createLoadBalance(LoadBalance value) {
        return new JAXBElement<LoadBalance>(_LoadBalance_QNAME, LoadBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "activateCard")
    public JAXBElement<ActivateCard> createActivateCard(ActivateCard value) {
        return new JAXBElement<ActivateCard>(_ActivateCard_QNAME, ActivateCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoWithdrawalAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "doWithdrawalAccountResponse")
    public JAXBElement<DoWithdrawalAccountResponse> createDoWithdrawalAccountResponse(DoWithdrawalAccountResponse value) {
        return new JAXBElement<DoWithdrawalAccountResponse>(_DoWithdrawalAccountResponse_QNAME, DoWithdrawalAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardLock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "cardLock")
    public JAXBElement<CardLock> createCardLock(CardLock value) {
        return new JAXBElement<CardLock>(_CardLock_QNAME, CardLock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIndividualLimits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "deleteIndividualLimits")
    public JAXBElement<DeleteIndividualLimits> createDeleteIndividualLimits(DeleteIndividualLimits value) {
        return new JAXBElement<DeleteIndividualLimits>(_DeleteIndividualLimits_QNAME, DeleteIndividualLimits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualLimitsDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "IndividualLimitsDto")
    public JAXBElement<IndividualLimitsDto> createIndividualLimitsDto(IndividualLimitsDto value) {
        return new JAXBElement<IndividualLimitsDto>(_IndividualLimitsDto_QNAME, IndividualLimitsDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemporaryLock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://siscoop.endpoint.ws.syc.com/", name = "temporaryLock")
    public JAXBElement<TemporaryLock> createTemporaryLock(TemporaryLock value) {
        return new JAXBElement<TemporaryLock>(_TemporaryLock_QNAME, TemporaryLock.class, null, value);
    }

}
