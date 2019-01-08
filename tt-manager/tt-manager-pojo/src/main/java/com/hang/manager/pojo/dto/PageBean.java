package com.hang.manager.pojo.dto;

public class PageBean {
    private Integer page;
    private Integer limit;
    private Integer offset;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return (page-1)*limit;
    }
}
