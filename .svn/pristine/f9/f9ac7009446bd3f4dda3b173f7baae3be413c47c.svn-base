
package br.com.bradseg.siaw.antecipaparcela.cics;

import java.sql.SQLException;

import br.com.bradseg.bsad.framework.ctg.programapi.annotation.CicsGateway;
import br.com.bradseg.bsad.framework.ctg.programapi.field.DateFieldType;
import br.com.bradseg.bsad.framework.ctg.programapi.field.StringFieldType;
import br.com.bradseg.bsad.framework.ctg.programapi.field.DoubleFieldType;
import br.com.bradseg.bsad.framework.ctg.programapi.field.FieldType;
import br.com.bradseg.bsad.framework.ctg.programapi.field.IntegerFieldType;
import br.com.bradseg.bsad.framework.ctg.programapi.program.CTGProgramImpl;
import br.com.bradseg.bsad.framework.ctg.programapi.program.CommonAreaMetaData;

/**
 * @author rafael.jesus
 *
 */
@CicsGateway
public class SIAW0550 extends CTGProgramImpl {

	private static final String PGM_NAME = "SIAW0550";
	private static final String TRAN_NAME = "SW55";

	private static final CommonAreaMetaData COMM_AREA = new CommonAreaMetaData(
		new FieldType[] {
			new IntegerFieldType("B1040-SUC", 4),
			new IntegerFieldType("B1040-RMO", 4),
			new IntegerFieldType("B1040-CIA", 4),
			new IntegerFieldType("B1040-APO", 8),
			new IntegerFieldType("B1040-ITEM", 4),
			new IntegerFieldType("B1040-ENDOSSO", 8),
			new IntegerFieldType("B1040-NR-PRESTACAO", 3),		
			new DoubleFieldType("B1040-VL-PARC", 15, 2),
			new DoubleFieldType("B1040-PERC-FRACION", 7, 4),
			new DoubleFieldType("B1040-VL-ADIC-FRACION ", 15, 2),
			new DoubleFieldType("B1040-VL-IOF", 15, 2),			
			new DateFieldType("B1040-DT-VENC", 8, "ddMMyyyy"),
			new DateFieldType("B1040-DT-PGTO", 8, "ddMMyyyy"),		
			new IntegerFieldType("B1040-TIPO-COBR", 2),
			new DoubleFieldType("B1040-VL-PARC-CALC", 15, 2),
			new DoubleFieldType("B1040-VL-IOF-CALC", 15, 2),
			new DateFieldType("B1040-DT-CALC-PARC", 8, "ddMMyyyy"),
			new IntegerFieldType("B1040-ERRO", 1),
			new StringFieldType("B1040-MSG-ERRO", 50),
//			new StringFieldType("FILLER", 46),		
//			new IntegerFieldType("B1040-MSG-ERRO-SQLCODE", 4),
			new StringFieldType("FILLER", 156)
	});
	
	public SIAW0550() {
		super(PGM_NAME, TRAN_NAME, COMM_AREA.getStreamSize(), COMM_AREA, COMM_AREA);
	}	
}
