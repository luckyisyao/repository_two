package com.lmash.mysqltest.pojo;

import java.util.List;

/**
 * <p>
 * 用于分页
 * </p>
 * 
 * @author:Crow
 * @Date: 2019年8月20日 上午8:55:54
 */
public class PageBean<T> {
	// 已知数据
	// 当前页
	private int pageNumber;
	// 每页显示条数
	private int pageSize;
	// 总条数
	private int total;

	// 数据集合
	private List<T> data;

	// 需要计算得来
	// 总页数
	private int totalPage;


	public PageBean(int pageNumber, int pageSize, int total) {
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.total = total;

		//totalPage总页数
		if (total % pageSize == 0) {
			this.totalPage = total / pageSize;
		} else {
			this.totalPage = total / pageSize + 1;
		}
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	/**
	 * 每页显示条数
	 * 
	 * @return
	 */
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * 获取总页数
	 * 
	 * @return
	 */
	public int getTotalPage() {
		return totalPage;
	}

	public List<T> getList() {
		return data;
	}

	public void setList(List<T> list) {
		this.data = list;
	}
}
