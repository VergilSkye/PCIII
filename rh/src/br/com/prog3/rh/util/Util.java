package br.com.prog3.rh.util;

import java.time.LocalDate;

public class Util {
	public static int[] formatarDataDeGuiParaLocalDate(String dataGui) {
		int[] dataFormatada = new int[3];
		dataFormatada[0] = Integer.parseInt(dataGui.substring(5, 7));
		dataFormatada[1] = Integer.parseInt(dataGui.substring(8, 10));
		dataFormatada[2] = Integer.parseInt(dataGui.substring(0, 4));
		return dataFormatada;
	}

	public static String formatarDataDeLocalDateParaGui(LocalDate dataLocalDate) {
		StringBuilder dataFormatada = new StringBuilder();
		if (dataLocalDate.getDayOfMonth() < 10) {
			dataFormatada.append("0" + dataLocalDate.getDayOfMonth() + "/");
		} else {
			dataFormatada.append(dataLocalDate.getDayOfMonth() + "/");
		}
		if (dataLocalDate.getMonthValue() < 10) {
			dataFormatada.append("0" + dataLocalDate.getMonthValue() + "/");
		} else {
			dataFormatada.append(dataLocalDate.getMonthValue() + "/");
		}
		dataFormatada.append(dataLocalDate.getYear());
		return dataFormatada.toString();
	}
}