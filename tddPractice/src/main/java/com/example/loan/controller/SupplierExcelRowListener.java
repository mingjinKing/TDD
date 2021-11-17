package com.example.loan.controller;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import com.example.loan.bo.SupplierValidator;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SupplierExcelRowListener
        extends AnalysisEventListener<SupplierExcelRow> {
    List<SupplierExcelRow> dataList = new ArrayList<>();

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("所有数据解析完成！");
    }

    public List<SupplierExcelRow> getList() {
        return dataList;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(SupplierExcelRow data, AnalysisContext context) {
        log.info("解析到一条数据:{}", JSON.toJSONString(data));
        Boolean success = new SupplierValidator().validateSpecial(data.getSpecialProperty());
        if (!success) {
            return;
        }
        dataList.add(data);
    }
}
