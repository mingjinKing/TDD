package com.example.loan.controller;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SupplierExcelRow {
    @ExcelProperty("供应商名称")
    private String name;

    @ExcelProperty("简称")
    private String shortName;

    @ExcelProperty("营业执照")
    private String businessLicense;

    @ExcelProperty("税号")
    private String taxIdNumber;

    @ExcelProperty("纳税类型")
    private String taxIdNumberType;

    @ExcelProperty("特别属性")
    private String specialProperty;

    @ExcelProperty("法人代表")
    private String legalRepresentative;

    @ExcelProperty("成立日期")
    private String foundDate;
}
