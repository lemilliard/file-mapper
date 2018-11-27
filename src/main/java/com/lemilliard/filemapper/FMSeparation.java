package com.lemilliard.filemapper;

public enum FMSeparation {
	SPACE(" "), //
	DOUBLE_SPACE("  "), //
	TAB("\\t");

	private String value;

	FMSeparation(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
