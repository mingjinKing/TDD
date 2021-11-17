package com.example.loan.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("supplier")
public class SupplierController {
    @PostMapping
    public List<SupplierExcelRow> batchImport(@RequestParam MultipartFile file) throws IOException {
        SupplierExcelRowListener readListener = new SupplierExcelRowListener();
        EasyExcelFactory.read(file.getInputStream(), SupplierExcelRow.class, readListener).sheet().doRead();
        return readListener.getList();
    }

}
