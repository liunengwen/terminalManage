package com.newland.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {
	
	protected final Logger log = LoggerFactory.getLogger(getClass());;
	
	protected static final String STATUS = "status";
	protected static final String MSG = "msg";
	
	protected static final int SUCCESS_STATUS = 200;
	protected static final int CLIENT_ERROR_STATUS = 400;
	protected static final int AUTH_ERROR_STATUS = 401;
	protected static final int DATA_INPUT_ERROR_STATUS = 402;
	protected static final int SESSION_TIMEOUT_STATUS = 440;
	protected static final int SERVER_ERROR_STATUS = 500;
	
	
	
}
