package com.fdx.common.exception;

public class FDXException extends Exception {

    int errorCode = 0;
	String originalMessage;   //to capture and save message from Cause.

    public FDXException(String message) {
        super(message);
    }

    public FDXException(int errorCode) {
      super("Contact system admin");
			this.errorCode = errorCode;
    }

    public FDXException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public FDXException(Exception e, String message, int errorCode) {
		super(message);		
        this.errorCode = errorCode;
		assignValuesFromCause(e);
    }

	public FDXException(Exception e, String message) {
        super(message);
		assignValuesFromCause(e);        
    }

	public FDXException(Exception e) {
        assignValuesFromCause(e);
    }

	public FDXException(Exception e, int errorCode) {
        this.errorCode = errorCode;
		assignValuesFromCause(e);
    }


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

	// Get message from the Cause if available. 
    public String getOriginalMessage() {
		if (this.originalMessage != null) 
			return this.originalMessage;
		else
			return super.getMessage();
    }
	
	
	/* In some special cases where checked exceptions can not be thrown, FDXException needs to be wrapped
	*  within unchecked Exception. Later when that Exception is caught and FDXException is created, values
	*  can be retrieved from original cause.
	*/
	private void assignValuesFromCause(Exception e) {

		//if Cause was the FDXException ignore it to avoid recursive linking.
		if (e instanceof FDXException) {
			return;
		} 
		
		// Inspect cause to check if FDXException was embedded inside it 
		if (e instanceof Throwable) {
			Throwable innerEx = e.getCause();
			if (innerEx instanceof FDXException) {
				this.originalMessage = innerEx.getMessage();
				this.errorCode = ((FDXException)innerEx).getErrorCode();
				return;
			}
		
		// Write code below this line to inspect and derive values from other causes.

		}
		return;
	}
}