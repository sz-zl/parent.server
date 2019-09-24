package com.sz.p2p.entity;

import java.util.List;

public class Split<E> {
	
	private Integer count;
	private Integer cp;
	private Integer ps;
	private Integer pages;
	private List<E> elementList;
	
	public Split() {
	}

	public Split(Integer count, Integer cp, Integer ps, Integer pages, List<E> elementList) {
		super();
		this.count = count;
		this.cp = cp;
		this.ps = ps;
		this.pages = pages;
		this.elementList = elementList;
	}

	public List<E> getElementList() {
		return elementList;
	}


	public void setElementList(List<E> elementList) {
		this.elementList = elementList;
	}


	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCp() {
		return cp;
	}
	public void setCp(Integer cp) {
		this.cp = cp;
	}
	public Integer getPs() {
		return ps;
	}
	public void setPs(Integer ps) {
		this.ps = ps;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Split [count=" + count + ", cp=" + cp + ", ps=" + ps + ", pages=" + pages + ", elementList="
				+ elementList + "]";
	}

}
