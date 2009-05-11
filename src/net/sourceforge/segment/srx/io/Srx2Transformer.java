package net.sourceforge.segment.srx.io;

import static net.rootnode.loomchild.util.io.Util.copyAll;

import java.io.Reader;
import java.io.Writer;
import java.util.Map;

import net.sourceforge.segment.srx.SrxTransformer;


/**
 * Represents SRX document transformer between SRX 2.0 and newest supported
 * version. As newest supported version is 2.0 so does no transformation.
 * 
 * @author loomchild
 */
public class Srx2Transformer implements SrxTransformer {

	/**
	 * Copies SRX document from reader to writer without transformation.
	 * 
	 * @param reader
	 *            Reader containing SRX document.
	 * @param writer
	 *            Writer to write SRX document.
	 * @param parameterMap
	 *            Map containing transformation parameters, ignored.
	 */
	public void transform(Reader reader, Writer writer,
			Map<String, Object> parameterMap) {
		copyAll(reader, writer);
	}

	/**
	 * Returns given reader without modification.
	 * 
	 * @param reader
	 *            Reader containing SRX document.
	 * @param parameterMap
	 *            Map containing transformation parameters, ignored.
	 * @return Returns reader.
	 */
	public Reader transform(Reader reader, Map<String, Object> parameterMap) {
		return reader;
	}

}