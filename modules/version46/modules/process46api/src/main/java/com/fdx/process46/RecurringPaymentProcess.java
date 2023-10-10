package com.fdx.process46;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fdx.api.model46.model.RecurringPayment46;
import com.fdx.api.model46.modelimpl.RecurringPayment;
import com.fdx.api.model46.modelimpl.RecurringPaymentForUpdate;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecurringPaymentProcess {

  private static final Logger log = LoggerFactory.getLogger(RecurringPaymentProcess.class);

  public RecurringPayment46 updateRecurringPaymentById(String recurringPaymentId, Object recurringPaymentForUpdateIn) throws FDXException {
    RecurringPayment recurringPaymentRepository = new RecurringPayment();
    try {
      // will throw 806 error if not found
      recurringPaymentRepository.getRecurringPaymentById(recurringPaymentId);
      MoneyMovementProcess moneyMovementProcess = new MoneyMovementProcess();
      ObjectMapper mapper = FdxUtil.getObjectMapper();
      RecurringPaymentForUpdate recurringPaymentForUpdate = mapper.convertValue(recurringPaymentForUpdateIn,
          new TypeReference<RecurringPaymentForUpdate>() {});
      moneyMovementProcess.validatetRecurringPaymentInput(recurringPaymentForUpdate, false);
      RecurringPayment recurringPayment = recurringPaymentForUpdate.updateRecurringPayment(recurringPaymentId, recurringPaymentForUpdate);
      return recurringPayment;
    } catch (FDXException fdxException) {
      if (fdxException.getErrorCode() == 1) {
        throw new FDXException(808);
      }
      throw fdxException;
    } catch (IllegalArgumentException e) {
      throw new FDXException(e,401);
    } catch (Exception e) {
      log.error("RecurringPayment : ", e);
      recurringPaymentRepository.setRecurringPaymentStatus(recurringPaymentRepository.getRecurringPaymentId(),"FAILED");
      throw new FDXException(e,500);
    }
  }

  public RecurringPayment46 postRecurringPayment(Object recurringPaymentForUpdateInput) throws FDXException {
    String recurringPaymentId = null;
    RecurringPayment recurringPaymentRepository = new RecurringPayment();
    try {
      RecurringPaymentForUpdate recurringPaymentForUpdateRepository = new RecurringPaymentForUpdate();
      MoneyMovementProcess moneyMovementProcess = new MoneyMovementProcess();
      ObjectMapper mapper = FdxUtil.getObjectMapper();
      RecurringPaymentForUpdate recurringPaymentForUpdate = mapper.convertValue(recurringPaymentForUpdateInput,
          new TypeReference<RecurringPaymentForUpdate>() {});
      moneyMovementProcess.validatetRecurringPaymentInput(recurringPaymentForUpdate, true);
      RecurringPayment recurringPayment = (RecurringPayment) recurringPaymentForUpdateRepository.postRecurringPayment(recurringPaymentForUpdate);
      return moneyMovementProcess.processRecurringPayment(recurringPayment);
    } catch (IllegalArgumentException e) {
      throw new FDXException(e, 401);
    }  catch (FDXException fdxException) {
      if (fdxException.getErrorCode() == 1) {
        throw new FDXException(807);
      }
      throw fdxException;
    } catch (Exception e) {
      log.error("RecurringPayment : ", e);
      recurringPaymentRepository.setRecurringPaymentStatus(recurringPaymentId, "FAILED");
      throw new FDXException(e,500);
    }
  }

  public RecurringPayment46 cancelRecurringPaymentById(String recurringPaymentId) throws FDXException {
    RecurringPayment recurringPaymentRepository = new RecurringPayment();
    RecurringPayment46 recurringPayment46 = (RecurringPayment46) recurringPaymentRepository.cancelRecurringPaymentById(recurringPaymentId);
    // payments spawned from recurring payment needs to be cancelled
    // TODO uncomment below line once implementation is done
    //paymentRepository.deletePayment(paymentRepository.getActivePaymentForRecurringPayment(recurringPaymentId));
    return recurringPayment46;
  }

}
