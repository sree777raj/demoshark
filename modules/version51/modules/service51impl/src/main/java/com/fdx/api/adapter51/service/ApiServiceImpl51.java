package com.fdx.api.adapter51.service;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fdx.api.adapter.service.ServiceAdapterApi;
import com.fdx.api.entities.moneymovement.PaymentStatus;
import com.fdx.api.model51.model.Account51;
import com.fdx.api.model51.model.AccountPaymentNetworkList51;
import com.fdx.api.model51.model.AccountWithDetails51;
import com.fdx.api.model51.model.Accounts51;
import com.fdx.api.model51.model.Availability51;
import com.fdx.api.model51.model.Capability51;
import com.fdx.api.model51.model.Customer51;
import com.fdx.api.model51.model.Customers51;
import com.fdx.api.model51.model.Error51;
import com.fdx.api.model51.model.FdxError51;
import com.fdx.api.model51.model.Idempotency51;
import com.fdx.api.model51.model.Payee51;
import com.fdx.api.model51.model.PayeeForUpdate51;
import com.fdx.api.model51.model.Payees51;
import com.fdx.api.model51.model.Payment51;
import com.fdx.api.model51.model.Payments51;
import com.fdx.api.model51.model.RecurringPayment51;
import com.fdx.api.model51.model.RecurringPayments51;
import com.fdx.api.model51.model.RewardCategories51;
import com.fdx.api.model51.model.RewardProgram51;
import com.fdx.api.model51.model.RewardPrograms51;
import com.fdx.api.model51.model.Statement51;
import com.fdx.api.model51.model.Statements51;
import com.fdx.api.model51.model.TaxDataList51;
import com.fdx.api.model51.model.Transaction51;
import com.fdx.api.model51.model.Transactions51;
import com.fdx.api.model51.model.Transfer51;
import com.fdx.api.model51.model.TransferStatus51;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.ApiUtil;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import com.fdx.process51.PaymentProcess;
import com.fdx.process51.RecurringPaymentProcess;
import com.fdx.service.certificationmetrics.CertificationMetricService;
import com.fdx.service.fraud.SuspectedFraudIncidentService;
import com.fdx.service.notification.subscriptions.NotificationSubscriptionService;
import com.fdx.service.recipient.ConsentGrantService;
import com.fdx.service.recipient.FdxErrorService;
import com.fdx.service.notification.NotificationService;
import com.fdx.service.recipient.RecipientService;
import com.fdx.service.registry.recipient.RegistryRecipientService;
import com.fdx.service.transfer.TransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

@Service("5.1")
@PropertySource(value = "classpath:version51-application.properties", ignoreResourceNotFound = true)
public class ApiServiceImpl51<T> implements ServiceAdapterApi<T> {

	private static final Logger log = LoggerFactory.getLogger(ApiServiceImpl51.class);

	@Autowired
	Accounts51<?> accountsDao;

	@Autowired
	AccountWithDetails51<?> accountWithDetailsDao;

	@Autowired
	Transactions51<?> transactionsDao;

	@Autowired
	Transaction51<?> transactionDao;

	@Autowired
	Account51<?> accountDao;

	@Autowired
	Statements51<?> statementsDao;

	@Autowired
	Statement51<?> statementDao;

	@Autowired
	Error51<?> errorDao;

	@Autowired
	Availability51<?> availabilityDao;

	@Autowired
	Capability51<?> capabilityDao51;

	@Autowired
	Customers51<?> customersDao;

	@Autowired
	Customer51<?> customerDao;

	@Autowired
	RewardCategories51<?> rewardCategoriesDao;

	String errorResponse = null;

	@Autowired
	RewardProgram51<?> rewardProgramDao;

	@Autowired
	RewardPrograms51<?> rewardProgramsDao;

	@Autowired
	TaxDataList51<?> taxDataListDao;

	@Autowired
	Payees51<?> payeesDao;

	@Autowired
	Payee51<?> payeeDao;

	@Autowired
	PayeeForUpdate51<?> payeeForUpdateDao;

	@Autowired
	Payments51<?> paymentsDao;

	@Autowired
	Payment51<?> paymentDao;

	@Autowired
	RecurringPayments51<?> recurringPayementsDao;

	@Autowired
	RecurringPayment51<?> recurringPaymentDao51;

	@Autowired
	Transfer51<?> transferDao51;

	@Autowired
	TransferStatus51<?> transferStatusDao51;

	@Autowired
	AccountPaymentNetworkList51<?> accountPaymentNetworkList51;

	@Autowired
	FdxError51<?> fdxErrorDao;

	@Autowired
	Idempotency51<?> idempotency51;

	@Autowired
	RecipientService recipientService;

	@Autowired
	ConsentGrantService consentGrantService;

	@Autowired
	NotificationService notificationService;

	@Autowired
	NotificationSubscriptionService notificationSubscriptionService;

	@Autowired
	SuspectedFraudIncidentService suspectedFraudIncidentService;

	@Autowired
	FdxErrorService fdxErrorService;

	@Autowired
	RegistryRecipientService registryRecipientService;

	@Autowired
	TransferService transferService;

	@Autowired
	CertificationMetricService certificationMetricService;

	@Override
	public T searchForAccounts(List<String> accountIds, int limit, String offset, String resultType, String uriPath,
			String startTime, String endTime, String queryInput) {
		try {
			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("accountIds");
			paramsSet.add("startTime");
			paramsSet.add("resultType");
			paramsSet.add("endTime");
			paramsSet.add("limit");
			paramsSet.add("offset");

			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");

			Map<String, String> queryMap = new HashMap<>();
			if (query != null) {
				queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}
			LocalDate startTimeLocalDate = startTime != null ? getLocalDateFromStringDate(startTime) : LocalDate.of(1, 1, 1);
			LocalDate endTimeLocalDate = endTime != null ? getLocalDateFromStringDate(endTime) : LocalDate.of(9999, 12, 31);
			if (startTimeLocalDate.isAfter(endTimeLocalDate) && endTimeLocalDate.isBefore(startTimeLocalDate)) {
				throw new FDXException(703);
			}

			// if any date specified return data only if the transaction exist
			boolean isDateParamPassed = startTime != null || endTime != null;

			T accounts = (T) accountsDao.getAccounts(accountIds, limit, offset, resultType, uriPath, startTimeLocalDate,
					endTimeLocalDate, getQuery(queryMap).toString().trim(), isDateParamPassed);
			String accountsResponse = getSerializedObject(accounts);
			return (T) new ResponseEntity(accountsResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	private T getResponseEntityForError(int errorCode) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(new MediaType("application", "json"));
		if (errorCode == FdxConstants.HTTP_ERROR_CODE_500) {
			errorResponse = ApiUtil.getErrorObject("500", "Internal server error");
			return (T) new ResponseEntity(errorResponse, responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			try {
				FdxError51 fdxError = (FdxError51) fdxErrorDao.getFdxError(errorCode, "API");
				errorResponse = ApiUtil.getErrorObject(String.valueOf(errorCode), fdxError.getMessage());
				return (T) new ResponseEntity(errorResponse, responseHeaders, HttpStatus.valueOf(fdxError.getHttpStatusCode()));
			} catch (Exception ex) {
				return getResponseEntityException(ex);
			}
		}
	}

	private T getResponseEntityException(Exception e) {
		log.error("ApiServiceImpl51", e);
		String errorCode = "500";
		String message = "Internal server error";
		errorResponse = ApiUtil.getErrorObject(errorCode, message);
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(new MediaType("application", "json"));
		return (T) new ResponseEntity(errorResponse, responseHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	private T getResponseEntityFDXException(FDXException fdxException) {
		if (fdxException.getErrorCode() == 0) {
			errorResponse = ApiUtil.getErrorObject(String.valueOf(fdxException.getErrorCode()), fdxException.getMessage());
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("application", "json"));
			return (T) new ResponseEntity(errorResponse, responseHeaders, HttpStatus.NOT_FOUND);
		} else {
			return getResponseEntityForError(fdxException.getErrorCode());
		}
	}

	@Override
	public T getAccount(String accountId) {
		try {
			T accounts = (T) accountWithDetailsDao.getAccount(accountId);
			String accountJson = getSerializedObject(accounts);
			return (T) new ResponseEntity(accountJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getAccountContact(String accountId) {
		try {
			T accountContact = (T) accountDao.getAccountContact(accountId);
			String accountContactResponse = getSerializedObject(accountContact);
			return (T) new ResponseEntity(accountContactResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T searchForAccountTransactions(String accountId, String startTime, String endTime, Integer limit,
			String offset, String uriPath, String queryInput) {
		T transactionsList = null;
		try {
			String queryResult = new String();
			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("accountIds");
			paramsSet.add("startTime");
			paramsSet.add("endTime");
			paramsSet.add("limit");
			paramsSet.add("offset");

			Map<String, String> queryMap = new HashMap<>();

			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");

			if (query != null) {
				queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}
			LocalDate startTimeLocalDate = startTime != null ? getLocalDateFromStringDate(startTime) : LocalDate.of(1, 1, 1);
			LocalDate endTimeLocalDate = endTime != null ? getLocalDateFromStringDate(endTime) : LocalDate.of(9999, 12, 31);
			if (startTimeLocalDate.isAfter(endTimeLocalDate) && endTimeLocalDate.isBefore(startTimeLocalDate)) {
				throw new FDXException(703);
			}
			if (queryMap != null && queryMap.size() != 0)
				queryResult = getQuery(queryMap).toString();
			transactionsList = (T) transactionsDao.getTransactions(accountId, startTimeLocalDate, endTimeLocalDate, limit,
					offset, uriPath, queryResult);
			String transactionsResponse = getSerializedObject(transactionsList);
			return (T) new ResponseEntity(transactionsResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getAccountTransactionImages(String accountId, String imageId) {
		try {
			T transactionsList = (T) transactionDao.getTransactionImage(accountId, imageId);
			String statementImage = (String) transactionsList;
			if (transactionsList.equals("")) {
				String errorCode = "701";
				String message = "Image Id Not Found: " + imageId;
				HttpHeaders responseHeaders = new HttpHeaders();
				responseHeaders.setContentType(new MediaType("application", "json"));
				errorResponse = ApiUtil.getErrorObject(errorCode, message);
				return (T) new ResponseEntity<T>((T) errorResponse, responseHeaders, HttpStatus.NOT_FOUND);
			}
			URL url = new URL(statementImage);
			RenderedImage image = ImageIO.read(url);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ImageIO.write(image, "gif", bos);
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("image", "png"));
			return (T) new ResponseEntity<T>((T) bos.toByteArray(), responseHeaders, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T searchForAccountStatements(String accountId, String startTime, String endTime, Integer limit,
			String offset, String uriPath, String queryInput) {
		try {
			String queryResult = new String();
			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("accountIds");
			paramsSet.add("startTime");
			paramsSet.add("endTime");
			paramsSet.add("limit");
			paramsSet.add("offset");
			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");
			Map<String, String> queryMap = new HashMap<>();
			if (query != null) {
				queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}
			LocalDate startTimeLocalDate = startTime != null ? getLocalDateFromStringDate(startTime) : LocalDate.of(1, 1, 1);
			LocalDate endTimeLocalDate = endTime != null ? getLocalDateFromStringDate(endTime) : LocalDate.of(9999, 12, 31);
			if (startTimeLocalDate.isAfter(endTimeLocalDate) && endTimeLocalDate.isBefore(startTimeLocalDate)) {
				throw new FDXException(703);
			}
			if (queryMap != null && queryMap.size() > 0)
				queryResult = getQuery(queryMap).toString();

			T statementsList = (T) statementsDao.getStatementsList(accountId, startTimeLocalDate, endTimeLocalDate, limit,
					offset, uriPath, queryResult);
			String statementsListResponse = getSerializedObject(statementsList);
			return (T) new ResponseEntity(statementsListResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getAvailability() {
		try {
			T availability = (T) availabilityDao.getAvailability();
			String availabilityResponse = getSerializedObject(availability);
			return (T) new ResponseEntity(availabilityResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getCapability() {
		try {
			T capability = (T) capabilityDao51.getCapability();
			String capabilityResponse = getSerializedObject(capability);
			return (T) new ResponseEntity(capabilityResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getAccountStatement(String accountId, String statementId) {
		try {
			T statementResponse = (T) statementDao.getStatementById(accountId, statementId);
			String statementImage = (String) statementResponse;
			URL url = new URL(statementImage);
			RenderedImage image = ImageIO.read(url);
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ImageIO.write(image, "gif", bos);
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("image", "png"));
			return (T) new ResponseEntity<T>((T) bos.toByteArray(), responseHeaders, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getCustomers(int limit, String offset, String uriPath, String queryInput) {
		try {
			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("offset");
			paramsSet.add("limit");
			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");
			if (query != null) {
				int errorCode = validateQueryParams(paramsSet, getQueryMap(query.trim()));
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}
			T customer = (T) customersDao.getCustomers(limit, offset, uriPath);
			String customerResponse = getSerializedObject(customer);
			return (T) new ResponseEntity(customerResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getCustomerById(String customerId) {
		try {
			T customer = (T) customerDao.getCustomerDetails(customerId);
			String customerResponse = getSerializedObject(customer);
			return (T) new ResponseEntity(customerResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getCurrentCustomerInfo() {
		try {
			T customer = (T) customerDao.getCurrentCustomerInfo();
			String customerResponse = getSerializedObject(customer);
			return (T) new ResponseEntity(customerResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getErrorObject(String errorCode, String message) {
		return (T) errorDao.getErrorObject(errorCode, message);
	}

	@Override
	public T getRewardProgramCategories(String rewardProgramId, int limit, String offset, String uriPath) {
		try {
			T reward = (T) rewardCategoriesDao.getRewardProgramCategories(rewardProgramId, limit, offset, uriPath);
			String rewardResponse = getSerializedObject(reward);
			return (T) new ResponseEntity(rewardResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getRewardProgram(String rewardProgramId) {
		try {
			T reward = (T) rewardProgramDao.getRewardProgram(rewardProgramId);
			String rewardResponse = getSerializedObject(reward);
			return (T) new ResponseEntity(rewardResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getRewardPrograms(String uriPath) {
		try {
			T rewardPrograms = (T) rewardProgramsDao.getRewardPrograms(uriPath);
			String rewardProgramsResponse = getSerializedObject(rewardPrograms);
			return (T) new ResponseEntity(rewardProgramsResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getTaxForms(List<Integer> taxYears, List<String> taxForms, List<String> contentTypes, String uriPath,
			String resultType, String queryInput) {
		try {
			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("taxYears");
			paramsSet.add("taxForms");
			paramsSet.add("contentTypes");
			paramsSet.add("resultType");

			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");

			if (query != null) {
				Map<String, String> queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}

			// This method wil throw FDXException 401 if passed content types are not valid
			String stringValueOfContentTypes = taxDataListDao.getStringValueOfContentTypes(contentTypes);
			if (stringValueOfContentTypes != null && !stringValueOfContentTypes.contains("application/json"))
				throw new FDXException(407);

			// TODO pass stringValueOfTaxForms to getTaxForms instead of taxForms while refactoring
			// This method wil throw FDXException 401 if passed tax forms are not valid
			String stringValueOfTaxForms = taxDataListDao.getStringValueOfTaxForms(taxForms);
			T taxFormsResponse = (T) taxDataListDao.getTaxForms(taxYears, taxForms, contentTypes, uriPath, resultType,
					query);
			String taxFormsResponseString = getSerializedObject(taxFormsResponse);
			return (T) new ResponseEntity(taxFormsResponseString, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getTaxFormByID(String taxFormId, String version, Object accept) {
		try {
			T taxFormsResponse = (T) taxDataListDao.getTaxFormsById(taxFormId, accept);
			String taxFormsResponseString = getSerializedObject(taxFormsResponse);
			return (T) new ResponseEntity(taxFormsResponseString, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getPayees(String updatedSince, String offset, int limit, String uriPath, String queryInput) {
		try {
			String queryResult = new String();

			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("updatedSince");
			paramsSet.add("offset");
			paramsSet.add("limit");

			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");

			Map<String, String> queryMap = new HashMap<>();

			if (query != null) {
				queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}

			if (queryMap != null && queryMap.size() > 0)
				queryResult = getQuery(queryMap).toString();

			T payees = (T) payeesDao.getPayeesList(updatedSince, offset, limit, uriPath, queryResult);

			String payeesResponse = getSerializedObject(payees);
			return (T) new ResponseEntity(payeesResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getPayeeById(String payeeId, String version) {
		try {
			T payee = (T) payeeDao.getPayeeById(payeeId);
			String payeeResponse = getSerializedObject(payee);
			return (T) new ResponseEntity(payeeResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T updatePayee(String payeeId, Object payeeForUpdate, String version, String idempotencyKey) {
		try {
			if (idempotency51.ifExists(idempotencyKey, "updatePayee")) {
				T payeeResponse = (T) idempotency51.getApiResponse(idempotencyKey, "updatePayee");
				return (T) new ResponseEntity(payeeResponse, HttpStatus.CONFLICT);
			}
			T payee = (T) payeeForUpdateDao.updatePayee(payeeId, payeeForUpdate);
			String payeeResponse = getSerializedObject(payee);
			idempotency51.insertIdempotency(payeeResponse, idempotencyKey, "updatePayee",HttpStatus.CREATED.value());
			return (T) new ResponseEntity(payeeResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T deletePayee(String payeeId, String version) {
		try {
			T payee = (T) payeeDao.deletePayee(payeeId);
			String payeeJson = getSerializedObject(payee);
			return (T) new ResponseEntity(payeeJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getPayments(String updatedSince, String offset, Integer limit, String uriPath, String queryInput) {
		try {
			String queryResult = new String();

			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("updatedSince");
			paramsSet.add("offset");
			paramsSet.add("limit");

			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");

			Map<String, String> queryMap = new HashMap<>();

			if (query != null) {
				queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}

			if (queryMap != null && queryMap.size() > 0)
				queryResult = getQuery(queryMap).toString();

			T payments = (T) paymentsDao.getPaymentsList(updatedSince, offset, limit, uriPath, queryResult);

			String paymentsResponse = getSerializedObject(payments);
			return (T) new ResponseEntity(paymentsResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getPaymentById(String paymentId, String version) {
		try {
			T payment = (T) paymentDao.getPaymentById(paymentId);
			String paymentJsonResponse = getStringAfterRemovingDuplicates(payment);
			return (T) new ResponseEntity<>(paymentJsonResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T cancelPayment(String paymentId, String version) {
		try {
			T payment = (T) paymentDao.deletePayment(paymentId);
			String paymentJsonResponse = getStringAfterRemovingDuplicates(payment);
			return (T) new ResponseEntity(paymentJsonResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T updatePayment(String paymentId, Object paymentForUpdate, String version, String idempotencyKey) {
		try {
			PaymentProcess paymentProcess = new PaymentProcess();
			if (idempotency51.ifExists(idempotencyKey, "updatePayment")) {
				T payeeResponse = (T) idempotency51.getApiResponse(idempotencyKey, "updatePayment");
				return (T) new ResponseEntity(payeeResponse, HttpStatus.CONFLICT);
			}
			T payment = (T) paymentProcess.updatePayment(paymentId, paymentForUpdate);
			String paymentJson = getStringAfterRemovingDuplicates(payment);
			idempotency51.insertIdempotency(paymentJson, idempotencyKey, "updatePayment",HttpStatus.CREATED.value());
			return (T) new ResponseEntity(paymentJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	private String getStringAfterRemovingDuplicates(T payment) throws JsonProcessingException {
		String paymentJsonWithDuplicates = getSerializedObject(payment);
		ObjectMapper objectMapper = FdxUtil.getObjectMapper();
		Map<String, Object> attributesWithDuplicates = objectMapper
				.readValue(paymentJsonWithDuplicates, Map.class);
		Map<String, Object> withoutDuplicates = new HashMap<>();
		attributesWithDuplicates.forEach((key, value) -> {
			if (! withoutDuplicates.containsKey(key.toLowerCase())) {
				withoutDuplicates.put(key, value);
			}
		});
		return objectMapper.writeValueAsString(withoutDuplicates);
	}

	@Override
	public T getRecurringPayments(String updatedSince, String offset, Integer limit, String uriPath,
			String queryInput) {
		try {
			String queryResult = new String();

			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("updatedSince");
			paramsSet.add("offset");
			paramsSet.add("limit");

			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");

			Map<String, String> queryMap = new HashMap<>();
			if (query != null)
				queryMap = getQueryMap(query);

			if (query != null) {
				queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}

			if (queryMap != null && queryMap.size() > 0)
				queryResult = getQuery(queryMap).toString();

			T recurringPayments = (T) recurringPayementsDao.getRecurringPaymentsList(updatedSince, offset, limit,
					uriPath, queryResult);

			String recurringPaymentsResponse = getSerializedObject(recurringPayments);
			return (T) new ResponseEntity(recurringPaymentsResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getRecurringPaymentById(String recurringPaymentId, String version) {
		try {
			T recurringPayment = (T) recurringPaymentDao51.getRecurringPaymentById(recurringPaymentId);
			String recurringPaymentJson = getSerializedObject(recurringPayment);
			return (T) new ResponseEntity(recurringPaymentJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T cancelRecurringPayment(String recurringPaymentId, String version) {
		try {
			RecurringPaymentProcess recurringPaymentProcess = new RecurringPaymentProcess();
			T recurringPayment = (T) recurringPaymentProcess.cancelRecurringPaymentById(recurringPaymentId);
			String recurringPaymentJson = getSerializedObject(recurringPayment);
			return (T) new ResponseEntity<String>(recurringPaymentJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T updateRecurringPayment(String recurringPaymentId, Object recurringPaymentForUpdate, String version,
			String idempotencyKey) {
		try {
			RecurringPaymentProcess recurringPaymentProcess = new RecurringPaymentProcess();
			if (idempotency51.ifExists(idempotencyKey, "updateRecurringPayment")) {
				T recurringPaymentResponse = (T) idempotency51.getApiResponse(idempotencyKey, "updateRecurringPayment");
				return (T) new ResponseEntity(recurringPaymentResponse, HttpStatus.CONFLICT);
			}
			T recurringPayment = (T) recurringPaymentProcess.updateRecurringPaymentById(recurringPaymentId,
					recurringPaymentForUpdate);
			String recurringPaymentResponse = getSerializedObject(recurringPayment);
			idempotency51.insertIdempotency(recurringPaymentResponse, idempotencyKey, "updateRecurringPayment",HttpStatus.CREATED.value());
			return (T) new ResponseEntity(recurringPaymentResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T postPayee(Object payeeForUpdate, String idempotencyKey) {
		try {
			if (idempotency51.ifExists(idempotencyKey, "createPayee")) {
				T postPayeeResponse = (T) idempotency51.getApiResponse(idempotencyKey, "createPayee");
				return (T) new ResponseEntity(postPayeeResponse, HttpStatus.CONFLICT);
			}
			T postPayee = (T) payeeForUpdateDao.postPayee(payeeForUpdate);
			String postPayeeJson = getSerializedObject(postPayee);
			idempotency51.insertIdempotency(postPayeeJson, idempotencyKey, "createPayee",HttpStatus.CREATED.value());
			return (T) new ResponseEntity(postPayeeJson, HttpStatus.CREATED);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T postPayment(Object paymentForUpdate, String idempotencyKey) {
		try {
			PaymentProcess paymentProcess = new PaymentProcess();
			if (idempotency51.ifExists(idempotencyKey, "schedulePayment")) {
				T paymentResponse = (T) idempotency51.getApiResponse(idempotencyKey, "schedulePayment");
				return (T) new ResponseEntity(paymentResponse, HttpStatus.CONFLICT);
			}
			T payment = (T) paymentProcess.postPayment(paymentForUpdate);
			String paymentJson = getStringAfterRemovingDuplicates(payment);
			idempotency51.insertIdempotency(paymentJson, idempotencyKey, "schedulePayment",HttpStatus.CREATED.value());
			return (T) new ResponseEntity(paymentJson, HttpStatus.CREATED);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T postRecurringPayment(Object recurringPaymentForUpdate, String idempotencyKey) {
		try {
			RecurringPaymentProcess recurringPaymentProcess = new RecurringPaymentProcess();
			if (idempotency51.ifExists(idempotencyKey, "scheduleRecurringPayment")) {
				T recurringPaymentResponse = (T) idempotency51.getApiResponse(idempotencyKey, "scheduleRecurringPayment");
				return (T) new ResponseEntity(recurringPaymentResponse, HttpStatus.CONFLICT);
			}
			T recurringPayment = (T) recurringPaymentProcess.postRecurringPayment(recurringPaymentForUpdate);
			String recurringPaymentResponse = getSerializedObject(recurringPayment);
			idempotency51.insertIdempotency(recurringPaymentResponse, idempotencyKey, "scheduleRecurringPayment",HttpStatus.CREATED.value());
			return (T) new ResponseEntity(recurringPaymentResponse, HttpStatus.CREATED);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getPaymentsByRecurringPaymentId(String recurringPaymentId, String updatedSince, String offset,
			Integer limit, String uriPath, String queryInput) {
		try {
			String queryResult = new String();

			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("updatedSince");
			paramsSet.add("offset");
			paramsSet.add("limit");

			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");

			Map<String, String> queryMap = new HashMap<>();

			if (query != null) {
				queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}

			if (queryMap != null && queryMap.size() > 0)
				queryResult = getQuery(queryMap).toString();

			T payments = (T) paymentsDao.getPaymentsByRecurringPaymentId(recurringPaymentId, updatedSince, offset,
					limit, uriPath, queryResult);

			String recurringPaymentsResponse = getSerializedObject(payments);
			return (T) new ResponseEntity(recurringPaymentsResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	/**
	 * POST /transfers : Request account transfer Create a transfer between accounts
	 *
	 * @param transfer Data of the transfer request (optional)
	 * @param idempotencyKey Used to de-duplicate requests
	 * @return Initial status of the requested transfer (status code 200)
	 */
	@Override
	public T postTransfer(Object transfer, String idempotencyKey) {
		try {
			if (idempotency51.ifExists(idempotencyKey, FdxConstants.REQUEST_ACCOUNT_TRANSFER)) {
				T transferStatusResponse = (T) idempotency51.getApiResponse(idempotencyKey, FdxConstants.REQUEST_ACCOUNT_TRANSFER);
				return (T) new ResponseEntity(transferStatusResponse, HttpStatus.CONFLICT);
			}
			String transferStatus = transferService.postTransfer(transfer);
			idempotency51.insertIdempotency(transferStatus, idempotencyKey, FdxConstants.REQUEST_ACCOUNT_TRANSFER, HttpStatus.OK.value());
			return (T) new ResponseEntity(transferStatus, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	/**
	 * GET /transfers/{transferId}/status : Get transfer status Get status of
	 * transfer between accounts
	 *
	 * @param transferId Transfer identifier (required)
	 * @return Current status of the requested transfer (status code 200)
	 */
	@Override
	public T getTransferStatus(String transferId) {
		try {
			String transferStatusJson = transferService.getTransferStatusDetails(transferId);
			return (T) new ResponseEntity(transferStatusJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

	@Override
	public T getAccountPaymentNetworks(String accountId, Integer limit, String offset, String uriPath,
			String queryInput) {
		try {
			Set<String> paramsSet = new HashSet<>();
			paramsSet.add("accountIds");
			paramsSet.add("startTime");
			paramsSet.add("resultType");
			paramsSet.add("endTime");
			paramsSet.add("limit");
			paramsSet.add("offset");

			String query = null;
			if (queryInput != null)
				query = URLDecoder.decode(queryInput, "UTF-8");

			Map<String, String> queryMap = new HashMap<>();
			if (query != null)
				queryMap = getQueryMap(query.trim());

			if (query != null) {
				queryMap = getQueryMap(query.trim());
				int errorCode = validateQueryParams(paramsSet, queryMap);
				if (errorCode != 0)
					return getResponseEntityForError(errorCode);
			}

			StringBuffer queryResult = getQuery(queryMap);
			T accounts = (T) accountPaymentNetworkList51.getAccountPaymentNetwork(accountId, limit, offset, uriPath,
					queryResult.toString().trim());
			String accountsResponse = getSerializedObject(accounts);
			return (T) new ResponseEntity(accountsResponse, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getResponseEntityFDXException(fdxException);
		} catch (Exception e) {
			return getResponseEntityException(e);
		}
	}

//	Validations
	private StringBuffer getQuery(Map<String, String> queryMap) {
		StringBuffer queryResponse = new StringBuffer();
		for (Entry entrySet : queryMap.entrySet()) {
			if (!((entrySet.getKey().equals("offset")) || (entrySet.getKey().equals("limit"))
					|| (entrySet.getKey().equals("updatedSince")))) {
				queryResponse.append(entrySet.getKey());
				queryResponse.append("=");
				queryResponse.append(entrySet.getValue() + "&");
			}
		}
		return queryResponse;
	}

	private Map<String, String> getQueryMap(String query) throws FDXException {
		try {
			String[] params = query.split("&");
			Map<String, String> map = new HashMap<>();
			for (String param : params) {
				String name = param.split("=")[0];
				String value = param.split("=")[1];
				map.put(name, value);
			}
			return map;
		} catch (Exception e) {
			// values are not in proper format
			throw new FDXException(401);
		}
	}

	private int validateQueryParams(Set<String> paramsSet, Map<String, String> queryMap) throws Exception {
		if (queryMap == null) {
			return 401;
		}
		for (Entry entrySet : queryMap.entrySet()) {
			String key = (String) entrySet.getKey();
			// validate against valid params as per api expectations
			if (!paramsSet.contains(key)) {
				return 401;
			}
			if (key.equals("resultType")) {
				if (!(entrySet.getValue().equals("lightweight") || (entrySet.getValue().equals("details")))) {
					return 401;
				}
			}
			if (key.equals("offset") || key.equals("limit")) {
				Object value = entrySet.getValue();
				if (value == null || !Pattern.matches("[0-9]+", value.toString())) {
					return 401;
				}
			}
			if (key.equals("taxYears")) {
				try {
					Object value = entrySet.getValue();
					List<String> yearList = Arrays.asList(value.toString().split(","));
					for (String year : yearList) {
						int length = year.length();
						if (length != 4) {
							return 401;
						}
						Integer.parseInt(year);
					}
				} catch (Exception e) {
					return 401;
				}
			}
		}
		return 0;
	}

	private String getSerializedObject(Object response) throws JsonProcessingException {
		ObjectMapper objectMapper = FdxUtil.getObjectMapper();
		objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.setSerializationInclusion(Include.NON_DEFAULT);
		return objectMapper.writeValueAsString(response);
	}

	private LocalDate getLocalDateFromStringDate(String dateTime) throws FDXException {
		try {
			DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
					.appendPattern("yyyy-MM-dd").toFormatter(Locale.ENGLISH);
			return LocalDate.parse(dateTime, formatter);
		} catch (DateTimeParseException e) {
			throw new FDXException(702);
		}
	}

	/**
	 * Creates a Recipient Record.
	 *
	 * @param recipientRequest data used for creation
	 * @return created recipient data as json
	 */
	@Override
	public ResponseEntity<String> postRecipient(Object recipientRequest) {
		try {
			String recipientJson = recipientService.postRecipient(recipientRequest);
			return new ResponseEntity<>(recipientJson, HttpStatus.CREATED);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Returns recipient data identified with clientId.
	 *
	 * @param clientId used for search
	 * @return recipient data as json
	 */
	@Override
	public ResponseEntity<String> getRecipient(String clientId) {
		try {
			String recipientJson = recipientService.getRecipient(clientId);
			return new ResponseEntity<>(recipientJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Updates a Recipient Record.
	 *
	 * @param recipientRequest data to be updated
	 * @param clientId used for search
	 * @return updated recipient data as json
	 */
	@Override
  public ResponseEntity<String> updateRecipient(Object recipientRequest,
                                                String clientId) {
    try {
      String recipientJson = recipientService.updateRecipient(recipientRequest, clientId);
      if ("Not found".equals(recipientJson)) {
        return new ResponseEntity<>(recipientJson, HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(recipientJson, HttpStatus.OK);
    } catch (FDXException fdxException) {
      return getFDXExceptionResponseEntity(fdxException);
    } catch (Exception e) {
      return getExceptionResponseEntity(e);
    }
  }

	/**
	 * Delete data for a specific recipient identified with clientId.
	 *
	 * @param clientId Client Identifier. Uniquely identifies a Client.
	 * @return No Content (status code 204) if deleted else return error.
	 */
	@Override
	public ResponseEntity<String> deleteRecipient(String clientId) {
		try {
			String recipientJson = recipientService.deleteRecipient(clientId);
			return new ResponseEntity<>(recipientJson, HttpStatus.NO_CONTENT);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Returns consent grant data identified with consentId.
	 *
	 * @param consentId used for search
	 * @return consent grant data as json
	 */
	@Override
	public ResponseEntity<String> getConsentGrant(String consentId) {
		try {
			String consentGrantJson = consentGrantService.getConsentGrant(consentId);
			return new ResponseEntity<>(consentGrantJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Revoke a Consent Grant.
	 *
	 * @param consentRevocationRequest details of request to revoke consent grant
	 * @param consentId                used for search
	 * @return No Content (status code 204) if revoke success else error
	 */
	@Override
	public ResponseEntity<String> revokeConsentGrant(Object consentRevocationRequest, String consentId) {
		try {
			String consentGrantJson = consentGrantService.revokeConsentGrant(consentRevocationRequest, consentId);
			return new ResponseEntity<>(consentGrantJson, HttpStatus.NO_CONTENT);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Retrieve Consent Revocation record.
	 *
	 * @param consentId Consent Grant ID (required)
	 * @return ConsentRevocation Ok (status code 200)
	 */
	@Override
	public ResponseEntity<String> getConsentRevocation(String consentId) {
		try {
			String consentGrantJson = consentGrantService.getConsentRevocation(consentId);
			return new ResponseEntity<>(consentGrantJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Post Consent Grant record.
	 *
	 * @param consentGrantRequest Consent Grant (required)
	 * @return ConsentGrant Created (status code 201)
	 */
	@Override
	public ResponseEntity<String> postConsentGrant(Object consentGrantRequest) {
		try {
			String consentGrantJson = consentGrantService.postConsentGrant(consentGrantRequest);
			return new ResponseEntity<>(consentGrantJson, HttpStatus.CREATED);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Get Consent Grant Id.
	 *
	 * @param registeredClientId value
	 * @param principalName      value
	 * @return consentId Ok (status code 200)
	 */
	@Override
	public ResponseEntity<String> getConsentGrantId(String registeredClientId,
																									String principalName) {
		try {
			String consentGrantJson =
					consentGrantService.getConsentGrantId(registeredClientId, principalName);
			return new ResponseEntity<>(consentGrantJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Publish a notification.
	 *
	 * @param notification object
	 * @return notification object
	 */
	@Override
	public ResponseEntity<String> publishNotification(Object notification) {
		try {
			String notificationJson = notificationService.publishNotification(notification);
			return new ResponseEntity<>(notificationJson, HttpStatus.NO_CONTENT);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Creates notification subscription entry on the server
	 *
	 * @param notificationSubscription (optional)
	 * @return notificationSubscription created (status code 201)
	 */
	@Override
	public ResponseEntity<String> createNotificationSubscription(Object notificationSubscription) {
		try {
			String notificationSubscriptionJson =
					notificationSubscriptionService.createNotificationSubscription(notificationSubscription);
			return new ResponseEntity<>(notificationSubscriptionJson, HttpStatus.CREATED);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		}  catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * GET /notification-subscriptions/{subscriptionId} : Get a notification subscription
	 * Call to get notification subscription
	 *
	 * @param subscriptionId ID of notification subscription (required)
	 * @return notification subscription json OK (status code 200)
	 */
	@Override
	public ResponseEntity<String> getNotificationSubscription(String subscriptionId) {
		try {
			String notificationSubscriptionJson =
					notificationSubscriptionService.getNotificationSubscription(subscriptionId);
			return new ResponseEntity<>(notificationSubscriptionJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * DELETE /notification-subscriptions/{subscriptionId} : Delete a notification subscription
	 *
	 * @param subscriptionId ID of notification subscription (required)
	 * @return No Content (status code 204)
	 */
	@Override
	public ResponseEntity<String> deleteNotificationSubscription(String subscriptionId) {
		try {
			String notificationSubscriptionJson =
					notificationSubscriptionService.deleteNotificationSubscription(subscriptionId);
			return new ResponseEntity<>(notificationSubscriptionJson, HttpStatus.NO_CONTENT);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * POST /fraud/suspected-incident : Notify Data Provider of fraud
	 * Notify Data Provider of suspected fraud
	 *
	 * @param suspectedFraudIncidentRequest (optional)
	 * @return OK (status code 200)
	 */
	@Override
	public ResponseEntity<String> reportSuspectedFraudIncident(Object suspectedFraudIncidentRequest) {
		try {
			String suspectedFraudIncidentJson =
					suspectedFraudIncidentService.reportSuspectedFraudIncident(suspectedFraudIncidentRequest);
			return new ResponseEntity<>(suspectedFraudIncidentJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		}  catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * Returns registry recipient data identified with recipientId.
	 *
	 * @param recipientId used for search
	 * @return registry recipient data as json
	 */
	@Override
	public ResponseEntity<String> getRegistryRecipient(String recipientId) {
		try {
			String registryRecipientJson = registryRecipientService.getRegistryRecipient(recipientId);
			return new ResponseEntity<>(registryRecipientJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * GET /recipients : Get Registry Recipients
	 *
	 * @param offset value
	 * @param limit value
	 * @return OK (status code 200)
	 */
	@Override
	public ResponseEntity<String> getRegistryRecipients(Integer offset, Integer limit) {
		try {
			String registryRecipientsJson = registryRecipientService.getRegistryRecipients(offset, limit);
			return new ResponseEntity<>(registryRecipientsJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * GET /transfers/{transferId} : Get a transfer
	 * Get a transfer been accounts
	 *
	 * @param transferId Transfer identifier (required)
	 * @return Ok (status code 200)
	 */
	@Override
	public ResponseEntity<String> getTransfer(String transferId) {
		try {
			String transferJson = transferService.getTransfer(transferId);
			return new ResponseEntity<>(transferJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * DELETE /transfers/{transferId} : Cancel transfer
	 * Cancel a transfer between accounts
	 *
	 * @param transferId Transfer identifier (required)
	 * @return Ok (status code 200)
	 */
	@Override
	public ResponseEntity<String> cancelTransfer(String transferId) {
		try {
			String transferJson = transferService.cancelTransfer(transferId);
			return new ResponseEntity<>(transferJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * GET /transfers : Search for transfers between accounts
	 * Search for transfers
	 *
	 * @param updatedSince            Return items that have been created or updated since the update id (optional)
	 * @param searchStartTransferDate Start time for use in retrieval of transfers by transfer date (optional)
	 * @param searchEndTransferDate   End time for use in retrieval of transfers by transfer date (optional)
	 * @param searchFromAccountIds    Search for transfers by source account (optional)
	 * @param searchToAccountIds      Search for transfers by source account (optional)
	 * @param searchStatuses          Search for transfers by source account (optional)
	 * @param searchTransferIds       Search for transfers by id (optional)
	 * @return Success (status code 200)
	 * or Start or end date value is not in the ISO 8601 format (status code 400)
	 * or Data not found for request parameters (status code 404)
	 * or Catch all exception where request was not processed due to an internal outage/issue. Consider other more specific errors before using this error (status code 500)
	 * or Error when FdxVersion in Header is not one of those implemented at backend (status code 501)
	 * or System is down for maintenance (status code 503)
	 */
	@Override
	public ResponseEntity<String> searchForTransfers(String updatedSince, LocalDate searchStartTransferDate,
																									 LocalDate searchEndTransferDate, List<String> searchFromAccountIds,
																									 List<String> searchToAccountIds, List<PaymentStatus> searchStatuses,
																									 List<String> searchTransferIds) {
		try {
			String transferJson = transferService.searchForTransfers(updatedSince, searchStartTransferDate,
					searchEndTransferDate, searchFromAccountIds, searchToAccountIds, searchStatuses, searchTransferIds);
			return new ResponseEntity<>(transferJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	/**
	 * GET /certification-metrics : Get certification performance metrics
	 * Get certification performance metrics for this implementer's APIs
	 *
	 * @param operationId Specific operationId for which to get the metrics. Optional (optional)
	 * @return Array of api's certification metrics (status code 200)
	 */
	@Override
	public ResponseEntity<String> getCertificationMetrics(String operationId) {
		try {
			String certificationMetricJson = certificationMetricService.getCertificationMetrics(operationId);
			return new ResponseEntity<>(certificationMetricJson, HttpStatus.OK);
		} catch (FDXException fdxException) {
			return getFDXExceptionResponseEntity(fdxException);
		} catch (Exception e) {
			return getExceptionResponseEntity(e);
		}
	}

	private ResponseEntity<String> getFDXExceptionResponseEntity(FDXException fdxException) {
		if (fdxException.getErrorCode() == 0) {
			errorResponse =
					ApiUtil.getErrorObject(String.valueOf(fdxException.getErrorCode()),
							fdxException.getMessage());
			HttpHeaders responseHeaders = new HttpHeaders();
			responseHeaders.setContentType(new MediaType("application", "json"));
			return new ResponseEntity<>(errorResponse, responseHeaders,
					HttpStatus.NOT_FOUND);
		} else {
			return getErrorResponseEntity(fdxException.getErrorCode());
		}
	}

	private ResponseEntity<String> getErrorResponseEntity(int errorCode) {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(new MediaType("application", "json"));
		if (errorCode == FdxConstants.HTTP_ERROR_CODE_500) {
			errorResponse = ApiUtil.getErrorObject("500", "Internal server error");
			return new ResponseEntity<>(errorResponse, responseHeaders,
					HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			try {
				FdxError51 fdxError = (FdxError51) fdxErrorDao.getFdxError(errorCode,
						"API");
				errorResponse = ApiUtil.getErrorObject(String.valueOf(errorCode),
						fdxError.getMessage());
				return new ResponseEntity<>(errorResponse, responseHeaders,
						HttpStatus.valueOf(fdxError.getHttpStatusCode()));
			} catch (Exception ex) {
				return getExceptionResponseEntity(ex);
			}
		}
	}

	private ResponseEntity<String> getExceptionResponseEntity(Exception e) {
		log.error("ApiServiceImpl51", e);
		errorResponse = ApiUtil.getErrorObject("500", "Internal server error");
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(new MediaType("application", "json"));
		return new ResponseEntity<>(errorResponse, responseHeaders,
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}