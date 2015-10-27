package br.com.bradseg.siaw.antecipaparcela.dao;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.bradseg.bsad.framework.core.exception.IntegrationException;
import br.com.bradseg.bsad.framework.ctg.programapi.program.CTGProgram;
import br.com.bradseg.bsad.framework.ctg.programapi.program.CTGProgramProvider;
import br.com.bradseg.bsad.framework.ctg.programapi.program.ResultSet;
import br.com.bradseg.siaw.antecipaparcela.cics.SIAW0550;
import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.RetornoErroVo;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class AntecipaParcelaDaoImplRefatorado implements AntecipaParcelaDao {

	private static final String CAMPO = "B1040-";
	
	@Autowired
	private CTGProgramProvider ctgProgramProvider;
	
	private ResultSet ajustaChamadaCics(EntradaParcelaVo entradaParcela){
		
		SIAW0550 programaSIAW0550 = ctgProgramProvider.get(SIAW0550.class);
		
//		CTGProgram programaSIAW0550 = new SIAW0550();
		
		programaSIAW0550.getInputSet().setInteger(CAMPO+"SUC", entradaParcela.getSucursal());
		programaSIAW0550.getInputSet().setInteger(CAMPO+"RMO", entradaParcela.getRamo());
		programaSIAW0550.getInputSet().setInteger(CAMPO+"CIA", entradaParcela.getCia());
		programaSIAW0550.getInputSet().setInteger(CAMPO+"APO", entradaParcela.getApolice());
		programaSIAW0550.getInputSet().setInteger(CAMPO+"ITEM", entradaParcela.getItem());
		programaSIAW0550.getInputSet().setInteger(CAMPO+"ENDOSSO", entradaParcela.getEndosso());
		programaSIAW0550.getInputSet().setInteger(CAMPO+"NR-PRESTACAO", entradaParcela.getNumeroPrestacao());
		programaSIAW0550.getInputSet().setDouble(CAMPO+"VL-PARC", entradaParcela.getValorParcela().doubleValue());
		programaSIAW0550.getInputSet().setDouble(CAMPO+"PERC-FRACION", entradaParcela.getPercentualJuros().doubleValue());
		programaSIAW0550.getInputSet().setDouble(CAMPO+"VL-ADIC-FRACION", entradaParcela.getValorAdicionalFracionamento().doubleValue());
		programaSIAW0550.getInputSet().setDouble(CAMPO+"VL-IOF", entradaParcela.getValorIOF().doubleValue());
		programaSIAW0550.getInputSet().setDate(CAMPO+"DT-VENC", entradaParcela.getDataVencimento());
		programaSIAW0550.getInputSet().setDate(CAMPO+"DT-PGTO", entradaParcela.getDataPagamento());
		programaSIAW0550.getInputSet().setInteger(CAMPO+"TIPO-COBR", entradaParcela.getTipoCobranca());
		
//		programaSIAW0550.setEntradaParcela(entradaParcela);

		ResultSet rs = programaSIAW0550.execute();
		return rs;
	}
	
	private SaidaParcelaVo getSaidaParcelaVo(ResultSet rs){
		DecimalFormat formatarDecimaisDinheiro = new DecimalFormat(".##");
		
		SaidaParcelaVo saidaParcela = new SaidaParcelaVo(); 
		saidaParcela.setValorParcelaCalculado(new BigDecimal(formatarDecimaisDinheiro.format(rs.getDouble(CAMPO+"VL-PARC-CALC"))));
		saidaParcela.setValorIOFCalculado(new BigDecimal(formatarDecimaisDinheiro.format(rs.getDouble(CAMPO+"VL-IOF-CALC"))));
		saidaParcela.setDataVencimentoBoleto(rs.getDate(CAMPO+"DT-CALC-PARC"));
		return saidaParcela;
		
	}
	
	private RetornoErroVo getErro(ResultSet rs){
		
		RetornoErroVo retornoErro = new RetornoErroVo();
		retornoErro.setErro(rs.getInteger(CAMPO+"ERRO"));
		retornoErro.setMensagemErro(rs.getString(CAMPO+"MSG-ERRO "));
		
		return retornoErro;
		
	}
	
	public SaidaParcelaVo consultarAntecipacaoParcela(EntradaParcelaVo entradaParcela){

		ResultSet rs = ajustaChamadaCics(entradaParcela);		
		SaidaParcelaVo saidaParcela = getSaidaParcelaVo( rs);	
		saidaParcela.setErro(getErro(rs));		
		return saidaParcela;
		
	}
	
}
