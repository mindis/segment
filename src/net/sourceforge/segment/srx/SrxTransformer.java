package net.sourceforge.segment.srx;

import java.io.Reader;
import java.io.Writer;
import java.util.Map;

import net.sourceforge.segment.srx.io.SrxVersion;


/**
 * Represents SRX document transformer between old versions and newest supported
 * version. Responsible for transforming using XSLT.
 * 
 * @author loomchild
 * @see SrxVersion
 */
public interface SrxTransformer {

	/**
	 * Transform given SRX document to newest supported version and write it to
	 * given writer.
	 * 
	 * @param reader
	 *            Reader containing SRX document.
	 * @param writer
	 *            Writer to write transformed SRX document.
	 * @param parameterMap
	 *            Map containing transformation parameters.
	 */
	public void transform(Reader reader, Writer writer,
			Map<String, Object> parameterMap);

	/**
	 * Transform given SRX document and return Reader containing newest
	 * supported version.
	 * 
	 * @param reader
	 *            Reader containing SRX document.
	 * @param parameterMap
	 *            Map containing transformation parameters.
	 * @return Returns reader containing SRX document in newest supported
	 *         version.
	 */
	public Reader transform(Reader reader, Map<String, Object> parameterMap);

}