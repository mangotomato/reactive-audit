package com.octo.reactive.audit.lib;

/**
 * Exception throw by the jvm agent if a file blocking API is used.
 * This exception is throw only if the throwExceptions parameter is true.
 *
 * @author Philippe PRADOS
 */

public class FileAuditReactiveException extends AuditReactiveException
{
	public FileAuditReactiveException(Latency latency, String message)
	{
		super(latency, "Call method " + message);
	}

	public FileAuditReactiveException(Latency latency, String format, Object... args)
	{
		super(latency, "Call method " + format, args);
	}
}