package com.fdx.process51;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fdx.api.model51.model.Payment51;
import com.fdx.api.model51.model.PaymentForUpdate51;
import com.fdx.api.model51.modelimpl.Payment;
import com.fdx.api.model51.modelimpl.PaymentForUpdate;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxConstants;
import com.fdx.common.util.FdxUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PaymentProcess {

  private static final Logger log = LoggerFactory.getLogger(PaymentProcess.class);

  public Payment51 postPayment(Object paymentForUpdate) throws FDXException {
    return postPayment(paymentForUpdate, null);
  }

  public Payment51 postPayment(Object paymentForUpdateObj, String recurringPaymentId)
      throws FDXException {
    try {
      PaymentForUpdate paymentForUpdateRepository = new PaymentForUpdate();
      MoneyMovementProcess moneyMovementProcess = new MoneyMovementProcess();
      PaymentForUpdate51 paymentForUpdate = FdxUtil.getObjectMapper().convertValue(paymentForUpdateObj,
          new TypeReference<PaymentForUpdate>() {
          });
      moneyMovementProcess.validatetPaymentInput(paymentForUpdate, true);
      Payment payment = paymentForUpdateRepository.postPaymentForUpdate(paymentForUpdate, recurringPaymentId);
      return moneyMovementProcess.processPayments(payment);
    } catch (IllegalArgumentException e) {
      throw new FDXException(e, 401);
    } catch (FDXException fdxException) {
      if (fdxException.getErrorCode() == 1) {
        throw new FDXException(804);
      }
      throw fdxException;
    } catch (Exception e) {
      log.error("Payment : ", e);
      throw new FDXException(e, FdxConstants.HTTP_ERROR_CODE_500);
    }
  }

  public Payment51 updatePayment(String paymentId, Object paymentForUpdateObj) throws FDXException {
    try {
      Payment paymentRepository = new Payment();
      PaymentForUpdate paymentForUpdateRepository = new PaymentForUpdate();
      MoneyMovementProcess moneyMovementProcess = new MoneyMovementProcess();
      PaymentForUpdate51 paymentForUpdate = FdxUtil.getObjectMapper().convertValue(paymentForUpdateObj,
          new TypeReference<PaymentForUpdate>() {
          });
      Payment51 payment = paymentRepository.okToUpdatePayment(paymentId);
      moneyMovementProcess.validatetPaymentInput(paymentForUpdate, false);
      paymentForUpdateRepository.updatePayment(paymentId, paymentForUpdate);
      return moneyMovementProcess.processPayments(payment);
    } catch (IllegalArgumentException e) {
      throw new FDXException(e, 401);
    }  catch (FDXException fdxException) {
      if (fdxException.getErrorCode() == 1) {
        throw new FDXException(805);
      }
      throw fdxException;
    } catch (Exception e) {
      log.error("Payment : ", e);
      throw new FDXException(e,FdxConstants.HTTP_ERROR_CODE_500);
    }
  }
}
