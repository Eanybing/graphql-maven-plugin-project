/**
 * This files is an extract from the org.slf4j.Logger interface, with all non pure JDK dependency removed. 
 * All methods that don't exist in MavenLog have also been removed.
 *  
 * The idea is to provide a standard logging API to the Plugin Logic, but to not depend on any external 
 * dependency. It's then up to the Plugin implementation (Maven, Gradle...) to map this to the real logging framework. 
 * 
 * 
 * Copyright (c) 2004-2011 QOS.ch
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.graphql_java_generator.plugin.conf;

/**
 * The org.slf4j.Logger interface is the main user entry point of SLF4J API. It is expected that logging takes place
 * through concrete implementations of this interface.
 * 
 * <h3>Typical usage pattern:</h3>
 * 
 * <pre>
 * import org.slf4j.Logger;
 * import org.slf4j.LoggerFactory;
 *
 * public class Wombat {
 *
 *   <span style="color:green">final static Logger logger = LoggerFactory.getLogger(Wombat.class);</span>
 *   Integer t;
 *   Integer oldT;
 *
 *   public void setTemperature(Integer temperature) {
 *     oldT = t;
 *     t = temperature;
 *     <span style="color:green">logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);</span>
 *     if(temperature.intValue() &gt; 50) {
 *       <span style="color:green">logger.info("Temperature has risen above 50 degrees.");</span>
 *     }
 *   }
 * }
 * </pre>
 *
 * Be sure to read the FAQ entry relating to <a href="../../../faq.html#logging_performance">parameterized logging</a>.
 * Note that logging statements can be parameterized in <a href="../../../faq.html#paramException">presence of an
 * exception/throwable</a>.
 *
 * <p>
 * Once you are comfortable using loggers, i.e. instances of this interface, consider using <a href="MDC.html">MDC</a>
 * as well as <a href="Marker.html">Markers</a>.
 *
 * @author Ceki G&uuml;lc&uuml;
 */
public interface Logger {

	/**
	 * Is the logger instance enabled for the DEBUG level?
	 *
	 * @return True if this Logger is enabled for the DEBUG level, false otherwise.
	 */
	public boolean isDebugEnabled();

	/**
	 * Log a message at the DEBUG level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	public void debug(String msg);

	/**
	 * Log an exception (throwable) at the DEBUG level with an accompanying message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	public void debug(String msg, Throwable t);

	/**
	 * Is the logger instance enabled for the INFO level?
	 *
	 * @return True if this Logger is enabled for the INFO level, false otherwise.
	 */
	public boolean isInfoEnabled();

	/**
	 * Log a message at the INFO level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	public void info(String msg);

	/**
	 * Log an exception (throwable) at the INFO level with an accompanying message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	public void info(String msg, Throwable t);

	/**
	 * Is the logger instance enabled for the WARN level?
	 *
	 * @return True if this Logger is enabled for the WARN level, false otherwise.
	 */
	public boolean isWarnEnabled();

	/**
	 * Log a message at the WARN level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	public void warn(String msg);

	/**
	 * Log an exception (throwable) at the WARN level with an accompanying message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	public void warn(String msg, Throwable t);

	/**
	 * Is the logger instance enabled for the ERROR level?
	 *
	 * @return True if this Logger is enabled for the ERROR level, false otherwise.
	 */
	public boolean isErrorEnabled();

	/**
	 * Log a message at the ERROR level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	public void error(String msg);

	/**
	 * Log an exception (throwable) at the ERROR level with an accompanying message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	public void error(String msg, Throwable t);

}
