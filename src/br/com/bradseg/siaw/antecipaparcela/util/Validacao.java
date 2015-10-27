package br.com.bradseg.siaw.antecipaparcela.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.RetornoErroVo;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class Validacao {

	private static final String CAMPO = " Campo ";
	private static final String CAMPONAONULO = " não pode ser nulo./n";
	private static final String CAMPONAONUMERICO = " não é um número./n";

	public RetornoErroVo validarDados(EntradaParcelaVo entradaParcelaVo) {

		RetornoErroVo retornoErroVo = new RetornoErroVo();
		StringBuilder mensagemTodosOsErros = new StringBuilder();

		if (null != entradaParcelaVo) {
			mensagemTodosOsErros.append(validarNulos(entradaParcelaVo));
			mensagemTodosOsErros.append(validarNumeros(entradaParcelaVo));
			mensagemTodosOsErros.append(entradaParcelaVo.getDataPagamento()
					+ " - "
					+ validarData(entradaParcelaVo.getDataPagamento(),
							"dd/MM/yyyy"));
			mensagemTodosOsErros.append(entradaParcelaVo.getDataVencimento()
					+ " - "
					+ validarData(entradaParcelaVo.getDataVencimento(),
							"dd/MM/yyyy"));
		} else {
			retornoErroVo.setMensagemErro("Dados não informados.");
			return retornoErroVo;
		}

		if (mensagemTodosOsErros.length() > 0) {
			retornoErroVo.setErro(77);
			retornoErroVo.setMensagemErro(mensagemTodosOsErros.toString());
		} else {
			retornoErroVo = null;
		}

		return retornoErroVo;
	}

	public String validarNulos(EntradaParcelaVo entradaParcelaVo) {

		StringBuilder mensagemErro = new StringBuilder();

		if (null == entradaParcelaVo.getSucursal()) {
			mensagemErro.append(CAMPO + "SUCURSAL" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getRamo()) {
			mensagemErro.append(CAMPO + "RAMO" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getCia()) {
			mensagemErro.append(CAMPO + "CIA" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getApolice()) {
			mensagemErro.append(CAMPO + "APOLICE" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getItem()) {
			mensagemErro.append(CAMPO + "ITEM" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getEndosso()) {
			mensagemErro.append(CAMPO + "ENDOSSO" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getNumeroPrestacao()) {
			mensagemErro.append(CAMPO + "NUMEROPRESTACAO" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getValorParcela()) {
			mensagemErro.append(CAMPO + "VALORPARCELA" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getPercentualJuros()) {
			mensagemErro.append(CAMPO + "PERCENTUALJUROS" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getValorAdicionalFracionamento()) {
			mensagemErro.append(CAMPO + "VALORADICIONALFRACIONAMENTO"
					+ CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getValorIOF()) {
			mensagemErro.append(CAMPO + "VALORIOF" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getDataVencimento()) {
			mensagemErro.append(CAMPO + "DATAVENCIMENTO" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getDataPagamento()) {
			mensagemErro.append(CAMPO + "DATAPAGAMENTO" + CAMPONAONULO);
		}
		if (null == entradaParcelaVo.getTipoCobranca()) {
			mensagemErro.append(CAMPO + "TIPOCOBRANCA" + CAMPONAONULO);
		}

		if (mensagemErro.length() == 0) {
			mensagemErro.append("");
		}

		return mensagemErro.toString();

	}

	public String validarData(Date data, String formato) {

		String mensagemRetorno = "";
		if (data != null) {
			Locale locale = new Locale("pt", "BR");
			SimpleDateFormat formatador = new SimpleDateFormat(formato, locale);
			formatador.setLenient(false);
			String auxiliarData = formatador.format(data);
			try {
				Date dataAuxiliar = formatador.parse(auxiliarData);
			} catch (ParseException e) {
				mensagemRetorno = auxiliarData
						+ " - Data inválida. Verificar valor. /n";
				e.printStackTrace();
			}
		}

		return mensagemRetorno;
	}

	public boolean isNumber(Object numero) {
		if (!(numero instanceof Number)) {
			return false;
		} else {
			return true;
		}
	}

	public String validarNumeros(EntradaParcelaVo entradaParcelaVo) {

		StringBuilder mensagemErroValidarNumeros = new StringBuilder();

		if (!isNumber(entradaParcelaVo.getSucursal())) {
			mensagemErroValidarNumeros.append(CAMPO + "SUCURSAL"
					+ CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getRamo())) {
			mensagemErroValidarNumeros
					.append(CAMPO + "RAMO" + CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getCia())) {
			mensagemErroValidarNumeros.append(CAMPO + "CIA" + CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getApolice())) {
			mensagemErroValidarNumeros.append(CAMPO + "APOLICE"
					+ CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getItem())) {
			mensagemErroValidarNumeros
					.append(CAMPO + "ITEM" + CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getEndosso())) {
			mensagemErroValidarNumeros.append(CAMPO + "ENDOSSO"
					+ CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getNumeroPrestacao())) {
			mensagemErroValidarNumeros.append(CAMPO + "NUMEROPRESTACAO"
					+ CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getValorParcela())) {
			mensagemErroValidarNumeros.append(CAMPO + "VALORPARCELA"
					+ CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getPercentualJuros())) {
			mensagemErroValidarNumeros.append(CAMPO + "PERCENTUALJUROS"
					+ CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getValorAdicionalFracionamento())) {
			mensagemErroValidarNumeros.append(CAMPO
					+ "VALORADICIONALFRACIONAMENTO" + CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getValorIOF())) {
			mensagemErroValidarNumeros.append(CAMPO + "VALORIOF"
					+ CAMPONAONUMERICO);
		}
		if (!isNumber(entradaParcelaVo.getTipoCobranca())) {
			mensagemErroValidarNumeros.append(CAMPO + "TIPOCOBRANCA"
					+ CAMPONAONUMERICO);
		}

		if (mensagemErroValidarNumeros.length() == 0) {
			mensagemErroValidarNumeros.append("");
		}

		return mensagemErroValidarNumeros.toString();

	}

}
