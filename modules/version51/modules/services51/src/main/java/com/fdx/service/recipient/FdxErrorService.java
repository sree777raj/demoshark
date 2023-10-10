package com.fdx.service.recipient;

import com.fdx.api.model51.modelimpl.FdxError;
import com.fdx.common.exception.FDXException;
import com.fdx.common.util.FdxUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for fdx error entity.
 */
@Service
public class FdxErrorService {

  @Autowired
  FdxError fdxError;

  /**
   * Returns fdx error using error code and realm for search.
   *
   * @param errorCode used for search
   * @param realm used for search
   * @return fdx error
   * @throws FDXException error
   */
  public String getFdxError(int errorCode, String realm) throws FDXException {
    return FdxUtil.getSerializedObject(fdxError.getFdxError(errorCode, realm));
  }

}
