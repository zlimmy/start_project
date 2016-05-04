package com.huimodel.api.base;

public class HotWords extends HwcObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2602642854956975396L;

	private String word;

	private int seq;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

}
