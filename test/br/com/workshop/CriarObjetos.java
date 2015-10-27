package br.com.workshop;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.RetornoErroVo;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;

public class CriarObjetos {

	@SuppressWarnings("finally")
	public static SaidaParcelaVo getSaidaParcelaVo() {
		SaidaParcelaVo sVo = null;
		try {

			sVo = new SaidaParcelaVo(new BigDecimal("100000"), new BigDecimal(
					"2000"),
					(Date) new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
							.parse("2015-10-22T11:00:54.000"),
					new RetornoErroVo());

			return sVo;
		} catch (ParseException p) {
			System.out.println(p.getStackTrace());
		} finally {
			return sVo;
		}
	}

	public static EntradaParcelaVo getEntradaParcelaVo() {

		EntradaParcelaVo entradaParcela = new EntradaParcelaVo();
		entradaParcela.setSucursal(1);
		entradaParcela.setRamo(990);
		entradaParcela.setCia(244);
		entradaParcela.setApolice(844556);
		entradaParcela.setItem(1);
		entradaParcela.setEndosso(00000000);
		entradaParcela.setNumeroPrestacao(1);
		entradaParcela.setValorParcela(new BigDecimal("100000"));
		entradaParcela.setPercentualJuros(new BigDecimal("250"));
		entradaParcela.setValorAdicionalFracionamento(new BigDecimal("2500"));
		entradaParcela.setValorIOF(new BigDecimal("2000"));

		entradaParcela.setDataVencimento(getDataValida());
		entradaParcela.setDataPagamento(getDataValida());

		entradaParcela.setTipoCobranca(1);

		return entradaParcela;

	}

	@SuppressWarnings("finally")
	public static Date getDataValida() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date data = null;

		try {

			data = (Date) format.parse("15/12/2015");

		} catch (ParseException e) {

		} finally {

			return data;

		}

	}
}
